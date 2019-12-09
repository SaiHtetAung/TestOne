package org.saihtetaung.ucs.services;

import java.util.List;

import org.saihtetaung.ucs.models.Menu;

public interface MenuService {

	void saveMenu(Menu menu);
	List<Menu> getMenuList();
	void deleteMenu(Long id) throws Exception;
	void updateMenu(Long id);
	
}
