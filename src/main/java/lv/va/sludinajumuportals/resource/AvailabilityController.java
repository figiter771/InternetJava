package lv.va.sludinajumuportals.resource;

import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/status")
public class AvailabilityController {
    public static boolean available;
    @GetMapping
    @ResponseBody
    public void getStatus(HttpServletResponse httpServletResponse) {
        httpServletResponse.setStatus(available ? httpServletResponse.SC_OK : httpServletResponse.SC_SERVICE_UNAVAILABLE);
    }
    @PostMapping("/{value}")
      @ResponseBody
    public void setStatus(@PathVariable("value") boolean value) {
        available= value;
    }
    
    
    
}
