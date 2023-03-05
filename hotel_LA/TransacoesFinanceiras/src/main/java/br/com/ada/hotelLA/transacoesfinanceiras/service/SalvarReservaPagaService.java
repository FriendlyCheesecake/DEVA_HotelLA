package br.com.ada.hotelLA.transacoesfinanceiras.service;

import br.com.ada.hotelLA.transacoesfinanceiras.payload.request.PagamentoReservaRequest;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;

@Service
public class SalvarReservaPagaService {

    @CacheEvict(cacheNames = "rlreservas", allEntries = true)
    public void executar(PagamentoReservaRequest pagamentoReservaRequest){

    }
}
