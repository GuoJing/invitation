package love.guojingandlwx.invitation.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Resource;
import love.guojingandlwx.invitation.dao.mysql.InvitationMapper;
import love.guojingandlwx.invitation.domain.InvitationDomain;
import love.guojingandlwx.invitation.dto.InvitationDto;
import love.guojingandlwx.invitation.exception.BadRequestException;
import love.guojingandlwx.invitation.service.InvitationService;
import org.springframework.stereotype.Service;

/**
 * Created by guojing on 2017/5/6.
 */
@Service
public class InvitationServiceImpl implements InvitationService {

    @Resource
    private InvitationMapper invitationMapper;

    @Override
    public List<InvitationDto> findAll() {
        List<InvitationDomain> invitationDomains = invitationMapper.findAll();
        return invitationDomains.stream().map(
            this::convertDomainToDto
        ).collect(Collectors.toList());
    }

    @Override
    public Long create(final InvitationDto invitationDto) throws BadRequestException {
        String name = invitationDto.getName();
        String phone = invitationDto.getPhone();

        int number = invitationDto.getNumber();

        if (name == null || name.isEmpty()) {
            throw new BadRequestException("name is empty");
        }

        if (phone == null || phone.isEmpty()) {
            throw new BadRequestException("phone is empty");
        }

        if (number == 0) {
            throw new BadRequestException("number should not be zero, ok?!");
        }

        InvitationDomain invitationDomain = convertDtoToDomain(invitationDto);
        return invitationMapper.create(invitationDomain);
    }

    /**
     * convert dto to domain object when create
     * @param invitationDto invitation dto
     * @return invitation domain
     */
    private InvitationDomain convertDtoToDomain(final InvitationDto invitationDto) {
        return new InvitationDomain.InvitationDomainBuilder()
            .withName(invitationDto.getName())
            .withNumber(invitationDto.getNumber())
            .withPhone(invitationDto.getPhone())
            .build();
    }

    /**
     * convert domain to dto object when search
     * @param invitationDomain invitation domain
     * @return invitation dto
     */
    private InvitationDto convertDomainToDto(final InvitationDomain invitationDomain) {
        return new InvitationDto.InvitationDtoBuilder()
            .withName(invitationDomain.getName())
            .withNumber(invitationDomain.getNumber())
            .withPhone(invitationDomain.getPhone())
            .build();
    }
}
