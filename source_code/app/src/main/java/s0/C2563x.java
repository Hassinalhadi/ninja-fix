package s0;

import B9.C0058p;
import a0.C0366t;
import a0.InterfaceC0364r;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.compose.LottieConstants;
import d0.C1564b;
import kotlin.jvm.functions.Function1;
import p0.AbstractC2264a;
import q0.AbstractC2367C;
import q0.C2396o;
import t0.C2946x;

/* renamed from: s0.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2563x extends L {

    /* renamed from: M, reason: collision with root package name */
    public static final Be.e f13350M;

    /* renamed from: K, reason: collision with root package name */
    public final g0 f13351K;

    /* renamed from: L, reason: collision with root package name */
    public C2562w f13352L;

    static {
        Be.e golf = a0.ao.golf();
        golf.oscar(C0366t.foxtrot);
        golf.xray(1.0f);
        golf.yankee(1);
        f13350M = golf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [s0.g0, T.r] */
    /* JADX WARN: Type inference failed for: r3v4, types: [s0.au] */
    public C2563x(al alVar) {
        super(alVar);
        C2562w c2562w;
        ?? rVar = new T.r();
        rVar.setAggregateChildKindSet$ui_release(0);
        this.f13351K = rVar;
        rVar.updateCoordinator$ui_release(this);
        if (alVar.yellow != null) {
            c2562w = new au(this);
        } else {
            c2562w = null;
        }
        this.f13352L = c2562w;
    }

    @Override // s0.L
    public final T.r A() {
        return this.f13351K;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [T.r] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17, types: [T.r] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r6v10, types: [J.e] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [J.e] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // s0.L
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G(C2545e c2545e, long j5, C2561v c2561v, int i4, boolean z2) {
        boolean z10;
        int i5;
        boolean z11;
        boolean z12;
        Object[] objArr;
        boolean z13;
        long j6 = j5;
        C2561v c2561v2 = c2561v;
        al alVar = this.f13251i;
        switch (c2545e.alpha) {
            case 1:
                z10 = true;
                break;
            default:
                A0.k xray = alVar.xray();
                if (xray != null && xray.silver) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z10 = !z13;
                break;
        }
        if (z10) {
            if (Z(j6)) {
                i5 = i4;
                z11 = z2;
            } else {
                i5 = i4;
                if (i5 == 1 && (Float.floatToRawIntBits(s(j6, z())) & LottieConstants.IterateForever) < 2139095040) {
                    z11 = false;
                }
            }
            z12 = true;
            if (!z12) {
                int i10 = c2561v2.red;
                J.e yankee = alVar.yankee();
                Object[] objArr2 = yankee.alpha;
                int i11 = yankee.red - 1;
                while (i11 >= 0) {
                    al alVar2 = (al) objArr2[i11];
                    if (alVar2.emerald()) {
                        switch (c2545e.alpha) {
                            case 1:
                                objArr = objArr2;
                                alVar2.amber(j6, c2561v2, i5, z11);
                                break;
                            default:
                                C0058p c0058p = alVar2.f13305x;
                                objArr = objArr2;
                                ((L) c0058p.foxtrot).F(L.f13250J, ((L) c0058p.foxtrot).x(j6), c2561v2, 1, z11);
                                c2561v2 = c2561v;
                                break;
                        }
                        long alpha = c2561v2.alpha();
                        if (AbstractC2557q.hotel(alpha) < 0.0f && AbstractC2557q.kilo(alpha) && !AbstractC2557q.juliet(alpha)) {
                            L l10 = (L) alVar2.f13305x.foxtrot;
                            l10.getClass();
                            T.r C = l10.C(M.hotel(16));
                            if (C != null && C.isAttached()) {
                                if (!C.getNode().isAttached()) {
                                    AbstractC2264a.bravo("visitLocalDescendants called on an unattached node");
                                }
                                T.r node = C.getNode();
                                if ((node.getAggregateChildKindSet$ui_release() & 16) != 0) {
                                    while (node != null) {
                                        if ((node.getKindSet$ui_release() & 16) != 0) {
                                            AbstractC2556p abstractC2556p = node;
                                            ?? r62 = 0;
                                            while (abstractC2556p != 0) {
                                                if (abstractC2556p instanceof b0) {
                                                    if (((b0) abstractC2556p).peach()) {
                                                        c2561v2.red = c2561v2.alpha.bravo - 1;
                                                    }
                                                } else if ((abstractC2556p.getKindSet$ui_release() & 16) != 0 && (abstractC2556p instanceof AbstractC2556p)) {
                                                    T.r rVar = abstractC2556p.purple;
                                                    int i12 = 0;
                                                    abstractC2556p = abstractC2556p;
                                                    r62 = r62;
                                                    while (rVar != null) {
                                                        if ((rVar.getKindSet$ui_release() & 16) != 0) {
                                                            i12++;
                                                            r62 = r62;
                                                            if (i12 == 1) {
                                                                abstractC2556p = rVar;
                                                            } else {
                                                                if (r62 == 0) {
                                                                    r62 = new J.e(new T.r[16]);
                                                                }
                                                                if (abstractC2556p != 0) {
                                                                    r62.bravo(abstractC2556p);
                                                                    abstractC2556p = 0;
                                                                }
                                                                r62.bravo(rVar);
                                                            }
                                                        }
                                                        rVar = rVar.getChild$ui_release();
                                                        abstractC2556p = abstractC2556p;
                                                        r62 = r62;
                                                    }
                                                    if (i12 == 1) {
                                                    }
                                                }
                                                abstractC2556p = AbstractC2555o.bravo(r62);
                                            }
                                        }
                                        node = node.getChild$ui_release();
                                    }
                                }
                            }
                            c2561v2.red = i10;
                            return;
                        }
                    } else {
                        objArr = objArr2;
                    }
                    i11--;
                    j6 = j5;
                    i5 = i4;
                    objArr2 = objArr;
                }
                c2561v2.red = i10;
                return;
            }
            return;
        }
        i5 = i4;
        z11 = z2;
        z12 = false;
        if (!z12) {
        }
    }

    @Override // s0.L
    public final void O(InterfaceC0364r interfaceC0364r, C1564b c1564b) {
        al alVar = this.f13251i;
        W alpha = ao.alpha(alVar);
        J.e yankee = alVar.yankee();
        Object[] objArr = yankee.alpha;
        int i4 = yankee.red;
        for (int i5 = 0; i5 < i4; i5++) {
            al alVar2 = (al) objArr[i5];
            if (alVar2.emerald()) {
                alVar2.india(interfaceC0364r, c1564b);
            }
        }
        if (((C2946x) alpha).getShowLayoutBounds()) {
            long j5 = this.red;
            interfaceC0364r.sierra(0.5f, 0.5f, ((int) (j5 >> 32)) - 0.5f, ((int) (j5 & 4294967295L)) - 0.5f, f13350M);
        }
    }

    @Override // s0.at
    public final int c(C2396o c2396o) {
        C2562w c2562w = this.f13352L;
        if (c2562w != null) {
            return c2562w.c(c2396o);
        }
        C c3 = this.f13251i.f13306y.papa;
        boolean z2 = c3.f13220f;
        am amVar = c3.f13231q;
        if (!z2) {
            if (c3.white.delta == ag.alpha) {
                amVar.foxtrot = true;
                if (amVar.bravo) {
                    c3.f13229o = true;
                    c3.f13230p = true;
                }
            } else {
                amVar.golf = true;
            }
        }
        c3.golf().f13312d = true;
        c3.bronze();
        c3.golf().f13312d = false;
        Integer num = (Integer) amVar.india.get(c2396o);
        if (num != null) {
            return num.intValue();
        }
        return RecyclerView.UNDEFINED_DURATION;
    }

    @Override // q0.InterfaceC2401t
    public final int delta(int i4) {
        gd.a uniform = this.f13251i.uniform();
        q0.ap foxtrot = uniform.foxtrot();
        al alVar = (al) uniform.purple;
        return foxtrot.hotel((L) alVar.f13305x.foxtrot, alVar.mike(), i4);
    }

    @Override // q0.InterfaceC2401t
    public final int jade(int i4) {
        gd.a uniform = this.f13251i.uniform();
        q0.ap foxtrot = uniform.foxtrot();
        al alVar = (al) uniform.purple;
        return foxtrot.bravo((L) alVar.f13305x.foxtrot, alVar.mike(), i4);
    }

    @Override // q0.InterfaceC2401t
    public final int lima(int i4) {
        gd.a uniform = this.f13251i.uniform();
        q0.ap foxtrot = uniform.foxtrot();
        al alVar = (al) uniform.purple;
        return foxtrot.alpha((L) alVar.f13305x.foxtrot, alVar.mike(), i4);
    }

    @Override // q0.InterfaceC2401t
    public final int romeo(int i4) {
        gd.a uniform = this.f13251i.uniform();
        q0.ap foxtrot = uniform.foxtrot();
        al alVar = (al) uniform.purple;
        return foxtrot.golf((L) alVar.f13305x.foxtrot, alVar.mike(), i4);
    }

    @Override // q0.AbstractC2367C
    public final void silver(long j5, float f5, Function1 function1) {
        P(j5, f5, function1);
        if (this.f13311c) {
            return;
        }
        this.f13251i.f13306y.papa.g();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [s0.w, s0.au] */
    @Override // s0.L
    public final void v() {
        if (this.f13352L == null) {
            this.f13352L = new au(this);
        }
    }

    @Override // q0.ao
    public final AbstractC2367C victor(long j5) {
        a(j5);
        al alVar = this.f13251i;
        J.e zulu = alVar.zulu();
        Object[] objArr = zulu.alpha;
        int i4 = zulu.red;
        for (int i5 = 0; i5 < i4; i5++) {
            ((al) objArr[i5]).f13306y.papa.e = ai.red;
        }
        S(alVar.f13296o.delta(this, alVar.mike(), j5));
        L();
        return this;
    }

    @Override // s0.L
    public final au y() {
        return this.f13352L;
    }
}
