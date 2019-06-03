package com.fortinosandoval.springbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * IndexController
 */
@Controller
@RequestMapping("/api")
public class IndexController {

  @GetMapping({ "/index", "/", "/home" })
  public String index(Model model) {
    model.addAttribute("attr", "Hola spring framework desde thymeleaf!!");
    return "index";
  }

}