package com.incognia.internal;

import java.util.List;
import kotlin.collections.CollectionsKt;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class vM {
    public static final String sVU = (String) wGk.hQ.getValue();

    /* renamed from: W, reason: collision with root package name */
    public final KE f11543W;

    /* renamed from: b, reason: collision with root package name */
    public final S0A f11544b;

    /* renamed from: f9, reason: collision with root package name */
    public final gSi f11545f9;

    public vM(S0A s0a, KE ke2, gSi gsi) {
        this.f11544b = s0a;
        this.f11543W = ke2;
        this.f11545f9 = gsi;
    }

    public final Cs5 b(syj syjVar) {
        S0A s0a = this.f11544b;
        int optInt = ((JSONObject) s0a.f9574b.get()).optInt(sVU, 8000);
        JSONObject jSONObject = (JSONObject) this.f11545f9.invoke(syjVar);
        int length = jSONObject.toString().length();
        if (length <= optInt) {
            return new Cs5(jSONObject, Bae.f8419W, length, null);
        }
        KE ke2 = this.f11543W;
        String b2 = ke2.b(syjVar.f11342b);
        String W5 = KE.W(syjVar.f11339W);
        String b4 = ke2.b(syjVar.f11344f9);
        String W10 = KE.W(syjVar.sVU);
        String b6 = ke2.b(syjVar.gmP);
        Long l10 = syjVar.f11331J;
        String b10 = ke2.b(syjVar.PqK);
        Boolean bool = syjVar.f11338V;
        Integer num = syjVar.olU;
        Integer num2 = syjVar.f11336R;
        Double d4 = syjVar.DOu;
        Integer num3 = syjVar.IB;
        String b11 = ke2.b(syjVar.Qs);
        String b12 = ke2.b(syjVar.f11327E);
        String b13 = ke2.b(syjVar.f11346n9);
        String b14 = ke2.b(syjVar.f11340Y);
        String b15 = ke2.b(syjVar.f11335P);
        String W11 = KE.W(syjVar.FL);
        Long l11 = syjVar.f11341ar;
        Long l12 = syjVar.a2F;
        Boolean bool2 = syjVar.f11329H;
        Boolean bool3 = syjVar.H02;
        String b16 = ke2.b(syjVar.jgi);
        String b17 = ke2.b(syjVar.f11332K);
        List b18 = ke2.b(syjVar.qnE, Ol.olU);
        List b19 = ke2.b(syjVar.f11348s0, jCW.f10669Y);
        Long l13 = syjVar.eeB;
        Float f5 = syjVar.Gw;
        Double d9 = syjVar.f11328G;
        Double d10 = syjVar.Pk;
        Boolean bool4 = syjVar.fI;
        Boolean bool5 = syjVar.WdK;
        String b20 = ke2.b(syjVar.Sn);
        Long l14 = syjVar.jG;
        String b21 = ke2.b(syjVar.oI);
        Boolean bool6 = syjVar.iMc;
        String W12 = KE.W(syjVar.vZZ);
        String b22 = ke2.b(syjVar.f11345i);
        Long l15 = syjVar.eHc;
        Long l16 = syjVar.f11337S;
        String b23 = ke2.b(syjVar.mn);
        String b24 = ke2.b(syjVar.Uj);
        Integer num4 = syjVar.VL;
        String b25 = ke2.b(syjVar.wcf);
        String b26 = ke2.b(syjVar.f11334M);
        Long l17 = syjVar.f11347r;
        String b27 = ke2.b(syjVar.s1O);
        String b28 = ke2.b(syjVar.Lu);
        List b29 = ke2.b(syjVar.f11330H8, CollectionsKt.emptyList());
        String b30 = ke2.b(syjVar.n4S);
        List b31 = ke2.b(syjVar.CM5, Ol.f9328V);
        List b32 = ke2.b(syjVar.Q, jCW.f10672n9);
        List b33 = ke2.b(syjVar.Mo1, jCW.f10661E);
        Integer num5 = syjVar.nK;
        List b34 = ke2.b(syjVar.AL, CollectionsKt.emptyList());
        List b35 = ke2.b(syjVar.OyQ, CollectionsKt.emptyList());
        List b36 = ke2.b(syjVar.f11349z, CollectionsKt.emptyList());
        List b37 = ke2.b(syjVar.C, CollectionsKt.a(EGE.f8600E, EGE.f8609n9));
        List b38 = ke2.b(syjVar.OJ, EGE.FL);
        List b39 = ke2.b(syjVar.TF1, Qfa.f9510J);
        List b40 = ke2.b(syjVar.mi, jCW.f10664L);
        String b41 = ke2.b(syjVar.f11343b8);
        Long l18 = syjVar.nT;
        Long l19 = syjVar.hod;
        JSONObject jSONObject2 = (JSONObject) this.f11545f9.invoke(new syj(b2, W5, b4, W10, b6, l10, b10, bool, num, num2, d4, num3, b11, b12, b13, b14, b15, W11, l11, l12, bool2, bool3, b16, b17, b18, b19, l13, f5, d9, d10, bool4, bool5, b20, l14, b21, bool6, W12, b22, l15, l16, b23, b24, num4, b25, b26, l17, b27, b28, b29, b30, b31, b32, b33, num5, b34, b35, b36, b37, b38, b39, b40, b41, l18, l19, syjVar.Ni, 131072, 0, 0));
        int length2 = jSONObject2.toString().length();
        if (length2 <= optInt) {
            return new Cs5(jSONObject2, fx3.f10448W, length2, Integer.valueOf(length));
        }
        JSONObject jSONObject3 = (JSONObject) this.f11545f9.invoke(new syj(null, W5, null, W10, null, null, null, null, null, null, null, null, null, null, null, null, null, W11, null, l12, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, W12, null, l15, null, null, null, null, null, null, null, b27, b28, null, null, null, null, null, num5, null, null, null, null, null, null, null, b41, l18, l19, null, -1310731, 1069449055, 2));
        return new Cs5(jSONObject3, lT1.f10827W, jSONObject3.toString().length(), Integer.valueOf(length));
    }
}
