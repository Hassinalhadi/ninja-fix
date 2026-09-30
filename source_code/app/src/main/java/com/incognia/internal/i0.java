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
public final class i0 implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public final Vl f10597W;

    /* renamed from: b, reason: collision with root package name */
    public final EGE f10598b;

    /* renamed from: f9, reason: collision with root package name */
    public final Lazy f10599f9 = LazyKt.lazy(clT.f10262b);
    public Set sVU;

    public i0(EGE ege, Vl vl) {
        this.f10598b = ege;
        this.f10597W = vl;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f10599f9.getValue();
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
            EGE ege = this.f10598b;
            S0A s0a = ege.f8610b;
            String str = EGE.f8601J;
            ArrayList arrayList = EGE.f8602L;
            LinkedHashSet C = CollectionsKt.C(s0a.b(str, arrayList));
            S0A s0a2 = ege.f8610b;
            if (((JSONObject) s0a2.f9574b.get()).optBoolean(EGE.IB, false)) {
                C.addAll(arrayList);
            }
            this.sVU = njx.b(CollectionsKt.C(C));
            Vl vl = this.f10597W;
            String str2 = (String) wGk.yO.getValue();
            Set set = this.sVU;
            if (set == null) {
                set = null;
            }
            ArrayList b2 = vl.b(str2, set);
            m206constructorimpl = Result.m206constructorimpl(new P7R((String) this.f10599f9.getValue(), b2, new QUz(new mf2(b2))));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Bo7.b(m206constructorimpl, wa2);
    }
}
