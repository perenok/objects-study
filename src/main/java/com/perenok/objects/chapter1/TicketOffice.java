package com.perenok.objects.chapter1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicketOffice {

    private Long money;
    private List<Ticket> tickets = new ArrayList<>();

    public TicketOffice(Long money, Ticket... tickets) {
        this.money = money;
        this.tickets.addAll(Arrays.asList(tickets));
    }

    public void sellTicketTo(Audience audience) {
        plusMoney(audience.buy(getTicket()));
    }

    private Ticket getTicket() {
        return tickets.remove(0);
    }

    private void plusMoney(Long money) {
        this.money += money;
    }

    private void minusMoney(Long money) {
        this.money -= money;
    }

    public Long getMoney() {
        return money;
    }
}
