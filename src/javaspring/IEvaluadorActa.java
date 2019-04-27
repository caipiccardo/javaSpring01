package javaspring;

import sensorclima.TipoClima;
import sensorvelocidad.DatosVehiculo;

public interface IEvaluadorActa {
    void evaluar(DatosVehiculo datosVechiculo, TipoClima clima);
}
