package com.snippets.api.data.priority_low.model;

import com.snippets.api.model.User;
import com.snippets.api.util.*;
import jakarta.persistence.*;
import org.junit.jupiter.api.*;

import static com.snippets.api.util.Constants.*;
import static org.junit.jupiter.api.Assertions.*;

@Order(10)
public class TestUser {
    private User user1;
    private User user2;
    private User user3;
    private User user4;
    private final Class<User> clazz = User.class;

    @BeforeEach
    void setUp() {
        user1 = DataUtil.getTestUser(0);
        user2 = DataUtil.getTestUser(1);
        user3 = DataUtil.getTestUser(2);
        user4 = DataUtil.getTestUser(3);
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

    @Test
    void idField_isAnnotatedWithId() {
        try {
            assertNotNull(clazz.getDeclaredField(ID).getDeclaredAnnotation(Id.class));
        } catch (NoSuchFieldException e) {
            fail();
        }
    }

    @Test
    void idField_isAnnotatedWithGeneratedValue() {
        try {
            assertNotNull(clazz.getDeclaredField(ID).getDeclaredAnnotation(GeneratedValue.class));
        } catch (NoSuchFieldException e) {
            fail();
        }
    }

    @Test
    public void idFieldGeneratedValueAnnotation_isStrategyUUID() {
        try {
            assertEquals(GenerationType.UUID, clazz
                    .getDeclaredField(ID)
                    .getDeclaredAnnotation(GeneratedValue.class)
                    .strategy()
            );
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
            fail();
        }
    }

    @Test
    public void idField_isAnnotatedWithColumn() {
        try {
            assertNotNull(clazz
                    .getDeclaredField(ID)
                    .getDeclaredAnnotation(Column.class)
            );
        } catch (NoSuchFieldException e) {
            fail();
        }
    }

    @Test
    public void idFieldColumnAnnotation_isNameId() {
        try {
            assertEquals(ID, clazz
                    .getDeclaredField(ID)
                    .getDeclaredAnnotation(Column.class)
                    .name()
            );
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
            fail();
        }
    }
    @Test
    public void idFieldColumnAnnotation_isNullableFalse() {
        try {
            assertFalse(clazz
                    .getDeclaredField(ID)
                    .getDeclaredAnnotation(Column.class)
                    .nullable());
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
            fail();
        }
    }

    @Test
    public void idFieldColumnAnnotation_isUniqueTrue() {
        try {
            assertTrue(clazz
                    .getDeclaredField(ID)
                    .getDeclaredAnnotation(Column.class)
                    .unique());
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
            fail();
        }
    }

    @Test
    public void emailField_isAnnotatedWithColumn() {
        try {
            assertNotNull(clazz
                    .getDeclaredField(EMAIL)
                    .getDeclaredAnnotation(Column.class)
            );
        } catch (NoSuchFieldException e) {
            fail();
        }
    }

    @Test
    public void emailFieldColumnAnnotation_isNameEmail() {
        try {
            assertEquals(EMAIL, clazz
                    .getDeclaredField(EMAIL)
                    .getDeclaredAnnotation(Column.class)
                    .name()
            );
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
            fail();
        }
    }
    @Test
    public void emailFieldColumnAnnotation_isNullableFalse() {
        try {
            assertFalse(clazz
                    .getDeclaredField(EMAIL)
                    .getDeclaredAnnotation(Column.class)
                    .nullable());
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
            fail();
        }
    }

    @Test
    public void emailFieldColumnAnnotation_isUniqueTrue() {
        try {
            assertTrue(clazz
                    .getDeclaredField(EMAIL)
                    .getDeclaredAnnotation(Column.class)
                    .unique());
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
            fail();
        }
    }@Test
    public void passwordField_isAnnotatedWithColumn() {
        try {
            assertNotNull(clazz
                    .getDeclaredField(PASSWORD)
                    .getDeclaredAnnotation(Column.class)
            );
        } catch (NoSuchFieldException e) {
            fail();
        }
    }

    @Test
    public void passwordFieldColumnAnnotation_isNamePassword_hash() {
        try {
            assertEquals("password_hash", clazz
                    .getDeclaredField(PASSWORD)
                    .getDeclaredAnnotation(Column.class)
                    .name()
            );
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
            fail();
        }
    }
    @Test
    public void passwordFieldColumnAnnotation_isNullableFalse() {
        try {
            assertFalse(clazz
                    .getDeclaredField(PASSWORD)
                    .getDeclaredAnnotation(Column.class)
                    .nullable());
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
            fail();
        }
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
