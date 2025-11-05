package com.klu;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:9090")  // ✅ your frontend is deployed in same Tomcat
@RequestMapping("/springapp1")  // ✅ main API base path
public class AppController {

    @Autowired
    private Service s;

    @PostMapping("/insert")
    public String insert(@RequestBody Product p) {
        return s.insertData(p);
    }

    @GetMapping("/display")
    public List<Product> display() {
        return s.displayData();
    }

    @PutMapping("/update")
    public String update(@RequestBody Product p) {
        return s.updateData(p);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        return s.deleteData(id);
    }
}
