package vlad.data_access_objects.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vlad.data_access_objects.dao.DAO;
import vlad.data_access_objects.entities.VehicleEntity;

import javax.transaction.Transactional;
import java.util.List;
@Service
public class CRUDVehicleService implements CRUDService<VehicleEntity> {
    @Autowired
    private DAO<VehicleEntity> dao;

    @Transactional
    @Override
    public List<VehicleEntity> getAll() {
        List<VehicleEntity> result = dao.getAllEntities();
        return result;
    }

    @Transactional
    @Override
    public void delete(VehicleEntity vehicle) {

    }
    @Transactional
    @Override
    public void add(VehicleEntity vehicle) {
        dao.add(vehicle);
    }

    @Transactional
    @Override
    public void update(VehicleEntity vehicle) {

    }
}
