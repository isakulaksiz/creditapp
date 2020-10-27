package com.koc.creditapp.Service;

import com.koc.creditapp.Entities.Candidate;
import com.koc.creditapp.Model.CreditAppRequest;
import com.koc.creditapp.Model.CreditAppResponse;


public interface CreditApplicationService {

    CreditAppResponse checkCreditAppCandidate(final CreditAppRequest request);

    Iterable<Candidate> findAll();
}
