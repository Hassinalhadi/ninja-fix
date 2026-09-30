package zendesk.core;

/* loaded from: classes.dex */
interface Storage {
    void clear();

    SessionStorage getSessionStorage();

    boolean hasSdkConfigChanged(ApplicationConfiguration applicationConfiguration);

    void storeSdkHash(ApplicationConfiguration applicationConfiguration);
}
