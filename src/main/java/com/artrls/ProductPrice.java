package com.artrls;

public record ProductPrice(long originalPrice, long discountedPrice) {
    boolean isDiscounted() {
        return (discountedPrice() > 0) && (discountedPrice() < originalPrice());
    }

    long finalPrice() {
        return isDiscounted() ? discountedPrice() : originalPrice();
    }

    int discountRate() {
        final long selPrc = originalPrice();
        final long finalDscPrc = finalPrice();
        return (int) ((selPrc - finalDscPrc) * 100 / selPrc);
    }
}