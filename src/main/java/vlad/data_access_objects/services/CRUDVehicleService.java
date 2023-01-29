package vlad.data_access_objects.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vlad.data_access_objects.dao.DAO;
import vlad.data_access_objects.entities.VehicleEntity;

import java.util.List;
@Service
public class CRUDVehicleService implements CRUDService<VehicleEntity> {
    @Autowired
    private DAO<VehicleEntity> dao;
    @Override
    public List<VehicleEntity> getAll() {
        List<VehicleEntity> result = dao.getAllEntities();
        return result;
    }

    @Override
    public void delete(VehicleEntity vehicle) {

    }

    @Override
    public void add(VehicleEntity vehicle) {

    }

    @Override
    public void update(VehicleEntity vehicle) {

    }
}
