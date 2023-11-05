package com.robsonkades.spring.sqlpersister;

import org.junit.jupiter.api.Test;

class SQLPersisterTest {

    SQLPersister sqlPersister = new SQLPersister();

    @Test
    void sample() {
        sqlPersister.execute("");
    }
}