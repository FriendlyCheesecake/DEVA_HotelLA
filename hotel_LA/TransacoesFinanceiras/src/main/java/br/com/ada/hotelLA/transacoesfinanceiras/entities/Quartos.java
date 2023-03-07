package br.com.ada.hotelLA.transacoesfinanceiras.entities;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "Quartos")
public class Quartos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String identificador;
    @Column(name = "nome_cliente")
    private String nomeCliente;

}
