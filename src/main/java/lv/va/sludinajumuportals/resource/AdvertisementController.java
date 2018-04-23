package lv.va.sludinajumuportals.resource;

import lv.va.sludinajumuportals.domain.Response;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class AdvertisementController { 
        //This is normal html code that sets up a Get from /status
        public String getHtml = "<form method=\"get\" action=\"status\" class=\"inline\">" +

            "  <button type=\"submit\" class=\"link-button\">\n" +

            "    CheckStatus\n" +

            "  </button>\n" +

            "</form>";
    @GetMapping(value = "/") // The address /
    @ResponseBody
    public String testEndpoint() {
        return ("<h1>Hello darkness my old friend!<h1> <br>")+getHtml;
    }

    @GetMapping(value = "/hey") // The address /hey
    @ResponseBody
    public Response nextTestEndpoint() {
        return new Response("Helo dankness my oll fren!");
    }


}