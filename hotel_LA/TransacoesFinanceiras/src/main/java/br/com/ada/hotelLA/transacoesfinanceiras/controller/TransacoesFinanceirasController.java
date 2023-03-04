package br.com.ada.hotelLA.transacoesfinanceiras.controller;

import br.com.ada.hotelLA.transacoesfinanceiras.payload.PagamentoReservaRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pagamentoreserva")
public class TransacoesFinanceirasController {
    @PostMapping(path = "/reserva")
    @ResponseStatus(HttpStatus.CREATED)
    public void realizarPagamentoReserva(@RequestBody PagamentoReservaRequest pagamentoReservaRequest){

    }
}
