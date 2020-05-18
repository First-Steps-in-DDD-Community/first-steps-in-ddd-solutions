package com.harmellaw.investigation;

import com.harmellaw.PNCId;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class APreChargeDecisionCase {

    private PNCId pncId;
    private Suspect mySuspect;
    private PreChargeDecisionCase myPreChargeDecisionCase;

    @BeforeEach
    public void setup() {
        pncId = new PNCId("KAHSDKJH");
        mySuspect = new Suspect();
        myPreChargeDecisionCase = new PreChargeDecisionCase(pncId, new HashSet<Suspect>(Arrays.asList(mySuspect)));
    }

    @Test
    public void shouldRecordAlternativeOffenceAdvice_AgainstSuspects() {
        OffenceAdvice myOffenceAdvice = new OffenceAdvice();

        myPreChargeDecisionCase.noteAlternativeOffenceAdvice(mySuspect, myOffenceAdvice); // TODO: "note" or "record"?

        assertEquals(myOffenceAdvice, myPreChargeDecisionCase.getOffenceAdviceFor(mySuspect));
    }

    // TODO: create a PreChargeDecision with a Set of Suspects
    // TODO: test that PreChargeDecision "knows who the suspects are" - allow / forbid advice to be added
}
