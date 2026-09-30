package com.incognia.internal;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.ab;
import kotlin.k;
import kotlin.text.Regex;

/* loaded from: classes2.dex */
public final class Ku implements P0 {

    /* renamed from: f9, reason: collision with root package name */
    public static final List f9030f9 = CollectionsKt.listOf((String) wGk.g9M.getValue(), (String) wGk.wlX.getValue(), (String) wGk.ruG.getValue(), (String) wGk.ucK.getValue(), (String) wGk.dfn.getValue(), (String) wGk.Yvh.getValue());
    public static final List sVU = ab.juliet((String) wGk.g21.getValue());

    /* renamed from: W, reason: collision with root package name */
    public final Lazy f9031W = LazyKt.lazy(Dr6.f8569b);

    /* renamed from: b, reason: collision with root package name */
    public final S0A f9032b;

    public Ku(nwv nwvVar, S0A s0a) {
        this.f9032b = s0a;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f9031W.getValue();
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
            try {
                m206constructorimpl2 = Result.m206constructorimpl(System.getenv());
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m206constructorimpl2 = Result.m206constructorimpl(ResultKt.createFailure(th));
            }
            LinkedHashMap linkedHashMap = null;
            if (m206constructorimpl2 instanceof k) {
                m206constructorimpl2 = null;
            }
            Map map = (Map) m206constructorimpl2;
            Set D10 = CollectionsKt.D(this.f9032b.b((String) wGk.LP0.getValue(), f9030f9));
            Irx irx = new Irx(CollectionsKt.D(this.f9032b.b((String) wGk.f11700l.getValue(), sVU)));
            if (map != null) {
                linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    String str2 = (String) entry.getValue();
                    if (!D10.contains(str)) {
                        ArrayList arrayList = irx.f8924b;
                        int i4 = 0;
                        if (!(arrayList != null) || !arrayList.isEmpty()) {
                            int size = arrayList.size();
                            while (i4 < size) {
                                Object obj = arrayList.get(i4);
                                i4++;
                                if (((Regex) obj).echo(str2)) {
                                }
                            }
                        }
                    }
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            m206constructorimpl = Result.m206constructorimpl(new P7R((String) this.f9031W.getValue(), linkedHashMap, new u94(new r0B(linkedHashMap))));
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th2));
        }
        Bo7.b(m206constructorimpl, wa2);
    }
}
