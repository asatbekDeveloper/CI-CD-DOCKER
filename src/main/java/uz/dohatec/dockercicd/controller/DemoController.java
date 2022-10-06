package uz.dohatec.dockercicd.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ci_cd")
public class DemoController {

    @GetMapping
    public String ciCd(){
        return "CI CD DOCKER";
    }
}
