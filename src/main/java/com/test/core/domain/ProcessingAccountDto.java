package com.test.core.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonTypeName("processingAccounts")
@SuperBuilder
public class ProcessingAccountDto extends CardConfiguration  {

    private String id;
    public String type;

    @JsonProperty("sourceAuthority")
    private String groupId;
    private String carAccountId;
    private String descriptor;
    private CardConfiguration cardConfiguration;
    private List<CardType> cardTypes;


    @Getter
    @Setter
    @Builder
    @AllArgsConstructor
    public static class CardType {

        public CardType() {
        }

        private TypeOfCard type;
        private String processorCode;
        private Category category;
        private Boolean enabled;
    }

    public enum BatchSecurityOptions {

    }

    public enum ProcessingAccountType {
        CARD,
        DD
    }

    public enum TypeOfCard {
        MC
    }

    public enum Category {
        CREDIT,
        DEBIT;
        public String getCategory() {
            return null;
        }
    }

    public enum Status {
    }

    public CardConfiguration getCardConfiguration() {
        return cardConfiguration;
    }
}
