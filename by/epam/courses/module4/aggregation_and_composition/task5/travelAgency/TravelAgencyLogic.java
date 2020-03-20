package by.epam.courses.module4.aggregation_and_composition.task5.travelAgency;

import by.epam.courses.module4.aggregation_and_composition.task5.ticket.Ticket;
import by.epam.courses.module4.aggregation_and_composition.task5.ticket.nutrition.Nutrition;
import by.epam.courses.module4.aggregation_and_composition.task5.ticket.transport.Transport;
import by.epam.courses.module4.aggregation_and_composition.task5.ticket.type.TicketType;
import by.epam.courses.module4.aggregation_and_composition.task5.ticket.TicketLogic;

import java.util.Comparator;

public class TravelAgencyLogic {
    private static TravelAgencyLogic travelAgencyLogic;

    private TravelAgencyLogic() {}

    public static TravelAgencyLogic getInstance() {
        if (travelAgencyLogic == null) {
            travelAgencyLogic = new TravelAgencyLogic();
        }
        return travelAgencyLogic;
    }

    public void findTickets(TicketType type, Transport transport, Nutrition nutrition, int days){
        for (Ticket ticket: TravelAgency.getInstance().getTickets()){
            if (type.equals(ticket.getTicketType()) && transport.equals(ticket.getTransport()) &&
                    nutrition.equals(ticket.getNutrition()) && days == ticket.getDays()){
                TicketLogic.getInstance().printTicket(ticket);
            }
        }
    }

    public void findTickets(TicketType type) {
        for (Ticket ticket: TravelAgency.getInstance().getTickets()) {
            if (ticket.getTicketType().equals(type)) {
                TicketLogic.getInstance().printTicket(ticket);
            }
        }
    }

    public void findTickets(Transport transport) {
        for (Ticket ticket: TravelAgency.getInstance().getTickets()) {
            if (ticket.getTransport().equals(transport)) {
                TicketLogic.getInstance().printTicket(ticket);
            }
        }
    }

    public void findTickets(Nutrition nutrition) {
        for (Ticket ticket: TravelAgency.getInstance().getTickets()) {
            if (ticket.getNutrition().equals(nutrition)) {
                TicketLogic.getInstance().printTicket(ticket);
            }
        }
    }

    public void findTickets(int days) {
        for (Ticket ticket: TravelAgency.getInstance().getTickets()) {
            if (ticket.getDays() == days) {
                TicketLogic.getInstance().printTicket(ticket);
            }
        }
    }

    public void sortTicketsByDays(){
        TravelAgency.getInstance().getTickets().sort(new Comparator<Ticket>() {
            @Override
            public int compare(Ticket t1, Ticket t2) {
                return t1.getDays() - t2.getDays();
            }
        });
    }

    public void printAllTickets(){
        for (Ticket ticket: TravelAgency.getInstance().getTickets()){
            TicketLogic.getInstance().printTicket(ticket);
            System.out.println();
        }
    }
}
