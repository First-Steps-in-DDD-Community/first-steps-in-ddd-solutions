package com.harmellaw.investigation;

import com.harmellaw.PNCId;

import java.util.HashSet;
import java.util.Set;

public class PoliceInvestigation {

    public PNCId pncId;
    public Set<Suspect> suspects = new HashSet<>();

    public PoliceInvestigation(PNCId aPncId, Suspect aSuspect) {
        if (aPncId == null) throw new IllegalArgumentException("You must provide a PNC Id");
        if (aSuspect == null) throw new IllegalArgumentException("You must provide a suspect");

        this.pncId = aPncId;
        this.suspects.add(aSuspect);
    }
}
