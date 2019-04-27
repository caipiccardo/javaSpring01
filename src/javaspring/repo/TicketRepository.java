package javaspring.repo;

import javaspring.Ticket;

public interface TicketRepository {
    void persistir(Ticket t);
}
