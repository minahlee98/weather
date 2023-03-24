package springTest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class main {
    @RequestMapping(value="/")
    public String index(Model model){
       // model.addAttribute("test", "1234");
      //  System.out.println(model);
        return "login";
    }

    @RequestMapping(value="/json", produces = "application/json")
    @ResponseBody
    public Object json(){
        Map<String, String> m = new HashMap<>();
        m.put("mappers/test", "1234");
        return m;
    }
}