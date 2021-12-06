package com.perenok.objects.chapter2.policy;

import com.perenok.objects.chapter2.movie.Money;
import com.perenok.objects.chapter2.movie.Screening;

public interface DiscountPolicy {

    Money calculateDiscountAmount(Screening screening);
}
