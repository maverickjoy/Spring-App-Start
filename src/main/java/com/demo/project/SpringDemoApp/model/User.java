package com.demo.project.SpringDemoApp.model;

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
