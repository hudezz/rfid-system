package com.house.notification.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/notifications")
public class NotificationController {

    @PostMapping
    public ResponseEntity<String> receiveNotification(@RequestBody Map<String, Object> payload) {
        System.out.println("[NOTIFICATION SERVICE] Received alert broadcast event: " + payload);
        // TODO: Integrate actual mobile notification gateways (APNS, FCM, or Pushover)
        return ResponseEntity.ok("Notification processed");
    }
}
