package javaspring;

import sensorclima.TipoClima;
import sensorvelocidad.DatosVehiculo;

public class AspectoLogEvaluadorActa implements IEvaluadorActa {
    IEvaluadorActa ea;

    public AspectoLogEvaluadorActa(IEvaluadorActa ea) {
        this.ea = ea;
    }
    
    public void evaluar(DatosVehiculo datosVechiculo, TipoClima clima) {
        System.out.println("Loggin de trafico:");
        System.out.println("Datos del vechiculo: ");
        System.out.println(datosVechiculo.patente);
        System.out.println(datosVechiculo.tipoVehiculo);
        System.out.println(datosVechiculo.velocidadMedida);
        System.out.println("-------------------------------------");
        ea.evaluar(datosVechiculo, clima);
    }
}
