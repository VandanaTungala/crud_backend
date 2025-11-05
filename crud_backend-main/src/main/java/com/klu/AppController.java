package com.klu;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:5174") // 👈 your frontend (Vite) runs here
@RequestMapping("/springapp1") // 👈 base URL for all APIs
public class AppController {

    @Autowired
    private Service s;

    // ➕ Insert Product
    @PostMapping("/insert")
    public String insert(@RequestBody Product p) {
        return s.insertData(p);
    }

    // 📋 Display Products
    @GetMapping("/display")
    public List<Product> display() {
        return s.displayData();
    }

    // 🔄 Update Product
    @PutMapping("/update")
    public String update(@RequestBody Product p) {
        return s.updateData(p);
    }

    // ❌ Delete Product
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        return s.deleteData(id);
    }
}
