package com.perenok.objects.chapter1;

public class Theater {

    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience) {
        if (audience.getBag().hasInvitation()) {
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().setTicket(ticket);
        } else {
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().minusMoney(ticket.getFee());
            ticketSeller.getTicketOffice().plusMoney(ticket.getFee());
            audience.getBag().setTicket(ticket);
        }
    }
}
