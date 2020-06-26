package com.harmellaw.investigation;

import com.harmellaw.PNCId;

import com.harmellaw.PNCId;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PreChargeDecisionCase {

    public final PNCId pncId;
    private Map<Suspect, OffenceAdvice> offenceAdvice = new HashMap<>();

    public PreChargeDecisionCase(PNCId pncId, Set<Suspect> suspects) {
        this.pncId = pncId;
        for (Suspect s : suspects) {
            offenceAdvice.put(s, null);
        }
    }

    public void recordAlternativeOffenceAdvice(Suspect suspect, OffenceAdvice advice) {
        offenceAdvice.put(suspect, advice);
    }

    public OffenceAdvice getOffenceAdviceFor(Suspect suspect) {
        return offenceAdvice.get(suspect);
    }

    public Set<Suspect> getSuspects() {
        return offenceAdvice.keySet();
    }

}
