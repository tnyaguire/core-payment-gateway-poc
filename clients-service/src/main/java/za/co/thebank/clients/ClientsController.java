package za.co.thebank.clients;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ClientsController {

    @GetMapping("/clients/{id}")
    public String getClientById(@PathVariable String id) {
        log.info("Getting client with id {}", id);
        return "Client details for client " + id;
    }
}