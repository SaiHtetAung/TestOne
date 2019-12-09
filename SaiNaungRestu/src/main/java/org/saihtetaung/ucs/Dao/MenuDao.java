package org.saihtetaung.ucs.Dao;

import java.util.List;

import org.saihtetaung.ucs.models.Menu;

public interface MenuDao {
	public void saveMenu(Menu menu);
	public List<Menu> getMenuList();
	Menu getMenuById(Long id);
	public void deleteMenu(Long id) throws Exception;
	public void updateMenu(Long id);
	
	
	
}
