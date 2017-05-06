package love.guojingandlwx.invitation.dao.mysql.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import love.guojingandlwx.invitation.dao.mysql.InvitationMapper;
import love.guojingandlwx.invitation.domain.InvitationDomain;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

/**
 * Created by guojing on 2017/5/6.
 */
@Repository
public class InvitationDaoImpl implements InvitationMapper {

    @Resource
    private SqlSession sqlSession;

    @Override
    public List<InvitationDomain> findAll() {
        return sqlSession.selectList("InvitationMapper.findAll");
    }

    @Override
    public Long create(final InvitationDomain invitationDomain) {
        Map<String, Object> params = new HashMap<>();
        params.put("name", invitationDomain.getName());
        params.put("phone", invitationDomain.getPhone());
        params.put("number", invitationDomain.getNumber());
        sqlSession.insert("InvitationMapper.create", params);
        Long lastRowId = Long.parseLong(params.get("id").toString());
        return lastRowId;
    }
}
