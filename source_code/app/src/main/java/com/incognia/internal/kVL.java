package com.incognia.internal;

import com.google.android.material.datepicker.j;
import h9.ar;
import kotlin.Pair;
import kotlin.Result;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class kVL implements toE {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cFV f10768b;

    public kVL(cFV cfv) {
        this.f10768b = cfv;
    }

    @Override // com.incognia.internal.toE
    public final void b(String str, boolean z2) {
    }

    @Override // com.incognia.internal.toE
    public final void b(BGx bGx) {
        cFV cfv = this.f10768b;
        njO.b(cfv, new ar(cfv, bGx, 0));
    }

    public static final void b(cFV cfv, BGx bGx) {
        String str = cFV.f10231L;
        jVu b2 = cfv.b(true, true);
        cfv.f10234E--;
        if (cfv.Qs == null) {
            if (bGx == null || !P5q.b(bGx, b2)) {
                return;
            }
            Pair b4 = cfv.b(bGx, cFV.R());
            boolean booleanValue = ((Boolean) b4.first).booleanValue();
            U91 u91 = (U91) b4.second;
            if (booleanValue && u91 != null) {
                cfv.f10242f9.b(new Nh(u91));
            }
            QHn.f9492b.b(cFV.f10231L, bGx, pVP.f11075b);
            return;
        }
        if (bGx != null && P5q.b(bGx, b2)) {
            QHn.f9492b.b(cFV.f10231L, bGx, pVP.f11075b);
            Function1 function1 = cfv.Qs;
            if (function1 != null) {
                Result.Companion companion = Result.INSTANCE;
                j.quebec(Result.m206constructorimpl(cFV.R()), function1);
            }
            cfv.Qs = null;
            return;
        }
        if (cfv.f10234E == 0) {
            Function1 function12 = cfv.Qs;
            if (function12 != null) {
                j.quebec(Result.m206constructorimpl(null), function12);
            }
            cfv.Qs = null;
        }
    }
}
