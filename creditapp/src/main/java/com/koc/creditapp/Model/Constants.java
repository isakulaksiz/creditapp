package com.koc.creditapp.Model;

import java.math.BigDecimal;

public class Constants {
    public static BigDecimal MIN_CREDIT = BigDecimal.valueOf(500);
    public static BigDecimal MAX_CREDIT = BigDecimal.valueOf(1000);
    public static String CREDIT_APP_UNSUCCESSFUL_RESPONSE = "Your credit application rejected !";
    public static BigDecimal creditLimitFactor = BigDecimal.valueOf(4);
    public static String CREDIT_APP_SUCCESSFUL_RESPONSE = "Your credit application confirmed..";
}
