package delivery.samurai.android.domain.image;

import D9.a;
import E9.d;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes2.dex */
public final class ImageProcessingModule_ProvideImageValidatorFactory implements b {
    @Override // Kd.a
    public final Object get() {
        d provideImageValidator = a.alpha.provideImageValidator();
        AbstractC2763s0.delta(provideImageValidator);
        return provideImageValidator;
    }
}
