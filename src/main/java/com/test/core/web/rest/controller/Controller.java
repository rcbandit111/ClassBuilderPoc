package com.test.core.web.rest.controller;

import com.test.core.domain.CardConfiguration;
import com.test.core.domain.ProcessingAccountDto;
import com.test.core.domain.ProcessingAccountDto.CardType;
import com.test.core.domain.ProcessingAccountResource;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class Controller {

    @GetMapping("/api/test")
    public String test(ProcessingAccountResource processingAccountResource)
    {
        List<CardType> cardTypes = Optional.ofNullable(processingAccountResource)
                .map(ProcessingAccountDto::getCardConfiguration)
                .map(CardConfiguration::getCardTypes)
                .orElse(null);

        CardConfiguration.builder().cardType((List<com.test.core.domain.CardType>) com.test.core.domain.CardType.builder().type(null).build()).build();

        return "test";
    }
}
