package com.perenok.objects.chapter1;

public class Audience {

    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Long buy(Ticket ticket) {
        return bag.hold(ticket);
    }

    public boolean hasTicket() {
        return bag.hasTicket();
    }

    public Long getMoney() {
        return bag.getMoney();
    }
}
