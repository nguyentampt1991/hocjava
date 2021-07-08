package ServetDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductDiscountCalculatoSevlet
 */
@WebServlet("/ProductDiscountCalculatoSevlet")
public class ProductDiscountCalculatoSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductDiscountCalculatoSevlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String product_Description = request.getParameter("txtProductDescription");
		float listPrice = Float.parseFloat(request.getParameter("txtListPrice"));
		float discountPercent = Float.parseFloat(request.getParameter("txtDiscountPercent"));
		
		float discountAmount =  (float) (listPrice *discountPercent*0.01);
		
		PrintWriter writer = response.getWriter();
		writer.println("<html>");
		
		writer.println("Product Description : "+ product_Description);
		writer.println("Discount Percent : "+ discountPercent);
		writer.println("Discount Amount : "+ discountAmount);
		writer.println("</html");
		
		
		
	}

}
