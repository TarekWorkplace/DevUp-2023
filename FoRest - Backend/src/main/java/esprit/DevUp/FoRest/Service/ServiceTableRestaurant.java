package esprit.DevUp.FoRest.Service;

import esprit.DevUp.FoRest.Entity.TableRestaurant;
import esprit.DevUp.FoRest.Repository.TableRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Slf4j
public class ServiceTableRestaurant implements IServiceTableRestaurant {

    TableRepository tableRepository;
    @Override
    public List<TableRestaurant> retrieveAllTableRestaurant() {
        return tableRepository.findAll();
    }

    @Override
    public TableRestaurant addTableRestaurant(TableRestaurant u) {
        return tableRepository.save(u);
    }

    @Override
    public TableRestaurant updateTableRestaurant(TableRestaurant u) {
        return tableRepository.save(u);
    }

    @Override
    public TableRestaurant retrieveTableRestaurant(Integer id) {
        return tableRepository.findById(id).orElse(null);
    }

    @Override
    public void removeTableRestaurant(Integer id) {
    tableRepository.deleteById(id);
    }
}
