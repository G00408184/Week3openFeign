package ie.atu.week3openfeign;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventory")
public class Controller {
    @Autowired
    private Service service;
    @GetMapping("/GET")
    public List<Product> getProduct() {
        return service.getProduct();
    }
    @PostMapping("/add")
    public String addProduct(@RequestBody Product product) {
        return service.addProduct(product);
    }
}
