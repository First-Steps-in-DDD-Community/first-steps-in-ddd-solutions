package com.harmellaw.investigation;

import com.harmellaw.PNCId;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class PoliceInvestigationDetails {

    public final PNCId pncId;
    public final Set<Suspect> suspects;

    public PoliceInvestigationDetails(PNCId aPncId, Suspect aSuspect) {
        if (aPncId == null) throw new IllegalArgumentException("You must provide a PNC Id");
        if (aSuspect == null) throw new IllegalArgumentException("You must provide a suspect");

        this.pncId = aPncId;

        Set<Suspect> suspects = new HashSet<>();
        suspects.add(aSuspect);
        this.suspects = Collections.unmodifiableSet(suspects);
    }
}
