package love.guojingandlwx.invitation.api.jsonBody;

/**
 * Created by guojing on 2017/5/6.
 */
public class NewInvitationJsonBody {
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
     * The type New invitation json body builder.
     */
    public static final class NewInvitationJsonBodyBuilder {

        private String name;
        private String phone;
        private int number;

        /**
         * Instantiates a new New invitation json body builder.
         */
        public NewInvitationJsonBodyBuilder() {
        }

        /**
         * A new invitation json body new invitation json body builder.
         *
         * @return the new invitation json body builder
         */
        public static NewInvitationJsonBodyBuilder aNewInvitationJsonBody() {
            return new NewInvitationJsonBodyBuilder();
        }

        /**
         * With name new invitation json body builder.
         *
         * @param name the name
         * @return the new invitation json body builder
         */
        public NewInvitationJsonBodyBuilder withName(final String name) {
            this.name = name;
            return this;
        }

        /**
         * With phone new invitation json body builder.
         *
         * @param phone the phone
         * @return the new invitation json body builder
         */
        public NewInvitationJsonBodyBuilder withPhone(final String phone) {
            this.phone = phone;
            return this;
        }

        /**
         * With number new invitation json body builder.
         *
         * @param number the number
         * @return the new invitation json body builder
         */
        public NewInvitationJsonBodyBuilder withNumber(final int number) {
            this.number = number;
            return this;
        }

        /**
         * Build new invitation json body.
         *
         * @return the new invitation json body
         */
        public NewInvitationJsonBody build() {
            NewInvitationJsonBody newInvitationJsonBody = new NewInvitationJsonBody();
            newInvitationJsonBody.setName(name);
            newInvitationJsonBody.setPhone(phone);
            newInvitationJsonBody.setNumber(number);
            return newInvitationJsonBody;
        }
    }
}
