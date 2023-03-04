package br.com.ada.hotelLA.reservaquarto.controller;

import br.com.ada.hotelLA.reservaquarto.payload.ReservaRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/realizarreserva")
public class ReceberReservaController {

    @PostMapping
    public void realizarReserva (@RequestBody ReservaRequest reservaRequest){

    }
}
