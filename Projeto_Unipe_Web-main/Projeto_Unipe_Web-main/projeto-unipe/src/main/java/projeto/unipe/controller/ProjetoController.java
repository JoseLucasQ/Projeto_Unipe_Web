package projeto.unipe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import projeto.unipe.model.Morador;

@Controller
public class ProjetoController {
	
	@RequestMapping(value = "/teste", method = RequestMethod.GET)
	public String welcome()
	{
		return "welcome";
	}
	
	@RequestMapping(value = "/outraforma", method = RequestMethod.GET)
	public ModelAndView outraForma()
	{
		ModelAndView view = new ModelAndView("welcome");
		
		view.addObject("mensagem", "View com parametros funcionando com sucesso");
		
		return view;
	}
	
	@RequestMapping(value = "/formulario", method = RequestMethod.GET)
	public ModelAndView formulario(Model model)
	{
		model.addAttribute("morado", new Morador());
		return new ModelAndView("formulario");
	}
	
	@RequestMapping(value = "/formulario", method = RequestMethod.POST)
	public ModelAndView exibelocal(@ModelAttribute Morador morador)
	{
		ModelAndView view = new ModelAndView("formulario");
		
		view.addObject("mensagem", morador.getNome() + " é morador de " + morador.getLocal());
		
		return view;
	}

}
