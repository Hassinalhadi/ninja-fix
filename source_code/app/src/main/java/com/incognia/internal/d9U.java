package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class d9U {

    /* renamed from: W, reason: collision with root package name */
    public final vQ f10297W;

    /* renamed from: b, reason: collision with root package name */
    public final vQ f10298b;

    /* renamed from: f9, reason: collision with root package name */
    public final vQ f10299f9;
    public static final String sVU = (String) wGk.dK.getValue();
    public static final String gmP = (String) wGk.BnM.getValue();

    /* renamed from: J, reason: collision with root package name */
    public static final String f10294J = (String) wGk.HLy.getValue();
    public static final String PqK = (String) wGk.Ixr.getValue();

    /* renamed from: V, reason: collision with root package name */
    public static final String f10296V = (String) wGk.wh3.getValue();
    public static final String olU = (String) wGk.PG.getValue();

    /* renamed from: R, reason: collision with root package name */
    public static final String f10295R = (String) wGk.xwz.getValue();
    public static final String DOu = (String) wGk.TIB.getValue();

    public d9U(vQ vQVar, vQ vQVar2, vQ vQVar3) {
        this.f10298b = vQVar;
        this.f10297W = vQVar2;
        this.f10299f9 = vQVar3;
    }

    public final bdh b() {
        String W5 = this.f10299f9.W(sVU, gmP);
        if (W5 != null) {
            int i4 = bdh.f10194b;
            return Intrinsics.areEqual(W5, (String) wGk.f11684c.getValue()) ? GmL.f8809W : Intrinsics.areEqual(W5, (String) wGk.f11707n4.getValue()) ? Q7W.f9485W : odR.f11028W;
        }
        vQ vQVar = this.f10298b;
        String str = f10294J;
        String str2 = PqK;
        String W10 = vQVar.W(str, str2);
        String W11 = this.f10297W.W(str, str2);
        if (W10 != null && W11 == null) {
            return GmL.f8809W;
        }
        if (W10 == null && W11 != null) {
            return Q7W.f9485W;
        }
        if (W10 == null) {
            return odR.f11028W;
        }
        Long b2 = b(this.f10298b, f10295R);
        Long b4 = b(this.f10297W, DOu);
        if (b2 == null || b4 == null) {
            if (b2 != null) {
                return GmL.f8809W;
            }
            return Q7W.f9485W;
        }
        if (b2.longValue() > b4.longValue()) {
            return GmL.f8809W;
        }
        return Q7W.f9485W;
    }

    public static Long b(vQ vQVar, String str) {
        String W5 = vQVar.W(str, olU);
        if (W5 != null) {
            try {
                return Long.valueOf(new JSONObject(W5).optLong(f10296V));
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
