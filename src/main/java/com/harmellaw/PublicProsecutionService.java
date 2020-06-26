package com.harmellaw;

import com.harmellaw.investigation.PoliceInvestigation;
import com.harmellaw.investigation.PreChargeDecision;

public class PublicProsecutionService {
    public PreChargeDecision receiveRequestForPreChargeDecision(PoliceInvestigation policeInvestigation) {
        return new PreChargeDecision(policeInvestigation.pncId, policeInvestigation.suspects);
    }

    public CriminalCase acceptCaseFile(PoliceCaseFile policeCaseFile) {
        return new CriminalCase(policeCaseFile.pncId, policeCaseFile.defendants);
    }
}