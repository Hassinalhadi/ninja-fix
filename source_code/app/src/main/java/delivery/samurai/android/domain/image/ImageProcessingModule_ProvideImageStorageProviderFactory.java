package delivery.samurai.android.domain.image;

import D9.a;
import E9.c;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes2.dex */
public final class ImageProcessingModule_ProvideImageStorageProviderFactory implements b {
    @Override // Kd.a
    public final Object get() {
        c provideImageStorageProvider = a.alpha.provideImageStorageProvider();
        AbstractC2763s0.delta(provideImageStorageProvider);
        return provideImageStorageProvider;
    }
}
