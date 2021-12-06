package com.perenok.objects.chapter2.movie;

public interface DiscountPolicy {

    Money calculateDiscountAmount(Screening screening);
}
