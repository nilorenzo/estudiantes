package com.sistema;

import com.interfaces.ISistema;

public class Main {

    //Principios S.O.L.I.D.
    //Principio de Responsabilidad Unica -Single Resposability Principle-
    public static void main(String[] args) {

        ISistema sistema = new Sistema();

        sistema.ejecutar();

    }
}
