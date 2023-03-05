package br.com.ada.hotelLA.transacoesfinanceiras.controller;

import br.com.ada.hotelLA.transacoesfinanceiras.payload.request.PagamentoReservaRequest;
import br.com.ada.hotelLA.transacoesfinanceiras.payload.response.RelatorioReservasConfirmadas;
import br.com.ada.hotelLA.transacoesfinanceiras.service.SalvarReservaPagaService;
import br.com.ada.hotelLA.transacoesfinanceiras.service.TotalReservasConfirmadasService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/pagamentoreserva")
@RequiredArgsConstructor
@Slf4j
public class TransacoesFinanceirasController {

    private final SalvarReservaPagaService salvarReservaPagaService;

    private final TotalReservasConfirmadasService totalReservasConfirmadasService;
    @PostMapping(path = "/reserva")
    @ResponseStatus(HttpStatus.CREATED)
    public void realizarPagamentoReserva(@RequestBody PagamentoReservaRequest pagamentoReservaRequest){
        log.info("Pagamento de reserva recebido {}", pagamentoReservaRequest);
        salvarReservaPagaService.executar(pagamentoReservaRequest);

    }

    @GetMapping(path = "/relatorio/{dataReserva}")
    //PENSEI EM PUXAR AS RESERVAS POR DATA, MAS NÃO SEI CHAMAR/TRANSFORMAR O TIPO DA VARIÁVEL
    public RelatorioReservasConfirmadas getRelatorioReservasConfirmadas(@PathVariable String dataReserva){
        return totalReservasConfirmadasService.execute(dataReserva);
    }
}
