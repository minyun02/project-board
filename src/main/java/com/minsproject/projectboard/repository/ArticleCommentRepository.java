package com.minsproject.projectboard.repository;

import com.minsproject.projectboard.domain.Article;
import com.minsproject.projectboard.domain.ArticleComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleCommentRepository extends JpaRepository<ArticleComment, Long> {
}
