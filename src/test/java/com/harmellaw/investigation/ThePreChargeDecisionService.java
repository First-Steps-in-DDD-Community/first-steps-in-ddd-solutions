package com.harmellaw.investigation;

import com.harmellaw.PNCId;
import com.harmellaw.preparation.TrialPreparationService;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThePreChargeDecisionService {

    private PreChargeDecisionService thePreChargeDecisionService;
    private PNCId pncId;
    private Suspect suspect;
    private PoliceInvestigationDetails policeInvestigationDetails;

    @BeforeEach
    public void setup() {
        thePreChargeDecisionService = new PreChargeDecisionService();
        pncId = new PNCId("AN-ID");
        suspect = new Suspect(CriminalOffence.CUTTING_AWAY_BUOYS_ETC);
        policeInvestigationDetails = new PoliceInvestigationDetails(pncId, suspect);
    }

    public void shouldCreateAPreChargeDecisionCaseWhenReceivingAPcdRequest() {
        PreChargeDecisionCase pcdCase = thePreChargeDecisionService.receiveRequestForPreChargeDecision(policeInvestigationDetails);

        assertEquals(pncId, pcdCase.pncId);
        assertEquals(policeInvestigationDetails.suspects, pcdCase.getSuspects());
    }

}
