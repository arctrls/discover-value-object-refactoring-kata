package com.artrls;

record ProductPrice(long originalPrice, long discountedPrice) {
    boolean isDiscounted() {
        return 0 < discountedPrice && discountedPrice < originalPrice;
    }

    long finalPrice() {
        return isDiscounted() ? discountedPrice : originalPrice;
    }

    int discountRate() {
        return (int) ((originalPrice - finalPrice()) * 100 / originalPrice);
    }
}