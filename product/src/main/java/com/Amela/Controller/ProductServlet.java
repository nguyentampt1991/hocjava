package com.Amela.Controller;

import com.Amela.Model.Product;
import com.Amela.Service.ProductService;
import com.Amela.Service.ProductServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = "/products")
public class ProductServlet extends HttpServlet {
    private ProductService productServi = new ProductServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");
        if(action== null)
        {
            action = "";
        }
        switch (action)
        {
            case "create":
                showCreateForm(request,response);

                break;
            case "edit":
                showEditForm(request,response);

                break;
            case "delete":
                 showDeleteForm(request,response);
                break;
            case "view":

                break;
            default:
                listProduct(request,response);
                break;
        }
    }

    private void showDeleteForm(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("productId"));
        Product product = this.productServi.findById(id);
        RequestDispatcher dispatcher;
        if (product==null)
        {
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        }else
        {
            request.setAttribute("product", product);
            dispatcher = request.getRequestDispatcher("Product/delete.jsp");
        }
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = this.productServi.findById(id);
        RequestDispatcher dispatcher;
        if(product== null)
        {
            dispatcher =request.getRequestDispatcher("error 404.jsp");
        }else
        {
            request.setAttribute("product",product);
            dispatcher = request.getRequestDispatcher("Product/edit.jsp");
        }
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/Product/create.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void listProduct(HttpServletRequest request, HttpServletResponse response) {
        List<Product> products = this.productServi.findAll();
        request.setAttribute("products",products);
        RequestDispatcher dispatcher = request.getRequestDispatcher("Product/list.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");
        if(action== null)
        {
            action = "";
        }
        switch (action)
        {
            case "create":
                createProduct(request,response);

                break;
            case "edit":
                updateProduct(request,response);
                break;
            case "delete":
                deleteProduct(request,response);

                break;
            default:
                break;
        }
    }

    private void deleteProduct(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("productId"));
        Product product = this.productServi.findById(id);
        RequestDispatcher dispatcher;
        if(product== null)
        {
            dispatcher = request.getRequestDispatcher("error404.jsp");

        }else
        {
            this.productServi.remove(id);
            try {
                response.sendRedirect("/product");

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void updateProduct(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("productId"));
        String name = request.getParameter("productName");
        String discription = request.getParameter("discription");
        float  price = Float.parseFloat(request.getParameter("price"));
        Product product = this.productServi.findById(id);
        RequestDispatcher dispatcher;
        if(product== null)
        {
            dispatcher= request.getRequestDispatcher("error 404.jsp");
        }else
        {
            product.setProductName(name);
            product.setDescription(discription);
            product.setPrice(price);
            this.productServi.update(id,product);
            request.setAttribute("product",product);
            request.setAttribute("message","Product information war update");
            dispatcher= request.getRequestDispatcher("Product/edit.jsp");
        }
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createProduct(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("productName");
        String discription = request.getParameter("discription");
        float price = Float.parseFloat(request.getParameter("price"));
        int id = (int) (Math.random())*10000;
        Product product = new Product(id,name,discription,price);
        this.productServi.save(product);
        RequestDispatcher dispatcher = request.getRequestDispatcher("Product/create.jsp");
        request.setAttribute("message","New product war create");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
