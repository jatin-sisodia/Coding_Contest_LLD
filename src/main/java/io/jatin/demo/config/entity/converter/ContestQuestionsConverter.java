package io.jatin.demo.config.entity.converter;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.jatin.demo.config.entity.helper.ContestQuestions;
import lombok.SneakyThrows;

import javax.persistence.AttributeConverter;

public class ContestQuestionsConverter implements AttributeConverter<ContestQuestions, String > {
    ObjectMapper objectMapper = new ObjectMapper();
    @SneakyThrows
    @Override
    public String convertToDatabaseColumn(ContestQuestions contestQuestions) {
        if (contestQuestions == null) return "";
        return objectMapper.writeValueAsString(contestQuestions);
    }

    @SneakyThrows
    @Override
    public ContestQuestions convertToEntityAttribute(String s) {
        if (s == null || s.length() == 0) return new ContestQuestions();
        return objectMapper.readValue(s, ContestQuestions.class);
    }
}
