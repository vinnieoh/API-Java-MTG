package testmtg.apimtg.resources;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import testmtg.apimtg.model.ListaCartas;
import testmtg.apimtg.repository.ListaCartasRepository;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(value="/api")
public class ListaCartasResource {

    @Autowired
    ListaCartasRepository listaCartasRepository;

    @GetMapping("/lista-cartas")
    public List<ListaCartas> listaCartaList(){
        return listaCartasRepository.findAll();
    }

    @GetMapping("/lista-cartas/{id}")
    public ListaCartas unicaListaCarta(@PathVariable(value="id") long id){
        return listaCartasRepository.findById(id);
    }

    @PostMapping("/lista-cartas")
    public ListaCartas saveListaCartas(@RequestBody ListaCartas listaCartas){
        return listaCartasRepository.save(listaCartas);
    }

    @DeleteMapping ("/lista-cartas")
    public void deleteListaCartas(@RequestBody ListaCartas listaCartas){
        listaCartasRepository.delete(listaCartas);
    }

    @PutMapping("/lista-cartas")
    public ListaCartas putListaCartas(@RequestBody ListaCartas listaCartas){
        return listaCartasRepository.save(listaCartas);
    }

}
