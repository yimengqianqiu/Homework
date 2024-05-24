package org.example.homework.dao.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Article {
    private Integer articleId;
    private Integer uid;
    private String title;
    private String content;
    private String publishedTime;
    private Integer likes;
    private Integer favorites;
    private Integer comments;
}
