package com.incognia.internal;

import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.ab;
import kotlin.k;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class bD implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public final Ol f10158W;

    /* renamed from: b, reason: collision with root package name */
    public final FW f10159b;

    /* renamed from: f9, reason: collision with root package name */
    public final Cc f10160f9;
    public final Lazy sVU = LazyKt.lazy(X7o.f9892b);

    public bD(FW fw, Ol ol, Cc cc2) {
        this.f10159b = fw;
        this.f10158W = ol;
        this.f10160f9 = cc2;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.sVU.getValue();
    }

    @Override // com.incognia.internal.P0
    public final boolean b() {
        return true;
    }

    @Override // com.incognia.internal.P0
    public final void b(yE yEVar, WA wa2) {
        Object m206constructorimpl;
        Object m206constructorimpl2;
        try {
            Result.Companion companion = Result.INSTANCE;
            LinkedHashSet mike = ab.mike(this.f10158W.b(), this.f10158W.W());
            Ol ol = this.f10158W;
            S0A s0a = ol.f9331b;
            String str = Ol.PqK;
            List list = Ol.f9327R;
            LinkedHashSet C = CollectionsKt.C(s0a.b(str, list));
            if (((JSONObject) ol.f9331b.f9574b.get()).optBoolean(Ol.sVU, false)) {
                C.addAll(list);
            }
            List z2 = CollectionsKt.z(ab.mike(ab.mike(mike, C), this.f10160f9.b()));
            FW fw = this.f10159b;
            fw.getClass();
            Object obj = null;
            try {
                m206constructorimpl2 = Result.m206constructorimpl(((Boolean) Mui.f9175b.getValue()).booleanValue() ? fw.fep(z2) : null);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m206constructorimpl2 = Result.m206constructorimpl(ResultKt.createFailure(th));
            }
            if (!(m206constructorimpl2 instanceof k)) {
                obj = m206constructorimpl2;
            }
            List list2 = (List) obj;
            m206constructorimpl = Result.m206constructorimpl(new P7R((String) this.sVU.getValue(), list2, new QUz(new i75(list2))));
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th2));
        }
        Bo7.b(m206constructorimpl, wa2);
    }
}
