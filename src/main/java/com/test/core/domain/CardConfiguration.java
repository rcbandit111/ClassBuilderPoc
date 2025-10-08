package com.test.core.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@SuperBuilder
public class CardConfiguration {

    private String carId;
    private String storePassword;
    private List<CardType> cardType;
    private List<ProcessingAccountDto.CardType> cardTypes;
}
