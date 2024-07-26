package com.performance.management.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "goal_setting")
public class GoalSetting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int igNumber;

    @Column(length = 1000)
    private String goalSettingDescription;

    @ManyToOne
    @JoinColumn(name = "bhag_fid", nullable = false)
    private Bhag bhag;

    private LocalDate startDate;

    private LocalDate completionTargetDate;

    private int performanceYear;

    private Integer userFid;

    //getters and setters

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

    public Bhag getBhag() {
        return bhag;
    }

    public void setBhag(Bhag bhag) {
        this.bhag = bhag;
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
