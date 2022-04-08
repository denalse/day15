package nus.iss.paf.userlogin.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/protected/{view}")
public class ProtectedController {
    
    @PostMapping()
    public ModelAndView post(@PathVariable String view) {
    
    ModelAndView mvc = new ModelAndView();
        mvc.setViewName(view);
        mvc.addObject("username", "fred");
        mvc.setStatus(HttpStatus.OK);

    return mvc;
}   
    }

    
