package davibc.provajava.controller;

import davibc.provajava.entity.Animal;
import davibc.provajava.services.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "animais")
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @PutMapping("{id}")
    public Animal Atualizar(@PathVariable Integer id, @RequestBody Animal animal){
        return animalService.Atualizar(animal, id);
    }

    @GetMapping
    public List<Animal> BuscarTodos(){
        return animalService.BuscarTodos();
    }

    @GetMapping("{id}")
    public Animal BuscarPeloId(@PathVariable Integer id){
        return animalService.BuscarPorId(id);
    }

    @DeleteMapping("{id}")
    public void Deletar(@PathVariable Integer id) {
        animalService.Deletar(id);
    }

    @PostMapping
    public void Adicionar(@RequestBody Animal animal){
        animalService.Adicionar(animal);
    }

}
