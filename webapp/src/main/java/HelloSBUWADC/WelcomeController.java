package HelloSBUWADC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Armando on 10/5/2016.
 */
@Controller
public class WelcomeController {
    @RequestMapping("/Welcome")
    public String Welcome( String name, Model model) {
        model.addAttribute("name", name);
        return "Welcome";

    }
}