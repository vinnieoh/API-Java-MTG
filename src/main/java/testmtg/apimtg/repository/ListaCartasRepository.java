package testmtg.apimtg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import testmtg.apimtg.model.ListaCartas;

public interface ListaCartasRepository extends JpaRepository<ListaCartas, Long> {
    ListaCartas findById(long id);
}
