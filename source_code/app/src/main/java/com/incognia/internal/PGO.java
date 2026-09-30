package com.incognia.internal;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import org.json.JSONObject;
import s6.AbstractC2734o6;

/* loaded from: classes2.dex */
public final class PGO implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public final Lazy f9399W = LazyKt.lazy(FfJ.f8721b);

    /* renamed from: b, reason: collision with root package name */
    public final rTO f9400b;

    public PGO(rTO rto, FVW fvw) {
        this.f9400b = rto;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f9399W.getValue();
    }

    @Override // com.incognia.internal.P0
    public final boolean b() {
        return true;
    }

    @Override // com.incognia.internal.P0
    public final void b(yE yEVar, WA wa2) {
        Object m206constructorimpl;
        Set b2;
        ArrayList arrayList;
        ArrayList arrayList2;
        try {
            Result.Companion companion = Result.INSTANCE;
            rTO rto = this.f9400b;
            S0A s0a = rto.f11233b;
            String str = rTO.f11231W;
            ArrayList arrayList3 = rTO.sVU;
            LinkedHashSet C = CollectionsKt.C(s0a.b(str, arrayList3));
            if (((JSONObject) rto.f11233b.f9574b.get()).optBoolean(rTO.f11232f9, true)) {
                C.addAll(arrayList3);
            }
            b2 = njx.b(CollectionsKt.C(C));
            arrayList = null;
            if (b2 == null) {
                b2 = null;
            }
            arrayList2 = new ArrayList();
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        if (!b2.isEmpty()) {
            BufferedReader W5 = FVW.W();
            if (W5 != null) {
                AbstractC2734o6.charlie(W5, new kvD(b2, arrayList2));
            } else {
                m206constructorimpl = Result.m206constructorimpl(new P7R((String) this.f9399W.getValue(), arrayList, new QUz(new A3(arrayList))));
                Bo7.b(m206constructorimpl, wa2);
            }
        }
        arrayList = arrayList2;
        m206constructorimpl = Result.m206constructorimpl(new P7R((String) this.f9399W.getValue(), arrayList, new QUz(new A3(arrayList))));
        Bo7.b(m206constructorimpl, wa2);
    }
}
