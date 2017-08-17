package br.com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.spring.dao.ProdutoDAO;
import br.com.spring.model.ETipoPreco;
import br.com.spring.model.Produto;

@Controller
@RequestMapping("/produtos")
public class ProdutoController {

	@Autowired
	ProdutoDAO produtoDao;
	
	@RequestMapping("/form")
	public ModelAndView form() {
		ModelAndView modelAndView =new ModelAndView("produtos/form");
		modelAndView.addObject("tipos", ETipoPreco.values());
		return modelAndView;
	}
	
	
	@RequestMapping(method=RequestMethod.POST)
	public String gravar(Produto produto){
		produtoDao.gravar(produto);
	    return "produtos/ok";
	}
	
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView listar(){
	    List<Produto> produtos = produtoDao.listar();
	    ModelAndView modelAndView = new ModelAndView("/produtos/lista");
	    modelAndView.addObject("produtos", produtos);
	    return modelAndView;
	}

}
