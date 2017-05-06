package love.guojingandlwx.invitation.service;

import java.util.List;
import love.guojingandlwx.invitation.dto.InvitationDto;
import love.guojingandlwx.invitation.exception.BadRequestException;
import org.springframework.stereotype.Service;

/**
 * Created by guojing on 2017/5/6.
 */
@Service
public interface InvitationService {

    /**
     * Find all list.
     *
     * @return the list
     */
    List<InvitationDto> findAll();

    /**
     * Create long.
     *
     * @param invitationDto the invitation dto
     * @return the long
     * @throws BadRequestException the bad request exception
     */
    Long create(InvitationDto invitationDto) throws BadRequestException;
}
