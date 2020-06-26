package com.harmellaw;

import com.harmellaw.investigation.PoliceInvestigation;

public class PublicProsecutionService {
    public CriminalCase receiveRequestForPreChargeDecision(PoliceInvestigation policeInvestigation) {
        return new CriminalCase(policeInvestigation.pncId, policeInvestigation.suspects);
    }
}