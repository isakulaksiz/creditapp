package com.koc.creditapp.Model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

@Getter
@Setter
public class CreditAppRequest {

    @NotBlank(message="Identity is mandatory!")
    private String identityNo;
    private String name;
    private String surname;
    @NotBlank(message = "Income is mandatory!")
    private BigDecimal income;

}
