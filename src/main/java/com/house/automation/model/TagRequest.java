package com.house.automation.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TagRequest {
    private String tagId;
    private String scannedBy;

    // TODO: Implement standard constructors, getters, and setters
}
