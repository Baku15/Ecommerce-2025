package com.ecommerce.online.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@Table(name = "group_role")
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Group_Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="group_id",nullable = false)
    private Group group;

    @ManyToOne
    @JoinColumn(name="role_id", nullable = false)
    private Role role;

}
