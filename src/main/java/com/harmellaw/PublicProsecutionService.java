package com.harmellaw;

import com.harmellaw.investigation.PoliceInvestigation;
import com.harmellaw.investigation.PreChargeDecisionCase;
import com.harmellaw.preparation.CriminalCase;
import com.harmellaw.preparation.PoliceCaseFile;

public class PublicProsecutionService {
    public PreChargeDecisionCase receiveRequestForPreChargeDecision(PoliceInvestigation policeInvestigation) {
        return new PreChargeDecisionCase(policeInvestigation.pncId, policeInvestigation.suspects);
    }

    public CriminalCase acceptCaseFile(PoliceCaseFile policeCaseFile) {
        return new CriminalCase(policeCaseFile.pncId, policeCaseFile.defendants);
    }
}