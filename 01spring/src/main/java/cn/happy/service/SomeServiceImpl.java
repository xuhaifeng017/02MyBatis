package cn.happy.service;

import cn.happy.dao.ISomeDao;
import cn.happy.dao.SomeDaoImpl;

/**
 * Created by 13447 on 2017/10/7.
 */
public class SomeServiceImpl implements ISomeService {

   private ISomeDao dao;

    public ISomeDao getDao() {
        return dao;
    }

    public void setDao(ISomeDao dao) {
        this.dao = dao;
    }

    public void doSome() {
        dao.doSome();
    }
}
