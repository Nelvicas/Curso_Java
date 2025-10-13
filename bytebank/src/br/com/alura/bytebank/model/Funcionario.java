package br.com.alura.bytebank.model;

import java.time.LocalDate;

public class Funcionario {
       private String nombre;

       private int matricula;

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nombre='" + nombre + '\'' +
                ", matricula=" + matricula +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }

    public Funcionario(String nombre, int matricula, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    private LocalDate fechaNacimiento;
}
