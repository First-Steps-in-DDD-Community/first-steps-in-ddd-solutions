package com.harmellaw;

public class PublicProsecutionService {
    public CriminalCase receiveRequestForPreChargeDecision(PoliceInvestigation policeInvestigation) {
        return new CriminalCase(policeInvestigation.pncId, policeInvestigation.suspects);
    }
}