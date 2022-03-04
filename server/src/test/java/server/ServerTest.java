package server;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.core.io.Resource;

import java.io.IOException;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ServerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Value("classpath:answer.json")
    private Resource resourceFile;

    @Test
    public void testCase() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Assertions.assertEquals(
                objectMapper.readTree(resourceFile.getFile()),
                objectMapper.readTree(this.restTemplate.getForObject("http://localhost:" + port + "/client/development", String.class)));
    }
}