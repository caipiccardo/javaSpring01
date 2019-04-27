package javaspring.repo;

import javaspring.Ticket;

public class TicketSqlMasTextRepository implements TicketRepository {
    private TicketSQLRepository ticketSQLRepository;
    private TicketTextRepository ticketTextRepository;

    public TicketSqlMasTextRepository(TicketSQLRepository ticketSQLRepository, TicketTextRepository ticketTextRepository) {
        this.ticketSQLRepository = ticketSQLRepository;
        this.ticketTextRepository = ticketTextRepository;
    }
    
    public void persistir(Ticket t) {
        ticketTextRepository.persistir(t);
        ticketSQLRepository.persistir(t);
    }
}
