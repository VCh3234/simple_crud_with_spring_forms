package vlad.data_access_objects.services;

import java.util.List;

public interface CRUDService<T> {
    List<T> getAll();

    void delete(long id);

    void save(T vehicle);

    T getById(long id);
}

