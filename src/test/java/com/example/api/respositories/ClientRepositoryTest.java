package com.example.api.respositories;

import com.example.api.models.Client;
import com.example.api.repositories.ClientRepository;
import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ActiveProfiles;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.Optional;

@DataJpaTest
public class ClientRepositoryTest {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private TestEntityManager testEntityManager;

    @Test
    public void persistingDataTest() {
        Client newClient = new Client();
        String name = "Test";
        newClient.setName(name);
        newClient.setCpf("12345678912");
        newClient.setBirthDate(LocalDate.now());
        testEntityManager.persist(newClient);

        Client client = clientRepository.findByName(name);
        assertNotNull(client);
        assertEquals(name, client.getName());
    }
}
