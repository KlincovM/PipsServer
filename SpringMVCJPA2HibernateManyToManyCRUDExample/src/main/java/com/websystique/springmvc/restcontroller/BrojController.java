package com.websystique.springmvc.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.websystique.springmvc.model.Broj;
import com.websystique.springmvc.service.BrojService;

@RestController
@RequestMapping("/brojController")
public class BrojController {

	
	@Autowired
	BrojService brojService;
	
	@RequestMapping("/uzmiSledeciBroj")
	public @ResponseBody String uzmiSledeciBroj(@RequestParam("korisnikID")int korisnikID,
												@RequestParam("aparatID")int aparatID,
												@RequestParam("salterID")int salterID)
	{
		Broj broj = brojService.uzmiSlobodanBroj(korisnikID, aparatID, salterID);
		Gson brojGson = new Gson();
		return brojGson.toJson(broj);
	}
}
