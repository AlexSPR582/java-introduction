package by.epam.courses.module4.aggregation_and_composition.task5.travelAgency;

import by.epam.courses.module4.aggregation_and_composition.task5.ticket.Ticket;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TravelAgency {
    private static TravelAgency travelAgency;

    private List<Ticket> tickets;

    private TravelAgency(){
        this.tickets = new ArrayList<>();
    }

    public static TravelAgency getInstance(){
        if (travelAgency == null){
            travelAgency = new TravelAgency();
        }
        return travelAgency;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TravelAgency that = (TravelAgency) o;
        return Objects.equals(tickets, that.tickets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tickets);
    }

    @Override
    public String toString() {
        return "TravelAgency{" +
                "tickets=" + tickets +
                '}';
    }
}
