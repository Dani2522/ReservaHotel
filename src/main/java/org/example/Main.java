package org.example;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date fechaHora = new Date(); // Usando la fecha y hora actual como ejemplo
        Reservable reservaHotel = new ReservaHotel("Daniel Moreno", "1056075931", "3502349867", fechaHora, "Hotel Campestre");
        Reservable reservaRestaurante = new ReservaRestaurante("Paula Mayorga", "1030655401", "3057128420", fechaHora, "Restaurante Venezia");

        reservaHotel.realizarReserva(reservaHotel.getNombre(), reservaHotel.getDocumento(), reservaHotel.getNumeroContacto(), fechaHora);
        reservaRestaurante.realizarReserva(reservaRestaurante.getNombre(), reservaRestaurante.getDocumento(), reservaRestaurante.getNumeroContacto(), fechaHora);
    }
}