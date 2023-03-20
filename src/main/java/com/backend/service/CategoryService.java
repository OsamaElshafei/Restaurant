package com.backend.service;

import com.backend.dao.CategoryRepo;
import com.backend.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    private CategoryRepo categoryRepo;
    @Autowired
    public CategoryService(CategoryRepo categoryRepo) {
        this.categoryRepo = categoryRepo;
    }

    public List<Category>AllCategory(){
        return categoryRepo.findAll();
    }

}
