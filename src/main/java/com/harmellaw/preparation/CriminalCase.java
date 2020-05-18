package com.harmellaw.preparation;

import com.harmellaw.PNCId;

import java.util.Set;

public class CriminalCase {
    public PNCId pncId;
    public Set<Defendant> defendants;

    // TODO: do we need to make this immutable to make the point?  We could just record another TODO?...
    public CriminalCase(PNCId pncId, Set<Defendant> defendants) {
        this.pncId = pncId;
        this.defendants = defendants;
    }
}
