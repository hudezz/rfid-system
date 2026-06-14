package com.house.automation.controller;

import com.house.automation.model.TagRequest;
import com.house.automation.service.AutomationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/automation")
public class AutomationController {

    private final AutomationService automationService;

    // TODO: Verify constructor injection for AutomationService
    public AutomationController(AutomationService automationService) {

        this.automationService = automationService;
    }

    @PostMapping("/trigger")
    public ResponseEntity<String> trigger(@RequestBody TagRequest request) {
        // TODO: Call the service using the injected AutomationService and return ResponseEntity.ok()
        String result =automationService.processTagTap(request);
        return ResponseEntity.ok(result);
    }
}
