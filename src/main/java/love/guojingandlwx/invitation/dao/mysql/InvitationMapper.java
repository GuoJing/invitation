package love.guojingandlwx.invitation.dao.mysql;

import java.util.List;
import love.guojingandlwx.invitation.domain.InvitationDomain;
import org.springframework.stereotype.Repository;

/**
 * Created by guojing on 2017/5/6.
 */
@Repository
public interface InvitationMapper {

    /**
     * Find all list.
     *
     * @return the list
     */
    List<InvitationDomain> findAll();

    /**
     * Create long.
     *
     * @param invitationDomain the invitation domain
     * @return the long
     */
    Long create(InvitationDomain invitationDomain);
}
