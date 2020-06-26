package com.harmellaw.preparation;

import com.harmellaw.PNCId;

import java.util.HashSet;
import java.util.Set;

public class PoliceCaseFile {

    public final PNCId pncId;
    public final Set<Defendant> defendants = new HashSet<>();

    public PoliceCaseFile(PNCId pncId, Defendant defendant) {
        this.pncId = pncId;
        this.defendants.add(defendant);
    }
}
