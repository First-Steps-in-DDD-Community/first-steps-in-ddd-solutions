package com.harmellaw.investigation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class APreChargeDecision {

    private Suspect suspect;
    private PreChargeDecision aPreChargeDecision;
    private OffenceAdvice offenceAdvice;

    @BeforeEach
    public void setup() {
        suspect = new Suspect(CriminalOffence.CUTTING_AWAY_BUOYS_ETC);
        aPreChargeDecision = new PreChargeDecision();
        offenceAdvice = new OffenceAdvice();
    }

    @Test
    public void shouldRecordAlternativeOffenceAdviceAgainstSuspects() {
        aPreChargeDecision.recordAlternativeOffenceAdvice(suspect, offenceAdvice);

        assertEquals(offenceAdvice, aPreChargeDecision.getOffenceAdviceFor(suspect));
    }

}
