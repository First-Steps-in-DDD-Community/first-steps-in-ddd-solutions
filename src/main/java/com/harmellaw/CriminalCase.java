package com.harmellaw;

import com.harmellaw.investigation.Suspect;

import java.util.Set;

public class CriminalCase {

    public PNCId pncId;
    public Set<Suspect> suspects;

    public CriminalCase(PNCId pncId, Set<Suspect> suspects) {
        this.pncId = pncId;
        this.suspects = suspects;
    }

}
