package com.koc.creditapp.Service;

import com.koc.creditapp.Client.CreditScore.CreditScoreService;
import com.koc.creditapp.Entities.Candidate;
import com.koc.creditapp.Model.Constants;
import com.koc.creditapp.Model.CreditAppRequest;
import com.koc.creditapp.Model.CreditAppResponse;
import com.koc.creditapp.Repository.CreditApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class DefaultCreditAppService  implements CreditApplicationService{
    @Autowired
    private CreditApplicationRepository repository;


    @Override
    public CreditAppResponse checkCreditAppCandidate(CreditAppRequest request) {
        final BigDecimal creditScore = CreditScoreService.getCreditScore(request.getIdentityNo());

        final Boolean status = checkCreditAppStatus(creditScore);
        if (!status)
            return CreditAppResponse
                    .builder()
                    .isSuccessful(false)
                    .message(Constants.CREDIT_APP_UNSUCCESSFUL_RESPONSE)
                    .build();

        return CreditAppResponse.builder()
                .message(Constants.CREDIT_APP_SUCCESSFUL_RESPONSE)
                .isSuccessful(true)
                .build();
    }

    private Boolean checkCreditAppStatus(final BigDecimal creditScore) {
        if (creditScore.compareTo(Constants.MIN_CREDIT) < 0)
            return Boolean.FALSE;

        return Boolean.TRUE;
    }

    @Override
    public Iterable<Candidate> findAll() {
        return repository.findAll();
    }
}
