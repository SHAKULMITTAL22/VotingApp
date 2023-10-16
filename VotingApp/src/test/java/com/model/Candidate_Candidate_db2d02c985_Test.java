// Test generated by RoostGPT for test roost-test using AI Type Azure Open AI and AI Model roost-gpt4-32k

package com.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class Candidate_Candidate_db2d02c985_Test {

    Candidate candidate;

    @BeforeEach
    public void setUp() {
        candidate = new Candidate(1, "John", "Doe", "Jane", "Smith");
    }

    @Test
    public void testCandidateConstructor() {
        assertEquals(1, candidate.getId());
        assertEquals("John", candidate.getCandidate1());
        assertEquals("Doe", candidate.getCandidate2());
        assertEquals("Jane", candidate.getCandidate3());
        assertEquals("Smith", candidate.getCandidate4());
    }

    @Test
    public void testCandidateConstructorWithNullValues() {
        Candidate nullCandidate = new Candidate(0, null, null, null, null);
        assertEquals(0, nullCandidate.getId());
        assertEquals(null, nullCandidate.getCandidate1());
        assertEquals(null, nullCandidate.getCandidate2());
        assertEquals(null, nullCandidate.getCandidate3());
        assertEquals(null, nullCandidate.getCandidate4());
    }
}
