package com.mycompany.repository;

import com.mycompany.entity.RateEntity;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

@Repository
public interface RateJpaRepository extends JpaRepositoryImplementation<RateEntity, Integer> {
}
