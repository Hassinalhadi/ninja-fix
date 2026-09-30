package com.incognia.internal;

import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class sV5 extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public static final sV5 f11300b = new sV5();

    public sV5() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (eSs.f10363b.get()) {
            Log.i("Incognia", "Clearing accountId.");
        }
        zC b2 = X8.b();
        if (!Intrinsics.areEqual((String) b2.f11894W.f9573f9.get(), null)) {
            b2.b(dlT.f10328W, new HKV(b2, null));
        }
        return Unit.INSTANCE;
    }
}
