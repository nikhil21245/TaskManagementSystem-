package com.springPractice.TaskManagementSystem.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String description;
    boolean completed;
    @Enumerated(EnumType.STRING)
   Priority priority;
}
