package S2;

import A2.ao;
import android.content.Context;
import android.util.ArrayMap;
import android.view.Surface;
import androidx.camera.core.ai;
import androidx.camera.core.aj;
import androidx.camera.core.impl.AbstractC0512j;
import androidx.camera.core.impl.B;
import androidx.camera.core.impl.C0505c;
import androidx.camera.core.impl.InterfaceC0519q;
import androidx.camera.core.impl.V;
import androidx.camera.core.impl.ad;
import androidx.camera.core.impl.af;
import androidx.camera.core.impl.aq;
import androidx.camera.core.impl.ar;
import androidx.camera.core.impl.aw;
import androidx.camera.core.impl.ay;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.ResultKt;

/* loaded from: classes3.dex */
public final class l implements ar {
    public int alpha;
    public boolean purple;
    public final Object red;
    public Object silver;
    public final Object teal;
    public Object white;
    public Object yellow;

    public l(X2.h hVar, List list, int i4, X2.h hVar2, Y2.h hVar3, M2.c cVar, boolean z2) {
        this.red = hVar;
        this.teal = list;
        this.alpha = i4;
        this.silver = hVar2;
        this.white = hVar3;
        this.yellow = cVar;
        this.purple = z2;
    }

    @Override // androidx.camera.core.impl.ar
    public int alpha() {
        int alpha;
        synchronized (this.red) {
            alpha = ((ar) this.silver).alpha();
        }
        return alpha;
    }

    @Override // androidx.camera.core.impl.ar
    public int bravo() {
        int bravo;
        synchronized (this.red) {
            bravo = ((ar) this.silver).bravo();
        }
        return bravo;
    }

    public void charlie(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            delta((AbstractC0512j) it.next());
        }
    }

    @Override // androidx.camera.core.impl.ar
    public void close() {
        synchronized (this.red) {
            try {
                Surface surface = (Surface) this.teal;
                if (surface != null) {
                    surface.release();
                }
                ((ar) this.silver).close();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void delta(AbstractC0512j abstractC0512j) {
        ArrayList arrayList = (ArrayList) this.teal;
        if (arrayList.contains(abstractC0512j)) {
            return;
        }
        arrayList.add(abstractC0512j);
    }

    public void echo(af afVar) {
        for (C0505c c0505c : afVar.romeo()) {
            aw awVar = (aw) this.silver;
            awVar.getClass();
            try {
                awVar.quebec(c0505c);
            } catch (IllegalArgumentException unused) {
            }
            ((aw) this.silver).foxtrot(c0505c, afVar.pink(c0505c), afVar.quebec(c0505c));
        }
    }

    @Override // androidx.camera.core.impl.ar
    public androidx.camera.core.ar foxtrot() {
        aj ajVar;
        synchronized (this.red) {
            androidx.camera.core.ar foxtrot = ((ar) this.silver).foxtrot();
            if (foxtrot != null) {
                this.alpha++;
                ajVar = new aj(foxtrot);
                ajVar.charlie((ai) this.yellow);
            } else {
                ajVar = null;
            }
        }
        return ajVar;
    }

    @Override // androidx.camera.core.impl.ar
    public int golf() {
        int golf;
        synchronized (this.red) {
            golf = ((ar) this.silver).golf();
        }
        return golf;
    }

    public ad hotel() {
        ArrayList arrayList = new ArrayList((HashSet) this.red);
        B alpha = B.alpha((aw) this.silver);
        int i4 = this.alpha;
        ArrayList arrayList2 = new ArrayList((ArrayList) this.teal);
        boolean z2 = this.purple;
        V v4 = V.bravo;
        ArrayMap arrayMap = new ArrayMap();
        ay ayVar = (ay) this.white;
        for (String str : ayVar.alpha.keySet()) {
            arrayMap.put(str, ayVar.alpha.get(str));
        }
        return new ad(arrayList, alpha, i4, arrayList2, z2, new V(arrayMap), (InterfaceC0519q) this.yellow);
    }

    public void india(X2.h hVar, j jVar) {
        Context context = hVar.alpha;
        X2.h hVar2 = (X2.h) this.red;
        if (context == hVar2.alpha) {
            if (hVar.bravo != X2.j.alpha) {
                if (hVar.charlie == hVar2.charlie) {
                    if (hVar.uniform == hVar2.uniform) {
                        if (hVar.victor == hVar2.victor) {
                            return;
                        }
                        throw new IllegalStateException(("Interceptor '" + jVar + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
                    }
                    throw new IllegalStateException(("Interceptor '" + jVar + "' cannot modify the request's lifecycle.").toString());
                }
                throw new IllegalStateException(("Interceptor '" + jVar + "' cannot modify the request's target.").toString());
            }
            throw new IllegalStateException(("Interceptor '" + jVar + "' cannot set the request's data to null.").toString());
        }
        throw new IllegalStateException(("Interceptor '" + jVar + "' cannot modify the request's context.").toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object juliet(X2.h hVar, Pd.c cVar) {
        k kVar;
        int i4;
        l lVar;
        j jVar;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i5 = kVar.teal;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                kVar.teal = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = kVar.red;
                Od.a aVar = Od.a.alpha;
                i4 = kVar.teal;
                if (i4 == 0) {
                    if (i4 == 1) {
                        j jVar2 = kVar.purple;
                        l lVar2 = kVar.alpha;
                        ResultKt.alpha(obj);
                        lVar = lVar2;
                        jVar = jVar2;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    List list = (List) this.teal;
                    int i10 = this.alpha;
                    if (i10 > 0) {
                        india(hVar, (j) list.get(i10 - 1));
                    }
                    j jVar3 = (j) list.get(i10);
                    l lVar3 = new l((X2.h) this.red, (List) this.teal, i10 + 1, hVar, (Y2.h) this.white, (M2.c) this.yellow, this.purple);
                    kVar.alpha = this;
                    kVar.purple = jVar3;
                    kVar.teal = 1;
                    i iVar = (i) jVar3;
                    obj = iVar.delta(lVar3, kVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                    lVar = this;
                    jVar = iVar;
                }
                X2.i iVar2 = (X2.i) obj;
                lVar.india(iVar2.bravo(), jVar);
                return iVar2;
            }
        }
        kVar = new k(this, cVar);
        Object obj2 = kVar.red;
        Od.a aVar2 = Od.a.alpha;
        i4 = kVar.teal;
        if (i4 == 0) {
        }
        X2.i iVar22 = (X2.i) obj2;
        lVar.india(iVar22.bravo(), jVar);
        return iVar22;
    }

    public void kilo() {
        synchronized (this.red) {
            try {
                this.purple = true;
                ((ar) this.silver).lima();
                if (this.alpha == 0) {
                    close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.impl.ar
    public void lima() {
        synchronized (this.red) {
            ((ar) this.silver).lima();
        }
    }

    @Override // androidx.camera.core.impl.ar
    public Surface romeo() {
        Surface romeo;
        synchronized (this.red) {
            romeo = ((ar) this.silver).romeo();
        }
        return romeo;
    }

    @Override // androidx.camera.core.impl.ar
    public int uniform() {
        int uniform;
        synchronized (this.red) {
            uniform = ((ar) this.silver).uniform();
        }
        return uniform;
    }

    @Override // androidx.camera.core.impl.ar
    public androidx.camera.core.ar victor() {
        aj ajVar;
        synchronized (this.red) {
            androidx.camera.core.ar victor = ((ar) this.silver).victor();
            if (victor != null) {
                this.alpha++;
                ajVar = new aj(victor);
                ajVar.charlie((ai) this.yellow);
            } else {
                ajVar = null;
            }
        }
        return ajVar;
    }

    @Override // androidx.camera.core.impl.ar
    public void yankee(aq aqVar, Executor executor) {
        synchronized (this.red) {
            ((ar) this.silver).yankee(new ao(13, this, aqVar), executor);
        }
    }

    public l(ar arVar) {
        this.red = new Object();
        this.alpha = 0;
        this.purple = false;
        this.yellow = new ai(1, this);
        this.silver = arVar;
        this.teal = arVar.romeo();
    }

    public l() {
        this.red = new HashSet();
        this.silver = aw.bravo();
        this.alpha = -1;
        this.teal = new ArrayList();
        this.purple = false;
        this.white = ay.alpha();
    }

    public l(ad adVar) {
        HashSet hashSet = new HashSet();
        this.red = hashSet;
        this.silver = aw.bravo();
        this.alpha = -1;
        ArrayList arrayList = new ArrayList();
        this.teal = arrayList;
        this.purple = false;
        this.white = ay.alpha();
        hashSet.addAll(adVar.alpha);
        this.silver = aw.delta(adVar.bravo);
        this.alpha = adVar.charlie;
        arrayList.addAll(adVar.delta);
        this.purple = adVar.echo;
        ArrayMap arrayMap = new ArrayMap();
        V v4 = adVar.foxtrot;
        for (String str : v4.alpha.keySet()) {
            arrayMap.put(str, v4.alpha.get(str));
        }
        this.white = new V(arrayMap);
    }
}
