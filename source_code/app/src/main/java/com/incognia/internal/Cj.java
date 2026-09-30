package com.incognia.internal;

import android.content.Context;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Cj implements M1 {
    public static final String DOu;
    public static final String IB;

    /* renamed from: J, reason: collision with root package name */
    public static final String f8467J;
    public static final String PqK;

    /* renamed from: R, reason: collision with root package name */
    public static final String f8468R;

    /* renamed from: V, reason: collision with root package name */
    public static final String f8469V;

    /* renamed from: W, reason: collision with root package name */
    public static final String f8470W;

    /* renamed from: b, reason: collision with root package name */
    public static final String f8471b;

    /* renamed from: f9, reason: collision with root package name */
    public static final String f8472f9;
    public static final String gmP;
    public static final String olU;
    public static final String sVU;

    static {
        f8471b = (String) wGk.eym.getValue();
        f8470W = (String) wGk.lqg.getValue();
        f8472f9 = (String) wGk.f11701la.getValue();
        sVU = (String) wGk.f11682bn.getValue();
        gmP = (String) wGk.f11719ra.getValue();
        f8467J = (String) wGk.tG.getValue();
        PqK = (String) wGk.nG.getValue();
        f8469V = (String) wGk.f11644P6.getValue();
        olU = (String) wGk.bFT.getValue();
        f8468R = (String) wGk.f11664W.getValue();
        DOu = (String) wGk.f11657U.getValue();
        IB = (String) wGk.f11635Mf.getValue();
    }

    @Override // com.incognia.internal.M1
    public final boolean W() {
        return true;
    }

    @Override // com.incognia.internal.M1
    public final int b() {
        return 1;
    }

    @Override // com.incognia.internal.M1
    public final void b(Context context) {
        vQ vQVar = new vQ(context, f8471b);
        vQ vQVar2 = new vQ(context, f8470W);
        vQ vQVar3 = new vQ(context, f8472f9);
        bdh b2 = new d9U(vQVar2, vQVar3, vQVar).b();
        if (Intrinsics.areEqual(b2, GmL.f8809W)) {
            b(vQVar2, sVU, gmP, f8467J);
        } else if (Intrinsics.areEqual(b2, Q7W.f9485W)) {
            b(vQVar3, PqK, f8469V, olU);
        } else {
            Intrinsics.areEqual(b2, odR.f11028W);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(vQ vQVar, String str, String str2, String str3) {
        String str4;
        String W5 = vQVar.W(Wjl.f9867b, Wjl.f9866W);
        if (W5 != null) {
            QHn.sVU.b(DOu, kotlin.text.r.oscar(W5, IB, "").toLowerCase(Locale.getDefault()));
        }
        String W10 = vQVar.W(str2, h.f10515b);
        if (W10 == null) {
            String str5 = h.f10514W;
            String W11 = vQVar.W(str3, str5);
            W10 = W11 == null ? vQVar.W(str, str5) : W11;
        }
        if (W10 != null) {
            JSONObject jSONObject = new JSONObject(W10);
            String str6 = h.f10516f9;
            if (jSONObject.has(str6)) {
                str4 = jSONObject.getString(str6);
                if (str4 == null) {
                    QHn.sVU.b(f8468R, str4);
                    return;
                }
                return;
            }
        }
        str4 = null;
        if (str4 == null) {
        }
    }
}
