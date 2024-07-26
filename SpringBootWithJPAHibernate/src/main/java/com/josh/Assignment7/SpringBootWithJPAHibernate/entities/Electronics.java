package com.josh.Assignment7.SpringBootWithJPAHibernate.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Electronics", schema = "sys")
public class Electronics {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "Name", nullable = false, length = 100)
    private String name;

    @Column(name = "Watt", nullable = false)
    private Double watt;

    @Column(name = "Wired", nullable = false)
    private Boolean wired = false;

}