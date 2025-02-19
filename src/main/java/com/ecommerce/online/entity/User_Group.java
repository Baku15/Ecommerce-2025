package com.ecommerce.online.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "user_groups") // Evita usar 'groups' porque es palabra reservada

public class User_Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="person_id", nullable = false)
    private Person persona;

    @ManyToOne
    @JoinColumn(name="group_id",nullable = false)
    private Group group;

}
