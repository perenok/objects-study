package com.perenok.objects.chapter2.policy;

import com.perenok.objects.chapter2.movie.Money;
import com.perenok.objects.chapter2.movie.Screening;

public class NoneDiscountPolicy implements DiscountPolicy {

    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
