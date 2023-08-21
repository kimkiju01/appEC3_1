package com.example.appec3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hi")
public class SampleController {

    @GetMapping("/kiju")
    public String kiju(){

        return "hi";
    }
}
