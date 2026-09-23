package starrybucks_orders.demo;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class StarrybucksController {

    StarrybucksRepository starrybucksRepository;

    @GetMapping("/drinks")
    public List<Starrybucks> getAllDrinks(){
        return starrybucksRepository.findAll();
    }

    @GetMapping("/drink/{id}")
    public Starrybucks getDrinksbyid(@PathVariable Long id){
        return starrybucksRepository.findById(id).get();
    }

    @PostMapping("/drinks")
    public Starrybucks starrybucks(@RequestBody Starrybucks starrybucks){
        return starrybucksRepository.save(starrybucks);
    }

    @DeleteMapping("/drink/{id}")
    public void deleteDrinks(@PathVariable Long id){
        starrybucksRepository.deleteById(id);
    }


}
