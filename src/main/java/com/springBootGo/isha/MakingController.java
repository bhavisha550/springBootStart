package com.springBootGo.isha;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody   //returning string as it is
public class MakingController {

    @RequestMapping("/test")
    public String first()
    {
        return "just checking....";
    }

}

