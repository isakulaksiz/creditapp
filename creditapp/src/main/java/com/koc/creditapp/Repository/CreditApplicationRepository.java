package com.koc.creditapp.Repository;

import com.koc.creditapp.Entities.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditApplicationRepository extends JpaRepository<Candidate, Long> {
}
