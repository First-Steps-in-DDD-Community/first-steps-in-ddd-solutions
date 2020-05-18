package com.harmellaw.investigation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class APreChargeDecision {

    @BeforeEach
    public void setup() {
    }

    @Test
    public void shouldRecordAlternativeOffenceAdviceAgainstSuspects() {

        Suspect mySuspect = new Suspect();
        PreChargeDecision myPreChargeDecision = new PreChargeDecision();
        OffenceAdvice myOffenceAdvice = new OffenceAdvice();

        myPreChargeDecision.noteAlternativeOffenceAdvice(mySuspect, myOffenceAdvice); // TODO: "note" or "record"?

        assertEquals(myOffenceAdvice, myPreChargeDecision.getOffenceAdviceFor(mySuspect));
    }

    // TODO: create a PreChargeDecision with a Set of Suspects
    // TODO: test that PreChargeDecision "knows who the suspects are" - allow / forbid advice to be added
}
