package com.harmellaw;

import com.harmellaw.investigation.PoliceInvestigationFile;
import com.harmellaw.investigation.PreChargeDecisionCase;
import com.harmellaw.preparation.CriminalCase;
import com.harmellaw.preparation.PoliceCaseFile;

// TODO: you could also point out that this could be split up too....
public class CrownProsecutionService {

    // TODO: this method name sucks - look at the Expert Statement and find a better one / sync the two
    public PreChargeDecisionCase translatePoliceInvestigationIntoPcdCase(PoliceInvestigationFile policeInvestigationFile) {
        return new PreChargeDecisionCase(policeInvestigationFile.pncId, policeInvestigationFile.suspects);
        // TODO: we also ought to persist this new case, but that's not for this course (see the "Repository" pattern)
    }


    // TODO: check whether the police refer to "suspects" or "defendants" in their case files which they pass to the CPS
    // TODO: Assume it's "Defendant"
    public CriminalCase createCriminalCase(PoliceCaseFile policeCaseFile) {
        return new CriminalCase(policeCaseFile.pncId, policeCaseFile.defendants);
    }
}

