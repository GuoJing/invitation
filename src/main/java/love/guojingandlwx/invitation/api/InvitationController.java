package love.guojingandlwx.invitation.api;

import java.util.List;
import javax.annotation.Resource;
import love.guojingandlwx.invitation.api.jsonBody.NewInvitationJsonBody;
import love.guojingandlwx.invitation.dto.InvitationDto;
import love.guojingandlwx.invitation.exception.BadRequestException;
import love.guojingandlwx.invitation.service.InvitationService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by guojing on 2017/5/6.
 */
@RestController
@RequestMapping("/api")
public class InvitationController {

    @Resource
    private InvitationService invitationService;

    /**
     * Hello string.
     *
     * @return the string
     */
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public final String hello() {
        return "Hello World!";
    }

    /**
     * New invitations.
     *
     * @param jsonBody the json body
     * @throws BadRequestException the bad request exception
     */
    @RequestMapping(value = "/invitations", method = RequestMethod.POST)
    public final void newInvitations(@RequestBody final NewInvitationJsonBody jsonBody)
    throws BadRequestException {
        InvitationDto invitationDto = new InvitationDto.InvitationDtoBuilder()
            .withName(jsonBody.getName())
            .withNumber(jsonBody.getNumber())
            .withPhone(jsonBody.getPhone())
            .build();
        invitationService.create(invitationDto);
    }

    /**
     * Gets invitations.
     *
     * @return the invitations
     */
    @RequestMapping(value = "/invitations", method = RequestMethod.GET)
    public final List<InvitationDto> getInvitations() {
        return invitationService.findAll();
    }
}
