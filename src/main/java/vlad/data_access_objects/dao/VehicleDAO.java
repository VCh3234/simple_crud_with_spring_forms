package vlad.data_access_objects.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import vlad.data_access_objects.entities.VehicleEntity;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;

@Repository
public class VehicleDAO implements DAO<VehicleEntity> {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<VehicleEntity> getAllEntities() {
        Session session = sessionFactory.getCurrentSession();
        List<VehicleEntity> result = session.createQuery("from VehicleEntity", VehicleEntity.class).getResultList();
        return result;
    }

    @Override
    public void delete(long id) {
        Session session = sessionFactory.getCurrentSession();
        Query<VehicleEntity> query = session.createQuery("delete from VehicleEntity where id =:vehicleId");
        query.setParameter("vehicleId", id);
        query.executeUpdate();
    }

    @Override
    public void save(VehicleEntity vehicle) {
        Session session = sessionFactory.getCurrentSession();
        if(vehicle.getPurchaseDate() == null) {
            vehicle.setPurchaseDate(LocalDate.now());
        }
        System.out.println(vehicle);
        session.saveOrUpdate(vehicle);
    }

    @Override
    public VehicleEntity getById(long id) {
        Session session = sessionFactory.getCurrentSession();
        VehicleEntity result = session.get(VehicleEntity.class, id);
        return result;
    }
}
