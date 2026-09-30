package com.incognia.internal;

import com.google.android.material.datepicker.j;
import g9.a;
import h9.C1824b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.t;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class IW implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public final S0A f8903W;

    /* renamed from: b, reason: collision with root package name */
    public final pl2 f8904b;

    /* renamed from: f9, reason: collision with root package name */
    public final Lazy f8905f9 = LazyKt.lazy(Ibq.f8912b);
    public final AtomicReference sVU = new AtomicReference();

    public IW(pl2 pl2Var, S0A s0a, W6 w62) {
        this.f8904b = pl2Var;
        this.f8903W = s0a;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f8905f9.getValue();
    }

    @Override // com.incognia.internal.P0
    public final boolean b() {
        return false;
    }

    public final void f9() {
        this.f8904b.b(new a(4, this));
    }

    @Override // com.incognia.internal.P0
    public final void b(yE yEVar, WA wa2) {
        this.f8904b.b(new C1824b(this, wa2, 6));
    }

    public static final void b(IW iw, Function1 function1) {
        Map map = (Map) iw.sVU.get();
        if (map != null) {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new c7p((String) entry.getKey(), ((Number) entry.getValue()).longValue()));
            }
            Result.Companion companion = Result.INSTANCE;
            j.quebec(Result.m206constructorimpl(new ieJ((String) iw.f8905f9.getValue(), arrayList)), function1);
            return;
        }
        Result.Companion companion2 = Result.INSTANCE;
        j.quebec(Result.m206constructorimpl(new ieJ((String) iw.f8905f9.getValue(), null)), function1);
    }

    public final void b(String str) {
        this.f8904b.b(new C1824b(5, this, str));
    }

    public static final void b(IW iw, String str) {
        Map victor;
        int collectionSizeOrDefault;
        Map map = (Map) iw.sVU.get();
        if (map == null) {
            map = t.alpha;
        }
        if (map.containsKey(str)) {
            victor = kotlin.collections.y.amber(map);
            victor.put(str, Long.valueOf(System.currentTimeMillis()));
        } else {
            int optInt = ((JSONObject) iw.f8903W.f9574b.get()).optInt((String) wGk.HZ.getValue(), 10);
            victor = kotlin.collections.y.victor(map, new Pair(str, Long.valueOf(System.currentTimeMillis())));
            if (victor.size() > optInt) {
                List<Map.Entry> r4 = CollectionsKt.r(CollectionsKt.p(victor.entrySet(), new sw()), optInt);
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(r4, 10);
                int quebec = kotlin.collections.y.quebec(collectionSizeOrDefault);
                if (quebec < 16) {
                    quebec = 16;
                }
                Map linkedHashMap = new LinkedHashMap(quebec);
                for (Map.Entry entry : r4) {
                    Pair pair = new Pair(entry.getKey(), entry.getValue());
                    linkedHashMap.put(pair.getFirst(), pair.getSecond());
                }
                victor = linkedHashMap;
            }
        }
        iw.sVU.set(victor);
    }

    public static final void b(IW iw) {
        iw.sVU.set(null);
    }
}
