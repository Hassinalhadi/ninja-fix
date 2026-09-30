package zendesk.core;

import vg.d;
import yg.a;
import yg.b;
import yg.o;
import yg.s;

/* loaded from: classes.dex */
interface PushRegistrationService {
    @o("/api/mobile/push_notification_devices.json")
    d<PushRegistrationResponseWrapper> registerDevice(@a PushRegistrationRequestWrapper pushRegistrationRequestWrapper);

    @b("/api/mobile/push_notification_devices/{id}.json")
    d<Void> unregisterDevice(@s("id") String str);
}
