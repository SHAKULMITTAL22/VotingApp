// Test generated by RoostGPT for test roost-test using AI Type Azure Open AI and AI Model roost-gpt4-32k

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.model.Admin;

public class Admin_Admin_8160688bfa_Test {
    private Admin admin;

    //Set up method
    @BeforeEach
    public void setup() {
        admin = new Admin();
    }

    // Test case 1: to check if our admin object has been initialized
    @Test
    public void testAdminObjectNonNull() {
        Assertions.assertNotNull(admin, "Admin object is null but it should not be");
    }
    
    // Test case 2: to check if our admin object is initialized correctly
    @Test
    public void testAdminObjectDefaults() {
        Assertions.assertNull(admin.getName(), "Admin name should be null by default");
        Assertions.assertNull(admin.getId(), "Admin id should be null by default");
    }
}
