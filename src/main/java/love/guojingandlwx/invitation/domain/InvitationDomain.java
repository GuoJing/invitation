package love.guojingandlwx.invitation.domain;

/**
 * Created by guojing on 2017/5/6.
 */
public class InvitationDomain {
    private Long id;
    private String name;
    private String phone;
    private int number;

    /**
     * Gets id.
     *
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(final Long id) {
        this.id = id;
    }

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
     * The type Invitation domain builder.
     */
    public static final class InvitationDomainBuilder {

        private Long id;
        private String name;
        private String phone;
        private int number;

        /**
         * Instantiates a new Invitation domain builder.
         */
        public InvitationDomainBuilder() {
        }

        /**
         * An invitation domain invitation domain builder.
         *
         * @return the invitation domain builder
         */
        public static InvitationDomainBuilder anInvitationDomain() {
            return new InvitationDomainBuilder();
        }

        /**
         * With id invitation domain builder.
         *
         * @param id the id
         * @return the invitation domain builder
         */
        public InvitationDomainBuilder withId(final Long id) {
            this.id = id;
            return this;
        }

        /**
         * With name invitation domain builder.
         *
         * @param name the name
         * @return the invitation domain builder
         */
        public InvitationDomainBuilder withName(final String name) {
            this.name = name;
            return this;
        }

        /**
         * With phone invitation domain builder.
         *
         * @param phone the phone
         * @return the invitation domain builder
         */
        public InvitationDomainBuilder withPhone(final String phone) {
            this.phone = phone;
            return this;
        }

        /**
         * With number invitation domain builder.
         *
         * @param number the number
         * @return the invitation domain builder
         */
        public InvitationDomainBuilder withNumber(final int number) {
            this.number = number;
            return this;
        }

        /**
         * Build invitation domain.
         *
         * @return the invitation domain
         */
        public InvitationDomain build() {
            InvitationDomain invitationDomain = new InvitationDomain();
            invitationDomain.setId(id);
            invitationDomain.setName(name);
            invitationDomain.setPhone(phone);
            invitationDomain.setNumber(number);
            return invitationDomain;
        }
    }
}
