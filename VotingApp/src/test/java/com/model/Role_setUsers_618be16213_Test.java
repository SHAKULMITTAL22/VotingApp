// Test generated by RoostGPT for test roost-test using AI Type Azure Open AI and AI Model roost-gpt4-32k

package com.model;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class Role_setUsers_618be16213_Test {

    private Role role;

    @Before
    public void setUp() {
        this.role = new Role();
    }

    @Test
    public void testSetUsers() {
        // Arrange
        User user1 = mock(User.class);
        User user2 = mock(User.class);
        List<User> mockUsers = Arrays.asList(user1, user2);
        
        // Act
        role.setUsers(mockUsers);
        List<User> actualUsers = role.getUsers();
        
        // Assert
        assertEquals(mockUsers, actualUsers);
    }

    @Test
    public void testSetUsersWithEmptyList() {
        // Arrange
        List<User> mockUsers = Arrays.asList();
        
        // Act
        role.setUsers(mockUsers);
        List<User> actualUsers = role.getUsers();
        
        // Assert
        assertEquals(mockUsers, actualUsers);
    }

}
