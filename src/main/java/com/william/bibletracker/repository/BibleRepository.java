package com.william.bibletracker.repository;

import com.william.bibletracker.entity.Bible;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BibleRepository extends JpaRepository<Bible, Integer> {
}
