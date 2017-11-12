package com.websystique.springmvc.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.websystique.springmvc.model.User;
import com.websystique.springmvc.service.AparatService;

@RestController
@RequestMapping("/aparatController")
public class AparatController {

	@Autowired
	AparatService aparatService;
	
	
	@RequestMapping("/proba")
    public String greeting() {
        return "Proba";
    }
}
