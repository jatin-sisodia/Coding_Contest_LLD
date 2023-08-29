package io.jatin.demo.config.entity;

import io.jatin.demo.config.entity.converter.UserContestQuestionsConverter;
import io.jatin.demo.config.entity.helper.UserContestQuestions;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigInteger;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@Builder
@Entity
@Table(name = "users")
public class User extends BaseEntity {
    @Column(unique = true)
    String username;

    BigInteger score;

    @Builder.Default
    @Convert(converter = UserContestQuestionsConverter.class)
    UserContestQuestions userContestQuestions = new UserContestQuestions();
}
