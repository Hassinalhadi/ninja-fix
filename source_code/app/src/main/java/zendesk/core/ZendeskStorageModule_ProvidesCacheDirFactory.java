package zendesk.core;

import Kd.a;
import android.content.Context;
import dagger.internal.b;
import java.io.File;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ZendeskStorageModule_ProvidesCacheDirFactory implements b {
    private final a contextProvider;

    public ZendeskStorageModule_ProvidesCacheDirFactory(a aVar) {
        this.contextProvider = aVar;
    }

    public static ZendeskStorageModule_ProvidesCacheDirFactory create(a aVar) {
        return new ZendeskStorageModule_ProvidesCacheDirFactory(aVar);
    }

    public static File providesCacheDir(Context context) {
        File providesCacheDir = ZendeskStorageModule.providesCacheDir(context);
        AbstractC2763s0.delta(providesCacheDir);
        return providesCacheDir;
    }

    @Override // Kd.a
    public File get() {
        return providesCacheDir((Context) this.contextProvider.get());
    }
}
