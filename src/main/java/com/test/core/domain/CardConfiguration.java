package com.test.core.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class CardConfiguration {

    private String storeId;

    private String storePassword;

    private List<CardType> cardType;

    private List<ProcessingAccountDto.CardType> cardTypes;
}
