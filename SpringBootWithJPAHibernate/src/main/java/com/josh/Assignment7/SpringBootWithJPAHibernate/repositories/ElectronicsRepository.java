package com.josh.Assignment7.SpringBootWithJPAHibernate.repositories;

import com.josh.Assignment7.SpringBootWithJPAHibernate.entities.Electronics;
import org.springframework.data.repository.CrudRepository;

public interface ElectronicsRepository extends CrudRepository<Electronics,Integer> {
}
