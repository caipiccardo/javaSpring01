package javaspring;

import sensorvelocidad.DatosVehiculo;

public class Ticket {
    public final String id;
    public final DatosVehiculo datosVehiculo;
    public final Integer multa;

    public Ticket(String id, DatosVehiculo datosVehiculo, Integer multa) {
        this.id = id;
        this.datosVehiculo = datosVehiculo;
        this.multa = multa;
    }
}
