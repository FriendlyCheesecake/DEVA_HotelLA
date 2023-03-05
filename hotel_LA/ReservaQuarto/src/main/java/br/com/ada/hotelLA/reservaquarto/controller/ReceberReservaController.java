package br.com.ada.hotelLA.reservaquarto.controller;

import br.com.ada.hotelLA.reservaquarto.payload.ReservaRequest;
import br.com.ada.hotelLA.reservaquarto.service.ReceberReservaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/realizarreserva")
@RequiredArgsConstructor
public class ReceberReservaController {

    private final ReceberReservaService receberReservaService;
    @PostMapping
    public void realizarReserva (@RequestBody ReservaRequest reservaRequest){
        receberReservaService.executar(reservaRequest);

    }
}
