package br.com.ada.hotelLA.transacoesfinanceiras.service;

import br.com.ada.hotelLA.transacoesfinanceiras.payload.response.RelatorioReservasConfirmadas;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TotalReservasConfirmadasService {

    @Cacheable(cacheNames = "rlreservas", key = "#identificadorReserva")
    public RelatorioReservasConfirmadas execute(String identificarReservasConfirmadas){
        log.info("Relatório de reservas confirmadas invocado");
        RelatorioReservasConfirmadas relatorioReservas = new RelatorioReservasConfirmadas();
        //ESTABELECER SET/GET: relatorioReservas.set...
        return relatorioReservas;
    }
}
