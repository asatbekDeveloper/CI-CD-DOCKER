package uz.dohatec.dockercicd.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DemoController {

    @GetMapping
    public String ciCd(){
        return "CI CD DOCKER v1";
    }

    @GetMapping("/ci_cd/v2")
    public String ciCdV2(){
        return "CI CD DOCKER V2";
    }

    @GetMapping("/ci_cd/v3")
    public String ciCdV3(){
        return "CI CD DOCKER V3";
    }

    @GetMapping("/ci_cd/v4")
    public String ciCdV4(){
        return "CI CD DOCKER V4";
    }
}
