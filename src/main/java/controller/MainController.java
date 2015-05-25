package controller;

import model.Reply;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by prasad on 5/25/15.
 */
@Controller
@RequestMapping("reply")
public class MainController {

    @RequestMapping(value = "json-reply", method = RequestMethod.GET)
    public @ResponseBody Reply getDummyTextData(){
        Reply reply = new Reply(1,"Java");
        System.out.println(reply.getId()+"-"+reply.getName());
        return reply;
    }
}
