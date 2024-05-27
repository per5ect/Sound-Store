package com.Shoppingproject.Shopping.services.admin.adminproduct;

import com.Shoppingproject.Shopping.dto.ProductDto;

import java.io.IOException;
import java.util.List;

public interface AdminProductService {
    ProductDto addProduct(ProductDto productDto) throws IOException;

    List<ProductDto> getAllProducts();

    List<ProductDto> getAllProductsByName(String name);

    Boolean deleteProduct(Long id);
}
