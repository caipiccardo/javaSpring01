package javaspring;

public class TransormadorTicketJson {
    public String transformar(Ticket t) {
        return new com.google.gson.Gson().toJson(t);
    }
}
