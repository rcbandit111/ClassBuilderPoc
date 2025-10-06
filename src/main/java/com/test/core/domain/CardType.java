package com.test.core.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class CardType {

    public CardType() {
    }

    private ProcessingAccountDto.TypeOfCard type;
    private String processorCode;
    private ProcessingAccountDto.Category category;
    private Boolean enabled;
}
