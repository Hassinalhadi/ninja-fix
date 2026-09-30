package com.incognia.internal;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zjW implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public final Vl f11939W;

    /* renamed from: b, reason: collision with root package name */
    public final EGE f11940b;

    /* renamed from: f9, reason: collision with root package name */
    public final Lazy f11941f9 = LazyKt.lazy(KYB.f9007b);
    public Set sVU;

    public zjW(EGE ege, Vl vl) {
        this.f11940b = ege;
        this.f11939W = vl;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f11941f9.getValue();
    }

    @Override // com.incognia.internal.P0
    public final boolean b() {
        return true;
    }

    @Override // com.incognia.internal.P0
    public final void b(yE yEVar, WA wa2) {
        Object m206constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            EGE ege = this.f11940b;
            S0A s0a = ege.f8610b;
            String str = EGE.gmP;
            ArrayList arrayList = EGE.f8603P;
            LinkedHashSet C = CollectionsKt.C(s0a.b(str, arrayList));
            S0A s0a2 = ege.f8610b;
            if (((JSONObject) s0a2.f9574b.get()).optBoolean(EGE.DOu, false)) {
                C.addAll(arrayList);
            }
            this.sVU = njx.b(CollectionsKt.C(C));
            Vl vl = this.f11939W;
            String str2 = (String) wGk.f11620H1.getValue();
            Set set = this.sVU;
            if (set == null) {
                set = null;
            }
            ArrayList b2 = vl.b(str2, set);
            m206constructorimpl = Result.m206constructorimpl(new P7R((String) this.f11941f9.getValue(), b2, new QUz(new Ryv(b2))));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Bo7.b(m206constructorimpl, wa2);
    }
}
