package com;

import funcionarios.Funcionario;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Funcionario fun01= new Funcionario();
        fun01.setDocnum("23124456");
        fun01.setApellidos("fulanito");
        fun01.setNombres("cosme");
        fun01.setEdad(21);
        fun01.setSalario_base(3000000);
        //fun01.setSalario_minlegal(2550000);
        System.out.println(fun01.salario_neto());
        System.out.println(fun01.salario_dif());
        Funcionario fun02= new Funcionario("12345","de tal","fulano");
        fun02.setEdad(19);
        fun02.setSalario_base(2440000);
//        System.out.println(fun02.salario_neto());
//        System.out.println(fun02.salario_dif());
        System.out.println(fun01.toString());
        System.out.println(fun02.toString());
        
    }
}
