package repository;

import entities.Quartos;
import org.springframework.data.jpa.repository.JpaRepository;
import tech.ada.exemplos.salao.beleza.entity.Fornecedor;

public interface QuartosRepository extends JpaRepository<Quartos, String>{
}
