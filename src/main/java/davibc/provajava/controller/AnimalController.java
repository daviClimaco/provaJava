package davibc.provajava.controller;

import davibc.provajava.entity.Animal;
import davibc.provajava.services.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "animais")
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @PutMapping("{id}")
    public Animal Atualizar(@PathVariable Integer id, @RequestBody Animal animal){
        return animalService.Atualizar(animal, id);
    }

}
