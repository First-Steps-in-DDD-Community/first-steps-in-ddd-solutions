package com.harmellaw;

import com.harmellaw.investigation.PoliceInvestigation;
import com.harmellaw.preparation.CriminalCase;

public class CrownProsecutionService {

    // TODO: this method name sucks - look at the Expert Statement and find a better one / sync the two
    public CriminalCase translatePoliceInvestigationIntoCase(PoliceInvestigation policeInvestigation) {
        return new CriminalCase(policeInvestigation.pncId, policeInvestigation.suspects);
        // TODO: we also ought to persist this new case, but that's not for this course (see the "Repository" pattern)
    }

    public CriminalCase createCriminalCase(PoliceCaseFile policeCaseFile) {
        return null;
    }
}

