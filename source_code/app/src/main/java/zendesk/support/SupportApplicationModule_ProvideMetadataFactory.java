package zendesk.support;

import Kd.a;
import android.content.Context;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class SupportApplicationModule_ProvideMetadataFactory implements b {
    private final a contextProvider;
    private final SupportApplicationModule module;

    public SupportApplicationModule_ProvideMetadataFactory(SupportApplicationModule supportApplicationModule, a aVar) {
        this.module = supportApplicationModule;
        this.contextProvider = aVar;
    }

    public static SupportApplicationModule_ProvideMetadataFactory create(SupportApplicationModule supportApplicationModule, a aVar) {
        return new SupportApplicationModule_ProvideMetadataFactory(supportApplicationModule, aVar);
    }

    public static SupportSdkMetadata provideMetadata(SupportApplicationModule supportApplicationModule, Context context) {
        SupportSdkMetadata provideMetadata = supportApplicationModule.provideMetadata(context);
        AbstractC2763s0.delta(provideMetadata);
        return provideMetadata;
    }

    @Override // Kd.a
    public SupportSdkMetadata get() {
        return provideMetadata(this.module, (Context) this.contextProvider.get());
    }
}
