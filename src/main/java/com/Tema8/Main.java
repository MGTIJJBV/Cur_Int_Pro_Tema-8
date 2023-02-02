package com.Tema8;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setEdad(38);
        persona.setNombre("Jorge Beltran");
        persona.setTelefono(8183004687L);

        System.out.println("Los valores de persona son :: " + persona);

        System.out.println("**********************************************");

        System.out.println("Edad = " + persona.getEdad());
        System.out.println("Nombre = " + persona.getNombre());
        System.out.println("Telefono = " + persona.getTelefono());
    }
}