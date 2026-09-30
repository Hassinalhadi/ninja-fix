package com.incognia.internal;

import com.incognia.Incognia;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class MbI extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f9137b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MbI(boolean z2) {
        super(0);
        this.f9137b = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Incognia.INSTANCE.runOnIncogniaThreadIfInitialized("setLocationEnabled", new mk4(this.f9137b));
        return Unit.INSTANCE;
    }
}
