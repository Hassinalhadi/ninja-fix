package com.incognia.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class Bbw extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Av7 f8420b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bbw(Av7 av7) {
        super(0);
        this.f8420b = av7;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        try {
            return this.f8420b.f8388W.getDefaultDisplay();
        } catch (Throwable unused) {
            return null;
        }
    }
}
