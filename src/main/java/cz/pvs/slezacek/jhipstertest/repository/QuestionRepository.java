package cz.pvs.slezacek.jhipstertest.repository;

import cz.pvs.slezacek.jhipstertest.domain.Question;

import org.springframework.data.jpa.repository.*;

import java.util.List;

/**
 * Spring Data JPA repository for the Question entity.
 */
@SuppressWarnings("unused")
public interface QuestionRepository extends JpaRepository<Question,Long> {

    @Query("select question from Question question where question.questioner.login = ?#{principal.username}")
    List<Question> findByQuestionerIsCurrentUser();

    @Query("select question from Question question where question.answerer.login = ?#{principal.username}")
    List<Question> findByAnswererIsCurrentUser();

}
