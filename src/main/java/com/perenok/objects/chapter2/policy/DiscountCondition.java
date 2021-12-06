package com.perenok.objects.chapter2.policy;

import com.perenok.objects.chapter2.movie.Screening;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
