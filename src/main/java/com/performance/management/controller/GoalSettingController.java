// File: src/main/java/com/performance/management/controller/GoalSettingController.java
package com.performance.management.controller;

import com.performance.management.DTO.GoalSettingDTO;
import com.performance.management.entity.Bhag;
import com.performance.management.entity.GoalSetting;
import com.performance.management.service.GoalSettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/goals")
public class GoalSettingController {

    @Autowired
    private GoalSettingService goalSettingService;

    @PostMapping("/create")
    public ResponseEntity<GoalSetting> createGoal(@RequestBody GoalSettingDTO goalSetting) {
        GoalSetting savedGoal = goalSettingService.saveGoal(goalSetting);
        return ResponseEntity.ok(savedGoal);
    }

    @GetMapping("/get")
    public ResponseEntity<List<GoalSetting>> getAllGoals() {
        List<GoalSetting> goals = goalSettingService.getAllGoals();
        return ResponseEntity.ok(goals);
    }

//    @GetMapping("/getRoles")
//    public ResponseEntity<List<Roles>> getRoles() {
//        return ResponseEntity.ok(userService.getRoles());
//    }
    @GetMapping("/getBhag")
    public ResponseEntity<List<Bhag>> getBhag() {
        return ResponseEntity.ok(goalSettingService.getBhags());
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<GoalSetting> deleteGoal(@PathVariable Long id) {
        Optional<GoalSetting> goal = goalSettingService.getGoalById(id);
        if (goal.isPresent()) {
            goalSettingService.deleteGoal(id);
            return ResponseEntity.ok(goal.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}


