package com.koc.creditapp.Controller;

import com.koc.creditapp.Entities.Candidate;
import com.koc.creditapp.Model.CreditAppRequest;
import com.koc.creditapp.Service.CreditApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CreditApplicationController {
    // Dependency Inj-Singleton Design
    @Autowired
    private CreditApplicationService creditApplicationService;

    @RequestMapping(value = "/creditapplication/confirmation", method = { RequestMethod.GET })
    public ResponseEntity creditCandidateCheck(@RequestBody CreditAppRequest creditAppRequest){
        return ResponseEntity.ok(creditApplicationService.checkCreditAppCandidate(creditAppRequest));
    }

    @GetMapping("/getcandidates")
    Iterable<Candidate> all(){
        return creditApplicationService.findAll();
    }
}
