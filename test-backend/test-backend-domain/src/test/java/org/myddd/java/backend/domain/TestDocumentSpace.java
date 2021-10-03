package org.myddd.java.backend.domain;

import org.myddd.java.backend.AbstractDocumentTest;
import org.myddd.java.backend.domain.core.DocumentSpace;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.transaction.Transactional;

class TestDocumentSpace extends AbstractDocumentTest {

    @Test
    @Transactional
    void testCreateSharedDocument(){
        DocumentSpace sharedDocumentSpace = DocumentSpace.createSharedSpace();
        Assertions.assertTrue(sharedDocumentSpace.getId() > 0);
    }


}
