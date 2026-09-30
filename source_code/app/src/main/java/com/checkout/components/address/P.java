package com.checkout.components.address;

import android.content.Context;
import com.checkout.address.di.ResourceModule;
import com.checkout.address.di.ResourceProviderImpl;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class P implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.d f3872a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.d f3873b;

    public P(ResourceModule resourceModule, dagger.internal.b bVar, dagger.internal.b bVar2) {
        this.f3872a = bVar;
        this.f3873b = bVar2;
    }

    @Override // Kd.a
    public final Object get() {
        Context context = (Context) this.f3872a.get();
        Map map = (Map) this.f3873b.get();
        Intrinsics.echo(context, "context");
        return new ResourceProviderImpl(context, map);
    }
}
