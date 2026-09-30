package com.incognia.internal;

import android.util.Log;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class NaX extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9238b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NaX(String str) {
        super(0);
        this.f9238b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        AtomicBoolean atomicBoolean = eSs.f10363b;
        if (atomicBoolean.get()) {
            Log.i("Incognia", "Reporting businessUnitId.");
        }
        if (this.f9238b.length() == 0) {
            if (atomicBoolean.get()) {
                Log.w("Incognia", "Invalid businessUnitId received: businessUnitId won't be reported.");
            }
        } else {
            rfS.b(this.f9238b, "businessUnitId");
            String str = this.f9238b;
            if (!ArraysKt.whiskey(rfS.f11243b, str) && atomicBoolean.get()) {
                Log.w("Incognia", "Unexpected business unit id received: " + str + ". Please make sure this value has been properly aligned with Incognia's team.");
            }
            zC b2 = X8.b();
            String str2 = this.f9238b;
            Map map = (Map) b2.PqK.sVU.get();
            if (map != null && map.containsKey(str2)) {
                b2.PqK.b(str2);
            } else {
                b2.b(yAc.f11840W, new Fbn(b2, str2));
            }
        }
        return Unit.INSTANCE;
    }
}
