package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
public final class ab {
    public static final Object foxtrot = new Object();
    public final String alpha;
    public final aa bravo;
    public final Object charlie;
    public final Object delta = new Object();
    public volatile Object echo = null;

    public /* synthetic */ ab(String str, Object obj, aa aaVar) {
        this.alpha = str;
        this.charlie = obj;
        this.bravo = aaVar;
    }

    public final Object alpha(Object obj) {
        Object obj2;
        synchronized (this.delta) {
        }
        if (obj != null) {
            return obj;
        }
        if (W.kilo == null) {
            return this.charlie;
        }
        synchronized (foxtrot) {
            try {
                if (r6.u.mike()) {
                    if (this.echo == null) {
                        obj2 = this.charlie;
                    } else {
                        obj2 = this.echo;
                    }
                    return obj2;
                }
                try {
                    for (ab abVar : ac.alpha) {
                        if (!r6.u.mike()) {
                            Object obj3 = null;
                            try {
                                aa aaVar = abVar.bravo;
                                if (aaVar != null) {
                                    obj3 = aaVar.zza();
                                }
                            } catch (IllegalStateException unused) {
                            }
                            synchronized (foxtrot) {
                                abVar.echo = obj3;
                            }
                        } else {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                    }
                } catch (SecurityException unused2) {
                }
                aa aaVar2 = this.bravo;
                if (aaVar2 != null) {
                    try {
                        return aaVar2.zza();
                    } catch (IllegalStateException | SecurityException unused3) {
                    }
                }
                return this.charlie;
            } finally {
            }
        }
    }
}
