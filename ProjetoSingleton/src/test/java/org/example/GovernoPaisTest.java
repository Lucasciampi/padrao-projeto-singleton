package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GovernoPaisTest {

    @Test
    void deveRetornarNomePais() {
        GovernoPais.getInstance().setNomePais("França");
        assertEquals("França", GovernoPais.getInstance().getNomePais());
    }

    @Test
    void deveRetornarNomePresidente() {
        GovernoPais.getInstance().setNomePresidente("Emmanuel Macron");
        assertEquals("Emmanuel Macron", GovernoPais.getInstance().getNomePresidente());
    }


}