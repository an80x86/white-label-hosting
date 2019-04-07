package com.an80x86.whitelabelhosting.repository;

import com.an80x86.whitelabelhosting.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
}
