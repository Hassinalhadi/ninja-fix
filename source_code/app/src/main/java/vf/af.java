package vf;

import wf.C3268e;

/* loaded from: classes2.dex */
public abstract class af {
    public static final ai alpha;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [wf.e] */
    /* JADX WARN: Type inference failed for: r0v7, types: [vf.ae] */
    /* JADX WARN: Type inference failed for: r0v8, types: [vf.ai] */
    /* JADX WARN: Type inference failed for: r0v9, types: [vf.ae] */
    static {
        String str;
        boolean z2;
        ?? r02;
        int i4 = Af.u.alpha;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        boolean z10 = false;
        if (str != null) {
            z2 = Boolean.parseBoolean(str);
        } else {
            z2 = false;
        }
        if (!z2) {
            r02 = ae.f13993b;
        } else {
            Cf.e eVar = ao.alpha;
            r02 = Af.n.alpha;
            C3268e c3268e = r02.teal;
            if (r02 != 0) {
                z10 = true;
            }
            if (!z10) {
                r02 = ae.f13993b;
            }
        }
        alpha = r02;
    }
}
