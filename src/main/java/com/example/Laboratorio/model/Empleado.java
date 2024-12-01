/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Laboratorio.model;

/**
 *
 * @author LAB_P03
 */
public class Empleado {
      private double sueldoBase;
    private int horasExtra;

    // Constructor
    public Empleado(double sueldoBase, int horasExtra) {
        this.sueldoBase = sueldoBase;
        this.horasExtra = horasExtra;
    }

    // Métodos getter y setter
    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    // Método para calcular la tarifa por hora
    public double getTarifaPorHora() {
        return sueldoBase / 160; // Suponiendo 160 horas al mes
    }

    // Método para calcular el sueldo total a pagar
    public double getSueldoTotal() {
        return sueldoBase + (horasExtra * 8); // 8 es el pago por hora extra
    }
    
}
