package guru.springframework.spring5jokesappv2.controllers;

import guru.springframework.spring5jokesappv2.services.JokesService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

  private final JokesService jokesService;

  public JokesController(@Qualifier("joky") JokesService jokesService) {
    this.jokesService = jokesService;
  }

  @RequestMapping("/jokes")
  public String getJokes(Model model) {
    model.addAttribute("joke", this.jokesService.getQuote());
    return "jokes/detail";
  }
}
