package br.com.alura.bytebank;

import br.com.alura.bytebank.model.Funcionario;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {   // psvm + tabulador para escribir toda la clase main
        //System.out.println("Bienvenido a Bytebank");
        Funcionario jose = new Funcionario("José", 1, LocalDate.of(1990, 2, 12));
        //new Funcionario();
        System.out.println(jose);
    }
}
