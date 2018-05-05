package com.yrz.productinfo.service.impl;

import com.yrz.productinfo.dataobject.ProductInfo;
import com.yrz.productinfo.enums.ProductStatusEnum;
import com.yrz.productinfo.repository.ProductInfoRepository;
import com.yrz.productinfo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductServiceImpl implements ProductService{


    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Override
    public List<ProductInfo> findUpAll() {
        return productInfoRepository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }
}
