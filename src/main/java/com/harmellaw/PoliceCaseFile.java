package com.harmellaw;

import com.harmellaw.investigation.Suspect;

import java.util.HashSet;
import java.util.Set;

public class PoliceCaseFile {

    public PNCId pncId;
    public Set<Suspect> suspects = new HashSet<>();

    public PoliceCaseFile(PNCId pncId, Suspect aSuspect) {
        this.pncId = pncId;
        this.suspects.add(aSuspect);
    }
}
