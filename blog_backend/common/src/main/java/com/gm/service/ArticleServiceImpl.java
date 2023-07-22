package com.gm.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gm.entity.Article;
import com.gm.mapper.ArticleMapper;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService{
}
