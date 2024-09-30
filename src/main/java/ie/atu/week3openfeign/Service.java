package ie.atu.week3openfeign;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    private List<Product> productList = new ArrayList<>();

    public List<Product> getProduct() {
        return productList;
    }

    public String addProduct(Product product) {
        productList.add(product);
        return "Product added successfully";
    }
}
