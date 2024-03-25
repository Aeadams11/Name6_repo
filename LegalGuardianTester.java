import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentTester {
    @BeforeClass
	public void oneTimeSetup() {
		
	}
	
	@AfterClass
	public void oneTimeTearDown() {
		
	}
	
	@BeforeEach
	public void setup() {
		//runs before each test
		//create instance of user
        LegalGuardian user = new LegalGuardian(null, null, null, null, null, false, null);
	}
	
	@AfterEach
	public void tearDown() {
		//runs after each test
	}

    @Test
    public void testBadEmailFormat() {
        String email = "thisisnotanemail";
        assertFalse(user.setEmail(email));
    }

    @Test
    public void testGoodEmailFormat() {
        String email = "aeadams11@gmail.como";
        assertTrue(user.setEmail(email));
    }

    // create testers for LG with permissions and LG wo permissions
} 
