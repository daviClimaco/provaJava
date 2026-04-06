package davibc.provajava.services;

import davibc.provajava.entity.Animal;
import davibc.provajava.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    public List<Animal> BuscarTodos(){
        return animalRepository.findAll();
    }

    public Animal BuscarPorId(Integer id){
        return animalRepository.findById(id).get();
    }

    public void Adicionar(Animal animal){
        animalRepository.save(animal);
    }

    public void Deletar(Integer id){
        animalRepository.deleteById(id);
    }

    public Animal Atualizar(Animal animal, Integer id){

        Animal animalQueSeraAlterado = animalRepository.findById(id).orElse(null);

        animalQueSeraAlterado.setEspecie(animal.getEspecie());
        animalQueSeraAlterado.setNome(animal.getNome());

        return animalRepository.save(animalQueSeraAlterado);
    }


}
