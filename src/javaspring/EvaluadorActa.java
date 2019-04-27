package javaspring;

import java.util.Date;
import javaspring.repo.TicketRepository;
import sensorclima.TipoClima;
import sensorvelocidad.DatosVehiculo;
import sensorvelocidad.TipoVehiculo;

public class EvaluadorActa implements IEvaluadorActa {
    private AnalisisInformacion analisisInfo;
    private TicketRepository ticketRepository;

    public EvaluadorActa(AnalisisInformacion analisisInfo, TicketRepository ticketRepository) {
        this.analisisInfo = analisisInfo;
        this.ticketRepository = ticketRepository;
    }
    
    public void evaluar(DatosVehiculo datosVechiculo, TipoClima clima) {
        Boolean correspondeActa = analisisInfo.analizar(clima, new Date(2019,04,26),
                datosVechiculo.tipoVehiculo, datosVechiculo.velocidadMedida);
        
        if (correspondeActa) {
            Ticket t = new Ticket(
                java.util.UUID.randomUUID().toString(),
                datosVechiculo,
                1000
            );
            
            ticketRepository.persistir(t);
        }
    }
}
