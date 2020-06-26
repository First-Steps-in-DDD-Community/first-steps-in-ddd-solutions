package com.harmellaw.preparation;

import com.harmellaw.PNCId;

import java.util.Set;

public class CriminalCase {

    public PNCId pncId;
    public Set<Defendant> defendants;

    public CriminalCase(PNCId pncId, Set<Defendant> defendants) {
        this.pncId = pncId;
        this.defendants = defendants;
    }
}
