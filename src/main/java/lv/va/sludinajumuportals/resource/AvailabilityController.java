package lv.va.sludinajumuportals.resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class AvailabilityController {
    
    public String status = "503 Service Unavailable"; // Default status
    // Html code for post form
    public String htmlPost = "<form method=\"post\" action=\"\" class=\"inline\">"
            + "  <button type=\"submit\"  class=\"link-button\">\n"
            + "    POST\n"
            + "  </button>\n"
            + "</form>";
    //Html code for get form
    public String htmlGet = "<form method=\"get\" action=\"\" class=\"inline\">"
            + "  <button type=\"submit\"  class=\"link-button\">\n"
            + "    GET\n"
            + "  </button>\n"
            + "</form>";

    @GetMapping(value = "/{id}") // Will work with any address
    @ResponseBody
    public String getStatus(@PathVariable String id) {

        return status + "</br>  Address=" + id + htmlPost + htmlGet;
    }

    @PostMapping(value = "/{id}") // Will work only on html Post method
    @ResponseBody
    public String setStatus(@PathVariable String id) {
        //Changes the status from one to another
        if ("503 Service Unavailable".equals(status)) {
            status = "200 OK";
        } else {
            status = "503 Service Unavailable";
        }

        return status + "</br>  Address=" + id + htmlPost + htmlGet;
    }
}
