package com.snippets.api.data.priority_low.model;

import com.snippets.api.model.Snippet;
import com.snippets.api.util.*;
import jakarta.persistence.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@Order(10)
public class TestSnippet {
    private Snippet snippet1;
    private Snippet snippet2;
    private Snippet snippet3;
    private Snippet snippet4;
    private final Class<Snippet> clazz = Snippet.class;

    @BeforeEach
    void setUp() {
        snippet1 = DataUtil.getTestSnippet(0);
        snippet2 = DataUtil.getTestSnippet(1);
        snippet3 = DataUtil.getTestSnippet(2);
        snippet4 = DataUtil.getTestSnippet(3);
    }

    /*
     * -------------------------------
     * Annotations
     * -------------------------------
     */

    @Test
    @Order(1)
    void class_isAnnotatedWithEntity() {
        assertNotNull(clazz.getDeclaredAnnotation(Entity.class));
    }

    @Test
    @Order(2)
    void class_isAnnotatedWithTable() {
        assertNotNull(clazz.getDeclaredAnnotation(Table.class));
    }

    /*
     * -------------------------------
     * Constructor
     * -------------------------------
     */

    /*
     * -------------------------------
     * Fields
     * -------------------------------
     */

    /*
     * -------------------------------
     * Getter
     * -------------------------------
     */

    /*
     * -------------------------------
     * Setter
     * -------------------------------
     */

    /*
     * -------------------------------
     * Equals
     * -------------------------------
     */

    /*
     * -------------------------------
     * HashCode
     * -------------------------------
     */

}
