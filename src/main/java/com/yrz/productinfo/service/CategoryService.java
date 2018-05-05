package com.yrz.productinfo.service;

import com.yrz.productinfo.dataobject.ProductCategory;

import java.util.List;

public interface CategoryService {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);




}
