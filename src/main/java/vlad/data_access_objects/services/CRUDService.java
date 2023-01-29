package vlad.data_access_objects.services;

import java.util.List;

public interface CRUDService<T> {
    List<T> getAll();

    void delete(T vehicle);

    void add(T vehicle);

    void update(T vehicle);
}

