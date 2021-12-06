package com.perenok.objects.chapter2.movie;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

public class ScreeningTest {

    @Test
    @DisplayName("예약 확인 테스트 - 일정량 금액 할인 정책 적용, 할인조건은 sequence")
    void reserveTest_WithAmountDiscountPolicy() {
        //given
        Movie movie = new Movie(
                "아이언맨",
                Duration.ofMinutes(210),
                Money.wons(12000L),
                new AmountDiscountPolicy(Money.wons(3000L), new SequenceCondition(3))
        );
        Screening screening = new Screening(movie, 3, LocalDateTime.now());
        Customer customer = new Customer("크로플", "1234");
        int audienceCount = 2;

        //when
        Reservation reserve = screening.reserve(customer, audienceCount);

        //then
        assertThat(reserve.getFee().getAmount()).isEqualTo(18000L);
    }

    @Test
    @DisplayName("예약 확인 테스트 - 일정량 금액 할인 정책 적용, 할인조건은 sequence")
    void reserveTest_With() {
        //given
        Movie movie = new Movie(
                "아이언맨",
                Duration.ofMinutes(210),
                Money.wons(12000L),
                new PercentDiscountPolicy(0.3, new SequenceCondition(3))
        );
        Screening screening = new Screening(movie, 3, LocalDateTime.now());
        Customer customer = new Customer("크로플", "1234");
        int audienceCount = 2;

        //when
        Reservation reserve = screening.reserve(customer, audienceCount);

        //then
        assertThat(reserve.getFee().getAmount()).isEqualTo(16800L);
    }
}
