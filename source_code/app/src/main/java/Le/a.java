package Le;

import Oe.o;
import Oe.v;
import Oe.w;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes2.dex */
public final class a extends Oe.j implements w {
    public final /* synthetic */ int purple;
    public int red;
    public int silver;
    public int teal;

    public /* synthetic */ a(int i4) {
        this.purple = i4;
    }

    public final Object clone() {
        switch (this.purple) {
            case 0:
                a aVar = new a(0);
                aVar.lima(juliet());
                return aVar;
            default:
                a aVar2 = new a(1);
                aVar2.mike(kilo());
                return aVar2;
        }
    }

    @Override // Oe.j
    public final v golf() {
        switch (this.purple) {
            case 0:
                b juliet = juliet();
                juliet.alpha();
                return juliet;
            default:
                c kilo = kilo();
                kilo.alpha();
                return kilo;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0043  */
    @Override // Oe.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Oe.j hotel(Oe.f fVar, Oe.h hVar) {
        switch (this.purple) {
            case 0:
                b bVar = null;
                try {
                    try {
                        b.f1837a.getClass();
                        lima(new b(fVar));
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        b bVar2 = (b) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            bVar = bVar2;
                            if (bVar != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (bVar != null) {
                        lima(bVar);
                    }
                    throw th;
                }
            default:
                c cVar = null;
                try {
                    try {
                        c.f1838a.getClass();
                        mike(new c(fVar));
                        return this;
                    } catch (InvalidProtocolBufferException e4) {
                        c cVar2 = (c) e4.getUnfinishedMessage();
                        try {
                            throw e4;
                        } catch (Throwable th3) {
                            th = th3;
                            cVar = cVar2;
                            if (cVar != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    if (cVar != null) {
                        mike(cVar);
                    }
                    throw th;
                }
        }
    }

    @Override // Oe.j
    public final /* bridge */ /* synthetic */ Oe.j india(o oVar) {
        switch (this.purple) {
            case 0:
                lima((b) oVar);
                return this;
            default:
                mike((c) oVar);
                return this;
        }
    }

    public b juliet() {
        b bVar = new b(this);
        int i4 = this.red;
        int i5 = 1;
        if ((i4 & 1) != 1) {
            i5 = 0;
        }
        bVar.red = this.silver;
        if ((i4 & 2) == 2) {
            i5 |= 2;
        }
        bVar.silver = this.teal;
        bVar.purple = i5;
        return bVar;
    }

    public c kilo() {
        c cVar = new c(this);
        int i4 = this.red;
        int i5 = 1;
        if ((i4 & 1) != 1) {
            i5 = 0;
        }
        cVar.red = this.silver;
        if ((i4 & 2) == 2) {
            i5 |= 2;
        }
        cVar.silver = this.teal;
        cVar.purple = i5;
        return cVar;
    }

    public void lima(b bVar) {
        if (bVar == b.yellow) {
            return;
        }
        int i4 = bVar.purple;
        if ((i4 & 1) == 1) {
            int i5 = bVar.red;
            this.red = 1 | this.red;
            this.silver = i5;
        }
        if ((i4 & 2) == 2) {
            int i10 = bVar.silver;
            this.red = 2 | this.red;
            this.teal = i10;
        }
        this.alpha = this.alpha.bravo(bVar.alpha);
    }

    public void mike(c cVar) {
        if (cVar == c.yellow) {
            return;
        }
        int i4 = cVar.purple;
        if ((i4 & 1) == 1) {
            int i5 = cVar.red;
            this.red = 1 | this.red;
            this.silver = i5;
        }
        if ((i4 & 2) == 2) {
            int i10 = cVar.silver;
            this.red = 2 | this.red;
            this.teal = i10;
        }
        this.alpha = this.alpha.bravo(cVar.alpha);
    }
}
