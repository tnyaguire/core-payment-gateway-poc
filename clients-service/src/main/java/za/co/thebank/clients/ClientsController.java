package za.co.thebank.clients;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientsController {

    @GetMapping("/clients/{id}")
    public String getClientById(@PathVariable String id) {
        return "Client details for client " + id;
    }
}