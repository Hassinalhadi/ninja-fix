package zendesk.core;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public interface PushDeviceIdStorage {
    PushRegistrationRequest getPushRegistrationRequest();

    String getRegisteredDeviceId();

    boolean hasRegisteredDeviceId();

    void removePushRegistrationRequest();

    void removeRegisteredDeviceId();

    void storePushRegistrationRequest(PushRegistrationRequest pushRegistrationRequest);

    void storeRegisteredDeviceId(String str);
}
