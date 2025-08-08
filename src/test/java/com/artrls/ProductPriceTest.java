package com.artrls;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class ProductPriceTest {

    @Test
    void isDiscounted() {
        assertAll(
                () -> assertThat(new ProductPrice(1000L, 0L).isDiscounted()).isFalse(),
                () -> assertThat(new ProductPrice(1000L, 900L).isDiscounted()).isTrue(),
                () -> assertThat(new ProductPrice(1000L, 1000L).isDiscounted()).isFalse(),
                () -> assertThat(new ProductPrice(1000L, 1100L).isDiscounted()).isFalse()
        );
    }
}