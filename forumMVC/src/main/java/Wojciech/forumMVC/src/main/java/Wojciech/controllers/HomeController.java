package Wojciech.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Użytkownik on 27.01.2018.
 */
@Controller
public class HomeController {

        @RequestMapping("/")
        public String index() {

            return "index";
        }
    }

