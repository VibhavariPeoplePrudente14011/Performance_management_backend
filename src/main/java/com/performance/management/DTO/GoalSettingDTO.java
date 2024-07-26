package com.performance.management.DTO;

import com.performance.management.entity.Bhag;
import jakarta.persistence.*;

import java.time.LocalDate;

public class GoalSettingDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int igNumber;

    @Column(length = 1000)
    private String goalSettingDescription;

    private Integer bhagFid;

    private LocalDate startDate;

    private LocalDate completionTargetDate;

    private int performanceYear;

    private Integer userFid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getIgNumber() {
        return igNumber;
    }

    public void setIgNumber(int igNumber) {
        this.igNumber = igNumber;
    }

    public String getGoalSettingDescription() {
        return goalSettingDescription;
    }

    public void setGoalSettingDescription(String goalSettingDescription) {
        this.goalSettingDescription = goalSettingDescription;
    }

    public Integer getBhagFid() {
        return bhagFid;
    }

    public void setBhagFid(Integer bhagFid) {
        this.bhagFid = bhagFid;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getCompletionTargetDate() {
        return completionTargetDate;
    }

    public void setCompletionTargetDate(LocalDate completionTargetDate) {
        this.completionTargetDate = completionTargetDate;
    }

    public int getPerformanceYear() {
        return performanceYear;
    }

    public void setPerformanceYear(int performanceYear) {
        this.performanceYear = performanceYear;
    }

    public Integer getUserFid() {
        return userFid;
    }

    public void setUserFid(Integer userFid) {
        this.userFid = userFid;
    }
}
