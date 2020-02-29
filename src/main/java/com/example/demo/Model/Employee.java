package com.example.demo.Model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Employee implements Serializable {
   private Integer id;
   private String lastName;
   private String email;
   private Integer gender;
   private  Integer did;
   private String age;
   private String uuid;

}
