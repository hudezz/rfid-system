package com.house.automation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class ChoreLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tagId;
    private String scannedBy;
    private LocalDateTime timeStamp;

    public ChoreLog() {
    }

    public ChoreLog(String tagId, String scannedBy, LocalDateTime timeStamp) {
        this.tagId = tagId;
        this.scannedBy = scannedBy;
        this.timeStamp = timeStamp;
    }

    public ChoreLog(Long id, String tagId, String scannedBy, LocalDateTime timeStamp) {
        this.id = id;
        this.tagId = tagId;
        this.scannedBy = scannedBy;
        this.timeStamp = timeStamp;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId;
    }

    public String getScannedBy() {
        return scannedBy;
    }

    public void setScannedBy(String scannedBy) {
        this.scannedBy = scannedBy;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }
}
