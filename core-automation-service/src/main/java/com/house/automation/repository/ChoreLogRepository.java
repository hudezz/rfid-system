package com.house.automation.repository;

import com.house.automation.model.ChoreLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChoreLogRepository extends JpaRepository<ChoreLog, Long> {
}
