package vlad.data_access_objects.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import vlad.data_access_objects.entities.VehicleEntity;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class VehicleDAO implements DAO<VehicleEntity> {

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public List<VehicleEntity> getAllEntities() {
        Session session = sessionFactory.getCurrentSession();
        List<VehicleEntity> result = session.createQuery("from VehicleEntity", VehicleEntity.class).getResultList();
        return result;
    }

    public void delete(VehicleEntity vehicle) {

    }

    public void add(VehicleEntity vehicle) {

    }

    public void update(VehicleEntity vehicle) {

    }
}
