package springtest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GotItController {

    @RequestMapping("/gotit")
    public String gotIt() {
        // name of the template
        return "test";
    }

}
