package javaspring.repo;

import javaspring.Ticket;

public class TicketSQLRepository implements TicketRepository {
    private ConnectionFactory connFac;

    public TicketSQLRepository(ConnectionFactory connFac) {
        this.connFac = connFac;
    }
    
    public void persistir(Ticket t) {
        System.out.println("PERSISTIENDO EN SQL... INSERT INTO ...");
    }
}
