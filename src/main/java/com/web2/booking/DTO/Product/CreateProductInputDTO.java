package com.web2.booking.DTO.Product;

public record CreateProductInputDTO(String title, String city, String state, String image, double price,
                double customerScore, int numberOfReviews, int discount, double totalPrice) {

}
