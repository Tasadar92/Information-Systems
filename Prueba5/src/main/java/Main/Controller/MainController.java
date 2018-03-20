/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.Controller;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author danie
 */
@Controller
public class MainController {
    @RequestMapping("/")
    public String inicio(Map<String, Object> model) {
        return "index";
    }
}
