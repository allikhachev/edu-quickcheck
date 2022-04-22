package org.example;


import com.pholser.junit.quickcheck.From;
import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.generator.Ctor;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for simple App.
 */
@RunWith(JUnitQuickcheck.class)
public class FullNameTest {

    private final App app = new App();

    @Property
    public void lenShouldBeLenPlus2(@From(Ctor.class) User user) { // @From(Fields.class) can be used if constructor without parameters exists

        var res = app.getFullName(user);

        assertEquals(
                2 + user.getFirstName().length() + user.getMiddleName().length() + user.getLastName().length(),
                res.length()
        );
    }

    @Property
    public void shouldStartWithFirstName(@From(Ctor.class) User user) {

        var res = app.getFullName(user);

        assertTrue(res.startsWith(user.getFirstName()));
    }

    @Property
    public void shouldEndWithLastName(@From(Ctor.class) User user) {

        var res = app.getFullName(user);

        assertTrue(res.endsWith(user.getLastName()));
    }
}
