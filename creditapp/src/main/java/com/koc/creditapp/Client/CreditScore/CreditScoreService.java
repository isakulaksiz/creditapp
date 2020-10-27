package com.koc.creditapp.Client.CreditScore;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class CreditScoreService {

    public static final Map<String, BigDecimal> creditScore = new HashMap<>();

    static {
        creditScore.put("12343210258",BigDecimal.valueOf(200));
        creditScore.put("67899876225",BigDecimal.valueOf(400));
        creditScore.put("74122147863",BigDecimal.valueOf(1000));
        creditScore.put("36988963527",BigDecimal.valueOf(900));
    }

    public static BigDecimal getCreditScore(final String identityNo){
        if(!creditScore.containsKey(identityNo))
            throw IdentityNoNotFoundException.create(identityNo);
        return creditScore.get(identityNo);
    }
}
