package com.harmellaw;

import java.util.HashSet;
import java.util.Set;

public class PoliceCaseFile {
    public PNCId pncId;
    public Set<Defendant> defendants = new HashSet<>();

    public PoliceCaseFile(PNCId pncId, Defendant defendant) {
        this.pncId = pncId;
        this.defendants.add(defendant);
    }
}
