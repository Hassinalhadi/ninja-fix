package Le;

import Oe.o;
import Oe.v;
import Oe.w;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes2.dex */
public final class d extends Oe.j implements w {
    public int purple;
    public b red;
    public c silver;
    public c teal;
    public c white;
    public c yellow;

    /* JADX WARN: Type inference failed for: r0v0, types: [Oe.j, Le.d] */
    public static d kilo() {
        ?? jVar = new Oe.j();
        jVar.red = b.yellow;
        c cVar = c.yellow;
        jVar.silver = cVar;
        jVar.teal = cVar;
        jVar.white = cVar;
        jVar.yellow = cVar;
        return jVar;
    }

    public final Object clone() {
        d kilo = kilo();
        kilo.lima(juliet());
        return kilo;
    }

    @Override // Oe.j
    public final v golf() {
        e juliet = juliet();
        juliet.alpha();
        return juliet;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001d  */
    @Override // Oe.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Oe.j hotel(Oe.f fVar, Oe.h hVar) {
        e eVar = null;
        try {
            try {
                e.f1840d.getClass();
                lima(new e(fVar, hVar));
                return this;
            } catch (InvalidProtocolBufferException e) {
                e eVar2 = (e) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    eVar = eVar2;
                    if (eVar != null) {
                        lima(eVar);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (eVar != null) {
            }
            throw th;
        }
    }

    @Override // Oe.j
    public final /* bridge */ /* synthetic */ Oe.j india(o oVar) {
        lima((e) oVar);
        return this;
    }

    public final e juliet() {
        e eVar = new e(this);
        int i4 = this.purple;
        int i5 = 1;
        if ((i4 & 1) != 1) {
            i5 = 0;
        }
        eVar.red = this.red;
        if ((i4 & 2) == 2) {
            i5 |= 2;
        }
        eVar.silver = this.silver;
        if ((i4 & 4) == 4) {
            i5 |= 4;
        }
        eVar.teal = this.teal;
        if ((i4 & 8) == 8) {
            i5 |= 8;
        }
        eVar.white = this.white;
        if ((i4 & 16) == 16) {
            i5 |= 16;
        }
        eVar.yellow = this.yellow;
        eVar.purple = i5;
        return eVar;
    }

    public final void lima(e eVar) {
        c cVar;
        c cVar2;
        c cVar3;
        c cVar4;
        b bVar;
        if (eVar == e.f1839c) {
            return;
        }
        if ((eVar.purple & 1) == 1) {
            b bVar2 = eVar.red;
            if ((this.purple & 1) == 1 && (bVar = this.red) != b.yellow) {
                a aVar = new a(0);
                aVar.lima(bVar);
                aVar.lima(bVar2);
                this.red = aVar.juliet();
            } else {
                this.red = bVar2;
            }
            this.purple |= 1;
        }
        if ((eVar.purple & 2) == 2) {
            c cVar5 = eVar.silver;
            if ((this.purple & 2) == 2 && (cVar4 = this.silver) != c.yellow) {
                a india = c.india(cVar4);
                india.mike(cVar5);
                this.silver = india.kilo();
            } else {
                this.silver = cVar5;
            }
            this.purple |= 2;
        }
        if ((eVar.purple & 4) == 4) {
            c cVar6 = eVar.teal;
            if ((this.purple & 4) == 4 && (cVar3 = this.teal) != c.yellow) {
                a india2 = c.india(cVar3);
                india2.mike(cVar6);
                this.teal = india2.kilo();
            } else {
                this.teal = cVar6;
            }
            this.purple |= 4;
        }
        if ((eVar.purple & 8) == 8) {
            c cVar7 = eVar.white;
            if ((this.purple & 8) == 8 && (cVar2 = this.white) != c.yellow) {
                a india3 = c.india(cVar2);
                india3.mike(cVar7);
                this.white = india3.kilo();
            } else {
                this.white = cVar7;
            }
            this.purple |= 8;
        }
        if ((eVar.purple & 16) == 16) {
            c cVar8 = eVar.yellow;
            if ((this.purple & 16) == 16 && (cVar = this.yellow) != c.yellow) {
                a india4 = c.india(cVar);
                india4.mike(cVar8);
                this.yellow = india4.kilo();
            } else {
                this.yellow = cVar8;
            }
            this.purple |= 16;
        }
        this.alpha = this.alpha.bravo(eVar.alpha);
    }
}
