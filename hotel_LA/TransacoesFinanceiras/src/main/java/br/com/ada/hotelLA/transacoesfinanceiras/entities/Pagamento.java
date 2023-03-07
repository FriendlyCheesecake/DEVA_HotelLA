package br.com.ada.hotelLA.transacoesfinanceiras.entities;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Data
@Entity
@Table(name = "Pagamento")
@NamedEntityGraph(name = "Pagamento.quartos", attributeNodes = @NamedAttributeNode("quartos"))
public class Pagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @CreatedDate
    private LocalDateTime dataCriacao;

    @OneToMany(mappedBy = "pagamento", cascade = {CascadeType.PERSIST})
    private List<Quartos> quartos;

    public void adicionarItems(List<Quartos> quartos) {
        quartos.forEach(quarto->quarto.setPagamento(this));
        if(Objects.isNull(this.quartos)){
            this.quartos = new ArrayList<>();
        }
        this.quartos.addAll(quartos);
    }
}
