package com.house.automation.service;

import com.house.automation.model.TagRequest;
import org.springframework.stereotype.Service;

@Service
public class AutomationServiceImpl implements AutomationService {

    @Override
    public String processTagTap(TagRequest request) {
        /*
         * =========================================================================
         * TODO: MANUAL IMPLEMENTATION GUIDE
         * =========================================================================
         * You can trigger this service via iOS "Shortcuts" (iPhone Personal Automation):
         * 
         * 1. Open Shortcuts app on your iPhone.
         * 2. Go to the "Automation" tab and click "+" to create a new Personal Automation.
         * 3. Select "NFC" -> scan your physical NFC card/tag and name it (e.g. "BedroomTag").
         * 4. Set the automation to run "Immediately" without asking.
         * 5. Add a "Get Contents of URL" action:
         *    - URL: http://<your-spring-boot-server-ip>:8080/api/v1/automation/trigger
         *    - Method: POST
         *    - Headers: Content-Type: application/json
         *    - Request Body (JSON):
         *      {
         *         "tagId": "bedroom-tag-001",
         *         "scannedBy": "Alex's iPhone"
         *      }
         * 
         * 6. Write your conditional logic below to check the incoming parameters:
         * 
         *    String tagId = request.getTagId();
         *    String scannedBy = request.getScannedBy();
         * 
         *    if ("bedroom-tag-001".equals(tagId)) {
         *        // Trigger smart bedroom lights on / off
         *        // e.g. homeAssistantClient.toggleSwitch("light.bedroom");
         *        return "Bedroom automation triggered by " + scannedBy;
         *    } else if ("garage-tag-002".equals(tagId)) {
         *        // Trigger garage door opener
         *        return "Garage door toggled by " + scannedBy;
         *    } else {
         *        System.out.println("Unknown Tag Scanned: " + tagId + " by " + scannedBy);
         *    }
         * =========================================================================
         */
        
        return "Received tag event successfully";
    }
}
