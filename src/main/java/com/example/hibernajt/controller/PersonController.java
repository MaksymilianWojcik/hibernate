package com.example.hibernajt.controller;

import com.example.hibernajt.dao.PersonDao;
import com.example.hibernajt.model.Person;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by MAKS on 03.05.2017.
 */

@Controller
public class PersonController {


    @Autowired
    PersonDao personDao;

    @GetMapping("/person/add")
    public String add(ModelMap modelMap){
        modelMap.addAttribute("person", new Person());
        return "person/add";
    }

    @PostMapping("person/create") //bo trzeba przejsc w htmlu do person creata
    public String create(@ModelAttribute Person person, ModelMap modelMap){
        //tutaj powinnismy dodac do bazy danych
        personDao.safe(person);

        return "redirect:/person/success";
    }


    @GetMapping("person/success")
    public String success(){
        return "person/success";
    }
}
