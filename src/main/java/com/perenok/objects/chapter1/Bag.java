package com.perenok.objects.chapter1;

public class Bag {

    private Long money;
    private Ticket ticket;
    private Invitation invitation;

    public Bag(Long money) {
        this.money = money;
    }

    public Bag(Long money, Invitation invitation) {
        this.money = money;
        this.invitation = invitation;
    }

    public Long hold(Ticket ticket) {
        if (hasInvitation()) {
            setTicket(ticket);
            return 0L;
        } else {
            minusMoney(ticket.getFee());
            setTicket(ticket);
            return ticket.getFee();
        }
    }

    private void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    private boolean hasInvitation() {
        return invitation != null;
    }

    private void minusMoney(Long money) {
        this.money -= money;
    }

    private void plusMoney(Long money) {
        this.money += money;
    }
}
