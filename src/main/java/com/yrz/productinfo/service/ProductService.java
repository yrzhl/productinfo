package com.yrz.productinfo.service;

import com.yrz.productinfo.common.DecreaseStockInput;
import com.yrz.productinfo.common.ProductInfoOutput;
import com.yrz.productinfo.dataobject.ProductInfo;

import java.util.List;

public interface ProductService {

    List<ProductInfo> findUpAll();

    /**
     * 查询商品列表
     * @param productIdList
     * @return
     */
    List<ProductInfoOutput> findList(List<String> productIdList);

    /**
     * 扣库存
     * @param decreaseStockInputList
     */
    void decreaseStock(List<DecreaseStockInput> decreaseStockInputList);


}
