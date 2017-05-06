package love.guojingandlwx.invitation.dto;

/**
 * Created by guojing on 2017/5/6.
 */
public class InvitationDto {
    private String name;
    private String phone;
    private int number;

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * Gets phone.
     *
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets phone.
     *
     * @param phone the phone
     */
    public void setPhone(final String phone) {
        this.phone = phone;
    }

    /**
     * Gets number.
     *
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * Sets number.
     *
     * @param number the number
     */
    public void setNumber(final int number) {
        this.number = number;
    }


    /**
     * The type Invitation dto builder.
     */
    public static final class InvitationDtoBuilder {

        private String name;
        private String phone;
        private int number;

        /**
         * Instantiates a new Invitation dto builder.
         */
        public InvitationDtoBuilder() {
        }

        /**
         * An invitation dto invitation dto builder.
         *
         * @return the invitation dto builder
         */
        public static InvitationDtoBuilder anInvitationDto() {
            return new InvitationDtoBuilder();
        }

        /**
         * With name invitation dto builder.
         *
         * @param name the name
         * @return the invitation dto builder
         */
        public InvitationDtoBuilder withName(final String name) {
            this.name = name;
            return this;
        }

        /**
         * With phone invitation dto builder.
         *
         * @param phone the phone
         * @return the invitation dto builder
         */
        public InvitationDtoBuilder withPhone(final String phone) {
            this.phone = phone;
            return this;
        }

        /**
         * With number invitation dto builder.
         *
         * @param number the number
         * @return the invitation dto builder
         */
        public InvitationDtoBuilder withNumber(final int number) {
            this.number = number;
            return this;
        }

        /**
         * Build invitation dto.
         *
         * @return the invitation dto
         */
        public InvitationDto build() {
            InvitationDto invitationDto = new InvitationDto();
            invitationDto.setName(name);
            invitationDto.setPhone(phone);
            invitationDto.setNumber(number);
            return invitationDto;
        }
    }
}
