package javaspring;

import java.util.Date;
import sensorvelocidad.TipoVehiculo;

public class AnalisisInformacion {
    public boolean analizar(sensorclima.TipoClima tipoclima,
                            Date fecha, 
                            sensorvelocidad.TipoVehiculo tipovehiculo,
                            Integer velocidad
                            ) {
        return (tipovehiculo == TipoVehiculo.Auto);
    }
}
