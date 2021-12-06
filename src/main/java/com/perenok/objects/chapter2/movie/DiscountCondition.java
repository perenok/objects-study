package com.perenok.objects.chapter2.movie;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
