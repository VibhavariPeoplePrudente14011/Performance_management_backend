package com.performance.management.service;

import com.performance.management.DTO.GoalSettingDTO;
import com.performance.management.entity.Bhag;
import com.performance.management.entity.GoalSetting;
import com.performance.management.entity.Roles;
import com.performance.management.entity.Usertable;
import com.performance.management.repository.BhagRepository;
import com.performance.management.repository.GoalSettingRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;
import java.util.Optional;

@Service
public class GoalSettingService {

    @Autowired
    private BhagRepository BhagRepository;

    @Autowired
    private GoalSettingRepository goalSettingRepository;

    @Autowired
    ModelMapper modelMapper;

    public GoalSetting saveGoal(GoalSettingDTO goalSetting) {
        Bhag bhag = new Bhag();
        bhag.setId(goalSetting.getBhagFid());
        GoalSetting goalSetting1 = modelMapper.map(goalSetting, GoalSetting.class);
        goalSetting1.setBhag(bhag);
        return goalSettingRepository.save(goalSetting1);
    }

    public List<GoalSetting> getAllGoals() {
        return goalSettingRepository.findAll();
    }

//    public List<Roles> getRoles() {
//        return rolesRespository.findAll();
//    }

    public List<Bhag> getBhags() {
        return BhagRepository.findAll();
    }


    public void deleteGoal(Long id) {
        goalSettingRepository.deleteById(id);
    }

    public Optional<GoalSetting> getGoalById(Long id) {
        return goalSettingRepository.findById(id);
    }
}
