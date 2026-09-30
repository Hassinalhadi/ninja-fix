package com.incognia.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.a;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Vy1 extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final Vy1 f9813b = new Vy1();

    public Vy1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        j1D j1d = (j1D) obj;
        String str = Dy.f8581b;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Dy.f8581b, j1d.f10651b);
        String str2 = j1d.f10650W;
        if (str2 != null) {
            jSONObject.put(Dy.f8580W, str2);
        }
        String str3 = j1d.f10652f9;
        if (str3 != null) {
            jSONObject.put(Dy.f8582f9, str3);
        }
        jSONObject.put(Dy.sVU, j1d.sVU);
        String str4 = j1d.gmP;
        if (str4 != null) {
            jSONObject.put(Dy.gmP, str4);
        }
        String str5 = j1d.f10647J;
        if (str5 != null) {
            jSONObject.put(Dy.f8577J, str5);
        }
        jSONObject.put(Dy.PqK, j1d.PqK);
        jSONObject.put(Dy.f8579V, j1d.f10649V);
        jSONObject.put(Dy.olU, j1d.olU);
        jSONObject.put(Dy.f8578R, 70901);
        jSONObject.put(Dy.DOu, j1d.f10648R);
        jSONObject.put(Dy.IB, j1d.DOu);
        jSONObject.put(Dy.Qs, 1776277729192L);
        String jSONObject2 = jSONObject.toString();
        Intrinsics.echo(jSONObject2, "<this>");
        byte[] bytes = jSONObject2.getBytes(a.alpha);
        Intrinsics.delta(bytes, "getBytes(...)");
        return bytes;
    }
}
