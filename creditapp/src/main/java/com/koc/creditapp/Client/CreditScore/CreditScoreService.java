package com.koc.creditapp.Client.CreditScore;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class CreditScoreService {

    public static final Map<String, BigDecimal> creditScore = new HashMap<>();

    static {
        creditScore.put("",BigDecimal.valueOf(200));
        creditScore.put("",BigDecimal.valueOf(400));
        creditScore.put("",BigDecimal.valueOf(1000));
        creditScore.put("",BigDecimal.valueOf(900));
    }

    public static BigDecimal getCreditScore(final String identityNo){
        if(!creditScore.containsKey(identityNo))
            throw IdentityNoNotFoundException.create(identityNo);
        return creditScore.get(identityNo);
    }
}
