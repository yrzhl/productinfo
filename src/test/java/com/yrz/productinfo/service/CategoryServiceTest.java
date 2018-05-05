package com.yrz.productinfo.service;

import com.yrz.productinfo.ProductinfoApplicationTests;
import com.yrz.productinfo.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;


@Component
public class CategoryServiceTest  extends ProductinfoApplicationTests{


    @Autowired
    private  CategoryService categoryService;

    @Test
    public void findByCategoryTypeIn() {
        List<ProductCategory> list = categoryService.findByCategoryTypeIn(Arrays.asList(11,22));

        Assert.assertTrue(list.size()>0);
    }
}