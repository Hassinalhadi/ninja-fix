package com.checkout.components.rememberme;

import com.checkout.components.interfaces.Environment;
import com.checkout.components.interfaces.data.PrimitiveStateFlowRepository;
import com.checkout.components.interfaces.localisation.Locale;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.checkout.components.kmp.rememberme.logging.RememberMeLogger;
import com.checkout.components.kmp.rememberme.shared.CheckoutKMPRememberMe;
import com.checkout.components.rememberme.di.RememberMeModule;
import com.checkout.components.rememberme.utils.KMPRememberMeClickHandler;
import java.util.Map;
import s6.AbstractC2763s0;

/* renamed from: com.checkout.components.rememberme.k0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0955k0 implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public final RememberMeModule f5973a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.d f5974b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.d f5975c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.d f5976d;
    public final dagger.internal.d e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.d f5977f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.d f5978g;

    /* renamed from: h, reason: collision with root package name */
    public final dagger.internal.d f5979h;

    /* renamed from: i, reason: collision with root package name */
    public final dagger.internal.d f5980i;

    public C0955k0(RememberMeModule rememberMeModule, dagger.internal.b bVar, dagger.internal.b bVar2, G g2, dagger.internal.b bVar3, dagger.internal.b bVar4, dagger.internal.b bVar5, dagger.internal.d dVar, dagger.internal.d dVar2) {
        this.f5973a = rememberMeModule;
        this.f5974b = bVar;
        this.f5975c = bVar2;
        this.f5976d = g2;
        this.e = bVar3;
        this.f5977f = bVar4;
        this.f5978g = bVar5;
        this.f5979h = dVar;
        this.f5980i = dVar2;
    }

    @Override // Kd.a
    public final Object get() {
        CheckoutKMPRememberMe kmpRememberMe = this.f5973a.kmpRememberMe((Map) this.f5974b.get(), (Locale) this.f5975c.get(), (KMPRememberMeClickHandler) this.f5976d.get(), (Environment) this.e.get(), (DesignTokens) this.f5977f.get(), (String) this.f5978g.get(), (PrimitiveStateFlowRepository) this.f5979h.get(), (RememberMeLogger) this.f5980i.get());
        AbstractC2763s0.delta(kmpRememberMe);
        return kmpRememberMe;
    }
}
