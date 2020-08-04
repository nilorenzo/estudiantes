package com.sistema;

import com.interfaces.ISistema;

public class Sistema implements ISistema {


    @Override
    public void ejecutar() {

        System.out.println("Hello world!");
    }

    @Override
    public void cargarDatos() {

    }

    @Override
    public void guardarDatos() {

    }

}
