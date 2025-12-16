package com.fastcampus.projectboard.repository;

import com.fastcampus.projectboard.config.JpaConfig;
import com.fastcampus.projectboard.domain.Article;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;
import org.springframework.boot.jdbc.test.autoconfigure.AutoConfigureTestDatabase;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@ActiveProfiles("testdb")
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE) //테스트db를 따로 불러오지 말고 설정된 db를 사용
@DisplayName("JPA 연결 테스트")
@Import({JpaConfig.class})
@DataJpaTest
class JpaRepositoryTest {

    private ArticleRepository articleRepository;
    private ArticleCommentRepository articleCommentRepository;

    public JpaRepositoryTest(@Autowired ArticleRepository articleRepository, @Autowired ArticleCommentRepository articleCommentRepository) {
        this.articleRepository = articleRepository;
        this.articleCommentRepository = articleCommentRepository;
    }

    @DisplayName("select 테스트")
    @Test
    void givenSelectTestData() {
        //Given

        //When
        List<Article> articles = articleRepository.findAll();

        //Then
        assertThat(articles)
                .isNotNull()
                .hasSize(20);
    }

    @DisplayName("insert 테스트")
    @Test
    void givenInsertTestData() {
        //Given
        long articlePreviousCount = articleRepository.count();

        //When
        articleRepository.save(Article.of("제목테스트","내용테스트","#패스트캠퍼스"));

        //Then
        assertThat(articleRepository.count()).isEqualTo(articlePreviousCount +1);
    }

    @DisplayName("update 테스트")
    @Test
    void givenUpdateTestData() {
        //Given
        Article article = articleRepository.findById(1L).orElseThrow();

        //When
        String updateHashTag = "#updateHashTag";
        article.setHashtag(updateHashTag);
        Article savedArticle = articleRepository.save(article);

        //Then
        assertThat(savedArticle).hasFieldOrPropertyWithValue("hashtag", updateHashTag);
    }

    @DisplayName("delete 테스트")
    @Test
    void givenDeleteTestData() {
        //Given
        Article article = articleRepository.findById(1L).orElseThrow();
        long previousArticleCount = articleRepository.count();//총 게시글수
        long previousCommetCount = articleCommentRepository.count();//총댓글수
        long deletedCount = article.getArticleComments().size();//삭제할 댓글수

        //When
        articleRepository.delete(article);

        //Then
        assertThat(articleRepository.count()).isEqualTo(previousArticleCount-1);
        assertThat(articleCommentRepository.count()).isEqualTo(previousCommetCount-deletedCount);
    }

}