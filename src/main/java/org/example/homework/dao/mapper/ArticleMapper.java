package org.example.homework.dao.mapper;

import org.example.homework.dao.pojo.Article;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ArticleMapper {
    void add(Article article);

    List<Article> selectAll();

    Article selectByArticleId(Integer articleId);

    void add1(Article article);

    List<Article> selectAll1(Integer uid);

    List<Article> selectAll2(String title);

    void add2(Article article);

    void add3(Article article);
}
