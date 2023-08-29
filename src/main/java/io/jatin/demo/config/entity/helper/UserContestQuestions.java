package io.jatin.demo.config.entity.helper;

import lombok.*;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class UserContestQuestions {
    Map<Long, List<Long>> contestQuestionsMap = new HashMap<>();
}
