package Ie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* loaded from: classes2.dex */
public final class ad extends Oe.k {

    /* renamed from: a, reason: collision with root package name */
    public List f1429a;
    public int silver;
    public al teal;
    public ak white;
    public ac yellow;

    /* JADX WARN: Type inference failed for: r0v0, types: [Oe.k, Ie.ad] */
    public static ad lima() {
        ?? kVar = new Oe.k();
        kVar.teal = al.teal;
        kVar.white = ak.teal;
        kVar.yellow = ac.f1425d;
        kVar.f1429a = Collections.EMPTY_LIST;
        return kVar;
    }

    public final Object clone() {
        ad lima = lima();
        lima.mike(kilo());
        return lima;
    }

    @Override // Oe.j
    public final Oe.v golf() {
        ae kilo = kilo();
        if (kilo.alpha()) {
            return kilo;
        }
        throw new UninitializedMessageException(kilo);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001d  */
    @Override // Oe.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Oe.j hotel(Oe.f fVar, Oe.h hVar) {
        ae aeVar = null;
        try {
            try {
                ae.f1431d.getClass();
                mike(new ae(fVar, hVar));
                return this;
            } catch (InvalidProtocolBufferException e) {
                ae aeVar2 = (ae) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    aeVar = aeVar2;
                    if (aeVar != null) {
                        mike(aeVar);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (aeVar != null) {
            }
            throw th;
        }
    }

    @Override // Oe.j
    public final /* bridge */ /* synthetic */ Oe.j india(Oe.o oVar) {
        mike((ae) oVar);
        return this;
    }

    public final ae kilo() {
        ae aeVar = new ae(this);
        int i4 = this.silver;
        int i5 = 1;
        if ((i4 & 1) != 1) {
            i5 = 0;
        }
        aeVar.silver = this.teal;
        if ((i4 & 2) == 2) {
            i5 |= 2;
        }
        aeVar.teal = this.white;
        if ((i4 & 4) == 4) {
            i5 |= 4;
        }
        aeVar.white = this.yellow;
        if ((i4 & 8) == 8) {
            this.f1429a = Collections.unmodifiableList(this.f1429a);
            this.silver &= -9;
        }
        aeVar.yellow = this.f1429a;
        aeVar.red = i5;
        return aeVar;
    }

    public final void mike(ae aeVar) {
        ac acVar;
        ak akVar;
        al alVar;
        if (aeVar == ae.f1430c) {
            return;
        }
        if ((aeVar.red & 1) == 1) {
            al alVar2 = aeVar.silver;
            if ((this.silver & 1) == 1 && (alVar = this.teal) != al.teal) {
                m mVar = new m(3);
                mVar.silver = Oe.r.purple;
                mVar.papa(alVar);
                mVar.papa(alVar2);
                this.teal = mVar.lima();
            } else {
                this.teal = alVar2;
            }
            this.silver |= 1;
        }
        if ((aeVar.red & 2) == 2) {
            ak akVar2 = aeVar.teal;
            if ((this.silver & 2) == 2 && (akVar = this.white) != ak.teal) {
                m mVar2 = new m(1);
                mVar2.silver = Collections.EMPTY_LIST;
                mVar2.oscar(akVar);
                mVar2.oscar(akVar2);
                this.white = mVar2.kilo();
            } else {
                this.white = akVar2;
            }
            this.silver |= 2;
        }
        if ((aeVar.red & 4) == 4) {
            ac acVar2 = aeVar.white;
            if ((this.silver & 4) == 4 && (acVar = this.yellow) != ac.f1425d) {
                ab lima = ab.lima();
                lima.mike(acVar);
                lima.mike(acVar2);
                this.yellow = lima.kilo();
            } else {
                this.yellow = acVar2;
            }
            this.silver |= 4;
        }
        if (!aeVar.yellow.isEmpty()) {
            if (this.f1429a.isEmpty()) {
                this.f1429a = aeVar.yellow;
                this.silver &= -9;
            } else {
                if ((this.silver & 8) != 8) {
                    this.f1429a = new ArrayList(this.f1429a);
                    this.silver |= 8;
                }
                this.f1429a.addAll(aeVar.yellow);
            }
        }
        juliet(aeVar);
        this.alpha = this.alpha.bravo(aeVar.purple);
    }
}
