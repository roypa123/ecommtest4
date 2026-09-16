package com.ram.ecommerce.service;

import com.ram.ecommerce.model.Category;
import com.ram.ecommerce.model.SubCategory;
import com.ram.ecommerce.repository.CategoryRepository;
import com.ram.ecommerce.repository.SubCategoryRepository;
import com.ram.ecommerce.view.SubCategoryResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public class SubCategoryService {

    private final SubCategoryRepository subCategoryRepository;
    private final CategoryRepository categoryRepository;
    private final MinioService minioService;






}
