package testmtg.apimtg.resources;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import testmtg.apimtg.model.Carta;
import testmtg.apimtg.repository.CartaRepository;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping(value="/api")
public class CartasResouce {

    @Autowired
    CartaRepository cartaRepository;

    @GetMapping("/carta/{lista_cartas_id}")
    public List<Carta> cartaList(@PathVariable(value="lista_cartas_id") long lista_cartas_id){
        return cartaRepository.findAllById(Collections.singleton(lista_cartas_id));
    }

    @PostMapping("/carta")
    public Carta saveCarta(@RequestBody Carta Carta){
        return cartaRepository.save(Carta);
    }

    @DeleteMapping("/carta")
    public void deleteCarta(@RequestBody Carta Carta){
        cartaRepository.delete(Carta);
    }

    @PutMapping("/carta")
    public Carta putCarta(@RequestBody Carta Carta){
        return cartaRepository.save(Carta);
    }

}
