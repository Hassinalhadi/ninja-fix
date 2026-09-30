package com.incognia.internal;

import com.incognia.Incognia;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class qEZ extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f11133b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qEZ(String str) {
        super(0);
        this.f11133b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Incognia.INSTANCE.runOnIncogniaThreadIfInitialized("reportBusinessUnitId", new NaX(this.f11133b));
        return Unit.INSTANCE;
    }
}
