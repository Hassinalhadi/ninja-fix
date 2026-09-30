package zendesk.classic.messaging.ui;

import dagger.internal.b;

/* loaded from: classes.dex */
public final class AvatarStateFactory_Factory implements b {

    /* loaded from: classes.dex */
    public static final class InstanceHolder {
        private static final AvatarStateFactory_Factory INSTANCE = new AvatarStateFactory_Factory();

        private InstanceHolder() {
        }
    }

    public static AvatarStateFactory_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static AvatarStateFactory newInstance() {
        return new AvatarStateFactory();
    }

    @Override // Kd.a
    public AvatarStateFactory get() {
        return newInstance();
    }
}
