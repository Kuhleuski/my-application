package repository.dao;

import java.sql.SQLException;
import java.util.List;

public interface GenericDao <T>{
    T findOne(Integer id) throws SQLException;

    List<T> findAll();

    T create(T entity);

    T update(T incomingEntity);

    void delete(T entity);

    void deleteById(Integer entityId) throws SQLException;

    void closeAll();
}
