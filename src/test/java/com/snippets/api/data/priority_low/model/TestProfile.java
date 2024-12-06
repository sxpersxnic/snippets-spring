package com.snippets.api.data.priority_low.model;

import com.snippets.api.model.Profile;
import com.snippets.api.util.*;
import jakarta.persistence.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@Order(10)
public class TestProfile {
    private Profile profile1;
    private Profile profile2;
    private Profile profile3;
    private Profile profile4;
    private final Class<Profile> clazz = Profile.class;

    @BeforeEach
    void setUp() {
        profile1 = DataUtil.getTestProfile(0);
        profile2 = DataUtil.getTestProfile(1);
        profile3 = DataUtil.getTestProfile(2);
        profile4 = DataUtil.getTestProfile(3);
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
