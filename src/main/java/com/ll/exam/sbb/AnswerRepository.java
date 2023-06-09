package com.ll.exam.sbb;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {
  @Transactional
  @Modifying
  @Query(value = "truncate answer", nativeQuery = true)
  void truncate();
}