package Dd;

import Af.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import s6.F4;

/* loaded from: classes2.dex */
public abstract class e {
    public final ArrayList alpha;
    public int bravo;
    public boolean charlie;
    public t delta;

    @NotNull
    private volatile /* synthetic */ Object interceptors$delegate;

    public e(t... tVarArr) {
        new zd.i();
        this.alpha = CollectionsKt.white(Arrays.copyOf(tVarArr, tVarArr.length));
        this.interceptors$delegate = null;
    }

    public final Object alpha(Object context, Object subject, Pd.c cVar) {
        f bVar;
        d dVar;
        int ivory;
        d dVar2;
        Nd.h coroutineContext = cVar.getContext();
        if (((List) this.interceptors$delegate) == null) {
            int i4 = this.bravo;
            if (i4 == 0) {
                this.interceptors$delegate = CollectionsKt.emptyList();
                this.charlie = false;
                this.delta = null;
                CollectionsKt.emptyList();
            } else {
                ArrayList arrayList = this.alpha;
                if (i4 == 1 && (ivory = CollectionsKt.ivory(arrayList)) >= 0) {
                    int i5 = 0;
                    while (true) {
                        Object obj = arrayList.get(i5);
                        if (obj instanceof d) {
                            dVar2 = (d) obj;
                        } else {
                            dVar2 = null;
                        }
                        if (dVar2 != null && !dVar2.charlie.isEmpty()) {
                            List list = dVar2.charlie;
                            dVar2.delta = true;
                            this.interceptors$delegate = list;
                            this.charlie = false;
                            this.delta = dVar2.alpha;
                            break;
                        }
                        if (i5 == ivory) {
                            break;
                        }
                        i5++;
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                int ivory2 = CollectionsKt.ivory(arrayList);
                if (ivory2 >= 0) {
                    int i10 = 0;
                    while (true) {
                        Object obj2 = arrayList.get(i10);
                        if (obj2 instanceof d) {
                            dVar = (d) obj2;
                        } else {
                            dVar = null;
                        }
                        if (dVar != null) {
                            List list2 = dVar.charlie;
                            arrayList2.ensureCapacity(list2.size() + arrayList2.size());
                            int size = list2.size();
                            for (int i11 = 0; i11 < size; i11++) {
                                arrayList2.add(list2.get(i11));
                            }
                        }
                        if (i10 == ivory2) {
                            break;
                        }
                        i10++;
                    }
                }
                this.interceptors$delegate = arrayList2;
                this.charlie = false;
                this.delta = null;
            }
        }
        this.charlie = true;
        List interceptors = (List) this.interceptors$delegate;
        Intrinsics.checkNotNull(interceptors);
        boolean delta = delta();
        Intrinsics.echo(context, "context");
        Intrinsics.echo(interceptors, "interceptors");
        Intrinsics.echo(subject, "subject");
        Intrinsics.echo(coroutineContext, "coroutineContext");
        if (!g.alpha && !delta) {
            bVar = new m(subject, context, interceptors);
        } else {
            bVar = new b(context, interceptors, subject, coroutineContext);
        }
        return bVar.alpha(subject, cVar);
    }

    public final d bravo(t tVar) {
        ArrayList arrayList = this.alpha;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            Object obj = arrayList.get(i4);
            if (obj == tVar) {
                d dVar = new d(tVar, j.alpha);
                arrayList.set(i4, dVar);
                return dVar;
            }
            if (obj instanceof d) {
                d dVar2 = (d) obj;
                if (dVar2.alpha == tVar) {
                    return dVar2;
                }
            }
        }
        return null;
    }

    public final int charlie(t tVar) {
        ArrayList arrayList = this.alpha;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            Object obj = arrayList.get(i4);
            if (obj == tVar || ((obj instanceof d) && ((d) obj).alpha == tVar)) {
                return i4;
            }
        }
        return -1;
    }

    public abstract boolean delta();

    public final boolean echo(t tVar) {
        ArrayList arrayList = this.alpha;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            Object obj = arrayList.get(i4);
            if (obj != tVar) {
                if ((obj instanceof d) && ((d) obj).alpha == tVar) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public final void foxtrot(t reference, t tVar) {
        d dVar;
        F4 f42;
        t tVar2;
        Intrinsics.echo(reference, "reference");
        if (echo(tVar)) {
            return;
        }
        int charlie = charlie(reference);
        if (charlie != -1) {
            int i4 = charlie + 1;
            ArrayList arrayList = this.alpha;
            int ivory = CollectionsKt.ivory(arrayList);
            if (i4 <= ivory) {
                while (true) {
                    Object obj = arrayList.get(i4);
                    h hVar = null;
                    if (obj instanceof d) {
                        dVar = (d) obj;
                    } else {
                        dVar = null;
                    }
                    if (dVar != null && (f42 = dVar.bravo) != null) {
                        if (f42 instanceof h) {
                            hVar = (h) f42;
                        }
                        if (hVar != null && (tVar2 = hVar.alpha) != null && Intrinsics.areEqual(tVar2, reference)) {
                            charlie = i4;
                        }
                        if (i4 == ivory) {
                            break;
                        } else {
                            i4++;
                        }
                    } else {
                        break;
                    }
                }
            }
            arrayList.add(charlie + 1, new d(tVar, new h(reference)));
            return;
        }
        throw new c("Phase " + reference + " was not registered for this pipeline");
    }

    public final void golf(t phase, Xd.m mVar) {
        Intrinsics.echo(phase, "phase");
        d bravo = bravo(phase);
        if (bravo != null) {
            List list = (List) this.interceptors$delegate;
            if (!this.alpha.isEmpty() && list != null && !this.charlie && (!(list instanceof Yd.a) || (list instanceof Yd.c))) {
                if (Intrinsics.areEqual(this.delta, phase)) {
                    list.add(mVar);
                } else if (Intrinsics.areEqual(phase, CollectionsKt.ochre(this.alpha)) || charlie(phase) == CollectionsKt.ivory(this.alpha)) {
                    d bravo2 = bravo(phase);
                    Intrinsics.checkNotNull(bravo2);
                    if (bravo2.delta) {
                        bravo2.charlie = CollectionsKt.B(bravo2.charlie);
                        bravo2.delta = false;
                    }
                    bravo2.charlie.add(mVar);
                    list.add(mVar);
                }
                this.bravo++;
                return;
            }
            if (bravo.delta) {
                bravo.charlie = CollectionsKt.B(bravo.charlie);
                bravo.delta = false;
            }
            bravo.charlie.add(mVar);
            this.bravo++;
            this.interceptors$delegate = null;
            this.charlie = false;
            this.delta = null;
            return;
        }
        throw new c("Phase " + phase + " was not registered for this pipeline");
    }
}
