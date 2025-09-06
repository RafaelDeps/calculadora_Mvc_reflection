package org.example.view.calculadora;

import org.example.model.model;

import java.util.Scanner;
import java.lang.reflect.*;

public class view {
    public static void menu() {
        int primeiro_numero, segundo_numero, resultado = 0;
        model modelo = new model();
        String operacao;
        Scanner entrada = new Scanner(System.in);

        System.out.println("digite o primeiro numero");

        primeiro_numero = entrada.nextInt();
        System.out.println("digite sua operacao: soma (+), sutracao(-), divisao(/), multiplicacao(*)");

        operacao = entrada.next();

        System.out.println("digite o segundo numero");
        segundo_numero = entrada.nextInt();
        try {
            Method reflect_conta = model.class.getMethod("conta", int.class, String.class, int.class);
            // obtençao do metodo conta da classe modelo
            resultado =  (int) reflect_conta.invoke(modelo,primeiro_numero,operacao,segundo_numero);
            // chamada do metodo conta da classe modelo
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }// trataçao de erros

        // resultado = modelo.conta(primeiro_numero,operacao,segundo_numero);
        // a linha acima foi comentada pois era como o resultado foi pego sem o reflection
        System.out.println(" ");
        System.out.println(primeiro_numero +" " +operacao + " " + segundo_numero +" " + "=" + " " + resultado);

    }
}