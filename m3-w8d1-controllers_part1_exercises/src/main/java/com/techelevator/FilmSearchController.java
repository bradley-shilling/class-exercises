package com.techelevator;

import com.techelevator.dao.FilmDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * FilmSearchController
 */
@Controller
public class FilmSearchController {

    @Autowired
    FilmDao filmDao;
    
    @RequestMapping(path="/films", method=RequestMethod.GET)
    public String showFilmSearchForm() {
        return "filmList";
    }
    
    @RequestMapping(path="/filmSearch", method=RequestMethod.GET)
    public String searchAndSortCustomers(@RequestParam(required=false) int minLength, @RequestParam(required=false) int maxLength, @RequestParam String genre, ModelMap modelHolder) {
    	
    	modelHolder.put("films", filmDao.getFilmsBetween(genre, minLength, maxLength));
        return "filmList";
    }
    
    
}