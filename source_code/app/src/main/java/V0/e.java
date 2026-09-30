package V0;

import t6.AbstractC2998h;

/* loaded from: classes3.dex */
public final class e extends AbstractC2998h {
    @Override // t6.AbstractC2998h
    public final boolean alpha(g gVar, c cVar, c cVar2) {
        synchronized (gVar) {
            try {
                if (gVar.purple == cVar) {
                    gVar.purple = cVar2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // t6.AbstractC2998h
    public final boolean bravo(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.alpha == obj) {
                    gVar.alpha = obj2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // t6.AbstractC2998h
    public final boolean charlie(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.red == fVar) {
                    gVar.red = fVar2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // t6.AbstractC2998h
    public final void delta(f fVar, f fVar2) {
        fVar.bravo = fVar2;
    }

    @Override // t6.AbstractC2998h
    public final void echo(f fVar, Thread thread) {
        fVar.alpha = thread;
    }
}
