package com.example.Timeappback.Entity;

import jakarta.persistence.*;
import java.sql.Time;
import java.util.Date;

@Entity
@Table(name = "registercase")
public class RegisterCaseEntity {
    @Id
    @Column(name = "Case_ID", length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Case_ID;

    @Column(name = "Client_Name", length = 255)
    private String Client_Name;

    @Column(name = "Date_Register")
    private String DateRegister;

    @Column(name = "From_Time")
    private String From_Time;

    @Column(name = "To_Time")
    private String To_Time;

    @Column(name = "Duration")
    private String Duration;

    @Column(name = "Case_Type", length = 255)
    private String Case_Type;

    @Column(name = "Case_Number", length = 255)
    private int Case_Number;

    @Column(name = "Type_Of_work", length = 255)
    private String Type_Of_work;

    @Column(name = "Description", length = 255)
    private String Description;

    public RegisterCaseEntity() {
    }

    public RegisterCaseEntity(int case_ID, String dateRegister, String from_Time, String to_Time, String duration, String client_Name, String case_Type, int case_Number, String type_Of_work, String description) {
        Case_ID = case_ID;
        DateRegister = dateRegister;
        From_Time = from_Time;
        To_Time = to_Time;
        Duration = duration;
        Client_Name = client_Name;
        Case_Type = case_Type;
        Case_Number = case_Number;
        Type_Of_work = type_Of_work;
        Description = description;
    }

    // Getters and Setters

    public int getCase_ID() {
        return Case_ID;
    }

    public void setCase_ID(int case_ID) {
        Case_ID = case_ID;
    }

    public String getDateRegister() {
        return DateRegister;
    }

    public void setDateRegister(String dateRegister) {
        DateRegister = dateRegister;
    }

    public String getFrom_Time() {
        return From_Time;
    }

    public void setFrom_Time(String from_Time) {
        From_Time = from_Time;
    }

    public String getTo_Time() {
        return To_Time;
    }

    public void setTo_Time(String to_Time) {
        To_Time = to_Time;
    }

    public String getDuration() {
        return Duration;
    }

    public void setDuration(String duration) {
        Duration = duration;
    }

    public String getClient_Name() {
        return Client_Name;
    }

    public void setClient_Name(String client_Name) {
        Client_Name = client_Name;
    }

    public String getCase_Type() {
        return Case_Type;
    }

    public void setCase_Type(String case_Type) {
        Case_Type = case_Type;
    }

    public int getCase_Number() {
        return Case_Number;
    }

    public void setCase_Number(int case_Number) {
        Case_Number = case_Number;
    }

    public String getType_Of_work() {
        return Type_Of_work;
    }

    public void setType_Of_work(String type_Of_work) {
        Type_Of_work = type_Of_work;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    @Override
    public String toString() {
        return "RegisterCaseEntity{" +
            "Case_ID=" + Case_ID +
            ", DateRegister='" + DateRegister + '\'' +
            ", From_Time=" + From_Time +
            ", To_Time=" + To_Time +
            ", Duration=" + Duration +
            ", Client_Name='" + Client_Name + '\'' +
            ", Case_Type='" + Case_Type + '\'' +
            ", Case_Number=" + Case_Number +
            ", Type_Of_work='" + Type_Of_work + '\'' +
            ", Description='" + Description + '\'' +
            '}';
    }
}