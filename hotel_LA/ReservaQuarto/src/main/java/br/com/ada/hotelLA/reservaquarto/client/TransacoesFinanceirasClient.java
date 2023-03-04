package br.com.ada.hotelLA.reservaquarto.client;

import br.com.ada.hotelLA.reservaquarto.client.payloadrequest.PagamentoReservaRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class TransacoesFinanceirasClient {

    private String url = "http://localhost:9080/pagamentoreserva";

    // o professor faz diferente (mas não sei fazer), com:
    // @Value("${}")
    //private String url;

    public void realizarPagamentoReserva (PagamentoReservaRequest pagamentoReserva){
        WebClient webClient = WebClient.create(url);
        webClient.post().uri(url).body(pagamentoReserva, PagamentoReservaRequest.class).retrieve();

    }
}
