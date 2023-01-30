package vlad.data_access_objects.dao;

import java.util.List;

public interface DAO<T> {
    List<T> getAllEntities();

    void delete(long id);

    void save(T vehicle);

    T getById(long id);
}
