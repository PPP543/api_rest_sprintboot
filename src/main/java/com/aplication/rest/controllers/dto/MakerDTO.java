package com.aplication.rest.controllers.dto;

import com.aplication.rest.entities.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class MakerDTO {
    private Long id;
    private String name;
    private List<Product> productList;

}
