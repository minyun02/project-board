package com.minsproject.projectboard.service;

import com.minsproject.projectboard.domain.Article;
import com.minsproject.projectboard.domain.ArticleComment;
import com.minsproject.projectboard.dto.ArticleCommentDto;
import com.minsproject.projectboard.repository.ArticleCommentRepository;
import com.minsproject.projectboard.repository.ArticleRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.BDDMockito.given;

@DisplayName("비지니스 로직 - 댓글")
@ExtendWith(MockitoExtension.class)
class ArticleCommentServiceTest {

    @InjectMocks private ArticleCommentService sut; //테스트 대상
    @Mock private ArticleRepository articleRepository;
    @Mock private ArticleCommentRepository articleCommentRepository;


    @DisplayName("게시글 ID로 조회하면, 해당하는 댓글 리스트를 반환한다.")
    @Test
    void givenArticleId_whenSearchingArticleComments_thenReturnsArticleComments() {
        //given
        Long articleId = 1L;
        given(articleRepository.findById(articleId)).willReturn(Optional.of(
                Article.of("title", "content", "#java"))
        );
        //when
        List<ArticleCommentDto> articleComments = sut.searchArticleComment(1L);
        //then
        assertThat(articleComments).isNotNull();
        BDDMockito.then(articleRepository).should().findById(articleId);
    }
}