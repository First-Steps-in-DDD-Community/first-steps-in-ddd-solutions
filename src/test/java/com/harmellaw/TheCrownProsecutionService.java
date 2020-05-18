package com.harmellaw;

import com.harmellaw.investigation.PoliceInvestigationFile;
import com.harmellaw.investigation.PreChargeDecisionCase;
import com.harmellaw.investigation.Suspect;
import com.harmellaw.preparation.CriminalCase;
import com.harmellaw.preparation.Defendant;
import com.harmellaw.preparation.PoliceCaseFile;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TheCrownProsecutionService {

    private PNCId myPncId;
    private Suspect mySuspect;
    private CrownProsecutionService theCps;

    @BeforeEach
    public void setup() {
        myPncId = new PNCId("DETER");
        mySuspect = new Suspect();
        theCps = new CrownProsecutionService();
    }

    // TODO: we _really_ need to have this laid out clearly in the domain statement
    // TODO: and _why_: so that it informs the resulting PCD - i.e. can't add a piece of advice to a non-existent suspect etc
    // TODO: "We need to speak to the domain expert". Come back and look at this - after providing additional domain expert testimony
    // TODO: what's hiding here? Is there another concept of a case?
    @Test
    public void receiptOfAPcdRequest_CreatesACase() { // todo: check this test name maps onto the domain expert statement
        PoliceInvestigationFile myPoliceInvestigationFile = new PoliceInvestigationFile(myPncId, mySuspect);

        // TODO: What happens when this is more explicitly "receive a PCDRequest"?
        PreChargeDecisionCase myCase = theCps.translatePoliceInvestigationIntoPcdCase(myPoliceInvestigationFile);
        // TODO: WHY ARE THEY DIFFERENT? This "Case" should be immutable as we don't change it (yet)

        assertEquals(myPncId, myCase.pncId);
        assertEquals(myPoliceInvestigationFile.suspects, myCase.getSuspects());
    }

    // TODO: make the name of this test more domain-y (cut and paste from the clarified
    @Test
    public void receiptOfAPoliceCaseFile_CreatesACriminalCase() {
        Defendant myDefendant = new Defendant();
        PoliceCaseFile policeCaseFile = new PoliceCaseFile(myPncId, myDefendant);

        CriminalCase myCase = theCps.createCriminalCase(policeCaseFile); // TODO: whats some nice domain language for this?

        assertEquals(myPncId, myCase.pncId);
        assertEquals(policeCaseFile.defendants, myCase.defendants);
    }
}
