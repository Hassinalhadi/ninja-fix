package zendesk.core;

import P8.c;

/* loaded from: classes.dex */
class PushRegistrationRequestWrapper {

    @c("push_notification_device")
    private PushRegistrationRequest pushRegistrationRequest;

    public PushRegistrationRequestWrapper(PushRegistrationRequest pushRegistrationRequest) {
        this.pushRegistrationRequest = pushRegistrationRequest;
    }

    public PushRegistrationRequest getPushRegistrationRequest() {
        return this.pushRegistrationRequest;
    }
}
