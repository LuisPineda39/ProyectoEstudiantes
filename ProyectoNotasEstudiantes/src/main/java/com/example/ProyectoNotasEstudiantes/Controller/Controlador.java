package com.example.ProyectoNotasEstudiantes.Controller;

import com.example.ProyectoNotasEstudiantes.Domain.Customers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
@RestController
public class Controlador {

    private List<Customers> customers=new ArrayList<>(Arrays.asList(
            new Customers(1,"luis","luis.pineda","123"),
            new Customers(1,"luis","luis.pineda","123"),
            new Customers(1,"luis","luis.pineda","123"),
            new Customers(1,"luis","luis.pineda","123")
    ));
    @GetMapping("/Estudiantes")
    private List<Customers> getCustomers(){
        return customers;
    }



}
