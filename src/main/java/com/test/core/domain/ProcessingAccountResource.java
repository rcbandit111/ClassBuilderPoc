package com.test.core.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public class ProcessingAccountResource extends ProcessingAccountDto {

    private String id;
    private String groupId;
    private String carAccountId;
    private ProcessingAccountDto cardConfiguration;
}