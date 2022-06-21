package repository.dao;

import repository.entity.Horse;
import repository.util.HibernateUtil;

public class HorseDaoImpl extends GenericDaoImpl<Horse> implements HorseDao{

    public HorseDaoImpl() {
        super(Horse.class, HibernateUtil.getEntityManager());
    }
}
