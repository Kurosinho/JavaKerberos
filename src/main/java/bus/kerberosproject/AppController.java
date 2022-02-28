package bus.kerberosproject;


import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller

public class AppController implements ErrorController {


    /*
     * Home page
     */
    @RequestMapping("/")
    public String viewHomePage() {
        return "home";
    }

    @RequestMapping("/login")
    public String viewLoginPage() {
        return "login";
    }


    @RequestMapping("/homeUser")
    public String viewMyHomePage() {return "homeUser";}


}
