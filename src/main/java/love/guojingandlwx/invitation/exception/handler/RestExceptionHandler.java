package love.guojingandlwx.invitation.exception.handler;

import java.util.HashMap;
import java.util.Map;
import love.guojingandlwx.invitation.exception.BadRequestException;
import net.minidev.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Created by guojing on 2017/5/6.
 */
@ControllerAdvice(basePackages = {"love.guojingandlwx.invitation.api"})
public class RestExceptionHandler {

    /**
     * Handle bad result http entity.
     *
     * @param e the e
     * @return the http entity
     */
    @ExceptionHandler(BadRequestException.class)
    public HttpEntity<?> handleBadResult(final BadRequestException e) {
        Map<String, String> map = new HashMap<>();
        map.put("status", "error");
        map.put("message", e.getMessage());
        JSONObject response = new JSONObject(map);
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }
}
