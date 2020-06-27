package com.harmellaw.investigation;

public class PreChargeDecisionService {
    public PreChargeDecisionCase receiveRequestForPreChargeDecision(PoliceInvestigationDetails policeInvestigationDetails) {
        return new PreChargeDecisionCase(policeInvestigationDetails.pncId, policeInvestigationDetails.suspects);
    }
}
