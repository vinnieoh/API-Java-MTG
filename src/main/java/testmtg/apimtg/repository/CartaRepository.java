package testmtg.apimtg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import testmtg.apimtg.model.Carta;

public interface CartaRepository extends JpaRepository <Carta, Long> {
    Carta findBy(long lista_cartas_id);
    //Carta findById(long id);
}
