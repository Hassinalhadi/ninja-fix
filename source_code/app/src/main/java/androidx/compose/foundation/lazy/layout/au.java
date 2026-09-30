package androidx.compose.foundation.lazy.layout;

import android.os.Trace;
import g.AbstractC1719b;
import id.C1915c;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import q0.C2379O;
import q0.InterfaceC2377M;
import s6.AbstractC2788u7;

/* loaded from: classes3.dex */
public final class au implements ag, av, ah {
    public final int alpha;
    public final C1915c bravo;
    public final Function1 charlie;
    public Q0.a delta;
    public InterfaceC2377M echo;
    public boolean foxtrot;
    public boolean golf;
    public boolean hotel;
    public Object india;
    public boolean juliet;
    public at kilo;
    public boolean lima;
    public long mike;
    public long november;
    public long oscar = kotlin.time.j.alpha();
    public final /* synthetic */ C3.d papa;

    public au(C3.d dVar, int i4, C1915c c1915c, Function1 function1) {
        this.papa = dVar;
        this.alpha = i4;
        this.bravo = c1915c;
        this.charlie = function1;
    }

    @Override // androidx.compose.foundation.lazy.layout.ag
    public final void alpha() {
        this.lima = true;
    }

    public final void bravo() {
        InterfaceC2377M interfaceC2377M = this.echo;
        if (interfaceC2377M != null) {
            interfaceC2377M.dispose();
        }
        this.echo = null;
        this.kilo = null;
    }

    @Override // androidx.compose.foundation.lazy.layout.ag
    public final void cancel() {
        if (!this.golf) {
            this.golf = true;
            bravo();
        }
    }

    public final boolean charlie(androidx.appcompat.app.am amVar) {
        boolean delta;
        if (!this.papa.alpha) {
            return false;
        }
        if (this.lima) {
            Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                delta = delta(amVar);
            } finally {
                Trace.endSection();
            }
        } else {
            delta = delta(amVar);
        }
        AbstractC2788u7.alpha(-1L, "compose:lazy:prefetch:execute:item");
        return delta;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0156, code lost:
    
        if (echo() == false) goto L141;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4, types: [androidx.compose.foundation.lazy.layout.b, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean delta(androidx.appcompat.app.am amVar) {
        int i4;
        Q0.a aVar;
        au auVar;
        List list;
        q0.ak akVar;
        int i5 = this.alpha;
        long j5 = i5;
        AbstractC2788u7.alpha(j5, "compose:lazy:prefetch:execute:item");
        C3.d dVar = this.papa;
        w wVar = (w) ((u) dVar.red).bravo.invoke();
        if (!this.golf) {
            int itemCount = wVar.getItemCount();
            if (i5 >= 0 && i5 < itemCount) {
                Object alpha = wVar.alpha(i5);
                Object obj = this.india;
                if (obj != null && !Intrinsics.areEqual(alpha, obj)) {
                    bravo();
                    return false;
                }
                Object bravo = wVar.bravo(i5);
                C1915c c1915c = this.bravo;
                C0561b c0561b = (C0561b) c1915c.silver;
                if (c1915c.red != bravo || c0561b == null) {
                    bv.al alVar = (bv.al) c1915c.purple;
                    Object golf = alVar.golf(bravo);
                    Object obj2 = golf;
                    if (golf == null) {
                        ?? obj3 = new Object();
                        obj3.delta = -1;
                        alVar.mike(bravo, obj3);
                        obj2 = obj3;
                    }
                    c0561b = (C0561b) obj2;
                    c1915c.red = bravo;
                    c1915c.silver = c0561b;
                }
                echo();
                long alpha2 = amVar.alpha();
                this.mike = alpha2;
                this.oscar = kotlin.time.j.alpha();
                this.november = 0L;
                AbstractC2788u7.alpha(alpha2, "compose:lazy:prefetch:available_time_nanos");
                if (!echo()) {
                    if (hotel(this.mike, c0561b.alpha)) {
                        Trace.beginSection("compose:lazy:prefetch:compose");
                        try {
                            if (this.echo != null) {
                                AbstractC1719b.alpha("Request was already composed!");
                            }
                            Xd.l alpha3 = ((u) dVar.red).alpha(i5, alpha, bravo);
                            this.india = alpha;
                            q0.al alpha4 = ((C2379O) dVar.purple).alpha();
                            s0.al alVar2 = alpha4.alpha;
                            if (alVar2.cyan()) {
                                alpha4.echo();
                                if (!alpha4.yellow.charlie(alpha)) {
                                    alpha4.e.kilo(alpha);
                                    bv.al alVar3 = alpha4.f13152c;
                                    Object golf2 = alVar3.golf(alpha);
                                    if (golf2 == null) {
                                        golf2 = alpha4.india(alpha);
                                        if (golf2 != null) {
                                            int kilo = ((J.e) ((J.b) alVar2.papa()).purple).kilo(golf2);
                                            int i10 = ((J.e) ((J.b) alVar2.papa()).purple).red;
                                            alVar2.f13290i = true;
                                            alVar2.gray(kilo, i10, 1);
                                            alVar2.f13290i = false;
                                            alpha4.f13156h++;
                                        } else {
                                            int i11 = ((J.e) ((J.b) alVar2.papa()).purple).red;
                                            s0.al alVar4 = new s0.al(2);
                                            alVar2.f13290i = true;
                                            alVar2.azure(i11, alVar4);
                                            alVar2.f13290i = false;
                                            alpha4.f13156h++;
                                            golf2 = alVar4;
                                        }
                                        alVar3.mike(alpha, golf2);
                                    }
                                    alpha4.hotel((s0.al) golf2, alpha, false, alpha3);
                                }
                            }
                            if (!alVar2.cyan()) {
                                akVar = new Object();
                            } else {
                                akVar = new q0.ak(alpha4, alpha);
                            }
                            this.echo = akVar;
                            this.hotel = true;
                            Trace.endSection();
                            india();
                            c0561b.alpha = C0561b.alpha(this.november, c0561b.alpha);
                        } finally {
                        }
                    }
                }
                if (!this.juliet) {
                    if (this.mike > 0) {
                        Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                        try {
                            this.kilo = golf();
                            this.juliet = true;
                        } finally {
                        }
                    }
                    return true;
                }
                at atVar = this.kilo;
                if (atVar != null) {
                    int i12 = c0561b.delta;
                    boolean z2 = this.lima;
                    List[] listArr = atVar.bravo;
                    int i13 = atVar.charlie;
                    List list2 = atVar.alpha;
                    if (i13 < list2.size()) {
                        if (atVar.foxtrot.golf) {
                            AbstractC1719b.charlie("Should not execute nested prefetch on canceled request");
                        }
                        Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                        try {
                            int size = list2.size();
                            for (int i14 = 0; i14 < size; i14++) {
                                ((ai) list2.get(i14)).delta = i12;
                            }
                            Trace.endSection();
                            Trace.beginSection("compose:lazy:prefetch:nested");
                            while (atVar.charlie < list2.size()) {
                                try {
                                    if (listArr[atVar.charlie] == null) {
                                        if (amVar.alpha() <= 0) {
                                            return true;
                                        }
                                        int i15 = atVar.charlie;
                                        ai aiVar = (ai) list2.get(i15);
                                        Function1 function1 = aiVar.alpha;
                                        if (function1 == null) {
                                            list = CollectionsKt.emptyList();
                                        } else {
                                            af afVar = new af(aiVar, aiVar.delta);
                                            function1.invoke(afVar);
                                            ArrayList arrayList = afVar.bravo;
                                            aiVar.foxtrot = arrayList.size();
                                            list = arrayList;
                                        }
                                        listArr[i15] = list;
                                    }
                                    List list3 = listArr[atVar.charlie];
                                    Intrinsics.checkNotNull(list3);
                                    while (atVar.delta < list3.size()) {
                                        av avVar = (av) list3.get(atVar.delta);
                                        if (z2) {
                                            if (avVar instanceof au) {
                                                auVar = (au) avVar;
                                            } else {
                                                auVar = null;
                                            }
                                            if (auVar != null) {
                                                auVar.lima = true;
                                            }
                                        }
                                        atVar.echo = true;
                                        if (((au) avVar).charlie(amVar)) {
                                            return true;
                                        }
                                        atVar.delta++;
                                    }
                                    atVar.delta = 0;
                                    atVar.charlie++;
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        } finally {
                        }
                    }
                }
                at atVar2 = this.kilo;
                if (atVar2 != null && atVar2.echo) {
                    india();
                    AbstractC2788u7.alpha(j5, "compose:lazy:prefetch:execute:item");
                    at atVar3 = this.kilo;
                    if (atVar3 != null) {
                        atVar3.echo = false;
                    }
                }
                if (!this.foxtrot && (aVar = this.delta) != null) {
                    if (hotel(this.mike, c0561b.charlie)) {
                        Trace.beginSection("compose:lazy:prefetch:measure");
                        try {
                            foxtrot(aVar.alpha);
                            Trace.endSection();
                            india();
                            c0561b.charlie = C0561b.alpha(this.november, c0561b.charlie);
                            Function1 function12 = this.charlie;
                            if (function12 != null) {
                                function12.invoke(this);
                            }
                        } finally {
                        }
                    }
                    return true;
                }
                at atVar4 = this.kilo;
                if (this.foxtrot && this.juliet && atVar4 != null) {
                    List list4 = atVar4.alpha;
                    int size2 = list4.size();
                    int i16 = Integer.MAX_VALUE;
                    for (int i17 = 0; i17 < size2; i17++) {
                        i16 = Math.min(i16, ((ai) list4.get(i17)).echo);
                    }
                    if (i16 == Integer.MAX_VALUE) {
                        i16 = 0;
                    }
                    int i18 = c0561b.delta;
                    if (i18 == -1) {
                        i4 = i16;
                    } else {
                        i4 = ((i18 * 3) + i16) / 4;
                    }
                    c0561b.delta = i4;
                    int size3 = list4.size();
                    int i19 = Integer.MAX_VALUE;
                    for (int i20 = 0; i20 < size3; i20++) {
                        i19 = Math.min(i19, ((ai) list4.get(i20)).foxtrot);
                    }
                    if (i19 == Integer.MAX_VALUE) {
                        i19 = 0;
                    }
                    if (i19 < i16) {
                        c0561b.charlie = 0L;
                        return false;
                    }
                    return false;
                }
                return false;
            }
        }
        bravo();
        return false;
    }

    public final boolean echo() {
        if (this.hotel) {
            return true;
        }
        return false;
    }

    public final void foxtrot(long j5) {
        if (this.golf) {
            AbstractC1719b.alpha("Callers should check whether the request is still valid before calling performMeasure()");
        }
        if (this.foxtrot) {
            AbstractC1719b.alpha("Request was already measured!");
        }
        this.foxtrot = true;
        InterfaceC2377M interfaceC2377M = this.echo;
        if (interfaceC2377M != null) {
            int alpha = interfaceC2377M.alpha();
            for (int i4 = 0; i4 < alpha; i4++) {
                interfaceC2377M.delta(i4, j5);
            }
            return;
        }
        AbstractC1719b.bravo("performComposition() must be called before performMeasure()");
        throw new KotlinNothingValueException();
    }

    public final at golf() {
        InterfaceC2377M interfaceC2377M = this.echo;
        if (interfaceC2377M != null) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            interfaceC2377M.charlie(new Y1.ae(objectRef, 1));
            List list = (List) objectRef.alpha;
            if (list != null) {
                return new at(this, list);
            }
            return null;
        }
        AbstractC1719b.bravo("Should precompose before resolving nested prefetch states");
        throw new KotlinNothingValueException();
    }

    public final boolean hotel(long j5, long j6) {
        if (this.lima) {
            j6 = 0;
        }
        if (j5 > j6) {
            return true;
        }
        return false;
    }

    public final void india() {
        long oscar;
        long alpha = kotlin.time.j.alpha();
        long j5 = this.oscar;
        kotlin.time.d unit = kotlin.time.d.purple;
        Intrinsics.echo(unit, "unit");
        long j6 = Long.MAX_VALUE;
        if (((j5 - 1) | 1) == Long.MAX_VALUE) {
            if (alpha == j5) {
                int i4 = kotlin.time.b.silver;
                oscar = 0;
            } else {
                oscar = kotlin.time.b.hotel(kotlin.time.g.juliet(j5));
            }
        } else if ((1 | (alpha - 1)) == Long.MAX_VALUE) {
            oscar = kotlin.time.g.juliet(alpha);
        } else {
            oscar = kotlin.time.g.oscar(alpha, j5, unit);
        }
        long j7 = oscar >> 1;
        int i5 = kotlin.time.b.silver;
        if ((((int) oscar) & 1) == 0) {
            j6 = j7;
        } else if (j7 <= 9223372036854L) {
            if (j7 < -9223372036854L) {
                j6 = Long.MIN_VALUE;
            } else {
                j6 = j7 * 1000000;
            }
        }
        this.november = j6;
        long j10 = this.mike - j6;
        this.mike = j10;
        this.oscar = alpha;
        AbstractC2788u7.alpha(j10, "compose:lazy:prefetch:available_time_nanos");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HandleAndRequestImpl { index = ");
        sb2.append(this.alpha);
        sb2.append(", constraints = ");
        sb2.append(this.delta);
        sb2.append(", isComposed = ");
        sb2.append(echo());
        sb2.append(", isMeasured = ");
        sb2.append(this.foxtrot);
        sb2.append(", isCanceled = ");
        return Q0.c.romeo(sb2, this.golf, " }");
    }
}
