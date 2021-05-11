package com.gmail.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gmail.product.entity.BrandEntity;
import com.gmail.product.service.BrandService;
import com.gmail.product.service.CategoryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GmailProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Autowired
    CategoryService categoryService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity=new BrandEntity();
        brandEntity.setBrandId(1L);
        brandEntity.setDescript("华为");
        brandService.save(brandEntity);
        brandService.updateById(brandEntity);

        List<BrandEntity> list=brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id",1L));

        list.forEach((item)->{
            System.out.println(item);
        });
    }

}
