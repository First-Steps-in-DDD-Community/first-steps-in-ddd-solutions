package com.harmellaw.preparation;

import com.harmellaw.PNCId;
import com.harmellaw.investigation.CriminalOffence;
import com.harmellaw.investigation.PoliceInvestigationDetails;
import com.harmellaw.investigation.PreChargeDecisionCase;
import com.harmellaw.investigation.Suspect;
import com.harmellaw.preparation.CriminalCase;
import com.harmellaw.preparation.Defendant;
import com.harmellaw.preparation.PoliceCaseFile;
import com.harmellaw.preparation.TrialPreparationService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TheTrialPreparationService {

    private TrialPreparationService thePps;
    private PNCId pncId;
    private Suspect suspect;
    private PoliceInvestigationDetails policeInvestigationDetails;

    @BeforeEach
    public void setup() {
        thePps = new TrialPreparationService();
        pncId = new PNCId("AN-ID");
        suspect = new Suspect(CriminalOffence.CUTTING_AWAY_BUOYS_ETC);
        policeInvestigationDetails = new PoliceInvestigationDetails(pncId, suspect);
    }

    @Test
    public void shouldCreateACriminalCaseWhenAPoliceCaseFileIsAccepted() {
        Defendant defendant = new Defendant();
        PoliceCaseFile policeCaseFile = new PoliceCaseFile(pncId, defendant);

        CriminalCase criminalCase = thePps.acceptCaseFile(policeCaseFile);

        assertEquals(pncId, criminalCase.pncId);
        assertEquals(policeCaseFile.defendants, criminalCase.defendants);
    }

}