package com.incognia.internal;

import com.google.android.material.datepicker.j;
import h9.C1833k;
import h9.ar;
import kotlin.Pair;
import kotlin.Result;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class wKp implements toE {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cFV f11745b;

    public wKp(cFV cfv) {
        this.f11745b = cfv;
    }

    @Override // com.incognia.internal.toE
    public final void b(BGx bGx) {
        cFV cfv = this.f11745b;
        njO.b(cfv, new ar(cfv, bGx, 1));
    }

    public static final void b(cFV cfv, BGx bGx) {
        String str = cFV.f10231L;
        if (bGx != null) {
            if (P5q.b(bGx, cfv.b(false, true))) {
                BGx R10 = cFV.R();
                QHn.f9492b.b(cFV.f10231L, bGx, pVP.f11075b);
                Function1 function1 = cfv.Qs;
                if (function1 != null) {
                    Result.Companion companion = Result.INSTANCE;
                    j.quebec(Result.m206constructorimpl(cFV.R()), function1);
                    cfv.Qs = null;
                    return;
                }
                Pair b2 = cfv.b(bGx, R10);
                boolean booleanValue = ((Boolean) b2.first).booleanValue();
                U91 u91 = (U91) b2.second;
                if (!booleanValue || u91 == null) {
                    return;
                }
                cfv.f10242f9.b(new Nh(u91));
                return;
            }
            return;
        }
        cfv.getClass();
    }

    @Override // com.incognia.internal.toE
    public final void b(String str, boolean z2) {
        cFV cfv = this.f11745b;
        njO.b(cfv, new C1833k(cfv, str, z2, 2));
    }

    public static final void b(cFV cfv, String str, boolean z2) {
        Function1 function1;
        String str2 = cFV.f10231L;
        if (z2) {
            if (cfv.DOu() && (function1 = cfv.Qs) != null) {
                Result.Companion companion = Result.INSTANCE;
                j.quebec(Result.m206constructorimpl(cFV.R()), function1);
                cfv.Qs = null;
                return;
            } else {
                if (((JSONObject) cfv.f10241b.f9574b.get()).optBoolean(cFV.qnE, true)) {
                    cfv.f10242f9.b(new Nh(Kcw.f9014W));
                    return;
                }
                return;
            }
        }
        cfv.getClass();
    }
}
