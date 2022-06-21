package repository;

import repository.dao.HorseDao;
import repository.dao.HorseDaoImpl;
import repository.entity.Horse;

import java.sql.SQLException;

public class AppRepository {
    public static void main(String[] args) {
        HorseDao horseDao = new HorseDaoImpl();

        Horse horse = Horse.builder()
                .type("Для скачек")
                .age(19)
                .price(1980)
                .build();

        Horse horse2 = Horse.builder()
                .type("Не для скачек")
                .age(7)
                .price(913)
                .build();




        horseDao.create(horse);
        horseDao.create(horse2);

//        try {
//            horseDao.deleteById(horse.getId());
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }


        horse2.setAge(2);


        horseDao.update(horse2);

    }
}
