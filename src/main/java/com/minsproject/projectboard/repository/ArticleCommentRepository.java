package com.minsproject.projectboard.repository;

import com.minsproject.projectboard.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleCommentRepository extends JpaRepository<Article, Long> {
}
