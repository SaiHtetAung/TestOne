package org.saihtetaung.ucs.services;

import java.util.List;

import org.saihtetaung.ucs.Dao.MenuDao;
import org.saihtetaung.ucs.models.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MenuServiceImpl implements MenuService{

	@Autowired
	MenuDao menuDao;
	
	public void saveMenu(Menu menu) {
		// TODO Auto-generated method stub
		menuDao.saveMenu(menu);
	}

	public List<Menu> getMenuList() {
		// TODO Auto-generated method stub
		return menuDao.getMenuList();
	}

	public void deleteMenu(Long id) throws Exception {
		// TODO Auto-generated method stub
		menuDao.deleteMenu(id);
	}

	public void updateMenu(Long id) {
		// TODO Auto-generated method stub
		menuDao.updateMenu(id);
	}

}
