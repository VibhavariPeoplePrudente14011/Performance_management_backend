package com.performance.management.repository;

import com.performance.management.entity.GoalSetting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoalSettingRepository extends JpaRepository<GoalSetting, Long> {
}
