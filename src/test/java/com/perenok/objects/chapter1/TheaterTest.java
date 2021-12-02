package com.perenok.objects.chapter1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

public class TheaterTest {

    @Test
    @DisplayName("극장에 관람객 enter 성공 테스트 - 초대장이 있을 때")
    void enterTest_WithInvitation() {
        //given
        Bag 가방 = new Bag(5000L, new Invitation(LocalDateTime.now()));
        Audience 관람객 = new Audience(가방);

        TicketOffice 매표소 = new TicketOffice(10000L, new Ticket(2000L), new Ticket(3000L));
        TicketSeller 판매원 = new TicketSeller(매표소);
        Theater 극장 = new Theater(판매원);

        //when
        극장.enter(관람객);

        //then
        assertThat(관람객.hasTicket()).isTrue();
    }

    @Test
    @DisplayName("극장에 관람객 enter 성공 테스트 - 초대장이 없을 때")
    void enterTest_WithoutInvitation() {
        //given
        Bag 가방 = new Bag(5000L);
        Audience 관람객 = new Audience(가방);

        TicketOffice 매표소 = new TicketOffice(10000L, new Ticket(2000L), new Ticket(3000L));
        TicketSeller 판매원 = new TicketSeller(매표소);
        Theater 극장 = new Theater(판매원);

        //when
        극장.enter(관람객);

        //then
        assertThat(관람객.hasTicket()).isTrue();
        assertThat(관람객.getMoney()).isEqualTo(3000L);
        assertThat(매표소.getMoney()).isEqualTo(12000L);
    }
}
