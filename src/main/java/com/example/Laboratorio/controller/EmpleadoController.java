/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Laboratorio.controller;

import com.example.Laboratorio.model.Empleado;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmpleadoController {
 
    // Ruta GET para mostrar el formulario
    @GetMapping("/formulario_empleado")
    public String mostrarFormulario() {
        return "formulario_empleado"; // Vista HTML con el formulario
    }

    // Ruta POST para calcular el sueldo y mostrar los resultados
    @PostMapping("/resultado_empleado")
    public String calcularSueldo(@RequestParam("sueldoBase") double sueldoBase,
                                 @RequestParam("horasExtra") int horasExtra,
                                 Model model) {
        // Crear el objeto empleado con los datos recibidos del formulario
        Empleado empleado = new Empleado(sueldoBase, horasExtra);

        // Depurar para verificar que los datos se reciben correctamente
        System.out.println("Sueldo Base: " + sueldoBase);
        System.out.println("Horas Extra: " + horasExtra);

        // Agregar los valores al modelo
        model.addAttribute("sueldoBase", sueldoBase);
        model.addAttribute("horasExtra", horasExtra);
        model.addAttribute("tarifaPorHora", empleado.getTarifaPorHora());
        model.addAttribute("sueldoTotal", empleado.getSueldoTotal());

        // Retornar la vista para mostrar los resultados
        return "resultado_empleado"; // Vista HTML para mostrar los resultados
    }
}
