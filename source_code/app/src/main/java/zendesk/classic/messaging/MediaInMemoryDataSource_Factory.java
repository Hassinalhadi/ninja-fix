package zendesk.classic.messaging;

import dagger.internal.b;

/* loaded from: classes.dex */
public final class MediaInMemoryDataSource_Factory implements b {

    /* loaded from: classes.dex */
    public static final class InstanceHolder {
        private static final MediaInMemoryDataSource_Factory INSTANCE = new MediaInMemoryDataSource_Factory();

        private InstanceHolder() {
        }
    }

    public static MediaInMemoryDataSource_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static MediaInMemoryDataSource newInstance() {
        return new MediaInMemoryDataSource();
    }

    @Override // Kd.a
    public MediaInMemoryDataSource get() {
        return newInstance();
    }
}
