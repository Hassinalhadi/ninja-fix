package s0;

import B9.C0058p;
import F.C0092c;
import a0.AbstractC0343ac;
import a0.AbstractC0345ae;
import a0.AbstractC0349c;
import a0.AbstractC0358l;
import a0.AbstractC0367u;
import a0.C0347ag;
import a0.C0354h;
import a0.C0366t;
import a0.InterfaceC0341aa;
import a0.InterfaceC0364r;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.view.ViewParent;
import c0.C0801a;
import com.airbnb.lottie.compose.LottieConstants;
import com.google.mlkit.vision.barcode.common.Barcode;
import d0.C1564b;
import d0.InterfaceC1566d;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import okhttp3.internal.http2.Http2;
import p0.AbstractC2264a;
import q0.AbstractC2375K;
import q0.C2396o;
import qe.C2474j;
import s6.AbstractC2609a7;
import s6.AbstractC2627c7;
import s6.Y6;
import t0.C2907c0;
import t0.C2946x;

/* loaded from: classes3.dex */
public abstract class L extends at implements q0.ao, q0.z, X {

    /* renamed from: D, reason: collision with root package name */
    public static final C2546f f13244D = C2546f.f13340g;

    /* renamed from: E, reason: collision with root package name */
    public static final C2546f f13245E = C2546f.f13339f;

    /* renamed from: F, reason: collision with root package name */
    public static final a0.ap f13246F;

    /* renamed from: G, reason: collision with root package name */
    public static final C2565z f13247G;

    /* renamed from: H, reason: collision with root package name */
    public static final float[] f13248H;

    /* renamed from: I, reason: collision with root package name */
    public static final C2545e f13249I;

    /* renamed from: J, reason: collision with root package name */
    public static final C2545e f13250J;
    public boolean B;
    public U C;

    /* renamed from: i, reason: collision with root package name */
    public final al f13251i;

    /* renamed from: j, reason: collision with root package name */
    public L f13252j;

    /* renamed from: k, reason: collision with root package name */
    public L f13253k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f13254l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f13255m;

    /* renamed from: n, reason: collision with root package name */
    public Function1 f13256n;

    /* renamed from: o, reason: collision with root package name */
    public Q0.d f13257o;

    /* renamed from: p, reason: collision with root package name */
    public Q0.n f13258p;

    /* renamed from: r, reason: collision with root package name */
    public q0.aq f13260r;

    /* renamed from: s, reason: collision with root package name */
    public bv.ag f13261s;

    /* renamed from: u, reason: collision with root package name */
    public float f13263u;

    /* renamed from: v, reason: collision with root package name */
    public Z.a f13264v;

    /* renamed from: w, reason: collision with root package name */
    public C2565z f13265w;

    /* renamed from: x, reason: collision with root package name */
    public C1564b f13266x;

    /* renamed from: y, reason: collision with root package name */
    public InterfaceC0364r f13267y;

    /* renamed from: z, reason: collision with root package name */
    public C0092c f13268z;

    /* renamed from: q, reason: collision with root package name */
    public float f13259q = 0.8f;

    /* renamed from: t, reason: collision with root package name */
    public long f13262t = 0;
    public final I A = new I(this, 1);

    /* JADX WARN: Type inference failed for: r0v2, types: [a0.ap, java.lang.Object] */
    static {
        ?? obj = new Object();
        obj.purple = 1.0f;
        obj.red = 1.0f;
        obj.silver = 1.0f;
        long j5 = AbstractC0343ac.alpha;
        obj.yellow = j5;
        obj.f2575a = j5;
        obj.f2577c = 8.0f;
        obj.f2578d = a0.aw.bravo;
        obj.e = a0.ao.alpha;
        obj.f2580g = 0;
        obj.f2581h = 9205357640488583168L;
        obj.f2582i = Y6.alpha();
        obj.f2583j = Q0.n.alpha;
        obj.f2584k = 3;
        f13246F = obj;
        f13247G = new C2565z();
        f13248H = C0347ag.alpha();
        f13249I = new C2545e(1);
        f13250J = new C2545e(2);
    }

    public L(al alVar) {
        this.f13251i = alVar;
        this.f13257o = alVar.f13298q;
        this.f13258p = alVar.f13299r;
    }

    public static L T(q0.z zVar) {
        q0.an anVar;
        L l10;
        if (zVar instanceof q0.an) {
            anVar = (q0.an) zVar;
        } else {
            anVar = null;
        }
        if (anVar != null && (l10 = anVar.alpha.f13315i) != null) {
            return l10;
        }
        Intrinsics.charlie(zVar, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (L) zVar;
    }

    public abstract T.r A();

    public final T.r B(int i4) {
        boolean hotel = M.hotel(i4);
        T.r A = A();
        if (hotel || (A = A.getParent$ui_release()) != null) {
            for (T.r C = C(hotel); C != null && (C.getAggregateChildKindSet$ui_release() & i4) != 0; C = C.getChild$ui_release()) {
                if ((C.getKindSet$ui_release() & i4) != 0) {
                    return C;
                }
                if (C == A) {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    public final T.r C(boolean z2) {
        T.r A;
        C0058p c0058p = this.f13251i.f13305x;
        if (((L) c0058p.foxtrot) == this) {
            return (T.r) c0058p.delta;
        }
        if (z2) {
            L l10 = this.f13253k;
            if (l10 == null || (A = l10.A()) == null) {
                return null;
            }
            return A.getChild$ui_release();
        }
        L l11 = this.f13253k;
        if (l11 == null) {
            return null;
        }
        return l11.A();
    }

    public final void D(T.r rVar, C2545e c2545e, long j5, C2561v c2561v, int i4, boolean z2) {
        if (rVar == null) {
            G(c2545e, j5, c2561v, i4, z2);
            return;
        }
        int i5 = c2561v.red;
        bv.ah ahVar = c2561v.alpha;
        c2561v.bravo(i5 + 1, ahVar.bravo);
        c2561v.red++;
        ahVar.golf(rVar);
        c2561v.purple.alpha(AbstractC2557q.alpha(-1.0f, z2, false));
        D(AbstractC2557q.charlie(rVar, c2545e.bravo()), c2545e, j5, c2561v, i4, z2);
        c2561v.red = i5;
    }

    public final void E(T.r rVar, C2545e c2545e, long j5, C2561v c2561v, int i4, boolean z2, float f5) {
        if (rVar == null) {
            G(c2545e, j5, c2561v, i4, z2);
            return;
        }
        int i5 = c2561v.red;
        bv.ah ahVar = c2561v.alpha;
        c2561v.bravo(i5 + 1, ahVar.bravo);
        c2561v.red++;
        ahVar.golf(rVar);
        c2561v.purple.alpha(AbstractC2557q.alpha(f5, z2, false));
        N(AbstractC2557q.charlie(rVar, c2545e.bravo()), c2545e, j5, c2561v, i4, z2, f5, true);
        c2561v.red = i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c2, code lost:
    
        if (s0.AbstractC2557q.delta(r18.alpha(), s0.AbstractC2557q.alpha(r2, r7, false)) > 0) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F(C2545e c2545e, long j5, C2561v c2561v, int i4, boolean z2) {
        float f5;
        boolean z10;
        boolean z11;
        T.r B = B(c2545e.bravo());
        if (!Z(j5)) {
            if (i4 == 1) {
                float s3 = s(j5, z());
                if ((Float.floatToRawIntBits(s3) & LottieConstants.IterateForever) < 2139095040) {
                    if (c2561v.red != CollectionsKt.ivory(c2561v)) {
                        if (AbstractC2557q.delta(c2561v.alpha(), AbstractC2557q.alpha(s3, false, false)) <= 0) {
                            return;
                        }
                    }
                    E(B, c2545e, j5, c2561v, i4, false, s3);
                    return;
                }
                return;
            }
            return;
        }
        if (B == null) {
            G(c2545e, j5, c2561v, i4, z2);
            return;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L));
        if (intBitsToFloat >= 0.0f && intBitsToFloat2 >= 0.0f && intBitsToFloat < navy() && intBitsToFloat2 < maroon()) {
            D(B, c2545e, j5, c2561v, i4, z2);
            return;
        }
        if (i4 == 1) {
            f5 = s(j5, z());
        } else {
            f5 = Float.POSITIVE_INFINITY;
        }
        if ((Float.floatToRawIntBits(f5) & LottieConstants.IterateForever) < 2139095040) {
            if (c2561v.red == CollectionsKt.ivory(c2561v)) {
                z10 = z2;
            } else {
                z10 = z2;
            }
            z11 = true;
            N(B, c2545e, j5, c2561v, i4, z10, f5, z11);
        }
        z10 = z2;
        z11 = false;
        N(B, c2545e, j5, c2561v, i4, z10, f5, z11);
    }

    public void G(C2545e c2545e, long j5, C2561v c2561v, int i4, boolean z2) {
        L l10 = this.f13252j;
        if (l10 != null) {
            l10.F(c2545e, l10.x(j5), c2561v, i4, z2);
        }
    }

    public final void H() {
        U u4 = this.C;
        if (u4 != null) {
            u4.invalidate();
            return;
        }
        L l10 = this.f13253k;
        if (l10 != null) {
            l10.H();
        }
    }

    public final boolean I() {
        if (this.C != null && this.f13259q <= 0.0f) {
            return true;
        }
        L l10 = this.f13253k;
        if (l10 != null) {
            return l10.I();
        }
        return false;
    }

    public final long J(q0.z zVar, long j5) {
        if (zVar instanceof q0.an) {
            q0.an anVar = (q0.an) zVar;
            anVar.alpha.f13315i.K();
            return anVar.bravo(this, j5 ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        L T4 = T(zVar);
        T4.K();
        L w4 = w(T4);
        while (T4 != w4) {
            U u4 = T4.C;
            if (u4 != null) {
                j5 = ((C2907c0) u4).delta(j5, false);
            }
            j5 = AbstractC2609a7.bravo(j5, T4.f13262t);
            T4 = T4.f13253k;
            Intrinsics.checkNotNull(T4);
        }
        return q(w4, j5);
    }

    public final void K() {
        this.f13251i.f13306y.bravo();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [T.r] */
    /* JADX WARN: Type inference failed for: r7v7, types: [T.r] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [J.e] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [J.e] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void L() {
        Function1 function1;
        T.r parent$ui_release;
        T.r C = C(M.hotel(128));
        if (C != null && (C.getNode().getAggregateChildKindSet$ui_release() & 128) != 0) {
            S.g echo = r6.u.echo();
            if (echo != null) {
                function1 = echo.echo();
            } else {
                function1 = null;
            }
            S.g foxtrot = r6.u.foxtrot(echo);
            try {
                boolean hotel = M.hotel(128);
                if (hotel) {
                    parent$ui_release = A();
                } else {
                    parent$ui_release = A().getParent$ui_release();
                    if (parent$ui_release == null) {
                    }
                }
                for (T.r C10 = C(hotel); C10 != null; C10 = C10.getChild$ui_release()) {
                    if ((C10.getAggregateChildKindSet$ui_release() & 128) == 0) {
                        break;
                    }
                    if ((C10.getKindSet$ui_release() & 128) != 0) {
                        ?? r82 = 0;
                        AbstractC2556p abstractC2556p = C10;
                        while (abstractC2556p != 0) {
                            if (abstractC2556p instanceof aa) {
                                ((aa) abstractC2556p).kilo(this.red);
                            } else if ((abstractC2556p.getKindSet$ui_release() & 128) != 0 && (abstractC2556p instanceof AbstractC2556p)) {
                                T.r rVar = abstractC2556p.purple;
                                int i4 = 0;
                                abstractC2556p = abstractC2556p;
                                r82 = r82;
                                while (rVar != null) {
                                    if ((rVar.getKindSet$ui_release() & 128) != 0) {
                                        i4++;
                                        r82 = r82;
                                        if (i4 == 1) {
                                            abstractC2556p = rVar;
                                        } else {
                                            if (r82 == 0) {
                                                r82 = new J.e(new T.r[16]);
                                            }
                                            if (abstractC2556p != 0) {
                                                r82.bravo(abstractC2556p);
                                                abstractC2556p = 0;
                                            }
                                            r82.bravo(rVar);
                                        }
                                    }
                                    rVar = rVar.getChild$ui_release();
                                    abstractC2556p = abstractC2556p;
                                    r82 = r82;
                                }
                                if (i4 == 1) {
                                }
                            }
                            abstractC2556p = AbstractC2555o.bravo(r82);
                        }
                    }
                    if (C10 == parent$ui_release) {
                        break;
                    }
                }
            } finally {
                r6.u.juliet(echo, foxtrot, function1);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [T.r] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [T.r] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [J.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [J.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void M() {
        boolean hotel = M.hotel(128);
        T.r A = A();
        if (hotel || (A = A.getParent$ui_release()) != null) {
            for (T.r C = C(hotel); C != null && (C.getAggregateChildKindSet$ui_release() & 128) != 0; C = C.getChild$ui_release()) {
                if ((C.getKindSet$ui_release() & 128) != 0) {
                    AbstractC2556p abstractC2556p = C;
                    ?? r5 = 0;
                    while (abstractC2556p != 0) {
                        if (abstractC2556p instanceof aa) {
                            ((aa) abstractC2556p).foxtrot(this);
                        } else if ((abstractC2556p.getKindSet$ui_release() & 128) != 0 && (abstractC2556p instanceof AbstractC2556p)) {
                            T.r rVar = abstractC2556p.purple;
                            int i4 = 0;
                            abstractC2556p = abstractC2556p;
                            r5 = r5;
                            while (rVar != null) {
                                if ((rVar.getKindSet$ui_release() & 128) != 0) {
                                    i4++;
                                    r5 = r5;
                                    if (i4 == 1) {
                                        abstractC2556p = rVar;
                                    } else {
                                        if (r5 == 0) {
                                            r5 = new J.e(new T.r[16]);
                                        }
                                        if (abstractC2556p != 0) {
                                            r5.bravo(abstractC2556p);
                                            abstractC2556p = 0;
                                        }
                                        r5.bravo(rVar);
                                    }
                                }
                                rVar = rVar.getChild$ui_release();
                                abstractC2556p = abstractC2556p;
                                r5 = r5;
                            }
                            if (i4 == 1) {
                            }
                        }
                        abstractC2556p = AbstractC2555o.bravo(r5);
                    }
                }
                if (C == A) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19, types: [T.r] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22, types: [T.r] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [T.r] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26, types: [J.e] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29, types: [J.e] */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    public final void N(T.r rVar, C2545e c2545e, long j5, C2561v c2561v, int i4, boolean z2, float f5, boolean z10) {
        int alpha;
        int alpha2;
        T.r bravo;
        if (rVar == null) {
            G(c2545e, j5, c2561v, i4, z2);
            return;
        }
        int i5 = i4;
        if (i5 == 3 || i5 == 4) {
            AbstractC2556p abstractC2556p = rVar;
            J.e eVar = null;
            while (true) {
                if (abstractC2556p == 0) {
                    break;
                }
                if (abstractC2556p instanceof b0) {
                    long juliet = ((b0) abstractC2556p).juliet();
                    int i10 = (int) (j5 >> 32);
                    float intBitsToFloat = Float.intBitsToFloat(i10);
                    al alVar = this.f13251i;
                    Q0.n nVar = alVar.f13299r;
                    int i11 = h0.bravo;
                    long j6 = Long.MIN_VALUE & juliet;
                    if (j6 != 0 && nVar != Q0.n.alpha) {
                        alpha = C2545e.alpha(2, juliet);
                    } else {
                        alpha = C2545e.alpha(0, juliet);
                    }
                    if (intBitsToFloat >= (-alpha)) {
                        float intBitsToFloat2 = Float.intBitsToFloat(i10);
                        int navy = navy();
                        Q0.n nVar2 = alVar.f13299r;
                        if (j6 != 0 && nVar2 != Q0.n.alpha) {
                            alpha2 = C2545e.alpha(0, juliet);
                        } else {
                            alpha2 = C2545e.alpha(2, juliet);
                        }
                        if (intBitsToFloat2 < navy + alpha2) {
                            int i12 = (int) (j5 & 4294967295L);
                            if (Float.intBitsToFloat(i12) >= (-C2545e.alpha(1, juliet))) {
                                if (Float.intBitsToFloat(i12) < C2545e.alpha(3, juliet) + maroon()) {
                                    J j7 = new J(this, rVar, c2545e, j5, c2561v, i5, z2, f5, z10);
                                    int i13 = c2561v.red;
                                    int ivory = CollectionsKt.ivory(c2561v);
                                    bv.ac acVar = c2561v.purple;
                                    bv.ah ahVar = c2561v.alpha;
                                    if (i13 == ivory) {
                                        int i14 = c2561v.red;
                                        c2561v.bravo(i14 + 1, ahVar.bravo);
                                        c2561v.red++;
                                        ahVar.golf(rVar);
                                        acVar.alpha(AbstractC2557q.alpha(0.0f, z2, true));
                                        j7.invoke();
                                        c2561v.red = i14;
                                        return;
                                    }
                                    long alpha3 = c2561v.alpha();
                                    int i15 = c2561v.red;
                                    if (AbstractC2557q.juliet(alpha3)) {
                                        int ivory2 = CollectionsKt.ivory(c2561v);
                                        c2561v.red = ivory2;
                                        c2561v.bravo(ivory2 + 1, ahVar.bravo);
                                        c2561v.red++;
                                        ahVar.golf(rVar);
                                        acVar.alpha(AbstractC2557q.alpha(0.0f, z2, true));
                                        j7.invoke();
                                        c2561v.red = ivory2;
                                        if (AbstractC2557q.hotel(c2561v.alpha()) < 0.0f) {
                                            c2561v.bravo(i15 + 1, c2561v.red + 1);
                                        }
                                        c2561v.red = i15;
                                        return;
                                    }
                                    if (AbstractC2557q.hotel(alpha3) > 0.0f) {
                                        int i16 = c2561v.red;
                                        c2561v.bravo(i16 + 1, ahVar.bravo);
                                        c2561v.red++;
                                        ahVar.golf(rVar);
                                        acVar.alpha(AbstractC2557q.alpha(0.0f, z2, true));
                                        j7.invoke();
                                        c2561v.red = i16;
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    if ((abstractC2556p.getKindSet$ui_release() & 16) != 0 && (abstractC2556p instanceof AbstractC2556p)) {
                        T.r rVar2 = abstractC2556p.purple;
                        int i17 = 0;
                        bravo = abstractC2556p;
                        eVar = eVar;
                        while (rVar2 != null) {
                            if ((rVar2.getKindSet$ui_release() & 16) != 0) {
                                i17++;
                                eVar = eVar;
                                if (i17 == 1) {
                                    bravo = rVar2;
                                } else {
                                    if (eVar == null) {
                                        eVar = new J.e(new T.r[16]);
                                    }
                                    if (bravo != null) {
                                        eVar.bravo(bravo);
                                        bravo = null;
                                    }
                                    eVar.bravo(rVar2);
                                }
                            }
                            rVar2 = rVar2.getChild$ui_release();
                            bravo = bravo;
                            eVar = eVar;
                        }
                        if (i17 == 1) {
                            i5 = i4;
                            abstractC2556p = bravo;
                            eVar = eVar;
                        }
                    }
                    bravo = AbstractC2555o.bravo(eVar);
                    i5 = i4;
                    abstractC2556p = bravo;
                    eVar = eVar;
                }
            }
        }
        if (z10) {
            E(rVar, c2545e, j5, c2561v, i4, z2, f5);
            return;
        }
        switch (c2545e.alpha) {
            case 1:
                AbstractC2556p abstractC2556p2 = rVar;
                ?? r22 = 0;
                while (abstractC2556p2 != 0) {
                    if (abstractC2556p2 instanceof b0) {
                        ((b0) abstractC2556p2).bronze();
                    } else if ((abstractC2556p2.getKindSet$ui_release() & 16) != 0 && (abstractC2556p2 instanceof AbstractC2556p)) {
                        T.r rVar3 = abstractC2556p2.purple;
                        int i18 = 0;
                        abstractC2556p2 = abstractC2556p2;
                        r22 = r22;
                        while (rVar3 != null) {
                            if ((rVar3.getKindSet$ui_release() & 16) != 0) {
                                i18++;
                                r22 = r22;
                                if (i18 == 1) {
                                    abstractC2556p2 = rVar3;
                                } else {
                                    if (r22 == 0) {
                                        r22 = new J.e(new T.r[16]);
                                    }
                                    if (abstractC2556p2 != 0) {
                                        r22.bravo(abstractC2556p2);
                                        abstractC2556p2 = 0;
                                    }
                                    r22.bravo(rVar3);
                                }
                            }
                            rVar3 = rVar3.getChild$ui_release();
                            abstractC2556p2 = abstractC2556p2;
                            r22 = r22;
                        }
                        if (i18 == 1) {
                        }
                    }
                    abstractC2556p2 = AbstractC2555o.bravo(r22);
                }
                break;
        }
        N(AbstractC2557q.charlie(rVar, c2545e.bravo()), c2545e, j5, c2561v, i4, z2, f5, false);
    }

    public abstract void O(InterfaceC0364r interfaceC0364r, C1564b c1564b);

    public final void P(long j5, float f5, Function1 function1) {
        X(function1, false);
        boolean alpha = Q0.k.alpha(this.f13262t, j5);
        al alVar = this.f13251i;
        if (!alpha) {
            ((C2946x) ao.alpha(alVar)).cyan(-4.0f);
            this.f13262t = j5;
            alVar.f13306y.papa.e();
            U u4 = this.C;
            if (u4 != null) {
                ((C2907c0) u4).echo(j5);
            } else {
                L l10 = this.f13253k;
                if (l10 != null) {
                    l10.H();
                }
            }
            J.e zulu = alVar.zulu();
            Object[] objArr = zulu.alpha;
            int i4 = zulu.red;
            for (int i5 = 0; i5 < i4; i5++) {
                ((al) objArr[i5]).bronze();
            }
            at.m(this);
            C2946x c2946x = alVar.f13287f;
            if (c2946x != null) {
                c2946x.victor(alVar);
            }
        }
        this.f13263u = f5;
        if (!this.f13312d) {
            e(i());
        }
        if (this == ((L) alVar.f13305x.foxtrot)) {
            ((C2946x) ao.alpha(alVar)).getRectManager().foxtrot(alVar, !alVar.f13306y.papa.f13219d);
        }
    }

    public final void Q(Z.a aVar, boolean z2, boolean z10) {
        U u4 = this.C;
        if (u4 != null) {
            if (this.f13255m) {
                if (z10) {
                    long z11 = z();
                    float intBitsToFloat = Float.intBitsToFloat((int) (z11 >> 32)) / 2.0f;
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (z11 & 4294967295L)) / 2.0f;
                    long j5 = this.red;
                    aVar.echo(-intBitsToFloat, -intBitsToFloat2, ((int) (j5 >> 32)) + intBitsToFloat, ((int) (j5 & 4294967295L)) + intBitsToFloat2);
                } else if (z2) {
                    long j6 = this.red;
                    aVar.echo(0.0f, 0.0f, (int) (j6 >> 32), (int) (j6 & 4294967295L));
                }
                if (aVar.foxtrot()) {
                    return;
                }
            }
            ((C2907c0) u4).charlie(aVar, false);
        }
        long j7 = this.f13262t;
        float f5 = (int) (j7 >> 32);
        aVar.bravo += f5;
        aVar.delta += f5;
        float f10 = (int) (j7 & 4294967295L);
        aVar.charlie += f10;
        aVar.echo += f10;
    }

    public final void R() {
        if (this.C != null) {
            X(null, false);
            this.f13251i.ochre(false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00ed, code lost:
    
        if (r3.echo != 0) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [J.e] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [J.e] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [T.r] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [T.r] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S(q0.aq aqVar) {
        L l10;
        boolean z2;
        boolean z10;
        boolean z11 = true;
        q0.aq aqVar2 = this.f13260r;
        if (aqVar != aqVar2) {
            this.f13260r = aqVar;
            al alVar = this.f13251i;
            int i4 = 0;
            if (aqVar2 == null || aqVar.bravo() != aqVar2.bravo() || aqVar.alpha() != aqVar2.alpha()) {
                int bravo = aqVar.bravo();
                int alpha = aqVar.alpha();
                U u4 = this.C;
                if (u4 != null) {
                    ((C2907c0) u4).foxtrot((bravo << 32) | (alpha & 4294967295L));
                } else if (alVar.emerald() && (l10 = this.f13253k) != null) {
                    l10.H();
                }
                yellow((alpha & 4294967295L) | (bravo << 32));
                if (this.f13256n != null) {
                    Y(false);
                }
                boolean hotel = M.hotel(4);
                T.r A = A();
                if (hotel || (A = A.getParent$ui_release()) != null) {
                    for (T.r C = C(hotel); C != null && (C.getAggregateChildKindSet$ui_release() & 4) != 0; C = C.getChild$ui_release()) {
                        if ((C.getKindSet$ui_release() & 4) != 0) {
                            AbstractC2556p abstractC2556p = C;
                            ?? r10 = 0;
                            while (abstractC2556p != 0) {
                                if (abstractC2556p instanceof InterfaceC2558s) {
                                    ((InterfaceC2558s) abstractC2556p).blue();
                                } else if ((abstractC2556p.getKindSet$ui_release() & 4) != 0 && (abstractC2556p instanceof AbstractC2556p)) {
                                    T.r rVar = abstractC2556p.purple;
                                    int i5 = 0;
                                    abstractC2556p = abstractC2556p;
                                    r10 = r10;
                                    while (rVar != null) {
                                        if ((rVar.getKindSet$ui_release() & 4) != 0) {
                                            i5++;
                                            r10 = r10;
                                            if (i5 == 1) {
                                                abstractC2556p = rVar;
                                            } else {
                                                if (r10 == 0) {
                                                    r10 = new J.e(new T.r[16]);
                                                }
                                                if (abstractC2556p != 0) {
                                                    r10.bravo(abstractC2556p);
                                                    abstractC2556p = 0;
                                                }
                                                r10.bravo(rVar);
                                            }
                                        }
                                        rVar = rVar.getChild$ui_release();
                                        abstractC2556p = abstractC2556p;
                                        r10 = r10;
                                    }
                                    if (i5 == 1) {
                                    }
                                }
                                abstractC2556p = AbstractC2555o.bravo(r10);
                            }
                        }
                        if (C == A) {
                            break;
                        }
                    }
                }
                C2946x c2946x = alVar.f13287f;
                if (c2946x != null) {
                    c2946x.victor(alVar);
                }
            }
            bv.ag agVar = this.f13261s;
            if (agVar != null) {
                Intrinsics.checkNotNull(agVar);
            }
            if (aqVar.charlie().isEmpty()) {
                return;
            }
            bv.ag agVar2 = this.f13261s;
            Map charlie = aqVar.charlie();
            if (agVar2 != null && agVar2.echo == charlie.size()) {
                Object[] objArr = agVar2.bravo;
                int[] iArr = agVar2.charlie;
                long[] jArr = agVar2.alpha;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    loop0: while (true) {
                        long j5 = jArr[i10];
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i11 = 8 - ((~(i10 - length)) >>> 31);
                            int i12 = i4;
                            while (i12 < i11) {
                                if ((j5 & 255) < 128) {
                                    int i13 = (i10 << 3) + i12;
                                    Object obj = objArr[i13];
                                    z10 = z11;
                                    int i14 = iArr[i13];
                                    Integer num = (Integer) charlie.get((C2396o) obj);
                                    if (num == null || num.intValue() != i14) {
                                        break loop0;
                                    }
                                } else {
                                    z10 = z11;
                                }
                                j5 >>= 8;
                                i12++;
                                z11 = z10;
                            }
                            z2 = z11;
                            if (i11 != 8) {
                                return;
                            }
                        } else {
                            z2 = z11;
                        }
                        if (i10 != length) {
                            i10++;
                            z11 = z2;
                            i4 = 0;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            alVar.f13306y.papa.f13231q.foxtrot();
            bv.ag agVar3 = this.f13261s;
            if (agVar3 == null) {
                bv.ag agVar4 = bv.aq.alpha;
                agVar3 = new bv.ag();
                this.f13261s = agVar3;
            }
            agVar3.alpha();
            for (Map.Entry entry : aqVar.charlie().entrySet()) {
                agVar3.hotel(((Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    public final Z.c U() {
        boolean india = india();
        Z.c cVar = Z.c.echo;
        if (india) {
            q0.z hotel = AbstractC2375K.hotel(this);
            Z.a aVar = this.f13264v;
            if (aVar == null) {
                aVar = new Z.a();
                this.f13264v = aVar;
            }
            long r4 = r(z());
            int i4 = (int) (r4 >> 32);
            aVar.bravo = -Float.intBitsToFloat(i4);
            int i5 = (int) (r4 & 4294967295L);
            aVar.charlie = -Float.intBitsToFloat(i5);
            aVar.delta = Float.intBitsToFloat(i4) + navy();
            aVar.echo = Float.intBitsToFloat(i5) + maroon();
            L l10 = this;
            while (l10 != hotel) {
                l10.Q(aVar, false, true);
                if (!aVar.foxtrot()) {
                    l10 = l10.f13253k;
                    Intrinsics.checkNotNull(l10);
                }
            }
            return new Z.c(aVar.bravo, aVar.charlie, aVar.delta, aVar.echo);
        }
        return cVar;
    }

    public final void V(L l10, float[] fArr) {
        float[] alpha;
        if (!Intrinsics.areEqual(l10, this)) {
            L l11 = this.f13253k;
            Intrinsics.checkNotNull(l11);
            l11.V(l10, fArr);
            if (!Q0.k.alpha(this.f13262t, 0L)) {
                float[] fArr2 = f13248H;
                C0347ag.delta(fArr2);
                long j5 = this.f13262t;
                C0347ag.foxtrot(fArr2, -((int) (j5 >> 32)), -((int) (j5 & 4294967295L)));
                C0347ag.echo(fArr, fArr2);
            }
            U u4 = this.C;
            if (u4 != null && (alpha = ((C2907c0) u4).alpha()) != null) {
                C0347ag.echo(fArr, alpha);
            }
        }
    }

    public final void W(L l10, float[] fArr) {
        L l11 = this;
        while (!Intrinsics.areEqual(l11, l10)) {
            U u4 = l11.C;
            if (u4 != null) {
                C0347ag.echo(fArr, ((C2907c0) u4).bravo());
            }
            if (!Q0.k.alpha(l11.f13262t, 0L)) {
                float[] fArr2 = f13248H;
                C0347ag.delta(fArr2);
                C0347ag.foxtrot(fArr2, (int) (r1 >> 32), (int) (r1 & 4294967295L));
                C0347ag.echo(fArr, fArr2);
            }
            l11 = l11.f13253k;
            Intrinsics.checkNotNull(l11);
        }
    }

    public final void X(Function1 function1, boolean z2) {
        boolean z10;
        C2946x c2946x;
        gd.a aVar;
        Reference poll;
        J.e eVar;
        C0092c c0092c;
        Reference poll2;
        J.e eVar2;
        Object obj;
        al alVar = this.f13251i;
        if (!z2 && this.f13256n == function1 && Intrinsics.areEqual(this.f13257o, alVar.f13298q) && this.f13258p == alVar.f13299r) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f13257o = alVar.f13298q;
        this.f13258p = alVar.f13299r;
        boolean cyan = alVar.cyan();
        I i4 = this.A;
        if (cyan && function1 != null) {
            this.f13256n = function1;
            if (this.C == null) {
                W alpha = ao.alpha(alVar);
                C0092c c0092c2 = this.f13268z;
                if (c0092c2 == null) {
                    C0092c c0092c3 = new C0092c(9, this, new I(this, 0));
                    this.f13268z = c0092c3;
                    c0092c = c0092c3;
                } else {
                    c0092c = c0092c2;
                }
                C2946x c2946x2 = (C2946x) alpha;
                do {
                    gd.a aVar2 = c2946x2.f13901n0;
                    poll2 = ((ReferenceQueue) aVar2.red).poll();
                    eVar2 = (J.e) aVar2.purple;
                    if (poll2 != null) {
                        eVar2.lima(poll2);
                    }
                } while (poll2 != null);
                while (true) {
                    int i5 = eVar2.red;
                    if (i5 != 0) {
                        obj = ((Reference) eVar2.mike(i5 - 1)).get();
                        if (obj != null) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                U u4 = (U) obj;
                if (u4 != null) {
                    C2907c0 c2907c0 = (C2907c0) u4;
                    InterfaceC0341aa interfaceC0341aa = c2907c0.purple;
                    if (interfaceC0341aa != null) {
                        if (!c2907c0.alpha.sierra) {
                            AbstractC2264a.alpha("layer should have been released before reuse");
                        }
                        c2907c0.alpha = interfaceC0341aa.bravo();
                        c2907c0.yellow = false;
                        c2907c0.silver = c0092c;
                        c2907c0.teal = i4;
                        c2907c0.f13841j = false;
                        c2907c0.f13842k = false;
                        c2907c0.f13843l = true;
                        C0347ag.delta(c2907c0.f13833a);
                        float[] fArr = c2907c0.f13834b;
                        if (fArr != null) {
                            C0347ag.delta(fArr);
                        }
                        c2907c0.f13839h = a0.aw.bravo;
                        c2907c0.f13844m = false;
                        long j5 = LottieConstants.IterateForever;
                        c2907c0.white = (j5 & 4294967295L) | (j5 << 32);
                        c2907c0.f13840i = null;
                        c2907c0.f13838g = 0;
                    } else {
                        throw Q0.c.xray("currently reuse is only supported when we manage the layer lifecycle");
                    }
                } else {
                    u4 = new C2907c0(c2946x2.getGraphicsContext().bravo(), c2946x2.getGraphicsContext(), c2946x2, c0092c, i4);
                }
                C2907c0 c2907c02 = (C2907c0) u4;
                c2907c02.foxtrot(this.red);
                c2907c02.echo(this.f13262t);
                this.C = u4;
                Y(true);
                alVar.B = true;
                i4.invoke();
                return;
            }
            if (z10 && Y(true)) {
                ((C2946x) ao.alpha(alVar)).getRectManager().echo(alVar);
                return;
            }
            return;
        }
        this.f13256n = null;
        U u10 = this.C;
        if (u10 != null) {
            C2907c0 c2907c03 = (C2907c0) u10;
            c2907c03.silver = null;
            c2907c03.teal = null;
            c2907c03.yellow = true;
            boolean z11 = c2907c03.f13835c;
            C2946x c2946x3 = c2907c03.red;
            if (z11) {
                c2907c03.f13835c = false;
                c2946x3.tango(c2907c03, false);
            }
            InterfaceC0341aa interfaceC0341aa2 = c2907c03.purple;
            if (interfaceC0341aa2 != null) {
                interfaceC0341aa2.alpha(c2907c03.alpha);
                do {
                    aVar = c2946x3.f13901n0;
                    poll = ((ReferenceQueue) aVar.red).poll();
                    eVar = (J.e) aVar.purple;
                    if (poll != null) {
                        eVar.lima(poll);
                    }
                } while (poll != null);
                eVar.bravo(new WeakReference(c2907c03, (ReferenceQueue) aVar.red));
                c2946x3.f13906q.remove(c2907c03);
            }
            alVar.B = true;
            i4.invoke();
            if (india() && alVar.emerald() && (c2946x = alVar.f13287f) != null) {
                c2946x.victor(alVar);
            }
        }
        this.C = null;
        this.B = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0406  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Y(boolean z2) {
        C2565z c2565z;
        int i4;
        long j5;
        boolean z10;
        boolean z11;
        int i5;
        C2946x c2946x;
        boolean z12;
        C2946x c2946x2;
        I i10;
        int i11;
        I i12;
        U u4 = this.C;
        if (u4 != null) {
            Function1 function1 = this.f13256n;
            if (function1 != null) {
                a0.ap apVar = f13246F;
                apVar.hotel(1.0f);
                apVar.india(1.0f);
                apVar.charlie(1.0f);
                apVar.oscar(0.0f);
                apVar.juliet(0.0f);
                long j6 = AbstractC0343ac.alpha;
                apVar.delta(j6);
                apVar.lima(j6);
                apVar.golf(0.0f);
                if (apVar.f2577c != 8.0f) {
                    apVar.alpha |= 2048;
                    apVar.f2577c = 8.0f;
                }
                long j7 = a0.aw.bravo;
                apVar.november(j7);
                apVar.kilo(a0.ao.alpha);
                apVar.foxtrot(false);
                if (!Intrinsics.areEqual(null, null)) {
                    apVar.alpha |= 131072;
                }
                if (!Intrinsics.areEqual(null, null)) {
                    apVar.alpha |= 262144;
                }
                if (apVar.f2584k != 3) {
                    apVar.alpha |= 524288;
                    apVar.f2584k = 3;
                }
                if (apVar.f2580g != 0) {
                    apVar.alpha |= 32768;
                    apVar.f2580g = 0;
                }
                apVar.f2581h = 9205357640488583168L;
                apVar.f2585l = null;
                apVar.alpha = 0;
                al alVar = this.f13251i;
                apVar.f2582i = alVar.f13298q;
                apVar.f2583j = alVar.f13299r;
                apVar.f2581h = AbstractC2627c7.bravo(this.red);
                ((C2946x) ao.alpha(alVar)).getSnapshotObserver().alpha(this, f13244D, new C2474j(3, function1));
                C2565z c2565z2 = this.f13265w;
                if (c2565z2 == null) {
                    c2565z2 = new C2565z();
                    this.f13265w = c2565z2;
                }
                C2565z c2565z3 = f13247G;
                c2565z3.getClass();
                c2565z3.alpha = c2565z2.alpha;
                c2565z3.bravo = c2565z2.bravo;
                c2565z3.charlie = c2565z2.charlie;
                c2565z3.delta = c2565z2.delta;
                c2565z3.echo = c2565z2.echo;
                c2565z3.foxtrot = c2565z2.foxtrot;
                float f5 = apVar.purple;
                c2565z2.alpha = f5;
                c2565z2.bravo = apVar.red;
                c2565z2.charlie = apVar.teal;
                c2565z2.delta = apVar.f2576b;
                c2565z2.echo = apVar.f2577c;
                long j10 = apVar.f2578d;
                c2565z2.foxtrot = j10;
                C2907c0 c2907c0 = (C2907c0) u4;
                int i13 = c2907c0.f13838g | apVar.alpha;
                c2907c0.e = apVar.f2583j;
                c2907c0.f13836d = apVar.f2582i;
                int i14 = i13 & 4096;
                if (i14 != 0) {
                    c2907c0.f13839h = j10;
                }
                if ((i13 & 1) != 0) {
                    InterfaceC1566d interfaceC1566d = c2907c0.alpha.alpha;
                    if (interfaceC1566d.bravo() != f5) {
                        interfaceC1566d.amber(f5);
                    }
                }
                if ((i13 & 2) != 0) {
                    C1564b c1564b = c2907c0.alpha;
                    float f10 = apVar.red;
                    InterfaceC1566d interfaceC1566d2 = c1564b.alpha;
                    if (interfaceC1566d2.gray() != f10) {
                        interfaceC1566d2.lima(f10);
                    }
                }
                if ((i13 & 4) != 0) {
                    C1564b c1564b2 = c2907c0.alpha;
                    float f11 = apVar.silver;
                    InterfaceC1566d interfaceC1566d3 = c1564b2.alpha;
                    if (interfaceC1566d3.alpha() != f11) {
                        interfaceC1566d3.uniform(f11);
                    }
                }
                if ((i13 & 8) != 0) {
                    InterfaceC1566d interfaceC1566d4 = c2907c0.alpha.alpha;
                    if (interfaceC1566d4.beige() != 0.0f) {
                        interfaceC1566d4.black();
                    }
                }
                if ((i13 & 16) != 0) {
                    C1564b c1564b3 = c2907c0.alpha;
                    float f12 = apVar.teal;
                    InterfaceC1566d interfaceC1566d5 = c1564b3.alpha;
                    if (interfaceC1566d5.victor() != f12) {
                        interfaceC1566d5.foxtrot(f12);
                    }
                }
                if ((i13 & 32) != 0) {
                    C1564b c1564b4 = c2907c0.alpha;
                    float f13 = apVar.white;
                    InterfaceC1566d interfaceC1566d6 = c1564b4.alpha;
                    if (interfaceC1566d6.gold() != f13) {
                        interfaceC1566d6.charlie(f13);
                        c1564b4.golf = true;
                        c1564b4.alpha();
                    }
                    if (apVar.white > 0.0f && !c2907c0.f13844m && (i12 = c2907c0.teal) != null) {
                        i12.invoke();
                    }
                }
                if ((i13 & 64) != 0) {
                    C1564b c1564b5 = c2907c0.alpha;
                    c2565z = c2565z3;
                    long j11 = apVar.yellow;
                    InterfaceC1566d interfaceC1566d7 = c1564b5.alpha;
                    i4 = i14;
                    if (!C0366t.charlie(j11, interfaceC1566d7.sierra())) {
                        interfaceC1566d7.yankee(j11);
                    }
                } else {
                    c2565z = c2565z3;
                    i4 = i14;
                }
                if ((i13 & 128) != 0) {
                    C1564b c1564b6 = c2907c0.alpha;
                    long j12 = apVar.f2575a;
                    InterfaceC1566d interfaceC1566d8 = c1564b6.alpha;
                    if (!C0366t.charlie(j12, interfaceC1566d8.xray())) {
                        interfaceC1566d8.cyan(j12);
                    }
                }
                if ((i13 & Barcode.FORMAT_UPC_E) != 0) {
                    C1564b c1564b7 = c2907c0.alpha;
                    float f14 = apVar.f2576b;
                    InterfaceC1566d interfaceC1566d9 = c1564b7.alpha;
                    if (interfaceC1566d9.quebec() != f14) {
                        interfaceC1566d9.echo(f14);
                    }
                }
                if ((i13 & Barcode.FORMAT_QR_CODE) != 0) {
                    InterfaceC1566d interfaceC1566d10 = c2907c0.alpha.alpha;
                    if (interfaceC1566d10.bronze() != 0.0f) {
                        interfaceC1566d10.tango();
                    }
                }
                if ((i13 & 512) != 0) {
                    InterfaceC1566d interfaceC1566d11 = c2907c0.alpha.alpha;
                    if (interfaceC1566d11.november() != 0.0f) {
                        interfaceC1566d11.whiskey();
                    }
                }
                if ((i13 & 2048) != 0) {
                    C1564b c1564b8 = c2907c0.alpha;
                    float f15 = apVar.f2577c;
                    InterfaceC1566d interfaceC1566d12 = c1564b8.alpha;
                    if (interfaceC1566d12.azure() != f15) {
                        interfaceC1566d12.fuchsia(f15);
                    }
                }
                if (i4 != 0) {
                    if (a0.aw.alpha(c2907c0.f13839h, j7)) {
                        C1564b c1564b9 = c2907c0.alpha;
                        if (!Z.b.bravo(c1564b9.victor, 9205357640488583168L)) {
                            c1564b9.victor = 9205357640488583168L;
                            c1564b9.alpha.romeo(9205357640488583168L);
                        }
                    } else {
                        C1564b c1564b10 = c2907c0.alpha;
                        j5 = 4294967295L;
                        long floatToRawIntBits = (Float.floatToRawIntBits(a0.aw.bravo(c2907c0.f13839h) * ((int) (c2907c0.white >> 32))) << 32) | (Float.floatToRawIntBits(a0.aw.charlie(c2907c0.f13839h) * ((int) (c2907c0.white & 4294967295L))) & 4294967295L);
                        if (!Z.b.bravo(c1564b10.victor, floatToRawIntBits)) {
                            c1564b10.victor = floatToRawIntBits;
                            c1564b10.alpha.romeo(floatToRawIntBits);
                        }
                        if ((i13 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                            C1564b c1564b11 = c2907c0.alpha;
                            boolean z13 = apVar.f2579f;
                            if (c1564b11.whiskey != z13) {
                                c1564b11.whiskey = z13;
                                c1564b11.golf = true;
                                c1564b11.alpha();
                            }
                        }
                        if ((i13 & 131072) != 0) {
                            InterfaceC1566d interfaceC1566d13 = c2907c0.alpha.alpha;
                            if (!Intrinsics.areEqual(null, null)) {
                                interfaceC1566d13.delta();
                            }
                        }
                        if ((i13 & 262144) != 0) {
                            InterfaceC1566d interfaceC1566d14 = c2907c0.alpha.alpha;
                            if (!Intrinsics.areEqual(interfaceC1566d14.kilo(), null)) {
                                interfaceC1566d14.zulu();
                            }
                        }
                        if ((i13 & 524288) != 0) {
                            C1564b c1564b12 = c2907c0.alpha;
                            int i15 = apVar.f2584k;
                            InterfaceC1566d interfaceC1566d15 = c1564b12.alpha;
                            if (interfaceC1566d15.green() != i15) {
                                interfaceC1566d15.hotel(i15);
                            }
                        }
                        if ((i13 & 32768) != 0) {
                            C1564b c1564b13 = c2907c0.alpha;
                            int i16 = apVar.f2580g;
                            if (i16 == 0) {
                                i11 = 0;
                            } else if (i16 == 1) {
                                i11 = 1;
                            } else {
                                i11 = 2;
                                if (i16 != 2) {
                                    throw new IllegalStateException("Not supported composition strategy");
                                }
                            }
                            InterfaceC1566d interfaceC1566d16 = c1564b13.alpha;
                            if (interfaceC1566d16.juliet() != i11) {
                                interfaceC1566d16.crimson(i11);
                            }
                        }
                        if ((i13 & 7963) != 0) {
                            c2907c0.f13841j = true;
                            c2907c0.f13842k = true;
                        }
                        if (Intrinsics.areEqual(c2907c0.f13840i, apVar.f2585l)) {
                            a0.ao aoVar = apVar.f2585l;
                            c2907c0.f13840i = aoVar;
                            if (aoVar == null) {
                                z10 = true;
                            } else {
                                C1564b c1564b14 = c2907c0.alpha;
                                if (aoVar instanceof a0.ai) {
                                    Z.c cVar = ((a0.ai) aoVar).echo;
                                    long floatToRawIntBits2 = Float.floatToRawIntBits(cVar.alpha);
                                    float f16 = cVar.bravo;
                                    c1564b14.foxtrot((floatToRawIntBits2 << 32) | (Float.floatToRawIntBits(f16) & j5), (Float.floatToRawIntBits(cVar.charlie - r10) << 32) | (Float.floatToRawIntBits(cVar.delta - f16) & j5), 0.0f);
                                } else if (aoVar instanceof a0.ah) {
                                    c1564b14.kilo = null;
                                    c1564b14.india = 9205357640488583168L;
                                    c1564b14.hotel = 0L;
                                    c1564b14.juliet = 0.0f;
                                    c1564b14.golf = true;
                                    c1564b14.november = false;
                                    c1564b14.lima = ((a0.ah) aoVar).echo;
                                    c1564b14.alpha();
                                } else if (aoVar instanceof a0.aj) {
                                    a0.aj ajVar = (a0.aj) aoVar;
                                    C0354h c0354h = ajVar.foxtrot;
                                    if (c0354h != null) {
                                        c1564b14.kilo = null;
                                        c1564b14.india = 9205357640488583168L;
                                        c1564b14.hotel = 0L;
                                        c1564b14.juliet = 0.0f;
                                        z10 = true;
                                        c1564b14.golf = true;
                                        c1564b14.november = false;
                                        c1564b14.lima = c0354h;
                                        c1564b14.alpha();
                                    } else {
                                        z10 = true;
                                        c1564b14.foxtrot((Float.floatToRawIntBits(r7.alpha) << 32) | (Float.floatToRawIntBits(r7.bravo) & j5), (Float.floatToRawIntBits(r7.bravo()) << 32) | (Float.floatToRawIntBits(r7.alpha()) & j5), Float.intBitsToFloat((int) (ajVar.echo.hotel >> 32)));
                                    }
                                    if ((aoVar instanceof a0.ah) && Build.VERSION.SDK_INT < 33 && (i10 = c2907c0.teal) != null) {
                                        i10.invoke();
                                    }
                                } else {
                                    throw new NoWhenBranchMatchedException();
                                }
                                z10 = true;
                                if (aoVar instanceof a0.ah) {
                                    i10.invoke();
                                }
                            }
                            z11 = z10;
                        } else {
                            z10 = true;
                            z11 = false;
                        }
                        c2907c0.f13838g = apVar.alpha;
                        if (i13 == 0 || z11) {
                            i5 = Build.VERSION.SDK_INT;
                            c2946x = c2907c0.red;
                            if (i5 < 26) {
                                ViewParent parent = c2946x.getParent();
                                if (parent != null) {
                                    parent.onDescendantInvalidated(c2946x, c2946x);
                                }
                            } else {
                                c2946x.invalidate();
                            }
                            if (c2946x.white) {
                                c2946x.cyan(0.0f);
                            }
                        }
                        boolean z14 = this.f13255m;
                        this.f13255m = apVar.f2579f;
                        this.f13259q = apVar.silver;
                        if (c2565z.alpha != c2565z2.alpha && c2565z.bravo == c2565z2.bravo && c2565z.charlie == c2565z2.charlie && c2565z.delta == c2565z2.delta && c2565z.echo == c2565z2.echo && a0.aw.alpha(c2565z.foxtrot, c2565z2.foxtrot)) {
                            z12 = z10;
                        } else {
                            z12 = false;
                        }
                        boolean z15 = !z12;
                        if (z2 && ((!z12 || z14 != this.f13255m) && (c2946x2 = alVar.f13287f) != null)) {
                            c2946x2.victor(alVar);
                        }
                        return z15;
                    }
                }
                j5 = 4294967295L;
                if ((i13 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                }
                if ((i13 & 131072) != 0) {
                }
                if ((i13 & 262144) != 0) {
                }
                if ((i13 & 524288) != 0) {
                }
                if ((i13 & 32768) != 0) {
                }
                if ((i13 & 7963) != 0) {
                }
                if (Intrinsics.areEqual(c2907c0.f13840i, apVar.f2585l)) {
                }
                c2907c0.f13838g = apVar.alpha;
                if (i13 == 0) {
                }
                i5 = Build.VERSION.SDK_INT;
                c2946x = c2907c0.red;
                if (i5 < 26) {
                }
                if (c2946x.white) {
                }
                boolean z142 = this.f13255m;
                this.f13255m = apVar.f2579f;
                this.f13259q = apVar.silver;
                if (c2565z.alpha != c2565z2.alpha) {
                }
                z12 = false;
                boolean z152 = !z12;
                if (z2) {
                    c2946x2.victor(alVar);
                }
                return z152;
            }
            throw Q0.c.xray("updateLayerParameters requires a non-null layerBlock");
        }
        if (this.f13256n == null) {
            return false;
        }
        AbstractC2264a.bravo("null layer with a non-null layerBlock");
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        if (r5 < r1.delta) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Z(long j5) {
        boolean z2;
        boolean z10;
        boolean z11;
        if ((((9187343241974906880L ^ (j5 & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) == 0) {
            U u4 = this.C;
            if (u4 != null && this.f13255m) {
                float intBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L));
                C1564b c1564b = ((C2907c0) u4).alpha;
                if (c1564b.whiskey) {
                    a0.ao delta = c1564b.delta();
                    if (delta instanceof a0.ai) {
                        Z.c cVar = ((a0.ai) delta).echo;
                        if (cVar.alpha <= intBitsToFloat) {
                            if (intBitsToFloat < cVar.charlie) {
                                if (cVar.bravo <= intBitsToFloat2) {
                                }
                            }
                        }
                    } else {
                        if (delta instanceof a0.aj) {
                            Z.d dVar = ((a0.aj) delta).echo;
                            float f5 = dVar.alpha;
                            if (intBitsToFloat >= f5) {
                                float f10 = dVar.charlie;
                                if (intBitsToFloat < f10) {
                                    float f11 = dVar.bravo;
                                    if (intBitsToFloat2 >= f11) {
                                        float f12 = dVar.delta;
                                        if (intBitsToFloat2 < f12) {
                                            long j6 = dVar.echo;
                                            z2 = false;
                                            z10 = true;
                                            int i4 = (int) (j6 >> 32);
                                            float intBitsToFloat3 = Float.intBitsToFloat(i4);
                                            long j7 = dVar.foxtrot;
                                            int i5 = (int) (j7 >> 32);
                                            if (Float.intBitsToFloat(i5) + intBitsToFloat3 <= dVar.bravo()) {
                                                long j10 = dVar.hotel;
                                                int i10 = (int) (j10 >> 32);
                                                float intBitsToFloat4 = Float.intBitsToFloat(i10);
                                                long j11 = dVar.golf;
                                                int i11 = (int) (j11 >> 32);
                                                if (Float.intBitsToFloat(i11) + intBitsToFloat4 <= dVar.bravo()) {
                                                    int i12 = (int) (j6 & 4294967295L);
                                                    int i13 = (int) (j10 & 4294967295L);
                                                    if (Float.intBitsToFloat(i13) + Float.intBitsToFloat(i12) <= dVar.alpha()) {
                                                        int i14 = (int) (j7 & 4294967295L);
                                                        int i15 = (int) (j11 & 4294967295L);
                                                        if (Float.intBitsToFloat(i15) + Float.intBitsToFloat(i14) <= dVar.alpha()) {
                                                            float intBitsToFloat5 = Float.intBitsToFloat(i4) + f5;
                                                            float intBitsToFloat6 = Float.intBitsToFloat(i12) + f11;
                                                            float intBitsToFloat7 = f10 - Float.intBitsToFloat(i5);
                                                            float intBitsToFloat8 = Float.intBitsToFloat(i14) + f11;
                                                            float intBitsToFloat9 = f10 - Float.intBitsToFloat(i11);
                                                            float intBitsToFloat10 = f12 - Float.intBitsToFloat(i15);
                                                            float intBitsToFloat11 = f12 - Float.intBitsToFloat(i13);
                                                            float intBitsToFloat12 = Float.intBitsToFloat(i10) + f5;
                                                            if (intBitsToFloat < intBitsToFloat5 && intBitsToFloat2 < intBitsToFloat6) {
                                                                z11 = t0.W.lima(intBitsToFloat, intBitsToFloat2, intBitsToFloat5, intBitsToFloat6, dVar.echo);
                                                            } else if (intBitsToFloat < intBitsToFloat12 && intBitsToFloat2 > intBitsToFloat11) {
                                                                z11 = t0.W.lima(intBitsToFloat, intBitsToFloat2, intBitsToFloat12, intBitsToFloat11, dVar.hotel);
                                                            } else if (intBitsToFloat > intBitsToFloat7 && intBitsToFloat2 < intBitsToFloat8) {
                                                                z11 = t0.W.lima(intBitsToFloat, intBitsToFloat2, intBitsToFloat7, intBitsToFloat8, dVar.foxtrot);
                                                            } else {
                                                                if (intBitsToFloat > intBitsToFloat9 && intBitsToFloat2 > intBitsToFloat10) {
                                                                    z11 = t0.W.lima(intBitsToFloat, intBitsToFloat2, intBitsToFloat9, intBitsToFloat10, dVar.golf);
                                                                }
                                                                z11 = z10;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            C0354h alpha = AbstractC0358l.alpha();
                                            Q0.c.juliet(alpha, dVar);
                                            z11 = t0.W.kilo(intBitsToFloat, intBitsToFloat2, alpha);
                                        }
                                    }
                                }
                            }
                        } else {
                            z2 = false;
                            z10 = true;
                            if (delta instanceof a0.ah) {
                                z11 = t0.W.kilo(intBitsToFloat, intBitsToFloat2, ((a0.ah) delta).echo);
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                        if (z11) {
                            return z10;
                        }
                        return z2;
                    }
                    z2 = false;
                    z10 = true;
                    z11 = false;
                    if (z11) {
                    }
                }
                z2 = false;
                z10 = true;
                z11 = z10;
                if (z11) {
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    @Override // Q0.d
    public final float alpha() {
        return this.f13251i.f13298q.alpha();
    }

    @Override // q0.z
    public final q0.z amber() {
        if (!india()) {
            AbstractC2264a.bravo("LayoutCoordinate operations are only valid when isAttached is true");
        }
        K();
        return ((L) this.f13251i.f13305x.foxtrot).f13253k;
    }

    @Override // q0.z
    public final void blue(q0.z zVar, float[] fArr) {
        L T4 = T(zVar);
        T4.K();
        L w4 = w(T4);
        C0347ag.delta(fArr);
        T4.W(w4, fArr);
        V(w4, fArr);
    }

    @Override // q0.z
    public final long cyan(long j5) {
        if (!india()) {
            AbstractC2264a.bravo("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return J(AbstractC2375K.hotel(this), ((C2946x) ao.alpha(this.f13251i)).black(j5));
    }

    @Override // s0.at
    public final at f() {
        return this.f13252j;
    }

    @Override // q0.z
    public final long foxtrot(long j5) {
        long gray = gray(j5);
        C2946x c2946x = (C2946x) ao.alpha(this.f13251i);
        c2946x.zulu();
        return C0347ag.bravo(gray, c2946x.f13864L);
    }

    @Override // s0.at
    public final q0.z g() {
        return this;
    }

    @Override // q0.InterfaceC2402u
    public final Q0.n getLayoutDirection() {
        return this.f13251i.f13299r;
    }

    @Override // q0.z
    public final long gray(long j5) {
        if (!india()) {
            AbstractC2264a.bravo("LayoutCoordinate operations are only valid when isAttached is true");
        }
        K();
        for (L l10 = this; l10 != null; l10 = l10.f13253k) {
            U u4 = l10.C;
            if (u4 != null) {
                j5 = ((C2907c0) u4).delta(j5, false);
            }
            j5 = AbstractC2609a7.bravo(j5, l10.f13262t);
        }
        return j5;
    }

    @Override // s0.at
    public final boolean h() {
        if (this.f13260r != null) {
            return true;
        }
        return false;
    }

    @Override // s0.at
    public final q0.aq i() {
        q0.aq aqVar = this.f13260r;
        if (aqVar != null) {
            return aqVar;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    @Override // q0.z
    public final boolean india() {
        return A().isAttached();
    }

    @Override // Q0.d
    public final float indigo() {
        return this.f13251i.f13298q.indigo();
    }

    @Override // s0.at
    public final at j() {
        return this.f13253k;
    }

    @Override // q0.z
    public final void juliet(float[] fArr) {
        W alpha = ao.alpha(this.f13251i);
        W(T(AbstractC2375K.hotel(this)), fArr);
        ((C2946x) ((m0.g) alpha)).papa(fArr);
    }

    @Override // s0.at
    public final long k() {
        return this.f13262t;
    }

    @Override // q0.z
    public final long kilo() {
        return this.red;
    }

    @Override // s0.X
    public final boolean november() {
        if (this.C != null && !this.f13254l && this.f13251i.cyan()) {
            return true;
        }
        return false;
    }

    @Override // s0.at
    public final void o() {
        silver(this.f13262t, this.f13263u, this.f13256n);
    }

    @Override // q0.z
    public final long oscar(q0.z zVar, long j5) {
        return J(zVar, j5);
    }

    public final void p(L l10, Z.a aVar, boolean z2) {
        if (l10 != this) {
            L l11 = this.f13253k;
            if (l11 != null) {
                l11.p(l10, aVar, z2);
            }
            long j5 = this.f13262t;
            float f5 = (int) (j5 >> 32);
            aVar.bravo -= f5;
            aVar.delta -= f5;
            float f10 = (int) (j5 & 4294967295L);
            aVar.charlie -= f10;
            aVar.echo -= f10;
            U u4 = this.C;
            if (u4 != null) {
                ((C2907c0) u4).charlie(aVar, true);
                if (this.f13255m && z2) {
                    long j6 = this.red;
                    aVar.echo(0.0f, 0.0f, (int) (j6 >> 32), (int) (j6 & 4294967295L));
                }
            }
        }
    }

    @Override // s0.at, s0.D
    public final al plum() {
        return this.f13251i;
    }

    public final long q(L l10, long j5) {
        if (l10 == this) {
            return j5;
        }
        L l11 = this.f13253k;
        if (l11 != null && !Intrinsics.areEqual(l10, l11)) {
            return x(l11.q(l10, j5));
        }
        return x(j5);
    }

    public final long r(long j5) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32)) - navy();
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L)) - maroon();
        float max = Math.max(0.0f, intBitsToFloat / 2.0f);
        float max2 = Math.max(0.0f, intBitsToFloat2 / 2.0f);
        return (Float.floatToRawIntBits(max2) & 4294967295L) | (Float.floatToRawIntBits(max) << 32);
    }

    public final float s(long j5, long j6) {
        float navy;
        float maroon;
        if (navy() >= Float.intBitsToFloat((int) (j6 >> 32)) && maroon() >= Float.intBitsToFloat((int) (j6 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long r4 = r(j6);
        float intBitsToFloat = Float.intBitsToFloat((int) (r4 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (r4 & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j5 >> 32));
        if (intBitsToFloat3 < 0.0f) {
            navy = -intBitsToFloat3;
        } else {
            navy = intBitsToFloat3 - navy();
        }
        float max = Math.max(0.0f, navy);
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j5 & 4294967295L));
        if (intBitsToFloat4 < 0.0f) {
            maroon = -intBitsToFloat4;
        } else {
            maroon = intBitsToFloat4 - maroon();
        }
        float max2 = Math.max(0.0f, maroon);
        long floatToRawIntBits = (Float.floatToRawIntBits(max2) & 4294967295L) | (Float.floatToRawIntBits(max) << 32);
        if (intBitsToFloat > 0.0f || intBitsToFloat2 > 0.0f) {
            int i4 = (int) (floatToRawIntBits >> 32);
            if (Float.intBitsToFloat(i4) <= intBitsToFloat) {
                int i5 = (int) (floatToRawIntBits & 4294967295L);
                if (Float.intBitsToFloat(i5) <= intBitsToFloat2) {
                    float intBitsToFloat5 = Float.intBitsToFloat(i4);
                    float intBitsToFloat6 = Float.intBitsToFloat(i5);
                    return (intBitsToFloat6 * intBitsToFloat6) + (intBitsToFloat5 * intBitsToFloat5);
                }
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    @Override // q0.z
    public final Z.c sierra(q0.z zVar, boolean z2) {
        if (!india()) {
            AbstractC2264a.bravo("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!zVar.india()) {
            AbstractC2264a.bravo("LayoutCoordinates " + zVar + " is not attached!");
        }
        L T4 = T(zVar);
        T4.K();
        L w4 = w(T4);
        Z.a aVar = this.f13264v;
        if (aVar == null) {
            aVar = new Z.a();
            this.f13264v = aVar;
        }
        aVar.bravo = 0.0f;
        aVar.charlie = 0.0f;
        aVar.delta = (int) (zVar.kilo() >> 32);
        aVar.echo = (int) (zVar.kilo() & 4294967295L);
        while (T4 != w4) {
            T4.Q(aVar, z2, false);
            if (aVar.foxtrot()) {
                return Z.c.echo;
            }
            T4 = T4.f13253k;
            Intrinsics.checkNotNull(T4);
        }
        p(w4, aVar, z2);
        return new Z.c(aVar.bravo, aVar.charlie, aVar.delta, aVar.echo);
    }

    public final void t(InterfaceC0364r interfaceC0364r, C1564b c1564b) {
        boolean z2;
        boolean z10;
        boolean z11;
        boolean z12;
        Canvas canvas;
        boolean z13;
        boolean z14;
        float f5;
        U u4 = this.C;
        if (u4 != null) {
            C2907c0 c2907c0 = (C2907c0) u4;
            c2907c0.golf();
            if (c2907c0.alpha.alpha.gold() > 0.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            c2907c0.f13844m = z2;
            c0.b bVar = c2907c0.f13837f;
            J2.t tVar = bVar.purple;
            tVar.victor(interfaceC0364r);
            tVar.purple = c1564b;
            C1564b c1564b2 = c2907c0.alpha;
            InterfaceC0364r mike = bVar.lime().mike();
            C1564b c1564b3 = (C1564b) bVar.lime().purple;
            if (!c1564b2.sierra) {
                c1564b2.alpha();
                InterfaceC1566d interfaceC1566d = c1564b2.alpha;
                if (!interfaceC1566d.oscar()) {
                    try {
                        interfaceC1566d.coral(c1564b2.bravo, c1564b2.charlie, c1564b2, c1564b2.echo);
                    } catch (Throwable unused) {
                    }
                }
                if (interfaceC1566d.gold() > 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    mike.romeo();
                }
                Canvas alpha = AbstractC0349c.alpha(mike);
                boolean isHardwareAccelerated = alpha.isHardwareAccelerated();
                if (!isHardwareAccelerated) {
                    long j5 = c1564b2.tango;
                    float f10 = (int) (j5 >> 32);
                    float f11 = (int) (j5 & 4294967295L);
                    long j6 = c1564b2.uniform;
                    float f12 = ((int) (j6 >> 32)) + f10;
                    float f13 = f11 + ((int) (j6 & 4294967295L));
                    float alpha2 = interfaceC1566d.alpha();
                    AbstractC0367u kilo = interfaceC1566d.kilo();
                    int green = interfaceC1566d.green();
                    if (alpha2 >= 1.0f && green == 3 && kilo == null && interfaceC1566d.juliet() != 1) {
                        alpha.save();
                        f5 = f10;
                    } else {
                        Be.e eVar = c1564b2.papa;
                        if (eVar == null) {
                            eVar = a0.ao.golf();
                            c1564b2.papa = eVar;
                        }
                        eVar.mike(alpha2);
                        eVar.november(green);
                        eVar.papa(kilo);
                        f5 = f10;
                        alpha.saveLayer(f5, f11, f12, f13, (Paint) eVar.bravo);
                    }
                    alpha.translate(f5, f11);
                    alpha.concat(interfaceC1566d.emerald());
                }
                if (!isHardwareAccelerated && c1564b2.whiskey) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    mike.golf();
                    a0.ao delta = c1564b2.delta();
                    if (delta instanceof a0.ai) {
                        mike.papa(((a0.ai) delta).echo);
                    } else if (delta instanceof a0.aj) {
                        C0354h c0354h = c1564b2.mike;
                        if (c0354h != null) {
                            c0354h.alpha.rewind();
                        } else {
                            c0354h = AbstractC0358l.alpha();
                            c1564b2.mike = c0354h;
                        }
                        Q0.c.juliet(c0354h, ((a0.aj) delta).echo);
                        mike.kilo(c0354h);
                    } else if (delta instanceof a0.ah) {
                        mike.kilo(((a0.ah) delta).echo);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                if (c1564b3 != null) {
                    E.s sVar = c1564b3.romeo;
                    if (!sVar.alpha) {
                        AbstractC0345ae.alpha("Only add dependencies during a tracking");
                    }
                    bv.am amVar = (bv.am) sVar.delta;
                    if (amVar != null) {
                        Intrinsics.checkNotNull(amVar);
                        amVar.alpha(c1564b2);
                    } else if (((C1564b) sVar.bravo) != null) {
                        bv.am amVar2 = bv.av.alpha;
                        bv.am amVar3 = new bv.am();
                        C1564b c1564b4 = (C1564b) sVar.bravo;
                        Intrinsics.checkNotNull(c1564b4);
                        amVar3.alpha(c1564b4);
                        amVar3.alpha(c1564b2);
                        sVar.delta = amVar3;
                        sVar.bravo = null;
                    } else {
                        sVar.bravo = c1564b2;
                    }
                    bv.am amVar4 = (bv.am) sVar.echo;
                    if (amVar4 != null) {
                        Intrinsics.checkNotNull(amVar4);
                        z14 = !amVar4.lima(c1564b2);
                    } else if (((C1564b) sVar.charlie) != c1564b2) {
                        z14 = true;
                    } else {
                        sVar.charlie = null;
                        z14 = false;
                    }
                    if (z14) {
                        c1564b2.quebec++;
                    }
                }
                if (!AbstractC0349c.alpha(mike).isHardwareAccelerated()) {
                    c0.b bVar2 = c1564b2.oscar;
                    if (bVar2 == null) {
                        bVar2 = new c0.b();
                        c1564b2.oscar = bVar2;
                    }
                    Q0.d dVar = c1564b2.bravo;
                    Q0.n nVar = c1564b2.charlie;
                    long bravo = AbstractC2627c7.bravo(c1564b2.uniform);
                    J2.t tVar2 = bVar2.purple;
                    C0801a c0801a = ((c0.b) tVar2.red).alpha;
                    Q0.d dVar2 = c0801a.alpha;
                    Q0.n nVar2 = c0801a.bravo;
                    InterfaceC0364r mike2 = tVar2.mike();
                    canvas = alpha;
                    z13 = z11;
                    long oscar = tVar2.oscar();
                    z12 = z10;
                    C1564b c1564b5 = (C1564b) tVar2.purple;
                    tVar2.whiskey(dVar);
                    tVar2.xray(nVar);
                    tVar2.victor(mike);
                    tVar2.yankee(bravo);
                    tVar2.purple = c1564b2;
                    mike.golf();
                    try {
                        c1564b2.charlie(bVar2);
                    } finally {
                        mike.november();
                        tVar2.whiskey(dVar2);
                        tVar2.xray(nVar2);
                        tVar2.victor(mike2);
                        tVar2.yankee(oscar);
                        tVar2.purple = c1564b5;
                    }
                } else {
                    z12 = z10;
                    canvas = alpha;
                    z13 = z11;
                    interfaceC1566d.papa(mike);
                }
                if (z13) {
                    mike.november();
                }
                if (z12) {
                    mike.india();
                }
                if (!isHardwareAccelerated) {
                    canvas.restore();
                    return;
                }
                return;
            }
            return;
        }
        long j7 = this.f13262t;
        float f14 = (int) (j7 >> 32);
        float f15 = (int) (j7 & 4294967295L);
        interfaceC0364r.mike(f14, f15);
        u(interfaceC0364r, c1564b);
        interfaceC0364r.mike(-f14, -f15);
    }

    @Override // q0.z
    public final long tango(long j5) {
        if (!india()) {
            AbstractC2264a.bravo("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ((C2946x) ao.alpha(this.f13251i)).quebec(gray(j5));
    }

    public final void u(InterfaceC0364r interfaceC0364r, C1564b c1564b) {
        InterfaceC0364r interfaceC0364r2;
        C1564b c1564b2;
        T.r B = B(4);
        if (B == null) {
            O(interfaceC0364r, c1564b);
            return;
        }
        al alVar = this.f13251i;
        alVar.getClass();
        an sharedDrawScope = ((C2946x) ao.alpha(alVar)).getSharedDrawScope();
        long bravo = AbstractC2627c7.bravo(this.red);
        sharedDrawScope.getClass();
        J.e eVar = null;
        while (B != null) {
            if (B instanceof InterfaceC2558s) {
                interfaceC0364r2 = interfaceC0364r;
                c1564b2 = c1564b;
                sharedDrawScope.delta(interfaceC0364r2, bravo, this, (InterfaceC2558s) B, c1564b2);
            } else {
                interfaceC0364r2 = interfaceC0364r;
                c1564b2 = c1564b;
                if ((B.getKindSet$ui_release() & 4) != 0 && (B instanceof AbstractC2556p)) {
                    int i4 = 0;
                    for (T.r rVar = ((AbstractC2556p) B).purple; rVar != null; rVar = rVar.getChild$ui_release()) {
                        if ((rVar.getKindSet$ui_release() & 4) != 0) {
                            i4++;
                            if (i4 == 1) {
                                B = rVar;
                            } else {
                                if (eVar == null) {
                                    eVar = new J.e(new T.r[16]);
                                }
                                if (B != null) {
                                    eVar.bravo(B);
                                    B = null;
                                }
                                eVar.bravo(rVar);
                            }
                        }
                    }
                    if (i4 == 1) {
                        interfaceC0364r = interfaceC0364r2;
                        c1564b = c1564b2;
                    }
                }
            }
            B = AbstractC2555o.bravo(eVar);
            interfaceC0364r = interfaceC0364r2;
            c1564b = c1564b2;
        }
    }

    public abstract void v();

    public final L w(L l10) {
        al alVar = l10.f13251i;
        al alVar2 = this.f13251i;
        if (alVar == alVar2) {
            T.r A = l10.A();
            T.r A10 = A();
            if (!A10.getNode().isAttached()) {
                AbstractC2264a.bravo("visitLocalAncestors called on an unattached node");
            }
            for (T.r parent$ui_release = A10.getNode().getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
                if ((parent$ui_release.getKindSet$ui_release() & 2) != 0 && parent$ui_release == A) {
                    return l10;
                }
            }
            return this;
        }
        while (alVar.f13289h > alVar2.f13289h) {
            alVar = alVar.victor();
            Intrinsics.checkNotNull(alVar);
        }
        al alVar3 = alVar2;
        while (alVar3.f13289h > alVar.f13289h) {
            alVar3 = alVar3.victor();
            Intrinsics.checkNotNull(alVar3);
        }
        while (alVar != alVar3) {
            alVar = alVar.victor();
            alVar3 = alVar3.victor();
            if (alVar == null || alVar3 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (alVar3 != alVar2) {
            if (alVar != l10.f13251i) {
                return (C2563x) alVar.f13305x.echo;
            }
            return l10;
        }
        return this;
    }

    public final long x(long j5) {
        long j6 = this.f13262t;
        float intBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32)) - ((int) (j6 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L)) - ((int) (j6 & 4294967295L));
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        U u4 = this.C;
        if (u4 != null) {
            return ((C2907c0) u4).delta(floatToRawIntBits, true);
        }
        return floatToRawIntBits;
    }

    @Override // q0.z
    public final long xray(long j5) {
        if (!india()) {
            AbstractC2264a.bravo("LayoutCoordinate operations are only valid when isAttached is true");
        }
        q0.z hotel = AbstractC2375K.hotel(this);
        C2946x c2946x = (C2946x) ao.alpha(this.f13251i);
        c2946x.zulu();
        return J(hotel, Z.b.foxtrot(C0347ag.bravo(j5, c2946x.f13865M), hotel.gray(0L)));
    }

    public abstract au y();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [T.r] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [T.r] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [J.e] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [J.e] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // q0.AbstractC2367C, q0.InterfaceC2401t
    public final Object yankee() {
        al alVar = this.f13251i;
        if (!alVar.f13305x.foxtrot(64)) {
            return null;
        }
        A();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        for (T.r rVar = (g0) alVar.f13305x.golf; rVar != null; rVar = rVar.getParent$ui_release()) {
            if ((rVar.getKindSet$ui_release() & 64) != 0) {
                ?? r62 = 0;
                AbstractC2556p abstractC2556p = rVar;
                while (abstractC2556p != 0) {
                    if (abstractC2556p instanceof Z) {
                        objectRef.alpha = ((Z) abstractC2556p).tango(alVar.f13298q, objectRef.alpha);
                    } else if ((abstractC2556p.getKindSet$ui_release() & 64) != 0 && (abstractC2556p instanceof AbstractC2556p)) {
                        T.r rVar2 = abstractC2556p.purple;
                        int i4 = 0;
                        abstractC2556p = abstractC2556p;
                        r62 = r62;
                        while (rVar2 != null) {
                            if ((rVar2.getKindSet$ui_release() & 64) != 0) {
                                i4++;
                                r62 = r62;
                                if (i4 == 1) {
                                    abstractC2556p = rVar2;
                                } else {
                                    if (r62 == 0) {
                                        r62 = new J.e(new T.r[16]);
                                    }
                                    if (abstractC2556p != 0) {
                                        r62.bravo(abstractC2556p);
                                        abstractC2556p = 0;
                                    }
                                    r62.bravo(rVar2);
                                }
                            }
                            rVar2 = rVar2.getChild$ui_release();
                            abstractC2556p = abstractC2556p;
                            r62 = r62;
                        }
                        if (i4 == 1) {
                        }
                    }
                    abstractC2556p = AbstractC2555o.bravo(r62);
                }
            }
        }
        return objectRef.alpha;
    }

    public final long z() {
        return this.f13257o.red(this.f13251i.f13300s.delta());
    }
}
