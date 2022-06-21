package service;

import repository.entity.Horse;

import java.sql.SQLException;
import java.util.List;

public interface HorseService {

    void createHorse(Horse horse);

    void deleteHorseById(int id) throws SQLException;

    void updateHorse(Horse horse);

    Horse findHorseById(int id) throws SQLException;

    List<Horse> allHorses();
}
