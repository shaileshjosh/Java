package com.josh.Assignment7.SpringBootWithJPAHibernate.services;

import com.josh.Assignment7.SpringBootWithJPAHibernate.entities.Electronics;
import com.josh.Assignment7.SpringBootWithJPAHibernate.repositories.ElectronicsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ElectronicsService {
    @Autowired
    private ElectronicsRepository electronicsRepository;

    public Iterable<Electronics> getAllElectronics() {
        return electronicsRepository.findAll();
    }
    public String  AddElectronics() {
        Electronics electronics1 = new Electronics();
        electronics1.setWired(true);
        electronics1.setName("Mobile Phone");
        electronics1.setWatt(5.0);
        electronicsRepository.save(electronics1);
        return "Electronics saved successfully";
    }
    public String DeleteAllElectronics() {
        electronicsRepository.deleteAll();
        return "All Electronics deleted successfully";
    }
    public String UpdateElectronics() {

        Optional<Electronics> electronics1 = electronicsRepository.findById(1);
        Electronics electronics = electronics1.get();
        electronics.setWired(false);
        electronics.setName("Television");
        electronics.setWatt(230.0);
        electronicsRepository.save(electronics);
        return "Electronics updated successfully";
    }
}
