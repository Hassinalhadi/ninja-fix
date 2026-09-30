package com.bumptech.glide;

import J2.t;
import J3.r;
import J3.s;
import J3.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import r1.C2486e;
import w.o;

/* loaded from: classes3.dex */
public final class h {
    public final u alpha;
    public final Q3.c bravo;
    public final o charlie;
    public final Q3.c delta;
    public final com.bumptech.glide.load.data.h echo;
    public final Q3.c foxtrot;
    public final T3.b golf;
    public final J2.l hotel = new J2.l(15);
    public final T3.c india = new T3.c();
    public final t juliet;

    public h() {
        t tVar = new t(false, (Object) new C2486e(20), (Object) new com.google.mlkit.common.sdkinternal.b(13), (Object) new g7.f(13));
        this.juliet = tVar;
        this.alpha = new u(tVar);
        this.bravo = new Q3.c(1);
        this.charlie = new o(15);
        this.delta = new Q3.c(2);
        this.echo = new com.bumptech.glide.load.data.h();
        this.foxtrot = new Q3.c(0);
        this.golf = new T3.b(0, false);
        List asList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = asList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        o oVar = this.charlie;
        synchronized (oVar) {
            try {
                ArrayList arrayList2 = new ArrayList((ArrayList) oVar.purple);
                ((ArrayList) oVar.purple).clear();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((ArrayList) oVar.purple).add((String) it2.next());
                }
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    String str = (String) it3.next();
                    if (!arrayList.contains(str)) {
                        ((ArrayList) oVar.purple).add(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void alpha(Class cls, E3.c cVar) {
        Q3.c cVar2 = this.bravo;
        synchronized (cVar2) {
            cVar2.alpha.add(new T3.a(cls, cVar));
        }
    }

    public final void bravo(Class cls, E3.l lVar) {
        Q3.c cVar = this.delta;
        synchronized (cVar) {
            cVar.alpha.add(new T3.e(cls, lVar));
        }
    }

    public final void charlie(Class cls, Class cls2, s sVar) {
        u uVar = this.alpha;
        synchronized (uVar) {
            uVar.alpha.alpha(cls, cls2, sVar);
            ((HashMap) uVar.bravo.purple).clear();
        }
    }

    public final void delta(String str, Class cls, Class cls2, E3.k kVar) {
        o oVar = this.charlie;
        synchronized (oVar) {
            oVar.victor(str).add(new T3.d(cls, cls2, kVar));
        }
    }

    public final ArrayList echo(Class cls, Class cls2, Class cls3) {
        ArrayList arrayList;
        boolean z2;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = this.charlie.xray(cls, cls2).iterator();
        while (it.hasNext()) {
            Class cls4 = (Class) it.next();
            Iterator it2 = this.foxtrot.echo(cls4, cls3).iterator();
            while (it2.hasNext()) {
                Class cls5 = (Class) it2.next();
                o oVar = this.charlie;
                synchronized (oVar) {
                    arrayList = new ArrayList();
                    Iterator it3 = ((ArrayList) oVar.purple).iterator();
                    while (it3.hasNext()) {
                        List<T3.d> list = (List) ((HashMap) oVar.red).get((String) it3.next());
                        if (list != null) {
                            for (T3.d dVar : list) {
                                if (dVar.alpha.isAssignableFrom(cls) && cls4.isAssignableFrom(dVar.bravo)) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (z2) {
                                    arrayList.add(dVar.charlie);
                                }
                            }
                        }
                    }
                }
                arrayList2.add(new com.bumptech.glide.load.engine.j(cls, cls4, cls5, arrayList, this.foxtrot.charlie(cls4, cls5), this.juliet));
            }
        }
        return arrayList2;
    }

    public final ArrayList foxtrot() {
        ArrayList arrayList;
        T3.b bVar = this.golf;
        synchronized (bVar) {
            arrayList = bVar.alpha;
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        throw new Registry$MissingComponentException() { // from class: com.bumptech.glide.Registry$NoImageHeaderParserException
        };
    }

    public final List golf(Object obj) {
        List list;
        u uVar = this.alpha;
        uVar.getClass();
        Class<?> cls = obj.getClass();
        synchronized (uVar) {
            J3.t tVar = (J3.t) ((HashMap) uVar.bravo.purple).get(cls);
            if (tVar == null) {
                list = null;
            } else {
                list = tVar.alpha;
            }
            if (list == null) {
                list = Collections.unmodifiableList(uVar.alpha.charlie(cls));
                if (((J3.t) ((HashMap) uVar.bravo.purple).put(cls, new J3.t(list))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (!list.isEmpty()) {
            int size = list.size();
            List list2 = Collections.EMPTY_LIST;
            boolean z2 = true;
            for (int i4 = 0; i4 < size; i4++) {
                r rVar = (r) list.get(i4);
                if (rVar.bravo(obj)) {
                    if (z2) {
                        list2 = new ArrayList(size - i4);
                        z2 = false;
                    }
                    list2.add(rVar);
                }
            }
            if (!list2.isEmpty()) {
                return list2;
            }
            throw new Registry$NoModelLoaderAvailableException(obj, (List<r>) list);
        }
        throw new Registry$NoModelLoaderAvailableException(obj);
    }

    public final com.bumptech.glide.load.data.g hotel(Object obj) {
        com.bumptech.glide.load.data.g bravo;
        com.bumptech.glide.load.data.h hVar = this.echo;
        synchronized (hVar) {
            try {
                Y3.f.bravo(obj);
                com.bumptech.glide.load.data.f fVar = (com.bumptech.glide.load.data.f) ((HashMap) hVar.purple).get(obj.getClass());
                if (fVar == null) {
                    Iterator it = ((HashMap) hVar.purple).values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        com.bumptech.glide.load.data.f fVar2 = (com.bumptech.glide.load.data.f) it.next();
                        if (fVar2.alpha().isAssignableFrom(obj.getClass())) {
                            fVar = fVar2;
                            break;
                        }
                    }
                }
                if (fVar == null) {
                    fVar = com.bumptech.glide.load.data.h.red;
                }
                bravo = fVar.bravo(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        return bravo;
    }

    public final void india(E3.e eVar) {
        T3.b bVar = this.golf;
        synchronized (bVar) {
            bVar.alpha.add(eVar);
        }
    }

    public final void juliet(com.bumptech.glide.load.data.f fVar) {
        com.bumptech.glide.load.data.h hVar = this.echo;
        synchronized (hVar) {
            ((HashMap) hVar.purple).put(fVar.alpha(), fVar);
        }
    }

    public final void kilo(Class cls, Class cls2, Q3.a aVar) {
        Q3.c cVar = this.foxtrot;
        synchronized (cVar) {
            cVar.alpha.add(new Q3.b(cls, cls2, aVar));
        }
    }
}
