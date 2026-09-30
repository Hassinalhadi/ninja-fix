package com.incognia.internal;

import java.io.IOException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class qHY extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TI9 f11138b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qHY(TI9 ti9) {
        super(0);
        this.f11138b = ti9;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        try {
            return TI9.b(this.f11138b);
        } catch (IOException unused) {
            return null;
        }
    }
}
