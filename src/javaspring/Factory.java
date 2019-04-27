package javaspring;

import javaspring.repo.*;

public class Factory {
    public IEvaluadorActa construirEvaluador() {
        
        TicketTextRepository ticketTextRepository 
                = new TicketTextRepository(
                        new TransormadorTicketJson(),
                        "c:\\tickets"
                );
        
        TicketSQLRepository ticketSQLRepository = 
                new TicketSQLRepository(new ConnectionFactory());
        
        TicketSqlMasTextRepository todosLosRepos = 
                new TicketSqlMasTextRepository(
                        ticketSQLRepository,
                        ticketTextRepository
                );
        
        EvaluadorActa evaluadorActa = new EvaluadorActa(
                new AnalisisInformacion(),
                todosLosRepos
        );
        
        return new AspectoLogEvaluadorActa(evaluadorActa);
    }
}
