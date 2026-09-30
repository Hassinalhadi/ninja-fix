package com.google.android.gms.measurement.internal;

import com.google.maps.android.BuildConfig;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class aj extends AbstractC1481z {

    /* renamed from: a, reason: collision with root package name */
    public long f7621a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7622b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7623c;

    /* renamed from: d, reason: collision with root package name */
    public List f7624d;
    public String e;

    /* renamed from: f, reason: collision with root package name */
    public int f7625f;

    /* renamed from: g, reason: collision with root package name */
    public String f7626g;

    /* renamed from: h, reason: collision with root package name */
    public String f7627h;

    /* renamed from: i, reason: collision with root package name */
    public String f7628i;

    /* renamed from: j, reason: collision with root package name */
    public long f7629j;

    /* renamed from: k, reason: collision with root package name */
    public String f7630k;
    public String red;
    public String silver;
    public int teal;
    public String white;
    public String yellow;

    public aj(G g2, long j5, long j6) {
        super(g2);
        this.f7629j = 0L;
        this.f7630k = null;
        this.f7622b = j5;
        this.f7623c = j6;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1481z
    public final boolean Z() {
        return true;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v0 com.google.android.gms.measurement.internal.zzr, still in use, count: 2, list:
          (r4v0 com.google.android.gms.measurement.internal.zzr) from 0x0109: MOVE (r23v0 com.google.android.gms.measurement.internal.zzr) = (r4v0 com.google.android.gms.measurement.internal.zzr) (LINE:266)
          (r4v0 com.google.android.gms.measurement.internal.zzr) from 0x00f4: MOVE (r23v6 com.google.android.gms.measurement.internal.zzr) = (r4v0 com.google.android.gms.measurement.internal.zzr) (LINE:245)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:56)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    public final com.google.android.gms.measurement.internal.zzr a0(java.lang.String r47) {
        /*
            Method dump skipped, instructions count: 865
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.aj.a0(java.lang.String):com.google.android.gms.measurement.internal.zzr");
    }

    public final String b0() {
        X();
        if (((G) this.alpha).yellow.j0(null, ac.f7601i0)) {
            return null;
        }
        return this.f7627h;
    }

    public final String c0() {
        X();
        V5.x.hotel(this.red);
        return this.red;
    }

    public final String d0() {
        W();
        X();
        V5.x.hotel(this.f7626g);
        return this.f7626g;
    }

    public final void e0() {
        String format;
        String str;
        W();
        G g2 = (G) this.alpha;
        ax axVar = g2.f7506a;
        G.delta(axVar);
        boolean kilo = axVar.d0().kilo(U.ANALYTICS_STORAGE);
        ar arVar = g2.f7507b;
        if (!kilo) {
            G.foxtrot(arVar);
            arVar.f7635f.alpha("Analytics Storage consent is not granted");
            format = null;
        } else {
            byte[] bArr = new byte[16];
            d1 d1Var = g2.e;
            G.delta(d1Var);
            d1Var.i0().nextBytes(bArr);
            format = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        }
        G.foxtrot(arVar);
        if (format == null) {
            str = BuildConfig.TRAVIS;
        } else {
            str = "not null";
        }
        arVar.f7635f.alpha("Resetting session stitching token to ".concat(str));
        this.f7628i = format;
        g2.f7511g.getClass();
        this.f7629j = System.currentTimeMillis();
    }
}
