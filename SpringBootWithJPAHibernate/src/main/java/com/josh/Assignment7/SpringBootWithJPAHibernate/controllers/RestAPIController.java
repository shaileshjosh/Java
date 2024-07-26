package com.josh.Assignment7.SpringBootWithJPAHibernate.controllers;

import com.josh.Assignment7.SpringBootWithJPAHibernate.entities.Electronics;
import com.josh.Assignment7.SpringBootWithJPAHibernate.services.ElectronicsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;

@RestController
@RequestMapping("/get")
public class RestAPIController {
    @Autowired
    ElectronicsService electronicsService;

    @GetMapping("/getAll")
    Iterable<Electronics> getAllElectronics() {
        return  electronicsService.getAllElectronics();
    }

    @GetMapping("/Add")
    String AddElectronics() {
        return  electronicsService.AddElectronics();
    }

    @GetMapping("/DeleteAll")
    String DeleteElectronics() {
        return  electronicsService.DeleteAllElectronics();
    }

    @GetMapping("/UpdateFirst")
    String UpdateElectronics() {
        return  electronicsService.UpdateElectronics();
    }

}
