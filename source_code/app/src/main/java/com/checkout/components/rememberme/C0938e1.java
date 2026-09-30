package com.checkout.components.rememberme;

import android.content.Context;
import com.checkout.components.rememberme.di.StyleModule;
import com.checkout.components.ui.utils.CountryPickerResourceProvider;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.checkout.components.rememberme.e1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0938e1 implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public final StyleModule f5920a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.d f5921b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.d f5922c;

    public C0938e1(StyleModule styleModule, dagger.internal.b bVar, dagger.internal.b bVar2) {
        this.f5920a = styleModule;
        this.f5921b = bVar;
        this.f5922c = bVar2;
    }

    @Override // Kd.a
    public final Object get() {
        StyleModule styleModule = this.f5920a;
        Context context = (Context) this.f5921b.get();
        Map map = (Map) this.f5922c.get();
        styleModule.getClass();
        Intrinsics.echo(context, "context");
        return new CountryPickerResourceProvider(context, map);
    }
}
