package com.checkout.components.card.di.module;

import android.content.Context;
import com.checkout.components.card.utils.ResourceProviderImpl;
import com.checkout.components.interfaces.localisation.ComponentTranslationKey;
import com.checkout.components.interfaces.ui.ResourceProvider;
import dagger.internal.b;
import dagger.internal.d;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ValidationModule_ProvideResourceProviderFactory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final ValidationModule f4184a;

    /* renamed from: b, reason: collision with root package name */
    private final d f4185b;

    /* renamed from: c, reason: collision with root package name */
    private final d f4186c;

    public ValidationModule_ProvideResourceProviderFactory(ValidationModule validationModule, d dVar, d dVar2) {
        this.f4184a = validationModule;
        this.f4185b = dVar;
        this.f4186c = dVar2;
    }

    public static ValidationModule_ProvideResourceProviderFactory create(ValidationModule validationModule, d dVar, d dVar2) {
        return new ValidationModule_ProvideResourceProviderFactory(validationModule, dVar, dVar2);
    }

    public static ResourceProvider provideResourceProvider(ValidationModule validationModule, Context context, Map<ComponentTranslationKey, String> map) {
        validationModule.getClass();
        Intrinsics.echo(context, "context");
        return new ResourceProviderImpl(context, map);
    }

    @Override // Kd.a
    public final ResourceProvider get() {
        return provideResourceProvider(this.f4184a, (Context) this.f4185b.get(), (Map) this.f4186c.get());
    }
}
