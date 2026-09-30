package com.incognia.internal;

import g9.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class kT {
    public long PqK;

    /* renamed from: W, reason: collision with root package name */
    public final pl2 f10762W;

    /* renamed from: b, reason: collision with root package name */
    public final zO f10763b;

    /* renamed from: f9, reason: collision with root package name */
    public final bt1 f10764f9;
    public final long sVU = 1000;
    public final ConcurrentHashMap gmP = new ConcurrentHashMap();

    /* renamed from: J, reason: collision with root package name */
    public final AtomicLong f10760J = new AtomicLong(0);

    /* renamed from: V, reason: collision with root package name */
    public final AtomicBoolean f10761V = new AtomicBoolean(false);

    public kT(zO zOVar, pl2 pl2Var, bt1 bt1Var) {
        this.f10763b = zOVar;
        this.f10762W = pl2Var;
        this.f10764f9 = bt1Var;
        try {
            Result.Companion companion = Result.INSTANCE;
            W();
            Result.m206constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m206constructorimpl(ResultKt.createFailure(th));
        }
    }

    public final String J(String str) {
        String b2;
        if (this.f10764f9 != null && (b2 = U9J.b(str)) != null) {
            return b2;
        }
        return str;
    }

    public final void W() {
        Object m206constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        if (this.f10763b.W()) {
            LinkedHashMap sVU = this.f10763b.sVU();
            if (sVU != null) {
                for (Map.Entry entry : sVU.entrySet()) {
                    this.gmP.put((String) entry.getKey(), (String) entry.getValue());
                }
            }
            m206constructorimpl = Result.m206constructorimpl(Unit.INSTANCE);
            if (Result.m207exceptionOrNullimpl(m206constructorimpl) != null) {
                this.gmP.clear();
                this.f10763b.b();
            }
        }
    }

    public final void b(String str, Object obj) {
        try {
            Result.Companion companion = Result.INSTANCE;
            String J4 = J(str);
            String obj2 = obj != null ? obj.toString() : null;
            if (this.f10764f9 != null) {
                String W5 = obj2 != null ? ICR.W(obj2) : null;
                if (W5 != null) {
                    obj2 = W5;
                }
            }
            if (obj2 == null) {
                this.gmP.remove(J4);
            } else {
                this.gmP.put(J4, obj2);
            }
            this.f10760J.incrementAndGet();
            sVU();
            Result.m206constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m206constructorimpl(ResultKt.createFailure(th));
        }
    }

    public final void f9() {
        try {
            Result.Companion companion = Result.INSTANCE;
            this.gmP.clear();
            this.f10760J.incrementAndGet();
            sVU();
            Result.m206constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m206constructorimpl(ResultKt.createFailure(th));
        }
    }

    public final String gmP(String str) {
        Object m206constructorimpl;
        String str2;
        Object obj = null;
        try {
            Result.Companion companion = Result.INSTANCE;
            String str3 = (String) this.gmP.get(J(str));
            if (this.f10764f9 != null) {
                if (str3 != null) {
                    str2 = ICR.b(str3);
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    str3 = str2;
                }
            }
            m206constructorimpl = Result.m206constructorimpl(str3);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        if (!(m206constructorimpl instanceof k)) {
            obj = m206constructorimpl;
        }
        return (String) obj;
    }

    public final void sVU() {
        try {
            Result.Companion companion = Result.INSTANCE;
            if (this.f10761V.compareAndSet(false, true)) {
                this.f10762W.b(this.sVU, new a(16, this));
            }
            Result.m206constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m206constructorimpl(ResultKt.createFailure(th));
        }
    }

    public final Long sVU(String str) {
        Object m206constructorimpl;
        String str2;
        String b2;
        Object obj = null;
        try {
            Result.Companion companion = Result.INSTANCE;
            str2 = (String) this.gmP.get(J(str));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        if (str2 != null) {
            if (this.f10764f9 != null && (b2 = ICR.b(str2)) != null) {
                str2 = b2;
            }
            Long uniform = kotlin.text.r.uniform(str2);
            if (uniform == null) {
                b(str);
            }
            m206constructorimpl = Result.m206constructorimpl(uniform);
            if (Result.m207exceptionOrNullimpl(m206constructorimpl) == null) {
                obj = m206constructorimpl;
            } else {
                b(str);
            }
            return (Long) obj;
        }
        return (Long) obj;
    }

    public final Integer f9(String str) {
        Object m206constructorimpl;
        String str2;
        String b2;
        Object obj = null;
        try {
            Result.Companion companion = Result.INSTANCE;
            str2 = (String) this.gmP.get(J(str));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        if (str2 != null) {
            if (this.f10764f9 != null && (b2 = ICR.b(str2)) != null) {
                str2 = b2;
            }
            Integer tango = kotlin.text.r.tango(str2);
            if (tango == null) {
                b(str);
            }
            m206constructorimpl = Result.m206constructorimpl(tango);
            if (Result.m207exceptionOrNullimpl(m206constructorimpl) == null) {
                obj = m206constructorimpl;
            } else {
                b(str);
            }
            return (Integer) obj;
        }
        return (Integer) obj;
    }

    public final Boolean W(String str) {
        Object m206constructorimpl;
        String str2;
        Object m206constructorimpl2;
        Boolean bool;
        String b2;
        Object obj = null;
        try {
            Result.Companion companion = Result.INSTANCE;
            str2 = (String) this.gmP.get(J(str));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        if (str2 != null) {
            if (this.f10764f9 != null && (b2 = ICR.b(str2)) != null) {
                str2 = b2;
            }
            try {
                if (Intrinsics.areEqual(str2, "true")) {
                    bool = Boolean.TRUE;
                } else {
                    bool = Intrinsics.areEqual(str2, "false") ? Boolean.FALSE : null;
                }
                m206constructorimpl2 = Result.m206constructorimpl(bool);
            } catch (Throwable th2) {
                Result.Companion companion3 = Result.INSTANCE;
                m206constructorimpl2 = Result.m206constructorimpl(ResultKt.createFailure(th2));
            }
            if (m206constructorimpl2 instanceof k) {
                m206constructorimpl2 = null;
            }
            Boolean bool2 = (Boolean) m206constructorimpl2;
            if (bool2 == null) {
                b(str);
            }
            m206constructorimpl = Result.m206constructorimpl(bool2);
            if (Result.m207exceptionOrNullimpl(m206constructorimpl) == null) {
                obj = m206constructorimpl;
            } else {
                b(str);
            }
            return (Boolean) obj;
        }
        return (Boolean) obj;
    }

    public final void b(String str) {
        try {
            Result.Companion companion = Result.INSTANCE;
            this.gmP.remove(J(str));
            this.f10760J.incrementAndGet();
            sVU();
            Result.m206constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m206constructorimpl(ResultKt.createFailure(th));
        }
    }

    public final void b(String str, Object obj, Function1 function1) {
        try {
            Result.Companion companion = Result.INSTANCE;
            if (obj == null) {
                b(str);
            } else {
                b(str, ((JSONObject) function1.invoke(obj)).toString());
            }
            Result.m206constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m206constructorimpl(ResultKt.createFailure(th));
        }
    }

    public final s8 b() {
        Object m206constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(this.f10763b.f9());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        if (m206constructorimpl instanceof k) {
            m206constructorimpl = null;
        }
        return (s8) m206constructorimpl;
    }

    public final void b(List list) {
        int collectionSizeOrDefault;
        try {
            Result.Companion companion = Result.INSTANCE;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(J((String) it.next()));
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i4 = 0;
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList.get(i5);
                i5++;
                if (this.gmP.keySet().contains((String) obj)) {
                    arrayList2.add(obj);
                }
            }
            int size2 = arrayList2.size();
            while (i4 < size2) {
                Object obj2 = arrayList2.get(i4);
                i4++;
                this.gmP.remove((String) obj2);
            }
            if (!arrayList2.isEmpty()) {
                this.f10760J.incrementAndGet();
                sVU();
            }
            Result.m206constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m206constructorimpl(ResultKt.createFailure(th));
        }
    }

    public static final void b(kT kTVar) {
        Object m206constructorimpl;
        kTVar.f10761V.set(false);
        long j5 = kTVar.f10760J.get();
        if (j5 == kTVar.PqK) {
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            kTVar.f10763b.b(kotlin.collections.y.zulu(kTVar.gmP));
            m206constructorimpl = Result.m206constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Result.m207exceptionOrNullimpl(m206constructorimpl);
        kTVar.PqK = j5;
    }

    public final Object b(Function1 function1, String str) {
        Object m206constructorimpl;
        String str2;
        Object m206constructorimpl2;
        String b2;
        try {
            Result.Companion companion = Result.INSTANCE;
            str2 = (String) this.gmP.get(J(str));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        if (str2 == null) {
            return null;
        }
        if (this.f10764f9 != null && (b2 = ICR.b(str2)) != null) {
            str2 = b2;
        }
        try {
            m206constructorimpl2 = Result.m206constructorimpl(function1.invoke(new JSONObject(str2)));
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            m206constructorimpl2 = Result.m206constructorimpl(ResultKt.createFailure(th2));
        }
        if (m206constructorimpl2 instanceof k) {
            m206constructorimpl2 = null;
        }
        if (m206constructorimpl2 == null) {
            b(str);
        }
        m206constructorimpl = Result.m206constructorimpl(m206constructorimpl2);
        if (Result.m207exceptionOrNullimpl(m206constructorimpl) == null) {
            return m206constructorimpl;
        }
        b(str);
        return null;
    }
}
