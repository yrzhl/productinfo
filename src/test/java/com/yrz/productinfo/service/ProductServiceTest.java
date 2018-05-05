package com.yrz.productinfo.service;

import com.yrz.productinfo.ProductinfoApplicationTests;
import com.yrz.productinfo.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductServiceTest extends ProductinfoApplicationTests{


    @Autowired
    ProductService productService;

    @Test
    public void findUpAll() {

        List<ProductInfo> list = productService.findUpAll();
        Assert.assertTrue(list.size()>0);
    }
}