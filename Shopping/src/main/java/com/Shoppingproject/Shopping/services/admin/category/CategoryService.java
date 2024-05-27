package com.Shoppingproject.Shopping.services.admin.category;

import com.Shoppingproject.Shopping.dto.CategoryDto;
import com.Shoppingproject.Shopping.entity.Category;

import java.util.List;

public interface CategoryService {

    Category createCategory(CategoryDto categoryDto);
    List<Category> getAllCategories();
}
