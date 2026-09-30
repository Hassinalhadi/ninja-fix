package s6;

/* loaded from: classes2.dex */
public final class av extends t6.X1 {
    @Override // t6.X1
    public final as bravo(A a6) {
        as asVar;
        as asVar2 = as.delta;
        synchronized (a6) {
            asVar = a6.purple;
            if (asVar != asVar2) {
                a6.purple = asVar2;
            }
        }
        return asVar;
    }

    @Override // t6.X1
    public final az charlie(A a6) {
        az azVar;
        az azVar2 = az.charlie;
        synchronized (a6) {
            azVar = a6.red;
            if (azVar != azVar2) {
                a6.red = azVar2;
            }
        }
        return azVar;
    }

    @Override // t6.X1
    public final void delta(az azVar, az azVar2) {
        azVar.bravo = azVar2;
    }

    @Override // t6.X1
    public final void echo(az azVar, Thread thread) {
        azVar.alpha = thread;
    }

    @Override // t6.X1
    public final boolean foxtrot(A a6, as asVar, as asVar2) {
        synchronized (a6) {
            try {
                if (a6.purple == asVar) {
                    a6.purple = asVar2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // t6.X1
    public final boolean golf(A a6, Object obj, Object obj2) {
        synchronized (a6) {
            try {
                if (a6.alpha == obj) {
                    a6.alpha = obj2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // t6.X1
    public final boolean hotel(A a6, az azVar, az azVar2) {
        synchronized (a6) {
            try {
                if (a6.red == azVar) {
                    a6.red = azVar2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
