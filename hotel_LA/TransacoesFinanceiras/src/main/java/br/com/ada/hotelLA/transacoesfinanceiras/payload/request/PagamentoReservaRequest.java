package br.com.ada.hotelLA.transacoesfinanceiras.payload.request;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Data
public class PagamentoReservaRequest {
    @NotNull
    private Quarto quarto;

    @NotNull
    private List<QuartosDisponiveis> quartosDisponiveis;

}
