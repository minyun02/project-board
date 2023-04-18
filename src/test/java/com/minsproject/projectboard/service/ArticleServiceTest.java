package com.minsproject.projectboard.service;

import com.minsproject.projectboard.domain.type.SearchType;
import com.minsproject.projectboard.dto.ArticleDto;
import com.minsproject.projectboard.repository.ArticleRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Page;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

@DisplayName("비지니스 로직 - 게시글")
@ExtendWith(MockitoExtension.class)
class ArticleServiceTest {

    @InjectMocks private ArticleService sut;
    @Mock private ArticleRepository articleRepository;

    @DisplayName("게시글을 검색하면, 게시글 리스트를 반환한다.")
    @Test
    void givenSearchParameters_whenSearchingArticles_thenReturnArticleList() {
        //given

        //when
        Page<ArticleDto> articles = sut.searchArticles(SearchType.TITLE, "search keyword"); //제목, 본문, ID, 닉네임, 해시태그

        //then
        assertThat(articles).isNotNull();
    }

    @DisplayName("게시글을 조회하면, 게시글을 반환한다.")
    @Test
    void givenArticleId_whenSearchingArticle_thenReturnsARticle() {
        //given

        //when
        ArticleDto article = sut.searchArticle(1L);

        //then
        assertThat(article).isNotNull();
    }
}