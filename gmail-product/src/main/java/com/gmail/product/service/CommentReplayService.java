package com.gmail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gmail.common.utils.PageUtils;
import com.gmail.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author wux
 * @email 2226541055@qq.com
 * @date 2021-05-09 22:13:50
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

