package org.example.homework.controller;

import org.example.homework.dao.pojo.Article;
import org.example.homework.dao.pojo.Result;
import org.example.homework.service.ArticleService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;



    @RequestMapping("/add")
    public Result add(@RequestBody Article article,HttpSession session){
        Integer uid = (Integer) session.getAttribute("uid");
        article.setUid(uid);
        Date date=new Date();
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        article.setPublishedTime(df.format(date));
        try {
            articleService.add(article);
            return new Result(200,"文章发布成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(500,"文章未发布成功",e);
        }
    }

    @RequestMapping("/selectAll")
    public Result selectAll(){
        try {
            List<Article> articles =articleService.selectAll();
            return new Result(200,"查询成功",articles);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(500,"查询失败",e);
        }
    }

    @RequestMapping("/selectByArticleId")
    public Result selectByArticleId(String articleId){
        try {
            Article article=articleService.selectByArticleId(Integer.valueOf(articleId));
            return new Result(200,"查询成功",article);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return new Result(500,"查询失败",e);
        }
    }



    @RequestMapping("/add1")
    public Result add1(@RequestBody Article article){
        try {
            articleService.add1(article);
            return new Result(200,"点赞成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(500,"点赞失败",e);
        }
    }

    @RequestMapping("/selectAll1")
    public Result selectAll1(HttpSession session){
        Integer uid = (Integer) session.getAttribute("uid");
        try {
            List<Article> articles =articleService.selectAll1(uid);
            return new Result(200,"查询成功",articles);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(500,"查询失败",e);

        }
    }

    @RequestMapping("/selectAll2")
    public Result selectAll2(@RequestBody String queryString){
        String title = queryString;
        try {
            List<Article> articles =articleService.selectAll2(title);
            return new Result(200,"查询成功",articles);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(500,"查询失败",e);

        }
    }

    @RequestMapping("/add2")
    public Result add2(@RequestBody Article article){
        try {
            articleService.add2(article);
            return new Result(200,"收藏成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(500,"收藏失败",e);
        }
    }
    @RequestMapping("/add3")
    public Result add3(@RequestBody Article article){
        try {
            articleService.add3(article);
            return new Result(200,"收藏成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(500,"收藏失败",e);
        }
    }

}
