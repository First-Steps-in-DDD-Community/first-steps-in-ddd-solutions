package com.harmellaw.investigation;

import com.harmellaw.PNCId;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class APreChargeDecisionCase {

    private Suspect suspect;
    private PreChargeDecisionCase aPreChargeDecisionCase;
    private OffenceAdvice offenceAdvice;
    private Set<Suspect> suspects;

    @BeforeEach
    public void setup() {
        PNCId pncId = new PNCId("ANOTHER_PNC_ID");
        suspect = new Suspect(CriminalOffence.CUTTING_AWAY_BUOYS_ETC);
        suspects = new HashSet<>();
        suspects.add(suspect);
        aPreChargeDecisionCase = new PreChargeDecisionCase(pncId, suspects);
        offenceAdvice = new OffenceAdvice();
    }

    @Test
    public void shouldRecordAlternativeOffenceAdviceAgainstSuspects() {
        aPreChargeDecisionCase.recordAlternativeOffenceAdvice(suspect, offenceAdvice);

        assertEquals(offenceAdvice, aPreChargeDecisionCase.getOffenceAdviceFor(suspect));
    }

}
