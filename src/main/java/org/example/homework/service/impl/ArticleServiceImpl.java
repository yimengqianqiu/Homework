package org.example.homework.service.impl;

import org.example.homework.dao.mapper.ArticleMapper;
import org.example.homework.dao.pojo.Article;
import org.example.homework.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public void add(Article article) {
        articleMapper.add(article);
    }
    @Override
    public List<Article> selectAll() {
        return articleMapper.selectAll();
    }

    @Override
    public Article selectByArticleId(Integer articleId) {
        return articleMapper.selectByArticleId(articleId);
    }

    @Override
    public void add1(Article article) {
         articleMapper.add1(article);
    }

    @Override
    public List<Article> selectAll1(Integer uid) {
        return articleMapper.selectAll1(uid);
    }

    @Override
    public List<Article> selectAll2(String title) {
        return articleMapper.selectAll2(title);
    }

    @Override
    public void add2(Article article) {
        articleMapper.add2(article);
    }

    @Override
    public void add3(Article article) {
        articleMapper.add3(article);
    }
}