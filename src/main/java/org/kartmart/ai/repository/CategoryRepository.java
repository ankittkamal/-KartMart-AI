package org.kartmart.ai.repository;

import org.kartmart.ai.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}