package javaspring;

import sensorclima.TipoClima;
import sensorvelocidad.DatosVehiculo;

public class Init {
    public static void main(String[] args) {
        sensorvelocidad.Sensor sensor = new sensorvelocidad.Sensor();
        sensorclima.Sensor sensorclima = new sensorclima.Sensor();
        Factory factory = new Factory();
        
        IEvaluadorActa evaluador = factory.construirEvaluador();
        TipoClima tipoclima = sensorclima.sensar();
                
        for (;;) {
            DatosVehiculo datosvehiculo = sensor.sensarVehiculo();
            evaluador.evaluar(datosvehiculo, tipoclima);
        }
    }
}
