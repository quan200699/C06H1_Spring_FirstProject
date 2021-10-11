package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/product")
public class DemoController {
    @GetMapping("/hello/{name}")
    public String showHello(Model model, @PathVariable String name) {
        model.addAttribute("message", "Hello " + name + "!");
        return "index";
    }

    @GetMapping("/demo")
    public ModelAndView showHello2(@RequestParam("name") String search) {
        ModelAndView modelAndView = new ModelAndView("product/index");
        modelAndView.addObject("message", "Hello " + search);
        return modelAndView;
    }
}
