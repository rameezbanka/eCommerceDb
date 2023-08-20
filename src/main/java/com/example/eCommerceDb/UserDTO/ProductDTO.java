package com.example.eCommerceDb.UserDTO;

import lombok.Data;

@Data
public class ProductDTO {
    private Long id;
    private String title;
    private String description;
    private double price;
    private String image;
}
