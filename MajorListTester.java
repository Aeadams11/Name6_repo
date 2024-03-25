import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MajorListTester {
    private MajorList majorList;

        @BeforeClass
        public void oneTimeSetup() {
         majorList = MajorList.getInstance();

        }
        
        @AfterClass
        public void oneTimeTearDown() {
            
        }
        
        @BeforeEach
        public void setup() {
            //runs before each test
        }
        
        @AfterEach
        public void tearDown() {
            
        }

        @Test
        public void testGetMajor() {
            Major major = new Major("Computer Science", null, null);
            MajorList.getInstance().getMajor("Computer Science");
        }
}
