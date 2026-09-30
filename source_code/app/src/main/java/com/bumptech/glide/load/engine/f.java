package com.bumptech.glide.load.engine;

import Oe.ah;
import androidx.appcompat.widget.P0;
import com.bumptech.glide.Registry$MissingComponentException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class f {
    public final ArrayList alpha = new ArrayList();
    public final ArrayList bravo = new ArrayList();
    public com.bumptech.glide.f charlie;
    public Object delta;
    public int echo;
    public int foxtrot;
    public Class golf;
    public com.google.android.gms.common.f hotel;
    public E3.i india;
    public Y3.c juliet;
    public Class kilo;
    public boolean lima;
    public boolean mike;
    public E3.f november;
    public com.bumptech.glide.g oscar;
    public k papa;
    public boolean quebec;
    public boolean romeo;

    public final ArrayList alpha() {
        boolean z2 = this.mike;
        ArrayList arrayList = this.bravo;
        if (!z2) {
            this.mike = true;
            arrayList.clear();
            ArrayList bravo = bravo();
            int size = bravo.size();
            for (int i4 = 0; i4 < size; i4++) {
                J3.q qVar = (J3.q) bravo.get(i4);
                if (!arrayList.contains(qVar.alpha)) {
                    arrayList.add(qVar.alpha);
                }
                int i5 = 0;
                while (true) {
                    List list = qVar.bravo;
                    if (i5 < list.size()) {
                        if (!arrayList.contains(list.get(i5))) {
                            arrayList.add(list.get(i5));
                        }
                        i5++;
                    }
                }
            }
        }
        return arrayList;
    }

    public final ArrayList bravo() {
        boolean z2 = this.lima;
        ArrayList arrayList = this.alpha;
        if (!z2) {
            this.lima = true;
            arrayList.clear();
            List golf = this.charlie.bravo().golf(this.delta);
            int size = golf.size();
            for (int i4 = 0; i4 < size; i4++) {
                J3.q alpha = ((J3.r) golf.get(i4)).alpha(this.delta, this.echo, this.foxtrot, this.india);
                if (alpha != null) {
                    arrayList.add(alpha);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final u charlie(Class cls) {
        u uVar;
        Class cls2;
        com.bumptech.glide.h bravo = this.charlie.bravo();
        Class cls3 = this.golf;
        Class cls4 = this.kilo;
        T3.c cVar = bravo.india;
        Y3.j jVar = (Y3.j) cVar.bravo.getAndSet(null);
        Y3.j jVar2 = jVar;
        if (jVar == null) {
            jVar2 = new Object();
        }
        jVar2.alpha = cls;
        jVar2.bravo = cls3;
        jVar2.charlie = cls4;
        synchronized (cVar.alpha) {
            uVar = (u) cVar.alpha.get(jVar2);
        }
        cVar.bravo.set(jVar2);
        bravo.india.getClass();
        if (T3.c.charlie.equals(uVar)) {
            return null;
        }
        if (uVar == null) {
            u uVar2 = null;
            ArrayList echo = bravo.echo(cls, cls3, cls4);
            if (echo.isEmpty()) {
                cls2 = cls;
            } else {
                cls2 = cls;
                uVar2 = new u(cls2, cls3, cls4, echo, bravo.juliet);
            }
            u uVar3 = uVar2;
            bravo.india.alpha(cls2, cls3, cls4, uVar3);
            return uVar3;
        }
        return uVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        r1 = r3.bravo;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final E3.c delta(Object obj) {
        E3.c cVar;
        Q3.c cVar2 = this.charlie.bravo().bravo;
        Class<?> cls = obj.getClass();
        synchronized (cVar2) {
            Iterator it = cVar2.alpha.iterator();
            while (true) {
                if (it.hasNext()) {
                    T3.a aVar = (T3.a) it.next();
                    if (aVar.alpha.isAssignableFrom(cls)) {
                        break;
                    }
                } else {
                    cVar = null;
                    break;
                }
            }
        }
        if (cVar != null) {
            return cVar;
        }
        final Class<?> cls2 = obj.getClass();
        throw new Registry$MissingComponentException(cls2) { // from class: com.bumptech.glide.Registry$NoSourceEncoderAvailableException
            {
                super(P0.blue(cls2, "Failed to find source encoder for data class: "));
            }
        };
    }

    public final E3.m echo(Class cls) {
        E3.m mVar = (E3.m) this.juliet.get(cls);
        if (mVar == null) {
            Iterator it = ((ah) this.juliet.entrySet()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    mVar = (E3.m) entry.getValue();
                    break;
                }
            }
        }
        if (mVar == null) {
            if (this.juliet.isEmpty() && this.quebec) {
                throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
            }
            return L3.c.bravo;
        }
        return mVar;
    }
}
