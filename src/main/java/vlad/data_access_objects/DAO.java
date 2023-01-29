package vlad.data_access_objects;

import vlad.data_access_objects.entities.VehicleEntity;

import java.util.List;

public interface DAO<T> {
    List<T> getAll();

    void delete(T vehicle);

    void add(T vehicle);

    void update(T vehicle);
}
