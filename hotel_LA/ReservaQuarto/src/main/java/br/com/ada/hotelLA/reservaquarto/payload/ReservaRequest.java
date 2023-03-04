package br.com.ada.hotelLA.reservaquarto.payload;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class ReservaRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty ("ID_reserva")
    private Long numeroReserva;

    @JsonProperty ("nome_cliente")
    private String nomeCliente;

    @JsonProperty ("preco_quarto")
    private BigDecimal precoQuarto;

    @JsonProperty ("data_hospedagem")
    private Date dataHospedagem;

    @JsonProperty ("dias_reservados")
    private Integer diasReservados;

    //CADA QUARTO VAI TER UM ID DIFERENTE, OU O ID É PARA TIPOS DE QUARTOS?
    //*OU* AQUI PODE SER DISPONIBILIDADEQUARTOREQUEST??
    //@Column (unique = true)
    @JsonProperty ("ID_quarto")
    private Long idQuarto;

}
