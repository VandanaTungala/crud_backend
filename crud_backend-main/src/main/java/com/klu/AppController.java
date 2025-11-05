package com.klu;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:5174") // 👈 add frontend URL here
@RequestMapping("/springapp1") // 👈 optional but helps structure URLs
public class AppController {

    @Autowired
    Service s;

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

    /*
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
    // test trigger

        return s.deleteData(id);
    }
    */
}

