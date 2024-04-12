package com.demo.project.model;

import lombok.*;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    private int id;
    private String name;
    private String email;
}