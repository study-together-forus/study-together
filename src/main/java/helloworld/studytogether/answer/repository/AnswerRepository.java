package helloworld.studytogether.answer.repository;

import helloworld.studytogether.answer.entity.Answer;
import helloworld.studytogether.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long> {
    int countByUser_UserId(Long userId);  // 특정 사용자의 작성한 답변 개수 계산
    int countByUser_UserIdAndIsSelectedTrue(Long userId);  // 특정 사용자의 채택된 답변 개수 계산

    // 특정 질문에 채택된 답변이 있는지 확인
    Optional<Answer> findByQuestion_QuestionIdAndIsSelectedTrue(Long questionId);

}