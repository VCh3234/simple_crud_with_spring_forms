package vlad.data_access_objects.dao;

import java.util.List;

public interface DAO<T> {
    List<T> getAllEntities();

    void delete(T vehicle);

    void add(T vehicle);

    void update(T vehicle);
}
