package I7;

import android.util.Log;
import ao.ad;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import com.google.firebase.components.MissingDependencyException;
import f8.InterfaceC1696b;
import f8.InterfaceC1697c;
import i8.InterfaceC1904b;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import s6.E5;
import s6.F5;

/* loaded from: classes2.dex */
public final class g implements c {

    /* renamed from: a, reason: collision with root package name */
    public static final E8.h f1418a = new E8.h(1);
    public final k teal;
    public final f yellow;
    public final HashMap alpha = new HashMap();
    public final HashMap purple = new HashMap();
    public final HashMap red = new HashMap();
    public final HashSet silver = new HashSet();
    public final AtomicReference white = new AtomicReference();

    public g(Executor executor, ArrayList arrayList, ArrayList arrayList2, f fVar) {
        k kVar = new k(executor);
        this.teal = kVar;
        this.yellow = fVar;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(b.charlie(kVar, k.class, InterfaceC1697c.class, InterfaceC1696b.class));
        arrayList3.add(b.charlie(this, g.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar != null) {
                arrayList3.add(bVar);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next());
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((InterfaceC1904b) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.yellow.bravo(componentRegistrar));
                        it3.remove();
                    }
                } catch (InvalidRegistrarException e) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                Object[] array = ((b) it4.next()).bravo.toArray();
                int length = array.length;
                int i4 = 0;
                while (true) {
                    if (i4 < length) {
                        Object obj = array[i4];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.silver.contains(obj.toString())) {
                                it4.remove();
                                break;
                            }
                            this.silver.add(obj.toString());
                        }
                        i4++;
                    }
                }
            }
            if (this.alpha.isEmpty()) {
                E5.delta(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.alpha.keySet());
                arrayList6.addAll(arrayList3);
                E5.delta(arrayList6);
            }
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                b bVar2 = (b) it5.next();
                this.alpha.put(bVar2, new l(new B7.c(1, this, bVar2)));
            }
            arrayList5.addAll(echo(arrayList3));
            arrayList5.addAll(golf());
            delta();
        }
        Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            ((Runnable) it6.next()).run();
        }
        Boolean bool = (Boolean) this.white.get();
        if (bool != null) {
            alpha(this.alpha, bool.booleanValue());
        }
    }

    public final void alpha(HashMap hashMap, boolean z2) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : hashMap.entrySet()) {
            b bVar = (b) entry.getKey();
            InterfaceC1904b interfaceC1904b = (InterfaceC1904b) entry.getValue();
            int i4 = bVar.delta;
            if (i4 == 1 || (i4 == 2 && z2)) {
                interfaceC1904b.get();
            }
        }
        k kVar = this.teal;
        synchronized (kVar) {
            arrayDeque = kVar.bravo;
            if (arrayDeque != null) {
                kVar.bravo = null;
            } else {
                arrayDeque = null;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                throw ad.yankee(it);
            }
        }
    }

    public final void bravo(boolean z2) {
        HashMap hashMap;
        AtomicReference atomicReference = this.white;
        Boolean valueOf = Boolean.valueOf(z2);
        while (!atomicReference.compareAndSet(null, valueOf)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        synchronized (this) {
            hashMap = new HashMap(this.alpha);
        }
        alpha(hashMap, z2);
    }

    @Override // I7.c
    public final Object charlie(Class cls) {
        return oscar(p.alpha(cls));
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, I7.m] */
    public final void delta() {
        boolean z2;
        for (b bVar : this.alpha.keySet()) {
            for (j jVar : bVar.charlie) {
                if (jVar.bravo == 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                p pVar = jVar.alpha;
                if (z2) {
                    HashMap hashMap = this.red;
                    if (!hashMap.containsKey(pVar)) {
                        Set set = Collections.EMPTY_SET;
                        ?? obj = new Object();
                        obj.bravo = null;
                        obj.alpha = Collections.newSetFromMap(new ConcurrentHashMap());
                        obj.alpha.addAll(set);
                        hashMap.put(pVar, obj);
                    }
                }
                HashMap hashMap2 = this.purple;
                if (hashMap2.containsKey(pVar)) {
                    continue;
                } else {
                    int i4 = jVar.bravo;
                    if (i4 != 1) {
                        if (i4 != 2) {
                            hashMap2.put(pVar, new n(n.charlie, n.delta));
                        }
                    } else {
                        throw new MissingDependencyException("Unsatisfied dependency for component " + bVar + ": " + pVar);
                    }
                }
            }
        }
    }

    public final ArrayList echo(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.echo == 0) {
                InterfaceC1904b interfaceC1904b = (InterfaceC1904b) this.alpha.get(bVar);
                for (p pVar : bVar.bravo) {
                    HashMap hashMap = this.purple;
                    if (!hashMap.containsKey(pVar)) {
                        hashMap.put(pVar, interfaceC1904b);
                    } else {
                        arrayList2.add(new A8.g(5, (n) ((InterfaceC1904b) hashMap.get(pVar)), interfaceC1904b));
                    }
                }
            }
        }
        return arrayList2;
    }

    @Override // I7.c
    public final Set foxtrot(p pVar) {
        InterfaceC1904b interfaceC1904b;
        synchronized (this) {
            interfaceC1904b = (m) this.red.get(pVar);
            if (interfaceC1904b == null) {
                interfaceC1904b = f1418a;
            }
        }
        return (Set) interfaceC1904b.get();
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, I7.m] */
    public final ArrayList golf() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.alpha.entrySet()) {
            b bVar = (b) entry.getKey();
            if (bVar.echo != 0) {
                InterfaceC1904b interfaceC1904b = (InterfaceC1904b) entry.getValue();
                for (p pVar : bVar.bravo) {
                    if (!hashMap.containsKey(pVar)) {
                        hashMap.put(pVar, new HashSet());
                    }
                    ((Set) hashMap.get(pVar)).add(interfaceC1904b);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            Object key = entry2.getKey();
            HashMap hashMap2 = this.red;
            if (!hashMap2.containsKey(key)) {
                p pVar2 = (p) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                ?? obj = new Object();
                obj.bravo = null;
                obj.alpha = Collections.newSetFromMap(new ConcurrentHashMap());
                obj.alpha.addAll(set);
                hashMap2.put(pVar2, obj);
            } else {
                m mVar = (m) hashMap2.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new A8.g(6, mVar, (InterfaceC1904b) it.next()));
                }
            }
        }
        return arrayList;
    }

    @Override // I7.c
    public final n hotel(p pVar) {
        InterfaceC1904b mike = mike(pVar);
        if (mike == null) {
            return new n(n.charlie, n.delta);
        }
        if (mike instanceof n) {
            return (n) mike;
        }
        return new n(null, mike);
    }

    @Override // I7.c
    public final InterfaceC1904b india(Class cls) {
        return mike(p.alpha(cls));
    }

    @Override // I7.c
    public final synchronized InterfaceC1904b mike(p pVar) {
        F5.bravo(pVar, "Null interface requested.");
        return (InterfaceC1904b) this.purple.get(pVar);
    }

    @Override // I7.c
    public final Object oscar(p pVar) {
        InterfaceC1904b mike = mike(pVar);
        if (mike == null) {
            return null;
        }
        return mike.get();
    }
}
