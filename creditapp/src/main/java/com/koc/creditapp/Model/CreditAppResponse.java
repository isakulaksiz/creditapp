package com.koc.creditapp.Model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
public class CreditAppResponse {
    private Boolean isSuccessful;
    private BigDecimal limit;
    private String message;
}
