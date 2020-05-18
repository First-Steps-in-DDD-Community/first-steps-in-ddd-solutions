package com.harmellaw.preparation;

import com.harmellaw.PNCId;
import com.harmellaw.investigation.Suspect;

import java.util.Set;

public class CriminalCase {
    public PNCId pncId;
    public Set<Suspect> suspects;

    // TODO: do we need to make this immutable to make the point?  We could just record another TODO?...
    public CriminalCase(PNCId pncId, Set<Suspect> suspects) {
        this.pncId = pncId;
        this.suspects = suspects;
    }
}
