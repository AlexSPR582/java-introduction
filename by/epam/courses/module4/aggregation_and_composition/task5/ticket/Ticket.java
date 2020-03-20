package by.epam.courses.module4.aggregation_and_composition.task5.ticket;

import by.epam.courses.module4.aggregation_and_composition.task5.ticket.nutrition.Nutrition;
import by.epam.courses.module4.aggregation_and_composition.task5.ticket.transport.Transport;
import by.epam.courses.module4.aggregation_and_composition.task5.ticket.type.TicketType;

import java.util.Objects;

public class Ticket {
    private TicketType type;
    private Transport transport;
    private Nutrition nutrition;
    private int days;

    public Ticket(TicketType type, Transport transport, Nutrition nutrition, int days) {
        this.type = type;
        this.transport = transport;
        this.nutrition = nutrition;
        this.days = days;
    }

    public TicketType getTicketType() {
        return type;
    }

    public Transport getTransport() {
        return transport;
    }

    public Nutrition getNutrition() {
        return nutrition;
    }

    public int getDays() {
        return days;
    }

    public void setTicketType(TicketType type) {
        this.type = type;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public void setNutrition(Nutrition nutrition) {
        this.nutrition = nutrition;
    }

    public void setDays(int days) {
        this.days = days;
    }

    @Override
    public String toString() {
        return "epam.courses.module4.aggregationAndComposition.task5.ticket.Ticket{" +
                "type='" + type + ' ' +
                ", transport='" + transport + ' ' +
                ", food='" + nutrition + ' ' +
                ", days=" + days +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return days == ticket.days &&
                type == ticket.type &&
                transport == ticket.transport &&
                nutrition == ticket.nutrition;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, transport, nutrition, days);
    }
}
