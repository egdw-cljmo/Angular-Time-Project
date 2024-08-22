package com.example.Timeappback.Dto;

import java.sql.Time;

public class CaseAddDTO {
    private int caseId;
    private String dateRegister;
    private String fromTime;
    private String toTime;
    private String duration;
    private String clientName;
    private String caseType;
    private int caseNumber;
    private String typeOfWork;
    private String description;

    // Getters and Setters

    public int getCaseId() {
        return caseId;
    }

    public void setCaseId(int caseId) {
        this.caseId = caseId;
    }

    public String getDateRegister() {
        return dateRegister;
    }

    public void setDateRegister(String dateRegister) {
        this.dateRegister = dateRegister;
    }

    public String getFromTime() {
        return fromTime;
    }

    public void setFromTime(String fromTime) {
        this.fromTime = fromTime;
    }

    public String getToTime() {
        return toTime;
    }

    public void setToTime(String toTime) {
        this.toTime = toTime;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getCaseType() {
        return caseType;
    }

    public void setCaseType(String caseType) {
        this.caseType = caseType;
    }

    public int getCaseNumber() {
        return caseNumber;
    }

    public void setCaseNumber(int caseNumber) {
        this.caseNumber = caseNumber;
    }

    public String getTypeOfWork() {
        return typeOfWork;
    }

    public void setTypeOfWork(String typeOfWork) {
        this.typeOfWork = typeOfWork;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Constructor
    public CaseAddDTO(int caseId, String dateRegister, String fromTime, String toTime, String duration, String clientName, String caseType, int caseNumber, String typeOfWork, String description) {
        this.caseId = caseId;
        this.dateRegister = dateRegister;
        this.fromTime = fromTime;
        this.toTime = toTime;
        this.duration = duration;
        this.clientName = clientName;
        this.caseType = caseType;
        this.caseNumber = caseNumber;
        this.typeOfWork = typeOfWork;
        this.description = description;
    }

    public CaseAddDTO() {
    }

    @Override
    public String toString() {
        return "CaseAddDTO{" +
            "caseId=" + caseId +
            ", dateRegister='" + dateRegister + '\'' +
            ", fromTime=" + fromTime +
            ", toTime=" + toTime +
            ", duration=" + duration +
            ", clientName='" + clientName + '\'' +
            ", caseType='" + caseType + '\'' +
            ", caseNumber=" + caseNumber +
            ", typeOfWork='" + typeOfWork + '\'' +
            ", description='" + description + '\'' +
            '}';
    }
}