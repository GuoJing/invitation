package love.guojingandlwx.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by guojing on 2017/5/6.
 */
@RestController
@RequestMapping("/api")
public class InvitationController {

    /**
     * Hello string.
     *
     * @return the string
     */
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public final String hello() {
        return "Hello World!";
    }
}
