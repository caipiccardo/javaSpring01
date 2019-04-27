package javaspring.repo;

import java.io.FileWriter;
import javaspring.Ticket;
import javaspring.TransormadorTicketJson;

public class TicketTextRepository implements TicketRepository {
    private TransormadorTicketJson transormadorTicketJson;
    private String pathDepositoArchivos;

    public TicketTextRepository(TransormadorTicketJson transormadorTicketJson, String pathDepositoArchivos) {
        this.transormadorTicketJson = transormadorTicketJson;
        this.pathDepositoArchivos = pathDepositoArchivos;
    }
    
    public void persistir(Ticket t) {
        String strTxt = transormadorTicketJson.transformar(t);
        
        String pathCompleto = pathDepositoArchivos + 
                                "\\" + 
                                t.id +
                                ".json";
        try {
            FileWriter fw = new FileWriter(pathCompleto);
            fw.write(strTxt);
            fw.flush();
            fw.close();
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }        
    }
}
