package es.upm.miw.iwvg.ecosystem.practica;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class UserTest {

    private User user;

    @BeforeEach
    void before() {
        user = new User(1,"Gabriel Macho", "La Familia Macho");
    }
    @Test
    void testNumber(){
        assertEquals(1, user.getNumber());
    }

    @Test
    void testNumberNumber(){
        user = new User(2,"Gabriel Macho", "La Familia Macho");
        assertEquals(2, user.getNumber());
    }

    @Test
    void testFullName(){
        assertEquals("Gabriel macho La familia macho", user.fullName());
    }

    @Test
    void testFullNameName(){
        user = new User(2,"Enrique Macho", "La Familia Macho");
        assertEquals("Enrique macho La familia macho", user.fullName());
    }

    @Test
    void testInitials(){
        assertEquals("G.", user.initials());
    }
    @Test
    void testName(){
        assertEquals("GABRIEL MACHO", user.getName());
    }

    @Test
    void testFamilyName(){
        assertEquals("La familia macho", user.getFamilyName());
    }

    @Test
    void testFamilyNameName(){
        user = new User(5,"Gabriel Macho", "Nueva Familia Macho");
        assertEquals("Nueva familia macho", user.getFamilyName());
    }

}
