package com.Shoppingproject.Shopping.services.customer;

import com.Shoppingproject.Shopping.dto.ProductDetailDto;
import com.Shoppingproject.Shopping.dto.ProductDto;

import java.util.List;

public interface CustomerProductService {
    List<ProductDto> getAllProducts();

    List<ProductDto> searchProductByTitle(String name);

    ProductDetailDto getProductDetailById(Long productId);
}
