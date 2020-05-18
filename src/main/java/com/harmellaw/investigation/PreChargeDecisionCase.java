package com.harmellaw.investigation;

import com.harmellaw.PNCId;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PreChargeDecisionCase {

    public final PNCId pncId;
    private Map<Suspect, OffenceAdvice> offenceAdvice = new HashMap<>();

    public PreChargeDecisionCase(PNCId pncId, Set<Suspect> suspects) {
        this.pncId = pncId;
        for(Suspect s : suspects) {
            offenceAdvice.put(s, null);
        }
    }

    // TODO: this now allows us to record advice against a potentially incorrect suspect - add a test to break this, then fix it
    public void noteAlternativeOffenceAdvice(Suspect suspect, OffenceAdvice advice) {
        offenceAdvice.put(suspect, advice);
    }

    public OffenceAdvice getOffenceAdviceFor(Suspect suspect) {
        return offenceAdvice.get(suspect);
    }

    public Set<Suspect> getSuspects() {
        return offenceAdvice.keySet();
    }
}
