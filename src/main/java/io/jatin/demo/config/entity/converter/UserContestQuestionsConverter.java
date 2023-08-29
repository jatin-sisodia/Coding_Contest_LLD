package io.jatin.demo.config.entity.converter;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.jatin.demo.config.entity.helper.UserContestQuestions;
import lombok.SneakyThrows;

import javax.persistence.AttributeConverter;

public class UserContestQuestionsConverter implements AttributeConverter<UserContestQuestions, String> {
    ObjectMapper objectMapper = new ObjectMapper();
    @SneakyThrows
    @Override
    public String convertToDatabaseColumn(UserContestQuestions userContestQuestions) {
        if (userContestQuestions == null) return "";
        return objectMapper.writeValueAsString(userContestQuestions);
    }

    @SneakyThrows
    @Override
    public UserContestQuestions convertToEntityAttribute(String s) {
        if (s.equals("") || s == null) return new UserContestQuestions();
        return objectMapper.readValue(s, UserContestQuestions.class);
    }
}
