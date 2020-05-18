package com.harmellaw.investigation;

import java.util.HashMap;
import java.util.Map;

public class PreChargeDecision {

    private Map<Suspect, OffenceAdvice> offenceAdvice = new HashMap<>();

    public void noteAlternativeOffenceAdvice(Suspect suspect, OffenceAdvice advice) {
        offenceAdvice.put(suspect, advice);
    }

    public OffenceAdvice getOffenceAdviceFor(Suspect suspect) {
        return offenceAdvice.get(suspect);
    }

}
