package org.example;

import java.util.Date;

public interface Reservable {
    boolean realizarReserva(String nombre, String documento, String numeroContacto, Date fechaHora);

    String getNombre();
    String getDocumento();
    String getNumeroContacto();
}

class ReservaBase {
    private String nombre;
    private String documento;
    private String numeroContacto;
    private Date fechaHora;

    public ReservaBase(String nombre, String documento, String numeroContacto, Date fechaHora) {
        this.nombre = nombre;
        this.documento = documento;
        this.numeroContacto = numeroContacto;
        this.fechaHora = fechaHora;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public String getNumeroContacto() {
        return numeroContacto;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nDocumento: " + documento + "\nContacto: " + numeroContacto + "\nFecha y Hora: " + fechaHora;
    }
}

class ReservaHotel extends ReservaBase implements Reservable {
    private String hotelNombre;

    public ReservaHotel(String nombre, String documento, String numeroContacto, Date fechaHora, String hotelNombre) {
        super(nombre, documento, numeroContacto, fechaHora);
        this.hotelNombre = hotelNombre;
    }

    @Override
    public boolean realizarReserva(String nombre, String documento, String numeroContacto, Date fechaHora) {

        System.out.println("Reserva de hotel realizada para " + nombre + " en el hotel " + hotelNombre);
        return true;
    }
}


class ReservaRestaurante extends ReservaBase implements Reservable {
    private String restauranteNombre;

    public ReservaRestaurante(String nombre, String documento, String numeroContacto, Date fechaHora, String restauranteNombre) {
        super(nombre, documento, numeroContacto, fechaHora);
        this.restauranteNombre = restauranteNombre;
    }

    @Override
    public boolean realizarReserva(String nombre, String documento, String numeroContacto, Date fechaHora) {
        System.out.println("Reserva en el restaurante " + restauranteNombre + " realizada para " + nombre);
        return true;
    }
}


