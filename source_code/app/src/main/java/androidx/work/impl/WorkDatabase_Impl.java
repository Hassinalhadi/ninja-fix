package androidx.work.impl;

import B0.a;
import B2.d;
import Fe.u;
import J2.b;
import J2.c;
import J2.e;
import J2.f;
import J2.h;
import J2.i;
import J2.l;
import J2.n;
import J2.r;
import J2.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import s2.InterfaceC2594b;

/* loaded from: classes3.dex */
public final class WorkDatabase_Impl extends WorkDatabase {
    public volatile r lima;
    public volatile c mike;
    public volatile t november;
    public volatile i oscar;
    public volatile l papa;
    public volatile n quebec;
    public volatile e romeo;

    @Override // androidx.work.impl.WorkDatabase
    public final l2.l delta() {
        return new l2.l(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.work.impl.WorkDatabase
    public final InterfaceC2594b echo(l2.e eVar) {
        return eVar.charlie.alpha(new u(eVar.alpha, eVar.bravo, new a(eVar, new D8.c(4, this)), false, false));
    }

    @Override // androidx.work.impl.WorkDatabase
    public final c foxtrot() {
        c cVar;
        if (this.mike != null) {
            return this.mike;
        }
        synchronized (this) {
            try {
                if (this.mike == null) {
                    this.mike = new c(this);
                }
                cVar = this.mike;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final List golf(LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new d(13, 14, 10));
        arrayList.add(new d(11));
        int i4 = 17;
        arrayList.add(new d(16, i4, 12));
        int i5 = 18;
        arrayList.add(new d(i4, i5, 13));
        arrayList.add(new d(i5, 19, 14));
        arrayList.add(new d(15));
        arrayList.add(new d(20, 21, 16));
        arrayList.add(new d(22, 23, 17));
        return arrayList;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final Set india() {
        return new HashSet();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final Map juliet() {
        HashMap hashMap = new HashMap();
        List list = Collections.EMPTY_LIST;
        hashMap.put(r.class, list);
        hashMap.put(c.class, list);
        hashMap.put(t.class, list);
        hashMap.put(i.class, list);
        hashMap.put(l.class, list);
        hashMap.put(n.class, list);
        hashMap.put(e.class, list);
        hashMap.put(f.class, list);
        return hashMap;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final e lima() {
        e eVar;
        if (this.romeo != null) {
            return this.romeo;
        }
        synchronized (this) {
            try {
                if (this.romeo == null) {
                    this.romeo = new e(this);
                }
                eVar = this.romeo;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [J2.i, java.lang.Object] */
    @Override // androidx.work.impl.WorkDatabase
    public final i quebec() {
        i iVar;
        if (this.oscar != null) {
            return this.oscar;
        }
        synchronized (this) {
            try {
                if (this.oscar == null) {
                    ?? obj = new Object();
                    obj.alpha = this;
                    obj.purple = new b(this, 2);
                    obj.red = new h(this, 0);
                    obj.silver = new h(this, 1);
                    this.oscar = obj;
                }
                iVar = this.oscar;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [J2.l, java.lang.Object] */
    @Override // androidx.work.impl.WorkDatabase
    public final l sierra() {
        l lVar;
        if (this.papa != null) {
            return this.papa;
        }
        synchronized (this) {
            try {
                if (this.papa == null) {
                    ?? obj = new Object();
                    obj.alpha = this;
                    obj.purple = new b(this, 3);
                    this.papa = obj;
                }
                lVar = this.papa;
            } catch (Throwable th) {
                throw th;
            }
        }
        return lVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, J2.n] */
    @Override // androidx.work.impl.WorkDatabase
    public final n tango() {
        n nVar;
        if (this.quebec != null) {
            return this.quebec;
        }
        synchronized (this) {
            try {
                if (this.quebec == null) {
                    ?? obj = new Object();
                    obj.alpha = this;
                    obj.purple = new b(this, 4);
                    obj.red = new h(this, 2);
                    obj.silver = new h(this, 3);
                    this.quebec = obj;
                }
                nVar = this.quebec;
            } catch (Throwable th) {
                throw th;
            }
        }
        return nVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final r uniform() {
        r rVar;
        if (this.lima != null) {
            return this.lima;
        }
        synchronized (this) {
            try {
                if (this.lima == null) {
                    this.lima = new r(this);
                }
                rVar = this.lima;
            } catch (Throwable th) {
                throw th;
            }
        }
        return rVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, J2.t] */
    @Override // androidx.work.impl.WorkDatabase
    public final t victor() {
        t tVar;
        if (this.november != null) {
            return this.november;
        }
        synchronized (this) {
            try {
                if (this.november == null) {
                    ?? obj = new Object();
                    obj.alpha = this;
                    obj.purple = new b(this, 6);
                    obj.red = new h(this, 20);
                    this.november = obj;
                }
                tVar = this.november;
            } catch (Throwable th) {
                throw th;
            }
        }
        return tVar;
    }
}
