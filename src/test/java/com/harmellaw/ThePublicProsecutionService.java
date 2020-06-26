package com.harmellaw;

import com.harmellaw.investigation.CriminalOffence;
import com.harmellaw.investigation.PoliceInvestigation;
import com.harmellaw.investigation.Suspect;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThePublicProsecutionService {

    private PublicProsecutionService thePps;
    private PNCId pncId;
    private Suspect suspect;
    private PoliceInvestigation policeInvestigation;

    @BeforeEach
    public void setup() {
        thePps = new PublicProsecutionService();
        pncId = new PNCId("AN-ID");
        suspect = new Suspect(CriminalOffence.CUTTING_AWAY_BUOYS_ETC);
        policeInvestigation = new PoliceInvestigation(pncId, suspect);
    }

    @Test
    public void shouldCreateACaseWhenReceivingAPcdRequest() {
        CriminalCase policeCase = thePps.receiveRequestForPreChargeDecision(policeInvestigation);

        assertEquals(pncId, policeCase.pncId);
        assertEquals(policeInvestigation.suspects, policeCase.suspects);
    }

}