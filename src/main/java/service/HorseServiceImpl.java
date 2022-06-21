package service;

import lombok.RequiredArgsConstructor;
import repository.dao.HorseDao;
import repository.dao.HorseDaoImpl;
import repository.entity.Horse;

import java.sql.SQLException;
import java.util.List;

@RequiredArgsConstructor
public class HorseServiceImpl implements HorseService{

    private final HorseDao horseDao = new HorseDaoImpl();


    @Override
    public void createHorse(Horse horse) {
        horseDao.create(horse);
    }

    @Override
    public void deleteHorseById(int id) throws SQLException {
        horseDao.findOne(id);
    }

    @Override
    public void updateHorse(Horse horse) {
        horseDao.update(horse);

    }

    @Override
    public Horse findHorseById(int id) throws SQLException {
        return horseDao.findOne(id);
    }

    @Override
    public List<Horse> allHorses() {
        return horseDao.findAll();
    }
}
