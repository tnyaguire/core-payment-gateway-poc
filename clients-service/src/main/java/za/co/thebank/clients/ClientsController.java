package za.co.thebank.clients;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ClientsController {

    @GetMapping("/clients/{id}")
    public String getClientById(@PathVariable String id) {
        log.info("getClientById");
        return "Client details for client " + id;
    }
}