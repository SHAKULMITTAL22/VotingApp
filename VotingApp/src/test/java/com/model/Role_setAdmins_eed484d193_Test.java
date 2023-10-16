// Test generated by RoostGPT for test roost-test using AI Type Azure Open AI and AI Model roost-gpt4-32k

package com.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class Role_setAdmins_eed484d193_Test {

    @InjectMocks
    Role role;

    @Mock
    List<Admin> adminsListMock;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSetAdmins_Success() {
        List<Admin> testAdminsList = new ArrayList<>();
        testAdminsList.add(new Admin(1, "john"));

        role.setAdmins(testAdminsList);
        assertEquals(testAdminsList, role.getAdmins());
    }

    @Test
    public void testSetAdmins_EmptyList() {
        List<Admin> emptyAdminsList = new ArrayList<>();

        role.setAdmins(emptyAdminsList);
        assertEquals(emptyAdminsList, role.getAdmins());
    }

}
