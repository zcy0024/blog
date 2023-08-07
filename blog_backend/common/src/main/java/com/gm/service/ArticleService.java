package com.gm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gm.domain.ResponseResult;
import com.gm.domain.entity.Article;

public interface ArticleService extends IService<Article> {
    ResponseResult hotArticleList();

    ResponseResult articleList(Integer pageNum, Integer pageSize, Long categoryId);
}
