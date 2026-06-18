package com.house.automation.service;

import com.house.automation.model.ChoreLog;
import com.house.automation.model.TagRequest;
import org.springframework.stereotype.Service;
import com.house.automation.repository.ChoreLogRepository;

import java.time.LocalDateTime;

@Service
public class AutomationServiceImpl implements AutomationService {
    private final ChoreLogRepository choreLogRepository;
    public AutomationServiceImpl(ChoreLogRepository choreLogRepository) {
        this.choreLogRepository = choreLogRepository;
    }

    @Override
    public String processTagTap(TagRequest request) {
        String tagId = request.getTagId();
        String scannedBy = request.getScannedBy();

        if ("washingmachine-tag".equals(tagId)) {
            System.out.println("[LOG] " + scannedBy + " swiped the WASHING MACHINE TAG!");
            ChoreLog choreLog = new ChoreLog(null, tagId, scannedBy, LocalDateTime.now());
            choreLogRepository.save(choreLog);
            return "Good job keeping up with the laundry, " + scannedBy + "!";
        }

        if ("CatsFedandLittercleaned-tag".equals(tagId)) {
            System.out.println("[LOG] " + scannedBy + " swiped the CATS FED & LITTER CLEANED TAG!");
            ChoreLog choreLog = new ChoreLog(null, tagId, scannedBy, LocalDateTime.now());
            choreLogRepository.save(choreLog);
            return "Good boy, keep feeding the cats! Miau miau, " + scannedBy;
        }

        if ("trashOut-tag".equals(tagId)) {
            System.out.println("[LOG] " + scannedBy + " swiped the TRASH OUT TAG!");
            ChoreLog choreLog = new ChoreLog(null, tagId, scannedBy, LocalDateTime.now());
            choreLogRepository.save(choreLog);
            return "Good boy, keeping the garbage out, " + scannedBy + "!";
        }

        // The Safety Net Fallback
        System.out.println("[ UNKNOWN TAG] Detected Tag ID: " + tagId + " scanned by: " + scannedBy);
        return "Tag detected, but no rules are coded for " + tagId + " yet!";
    }
}
