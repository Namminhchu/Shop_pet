package com.migi.migi_project.model.dto;

import lombok.Data;

import java.time.Instant;

@Data
public class BookingDTO {
    private Integer id;

    private String serviceId;

    private String serviceWorkerId;

    private Instant appointmentDate;

    private Instant createTime;

    private Integer clientId;

    private String petName;

    private String petType;

    private String serviceCode;

    private String serviceName;

    private String fullname;

    private Integer status;

    private String phone;

    private String appointmentDateStr;

    private String workerName;

    private String workerPhone;

    private String price;
}
