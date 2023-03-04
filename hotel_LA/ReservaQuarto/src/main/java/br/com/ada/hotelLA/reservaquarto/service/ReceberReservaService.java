package br.com.ada.hotelLA.reservaquarto.service;

import br.com.ada.hotelLA.reservaquarto.client.TransacoesFinanceirasClient;
import br.com.ada.hotelLA.reservaquarto.client.payloadrequest.PagamentoReservaRequest;
import br.com.ada.hotelLA.reservaquarto.payload.ReservaRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReceberReservaService {

    private final TransacoesFinanceirasClient transacoesFinanceirasClient;

    public void executar(ReservaRequest reservaRequest){
        PagamentoReservaRequest pagamentoReserva = new PagamentoReservaRequest();

        PagamentoReservaRequest pagamentoReservaRequest = new PagamentoReservaRequest();
        //Set/get variáveis(que não defini): pagamentoReservaRequest.set...

        transacoesFinanceirasClient.realizarPagamentoReserva(pagamentoReservaRequest);

    }
}
