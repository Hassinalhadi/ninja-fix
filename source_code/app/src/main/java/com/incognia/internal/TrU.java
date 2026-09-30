package com.incognia.internal;

import android.util.Log;
import h9.C1824b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class TrU extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bs8 f9685b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrU(bs8 bs8Var) {
        super(1);
        this.f9685b = bs8Var;
    }

    public final void b(Ri ri) {
        bs8 bs8Var = this.f9685b;
        njO.b(bs8Var, new C1824b(18, bs8Var, ri));
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Ri) obj);
        return Unit.INSTANCE;
    }

    public static final void b(bs8 bs8Var, Ri ri) {
        int i4;
        bs8Var.getClass();
        kT kTVar = QHn.f9492b;
        String str = bs8.f10206R;
        Integer f92 = kTVar.f9(str);
        if (f92 != null) {
            i4 = f92.intValue();
        } else {
            IG ig2 = IG.f8892f9;
            i4 = 0;
        }
        Cc5 cc5 = Cc5.f8464f9;
        if (i4 != 1) {
            kTVar.b(str, Integer.valueOf(ri.f9560b.f10935b));
        }
        if (Intrinsics.areEqual(ri.f9560b, cc5)) {
            if (eSs.f10363b.get()) {
                Log.i("Incognia", "Data sent successfully.");
            }
        } else if (eSs.f10363b.get()) {
            Log.w("Incognia", "Failed to send data.");
        }
    }
}
