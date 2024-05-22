package com.wipro.OneOneMapping.repository;

import com.wipro.OneOneMapping.model.Traveler;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TravelerRepository extends JpaRepository<Traveler,Long> {
}
