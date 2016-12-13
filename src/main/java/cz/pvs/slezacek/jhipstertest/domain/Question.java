package cz.pvs.slezacek.jhipstertest.domain;


import javax.persistence.*;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A Question.
 */
@Entity
@Table(name = "question")
public class Question implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Lob
    @Column(name = "question", nullable = false)
    private String question;

    @Column(name = "general_question")
    private String generalQuestion;

    @Column(name = "answer")
    private String answer;

    @Column(name = "general_answer")
    private String generalAnswer;

    @ManyToOne
    @NotNull
    private User questioner;

    @ManyToOne
    private User answerer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public Question question(String question) {
        this.question = question;
        return this;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getGeneralQuestion() {
        return generalQuestion;
    }

    public Question generalQuestion(String generalQuestion) {
        this.generalQuestion = generalQuestion;
        return this;
    }

    public void setGeneralQuestion(String generalQuestion) {
        this.generalQuestion = generalQuestion;
    }

    public String getAnswer() {
        return answer;
    }

    public Question answer(String answer) {
        this.answer = answer;
        return this;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getGeneralAnswer() {
        return generalAnswer;
    }

    public Question generalAnswer(String generalAnswer) {
        this.generalAnswer = generalAnswer;
        return this;
    }

    public void setGeneralAnswer(String generalAnswer) {
        this.generalAnswer = generalAnswer;
    }

    public User getQuestioner() {
        return questioner;
    }

    public Question questioner(User user) {
        this.questioner = user;
        return this;
    }

    public void setQuestioner(User user) {
        this.questioner = user;
    }

    public User getAnswerer() {
        return answerer;
    }

    public Question answerer(User user) {
        this.answerer = user;
        return this;
    }

    public void setAnswerer(User user) {
        this.answerer = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Question question = (Question) o;
        if (question.id == null || id == null) {
            return false;
        }
        return Objects.equals(id, question.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Question{" +
            "id=" + id +
            ", question='" + question + "'" +
            ", generalQuestion='" + generalQuestion + "'" +
            ", answer='" + answer + "'" +
            ", generalAnswer='" + generalAnswer + "'" +
            '}';
    }
}
