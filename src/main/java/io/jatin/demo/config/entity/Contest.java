package io.jatin.demo.config.entity;

import io.jatin.demo.config.constant.ContestStatus;
import io.jatin.demo.config.constant.Level;
import io.jatin.demo.config.entity.converter.ContestQuestionsConverter;
import io.jatin.demo.config.entity.helper.ContestQuestions;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@Builder
@Entity
@Table(name = "contests")
public class Contest extends BaseEntity{
    String name;

    Long userId;

    @Enumerated(EnumType.STRING)
    Level level;

    @Enumerated(EnumType.STRING)
    ContestStatus status;

    @Convert(converter = ContestQuestionsConverter.class)
    ContestQuestions contestQuestions;
}
