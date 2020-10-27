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
        return null;
    }

    @Override
    public Iterable<Candidate> findAll() {
        return repository.findAll();
    }
}
