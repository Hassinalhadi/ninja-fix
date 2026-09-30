package com.incognia.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class elV extends Lambda implements Function0 {

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ Function0 f10385W;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f10386b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public elV(String str, Function0 function0) {
        super(0);
        this.f10386b = str;
        this.f10385W = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (rfS.b(this.f10386b)) {
            this.f10385W.invoke();
        }
        return Unit.INSTANCE;
    }
}
