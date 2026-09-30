package com.incognia.internal;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class XD {

    /* renamed from: J, reason: collision with root package name */
    public static final String f9900J = (String) wGk.ipk.getValue();
    public static final String PqK = (String) wGk.UZA.getValue();

    /* renamed from: V, reason: collision with root package name */
    public static final String f9901V = (String) wGk.A.getValue();
    public static final String olU = (String) wGk.Vq.getValue();

    /* renamed from: W, reason: collision with root package name */
    public final JSONObject f9902W;

    /* renamed from: b, reason: collision with root package name */
    public final String f9903b;

    /* renamed from: f9, reason: collision with root package name */
    public final long f9904f9;
    public final String gmP;
    public final String sVU;

    public XD(String str, JSONObject jSONObject, long j5, String str2, String str3) {
        this.f9903b = str;
        this.f9902W = jSONObject;
        this.f9904f9 = j5;
        this.sVU = str2;
        this.gmP = str3;
    }

    public final JSONObject W() {
        JSONObject jSONObject = new JSONObject(this.f9902W.toString());
        jSONObject.put(f9900J, this.f9903b);
        jSONObject.put(PqK, this.gmP);
        jSONObject.put(f9901V, this.f9904f9);
        jSONObject.put(olU, this.sVU);
        return jSONObject;
    }

    public final int b() {
        return W().toString().getBytes(a.alpha).length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof XD)) {
            return false;
        }
        XD xd2 = (XD) obj;
        if (Intrinsics.areEqual(this.f9903b, xd2.f9903b) && Intrinsics.areEqual(this.f9902W, xd2.f9902W) && this.f9904f9 == xd2.f9904f9 && Intrinsics.areEqual(this.sVU, xd2.sVU) && Intrinsics.areEqual(this.gmP, xd2.gmP)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.gmP.hashCode() + VpS.b(this.sVU, lci.b(this.f9904f9, (this.f9902W.hashCode() + (this.f9903b.hashCode() * 31)) * 31, 31), 31);
    }

    public /* synthetic */ XD(String str, JSONObject jSONObject, long j5, String str2) {
        this(str, jSONObject, j5, str2, UUID.randomUUID().toString());
    }
}
