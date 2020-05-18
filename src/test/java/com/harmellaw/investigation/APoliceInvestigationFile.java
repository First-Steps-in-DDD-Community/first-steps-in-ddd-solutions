package com.harmellaw.investigation;

import com.harmellaw.PNCId;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class APoliceInvestigationFile {

    PNCId aPncId;
    Suspect aSuspect;
    PoliceInvestigationFile anInvestigationFile;

    @BeforeEach
    public void setup() {
        aPncId = new PNCId("1234-ESDT");
        aSuspect = new Suspect();
        anInvestigationFile = new PoliceInvestigationFile(aPncId, aSuspect);
    }

    @Test
    public void mustHaveAPoliceNationalComputerId() {
        assertNotNull(anInvestigationFile.pncId);
    }

    @Test
    public void cantBeCreated_WithAnEmptyPoliceNationalComputerId() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            anInvestigationFile = new PoliceInvestigationFile(null, aSuspect);
        });
        assertTrue(exception.getMessage().contains("You must provide a PNC Id"));
    }

    @Test
    public void cantBeCreated_WithNoSuspect() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            anInvestigationFile = new PoliceInvestigationFile(aPncId, null);
        });
        assertTrue(exception.getMessage().contains("You must provide a suspect"));
    }
}
