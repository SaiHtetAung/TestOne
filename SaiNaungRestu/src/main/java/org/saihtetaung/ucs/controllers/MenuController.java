package org.saihtetaung.ucs.controllers;

import org.saihtetaung.ucs.models.Menu;
import org.saihtetaung.ucs.services.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MenuController {
	@Autowired
	MenuService menuService;



	
	
	
	public String index(Model model) {
		model.addAttribute("menulist",menuService.getMenuList());
		return "home";
	}

	@RequestMapping(value = "/save_menu.htm", method = RequestMethod.GET)
	private String createMenu(Model model) {
		model.addAttribute("menu", new Menu());
		return "addmenu";
	}
	
	@RequestMapping(value = "/save_menu.htm", method = RequestMethod.POST)
	public String saveMenu(@ModelAttribute(value = "menu") Menu menu) {
		menuService.saveMenu(menu);
		return "redirect:/index.htm";
	}
	@RequestMapping(value="/delete.htm/{id}",method = RequestMethod.GET)
	public String deleteMenu(@PathVariable(value="id")Long id,Model model) throws Exception {
		menuService.deleteMenu(id); 
		return "redirect:/index.htm";
	}

	@RequestMapping(value = "/update,htm/{id}", method = RequestMethod.GET)
	public String updateMenu(@PathVariable(value = "id")Long id, Model model) throws Exception{
		menuService.updateMenu(id);
		return "redirect:/index.htm";
	}
}
