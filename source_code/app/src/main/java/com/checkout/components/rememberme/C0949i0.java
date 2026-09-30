package com.checkout.components.rememberme;

import android.content.Context;
import com.checkout.components.rememberme.di.RTLModule;
import com.checkout.components.ui.utils.extensions.Utils;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.checkout.components.rememberme.i0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0949i0 implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public final RTLModule f5953a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.d f5954b;

    public C0949i0(RTLModule rTLModule, dagger.internal.b bVar) {
        this.f5953a = rTLModule;
        this.f5954b = bVar;
    }

    @Override // Kd.a
    public final Object get() {
        RTLModule rTLModule = this.f5953a;
        Context context = (Context) this.f5954b.get();
        rTLModule.getClass();
        Intrinsics.echo(context, "context");
        return Boolean.valueOf(Utils.INSTANCE.isRtl(context));
    }
}
