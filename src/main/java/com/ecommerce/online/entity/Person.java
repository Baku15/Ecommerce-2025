package com.ecommerce.online.entity;

import com.ecommerce.online.enums.UserRole;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "persona")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String address;
    private String dni;
    private LocalDate birthDate;
    private String gender;
    private String nationality;
    private String description;
    private UserRole role;

    private Boolean isActive;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
        this.isActive = true;
    }

    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = LocalDateTime.now();
    }

}
