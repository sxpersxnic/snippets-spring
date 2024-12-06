package com.snippets.api.data.priority_low.model;

import com.snippets.api.model.Tag;
import com.snippets.api.util.*;
import jakarta.persistence.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@Order(10)
public class TestTag {
    private Tag tag1;
    private Tag tag2;
    private Tag tag3;
    private Tag tag4;
    private final Class<Tag> clazz = Tag.class;

    @BeforeEach
    void setUp() {
        tag1 = DataUtil.getTestTag(0);
        tag2 = DataUtil.getTestTag(1);
        tag3 = DataUtil.getTestTag(2);
        tag4 = DataUtil.getTestTag(3);
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
