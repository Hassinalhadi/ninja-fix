package delivery.samurai.android.domain.image;

import E9.a;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes2.dex */
public final class ImageProcessingModule_ProvideImageCompressorFactory implements b {
    @Override // Kd.a
    public final Object get() {
        a provideImageCompressor = D9.a.alpha.provideImageCompressor();
        AbstractC2763s0.delta(provideImageCompressor);
        return provideImageCompressor;
    }
}
