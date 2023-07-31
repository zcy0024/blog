package com.gm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gm.domain.ResponseResult;
import com.gm.domain.entity.Category;


/**
 * 分类表(Category)表服务接口
 *
 * @author zcy0024
 * @since 2023-07-23 18:20:28
 */
public interface CategoryService extends IService<Category> {

    ResponseResult getCategoryList();
}

