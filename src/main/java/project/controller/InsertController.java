package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class InsertController {
    @Autowired
    //public InsertController(InsertService insertService) {this.insertService = insertService;}

    @RequestMapping(value = "/InsertRestaurant", method = RequestMethod.GET)

    public String InsertRestaurant() {
        return "InsertRestaurant";
    }

    //Bæta við veitingastað
    //public String insertRestaurant(....)
}
