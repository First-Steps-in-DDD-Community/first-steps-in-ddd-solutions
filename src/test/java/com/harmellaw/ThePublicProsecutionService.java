package com.harmellaw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThePublicProsecutionService {

    private PublicProsecutionService thePps;

    @BeforeEach
    public void setup() {
        thePps = new PublicProsecutionService();
    }

    @Test
    public void shouldCreateACaseWhenReceivingAPcdRequest() {
        PNCId pncId = new PNCId("AN-ID");
        Suspect suspect = new Suspect(CriminalOffence.CUTTING_AWAY_BUOYS_ETC);
        PoliceInvestigation policeInvestigation = new PoliceInvestigation(pncId, suspect);

        CriminalCase policeCase = thePps.receiveRequestForPreChargeDecision(policeInvestigation);

        assertEquals(pncId, policeCase.pncId);
        assertEquals(policeInvestigation.suspects, policeCase.suspects);
    }

}