package com.checkout.components.address;

import android.content.Context;
import com.checkout.address.di.ResourceModule;
import com.checkout.components.ui.utils.CountryPickerResourceProvider;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class O implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.d f3870a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.d f3871b;

    public O(ResourceModule resourceModule, dagger.internal.b bVar, dagger.internal.b bVar2) {
        this.f3870a = bVar;
        this.f3871b = bVar2;
    }

    @Override // Kd.a
    public final Object get() {
        Context context = (Context) this.f3870a.get();
        Map map = (Map) this.f3871b.get();
        Intrinsics.echo(context, "context");
        return new CountryPickerResourceProvider(context, map);
    }
}
