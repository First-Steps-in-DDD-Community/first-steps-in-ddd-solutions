package com.harmellaw;

import com.harmellaw.investigation.Suspect;

import java.util.Set;

public class CriminalCase {

    public PNCId pncId;
    public Set<Suspect> suspects;
    public Set<Defendant> defendants;

    public CriminalCase(PNCId pncId, Set<Defendant> defendants) {
        this.pncId = pncId;
        this.defendants = defendants;
    }
}
