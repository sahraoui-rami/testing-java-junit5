package guru.springframework.sfgpetclinic.controllers;

public class IndexController {

    public String index(){

        return "index";
    }

    public void oopsHandler(){
        throw new ValueNotFoundException();
    }
}
