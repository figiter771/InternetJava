package lv.va.sludinajumuportals.resource;

import lv.va.sludinajumuportals.domain.Response;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class AdvertisementController { 
      
    @GetMapping(value = "/") // The address /
    @ResponseBody
    public String testEndpoint() {
        return ("<h1>Hello darkness my old friend!<h1> <br>");
    }

    @GetMapping(value = "/hey") // The address /hey
    @ResponseBody
    public Response nextTestEndpoint() {
        return new Response("Helo dankness my oll fren!");
    }


}