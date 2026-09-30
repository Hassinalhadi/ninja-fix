package com.incognia.internal;

import h9.C1824b;
import h9.ac;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class XuT {

    /* renamed from: b, reason: collision with root package name */
    public final pl2 f9966b;

    /* renamed from: W, reason: collision with root package name */
    public final LinkedHashMap f9965W = new LinkedHashMap();

    /* renamed from: f9, reason: collision with root package name */
    public final LinkedHashMap f9967f9 = new LinkedHashMap();

    public XuT(pl2 pl2Var) {
        this.f9966b = pl2Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    public static final void W(y6C y6c, L46 l46) {
        y6c.f11833f9.invoke(l46);
    }

    public static void b(y6C y6c, L46 l46) {
        y6c.f11831W.b(new C1824b(23, y6c, l46));
    }

    public final void W(Class cls, y6C y6c) {
        this.f9966b.b(new ac(this, cls, y6c, 1));
    }

    public final void b(L46 l46) {
        this.f9966b.b(new C1824b(22, l46, this));
    }

    public static final void W(XuT xuT, Class cls, y6C y6c) {
        Set set = (Set) xuT.f9965W.get(cls);
        if (set != null) {
            set.remove(y6c);
        }
        if (set == null || !set.isEmpty()) {
            return;
        }
        xuT.f9965W.remove(cls);
    }

    public static final void b(L46 l46, boolean z2, XuT xuT) {
        Class<?> cls = l46.getClass();
        if (z2) {
            xuT.f9967f9.put(cls, l46);
        }
        Set set = (Set) xuT.f9965W.get(cls);
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                b((y6C) it.next(), l46);
            }
        }
    }

    public final void b(Class cls, y6C y6c) {
        this.f9966b.b(new ac(this, cls, y6c, 0));
    }

    public static final void b(XuT xuT, Class cls, y6C y6c) {
        Set set = (Set) xuT.f9965W.get(cls);
        if (set == null) {
            set = new LinkedHashSet();
            xuT.f9965W.put(cls, set);
        }
        set.add(y6c);
        Object obj = xuT.f9967f9.get(cls);
        L46 l46 = obj instanceof L46 ? (L46) obj : null;
        if (l46 != null) {
            b(y6c, l46);
        }
    }
}
