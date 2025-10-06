package com.test.core.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ProcessingAccountResource extends ProcessingAccountDto {

    private String id;

    private String groupId;

    private String carAccountId;

    private ProcessingAccountDto cardConfiguration;
}