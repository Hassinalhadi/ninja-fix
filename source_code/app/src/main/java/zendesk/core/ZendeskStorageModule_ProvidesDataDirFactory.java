package zendesk.core;

import Kd.a;
import android.content.Context;
import dagger.internal.b;
import java.io.File;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ZendeskStorageModule_ProvidesDataDirFactory implements b {
    private final a contextProvider;

    public ZendeskStorageModule_ProvidesDataDirFactory(a aVar) {
        this.contextProvider = aVar;
    }

    public static ZendeskStorageModule_ProvidesDataDirFactory create(a aVar) {
        return new ZendeskStorageModule_ProvidesDataDirFactory(aVar);
    }

    public static File providesDataDir(Context context) {
        File providesDataDir = ZendeskStorageModule.providesDataDir(context);
        AbstractC2763s0.delta(providesDataDir);
        return providesDataDir;
    }

    @Override // Kd.a
    public File get() {
        return providesDataDir((Context) this.contextProvider.get());
    }
}
