package com.incognia.internal;

/* loaded from: classes2.dex */
public final class XYO implements Dn {
    @Override // com.incognia.internal.Dn
    public final void b(Throwable th) {
        try {
            try {
                X8.W();
                ow owVar = (ow) DDS.f8521b.get();
                owVar.getClass();
                if (owVar instanceof zfv) {
                    ((Q6I) X8.W()).f9470P.b(th, true);
                    return;
                }
            } catch (Throwable unused) {
                return;
            }
        } catch (NullPointerException unused2) {
        }
        Lsv.b(th, true);
    }
}
