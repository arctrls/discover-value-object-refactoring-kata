package com.artrls;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class ProductPriceTest {

    @Test
    void isDiscounted() {
        assertAll(
                () -> assertIsDiscounted(1_000L, 0L, false),
                () -> assertIsDiscounted(1_000L, 900L, true),
                () -> assertIsDiscounted(1_000L, 1_000L, false),
                () -> assertIsDiscounted(1_000L, 1_100L, false)
        );
    }

    private void assertIsDiscounted(final long originalPrice, final long discountedPrice, final boolean expected) {
        assertThat(new ProductPrice(originalPrice, discountedPrice).isDiscounted()).isEqualTo(expected);
    }
}