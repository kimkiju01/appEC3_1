package com.example.appec3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/goodbye")
public class IndexController {

    @GetMapping("/bye")
    public String bye(Model model){
        model.addAttribute("aa","hye");
        return "bye";
    }

    @GetMapping("/night")
    @ResponseBody
    public String night(){
       return "aaa";
    }

}
