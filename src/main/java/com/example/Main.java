package com.example;

public class Main {
    public static void main(String[] args) {
        Estadio estadio1 = new Estadio("Estadio El Metropolitano", "Barranquilla", 46692);
        Estadio estadio2 = new Estadio("Estadio Atanasio Girardot", "Medellín", 42826);

        estadio1.mostrarInformacion();
        estadio2.mostrarInformacion();

        
        JugadorFutbol jugador1 = new JugadorFutbol("Luis Diaz", 28, "Delantero/Extremo");
        JugadorFutbol jugador2 = new JugadorFutbol("Richard Rios", 25, "Mediocampista");
        JugadorFutbol jugador3 = new JugadorFutbol("James Rodriguez", 34, "Mediocampista Ofensivo");

        jugador1.presentarse();
        jugador2.presentarse();
        jugador3.presentarse();

        jugador1.cambiarPosicion("Extremo Derecho");
    }
}
