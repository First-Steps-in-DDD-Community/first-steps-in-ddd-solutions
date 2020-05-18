package com.harmellaw.preparation;

import com.harmellaw.PNCId;

import java.util.HashSet;
import java.util.Set;

public class PoliceCaseFile {

    public PNCId pncId;
    public Set<Defendant> defendants = new HashSet<>();

    public PoliceCaseFile(PNCId pncId, Defendant aDefendant) {
        this.pncId = pncId;
        this.defendants.add(aDefendant);
    }
}
