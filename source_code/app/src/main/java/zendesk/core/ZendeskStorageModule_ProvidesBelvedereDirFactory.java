package zendesk.core;

import Kd.a;
import android.content.Context;
import dagger.internal.b;
import java.io.File;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ZendeskStorageModule_ProvidesBelvedereDirFactory implements b {
    private final a contextProvider;

    public ZendeskStorageModule_ProvidesBelvedereDirFactory(a aVar) {
        this.contextProvider = aVar;
    }

    public static ZendeskStorageModule_ProvidesBelvedereDirFactory create(a aVar) {
        return new ZendeskStorageModule_ProvidesBelvedereDirFactory(aVar);
    }

    public static File providesBelvedereDir(Context context) {
        File providesBelvedereDir = ZendeskStorageModule.providesBelvedereDir(context);
        AbstractC2763s0.delta(providesBelvedereDir);
        return providesBelvedereDir;
    }

    @Override // Kd.a
    public File get() {
        return providesBelvedereDir((Context) this.contextProvider.get());
    }
}
