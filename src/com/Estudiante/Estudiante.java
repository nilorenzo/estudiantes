package com.Estudiante;

import com.Enums.EstadoCivilEnum;

import java.util.Calendar;

public class Estudiante {

    //Este tipo de clase se llama:
    //Plain_Old_Java_Object
    //EJEMPLO CLASE POJO

    private String nombre;
    private String apellido1;
    private String apellido2;
    private EstadoCivilEnum estadoCivil;  // SOLTERO | CASADO | DIVORCIADO | VIUDO
    private String genero;       // HOMBRE | MUJER
    private Calendar edad;
    private Calendar fechaCreacion;
    private Calendar fechaNacimiento;
    private String DNI;

    public Estudiante(String nombre, String apellido1, String apellido2, EstadoCivilEnum estadoCivil, String genero, Calendar edad, Calendar fechaCreacion, Calendar fechaNacimiento, String DNI) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.estadoCivil = estadoCivil;
        this.genero = genero;
        this.edad = edad;
        this.fechaCreacion = fechaCreacion;
        this.fechaNacimiento = fechaNacimiento;
        this.DNI = DNI;
    }

    public Estudiante() {



    }

    //GETTERS AND SETTERS
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public EstadoCivilEnum getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivilEnum estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Calendar getEdad() {
        return edad;
    }

    public void setEdad(Calendar edad) {
        this.edad = edad;
    }

    public Calendar getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Calendar fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
}
