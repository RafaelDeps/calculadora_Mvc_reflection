package org.example.model;

import org.example.controller.controller;

public class model {
    public int conta(int x, String operacao,int y) {
        controller controller = new controller();
        int resultado = 0;
        if (operacao.equals("+")) {
           resultado=  controller.somar(x, y);
        } else if (operacao.equals("-")) {
            resultado=    controller.subtrair(x, y);
        } else if (operacao.equals("*")) {
            resultado=  controller.multiplicar(x, y);
        } else if (operacao.equals("/")) {
            resultado=  controller.dividir(x, y);
        }
        return resultado;
    }
}
