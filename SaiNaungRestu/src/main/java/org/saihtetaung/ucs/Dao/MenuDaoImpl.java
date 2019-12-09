package org.saihtetaung.ucs.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.saihtetaung.ucs.models.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class MenuDaoImpl implements MenuDao {
	@Autowired
	SessionFactory sessionFactory;

	Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
		
	}

	public void saveMenu(Menu menu) {
		// TODO Auto-generated method stub
		getCurrentSession().saveOrUpdate(menu);
	}

	public List<Menu> getMenuList() {
		// TODO Auto-generated method stub
		return getCurrentSession().createCriteria(Menu.class).list();
	}

	public Menu getMenuById(Long id) {
		// TODO Auto-generated method stub
		Criteria c=getCurrentSession().createCriteria(Menu.class);
		c.add(Restrictions.eq("id",id));
		return (Menu)c.uniqueResult();
	}

	public void deleteMenu(Long id) throws Exception {
		// TODO Auto-generated method stub
		try {
			Menu m=getCurrentSession().get(Menu.class, id);
			getCurrentSession().delete(m);
			
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
	}

	public void updateMenu(Long id) {
		// TODO Auto-generated method stub
		
	}

}
