package com.harmellaw;

import com.harmellaw.investigation.PoliceInvestigationDetails;
import com.harmellaw.investigation.PreChargeDecisionCase;
import com.harmellaw.preparation.CriminalCase;
import com.harmellaw.preparation.PoliceCaseFile;

public class PublicProsecutionService {
    public PreChargeDecisionCase receiveRequestForPreChargeDecision(PoliceInvestigationDetails policeInvestigationDetails) {
        return new PreChargeDecisionCase(policeInvestigationDetails.pncId, policeInvestigationDetails.suspects);
    }

    public CriminalCase acceptCaseFile(PoliceCaseFile policeCaseFile) {
        return new CriminalCase(policeCaseFile.pncId, policeCaseFile.defendants);
    }
}