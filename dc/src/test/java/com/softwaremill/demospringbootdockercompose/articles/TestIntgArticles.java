package com.softwaremill.demospringbootdockercompose.articles;

import com.softwaremill.demospringbootdockercompose.AbstTestIntg;
import com.softwaremill.demospringbootdockercompose.domain.articles.Article;
import com.softwaremill.demospringbootdockercompose.domain.articles.ArticleId;
import com.softwaremill.demospringbootdockercompose.domain.articles.Author;
import com.softwaremill.demospringbootdockercompose.domain.articles.Content;
import com.softwaremill.demospringbootdockercompose.infrastructure.articles.api.Articles;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

public final class TestIntgArticles extends AbstTestIntg
{
    @Test
    void shouldReturnSavedArticle()
    {
	Article lToBeStoredArticle = new Article(new ArticleId(UUID.randomUUID().toString()),
				      new Author("test-author"),
				      new Content("test content"));
	articlesRepository.save(lToBeStoredArticle);

	Articles lFetchedArticles = testRestTemplate.getForObject("/api/articles", Articles.class);
	assertThat(lFetchedArticles).isEqualTo(new Articles(List.of(lToBeStoredArticle)));
    }
}
