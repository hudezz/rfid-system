package com.house.automation.model;

public class TagRequest {
    private String tagId;
    private String scannedBy;

    public TagRequest() {
    }

    public TagRequest(String tagId, String scannedBy) {
        this.tagId = tagId;
        this.scannedBy = scannedBy;
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
}
