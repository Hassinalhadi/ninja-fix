package com.checkout.components.rememberme;

import android.content.Context;
import com.checkout.components.rememberme.di.ResourceProviderImpl;
import com.checkout.components.rememberme.di.StyleModule;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.checkout.components.rememberme.l1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0959l1 implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public final StyleModule f5988a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.d f5989b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.d f5990c;

    public C0959l1(StyleModule styleModule, dagger.internal.b bVar, dagger.internal.b bVar2) {
        this.f5988a = styleModule;
        this.f5989b = bVar;
        this.f5990c = bVar2;
    }

    @Override // Kd.a
    public final Object get() {
        StyleModule styleModule = this.f5988a;
        Context context = (Context) this.f5989b.get();
        Map map = (Map) this.f5990c.get();
        styleModule.getClass();
        Intrinsics.echo(context, "context");
        return new ResourceProviderImpl(context, map);
    }
}
