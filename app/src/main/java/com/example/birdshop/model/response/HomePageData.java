package com.example.birdshop.model.response;

import com.example.birdshop.model.BrandDTO;
import com.example.birdshop.model.CategoryDTO;
import com.example.birdshop.model.ProductDTO;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class HomePageData {

    @SerializedName("filters")
    public Filters filters;

    @SerializedName("categories")
    public List<CategoryDTO> categories;

    @SerializedName("brands")
    public List<BrandDTO> brands;

    @SerializedName("products")
    public List<ProductDTO> products;

    @SerializedName("pagination")
    public Pagination pagination;

    public static class Filters {
        @SerializedName("selectedCategory") public String selectedCategory;
        @SerializedName("selectedBrand") public String selectedBrand;
        @SerializedName("sortOption") public String sortOption;
    }

    public static class Pagination {
        @SerializedName("page") public int page;
        @SerializedName("size") public int size;
        @SerializedName("totalPages") public int totalPages;
        @SerializedName("totalElements") public long totalElements;
    }
}