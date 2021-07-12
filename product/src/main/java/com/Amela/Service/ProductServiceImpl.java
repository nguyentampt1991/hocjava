package com.Amela.Service;

import com.Amela.Model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService{
    // Initialize data
    private static Map<Integer,Product> products;
    static {
        products = new HashMap<>();
        products.put(1, new Product(1,"Thuốc Lá","Dành cho người trên 18 tuổi", 20000));
        products.put(2, new Product(2,"Mì Tôm","100% từ khoai tây", 7000));
        products.put(3, new Product(3,"Cháo dinh dưỡng","Ăn liền tiện dụng", 5000));
        products.put(4, new Product(4,"Rượu Vang","Dành cho người trên 18+", 30000));
        products.put(5, new Product(5,"Nước Mắm","Làm từ 100% cá cơm", 35000));

    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getProductID(),product);

    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id,product);

    }

    @Override
    public void remove(int id) {
        products.remove(id);

    }
}
