package com.incognia.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class XlW extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ R0t f9948b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XlW(R0t r0t) {
        super(1);
        this.f9948b = r0t;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Integer num;
        FM4 fm4 = (FM4) obj;
        R0t r0t = this.f9948b;
        if (r0t != null) {
            num = Integer.valueOf(r0t.f9533b);
        } else {
            num = null;
        }
        fm4.JE = num;
        return Unit.INSTANCE;
    }
}
