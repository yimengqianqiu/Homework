package org.example.homework.service;

import org.example.homework.dao.pojo.Article;

import java.util.List;

public interface ArticleService {
    void add(Article article);

    List<Article> selectAll();

    Article selectByArticleId(Integer articleId);

    void add1(Article article);

    List<Article> selectAll1(Integer uid);

    List<Article> selectAll2(String title);

    void add2(Article article);

    void add3(Article article);
}
