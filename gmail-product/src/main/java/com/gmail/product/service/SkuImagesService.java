package com.gmail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gmail.common.utils.PageUtils;
import com.gmail.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author wux
 * @email 2226541055@qq.com
 * @date 2021-05-09 22:13:50
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

