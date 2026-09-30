package t0;

import a0.C0347ag;
import a0.InterfaceC0341aa;
import android.os.Build;
import android.view.ViewParent;
import bx.C0769g;
import com.airbnb.lottie.compose.LottieConstants;
import d0.C1564b;
import d0.InterfaceC1566d;
import s6.AbstractC2627c7;
import s6.Y6;
import t6.M2;

/* renamed from: t0.c0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2907c0 implements s0.U {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f13833a;
    public C1564b alpha;

    /* renamed from: b, reason: collision with root package name */
    public float[] f13834b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f13835c;

    /* renamed from: d, reason: collision with root package name */
    public Q0.d f13836d;
    public Q0.n e;

    /* renamed from: f, reason: collision with root package name */
    public final c0.b f13837f;

    /* renamed from: g, reason: collision with root package name */
    public int f13838g;

    /* renamed from: h, reason: collision with root package name */
    public long f13839h;

    /* renamed from: i, reason: collision with root package name */
    public a0.ao f13840i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f13841j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f13842k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f13843l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f13844m;

    /* renamed from: n, reason: collision with root package name */
    public final C0769g f13845n;
    public final InterfaceC0341aa purple;
    public final C2946x red;
    public Xd.l silver;
    public s0.I teal;
    public long white;
    public boolean yellow;

    public C2907c0(C1564b c1564b, InterfaceC0341aa interfaceC0341aa, C2946x c2946x, Xd.l lVar, s0.I i4) {
        this.alpha = c1564b;
        this.purple = interfaceC0341aa;
        this.red = c2946x;
        this.silver = lVar;
        this.teal = i4;
        long j5 = LottieConstants.IterateForever;
        this.white = (j5 & 4294967295L) | (j5 << 32);
        this.f13833a = C0347ag.alpha();
        this.f13836d = Y6.alpha();
        this.e = Q0.n.alpha;
        this.f13837f = new c0.b();
        this.f13839h = a0.aw.bravo;
        this.f13843l = true;
        this.f13845n = new C0769g(22, this);
    }

    public final float[] alpha() {
        float[] fArr = this.f13834b;
        if (fArr == null) {
            fArr = C0347ag.alpha();
            this.f13834b = fArr;
        }
        if (!this.f13842k) {
            if (Float.isNaN(fArr[0])) {
                return null;
            }
        } else {
            this.f13842k = false;
            float[] bravo = bravo();
            if (this.f13843l) {
                return bravo;
            }
            if (!W.juliet(bravo, fArr)) {
                fArr[0] = Float.NaN;
                return null;
            }
        }
        return fArr;
    }

    public final float[] bravo() {
        boolean z2 = this.f13841j;
        float[] fArr = this.f13833a;
        if (z2) {
            C1564b c1564b = this.alpha;
            long j5 = c1564b.victor;
            if ((9223372034707292159L & j5) == 9205357640488583168L) {
                j5 = M2.charlie(AbstractC2627c7.bravo(this.white));
            }
            float intBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L));
            InterfaceC1566d interfaceC1566d = c1564b.alpha;
            float beige = interfaceC1566d.beige();
            float victor = interfaceC1566d.victor();
            float bronze = interfaceC1566d.bronze();
            float november = interfaceC1566d.november();
            float quebec = interfaceC1566d.quebec();
            float bravo = interfaceC1566d.bravo();
            float gray = interfaceC1566d.gray();
            double d4 = bronze * 0.017453292519943295d;
            float sin = (float) Math.sin(d4);
            float cos = (float) Math.cos(d4);
            float f5 = -sin;
            float f10 = (victor * cos) - (1.0f * sin);
            float f11 = (1.0f * cos) + (victor * sin);
            double d9 = november * 0.017453292519943295d;
            float sin2 = (float) Math.sin(d9);
            float cos2 = (float) Math.cos(d9);
            float f12 = -sin2;
            float f13 = sin * sin2;
            float f14 = sin * cos2;
            float f15 = cos * sin2;
            float f16 = cos * cos2;
            float f17 = (f11 * sin2) + (beige * cos2);
            float f18 = (f11 * cos2) + ((-beige) * sin2);
            double d10 = quebec * 0.017453292519943295d;
            float sin3 = (float) Math.sin(d10);
            float cos3 = (float) Math.cos(d10);
            float f19 = -sin3;
            float f20 = (cos3 * f13) + (f19 * cos2);
            float f21 = ((f13 * sin3) + (cos2 * cos3)) * bravo;
            float f22 = sin3 * cos * bravo;
            float f23 = ((sin3 * f14) + (cos3 * f12)) * bravo;
            float f24 = f20 * gray;
            float f25 = cos * cos3 * gray;
            float f26 = ((cos3 * f14) + (f19 * f12)) * gray;
            float f27 = f15 * 1.0f;
            float f28 = f5 * 1.0f;
            float f29 = f16 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f21;
                fArr[1] = f22;
                fArr[2] = f23;
                fArr[3] = 0.0f;
                fArr[4] = f24;
                fArr[5] = f25;
                fArr[6] = f26;
                fArr[7] = 0.0f;
                fArr[8] = f27;
                fArr[9] = f28;
                fArr[10] = f29;
                fArr[11] = 0.0f;
                float f30 = -intBitsToFloat;
                fArr[12] = ((f21 * f30) - (intBitsToFloat2 * f24)) + f17 + intBitsToFloat;
                fArr[13] = ((f22 * f30) - (intBitsToFloat2 * f25)) + f10 + intBitsToFloat2;
                fArr[14] = ((f30 * f23) - (intBitsToFloat2 * f26)) + f18;
                fArr[15] = 1.0f;
            }
            this.f13841j = false;
            this.f13843l = a0.ao.papa(fArr);
        }
        return fArr;
    }

    public final void charlie(Z.a aVar, boolean z2) {
        float[] bravo;
        if (z2) {
            bravo = alpha();
        } else {
            bravo = bravo();
        }
        if (!this.f13843l) {
            if (bravo == null) {
                aVar.bravo = 0.0f;
                aVar.charlie = 0.0f;
                aVar.delta = 0.0f;
                aVar.echo = 0.0f;
                return;
            }
            C0347ag.charlie(bravo, aVar);
        }
    }

    public final long delta(long j5, boolean z2) {
        float[] bravo;
        if (z2) {
            bravo = alpha();
            if (bravo == null) {
                return 9187343241974906880L;
            }
        } else {
            bravo = bravo();
        }
        if (this.f13843l) {
            return j5;
        }
        return C0347ag.bravo(j5, bravo);
    }

    public final void echo(long j5) {
        C2946x c2946x = this.red;
        if (c2946x.white) {
            c2946x.cyan(-4.0f);
        }
        C1564b c1564b = this.alpha;
        if (!Q0.k.alpha(c1564b.tango, j5)) {
            c1564b.tango = j5;
            long j6 = c1564b.uniform;
            c1564b.alpha.mike((int) (j5 >> 32), (int) (j5 & 4294967295L), j6);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            ViewParent parent = c2946x.getParent();
            if (parent != null) {
                parent.onDescendantInvalidated(c2946x, c2946x);
                return;
            }
            return;
        }
        c2946x.invalidate();
    }

    public final void foxtrot(long j5) {
        if (!Q0.m.alpha(j5, this.white)) {
            C2946x c2946x = this.red;
            if (c2946x.white) {
                c2946x.cyan(-4.0f);
            }
            this.white = j5;
            if (!this.f13835c && !this.yellow) {
                c2946x.invalidate();
                if (true != this.f13835c) {
                    this.f13835c = true;
                    c2946x.tango(this, true);
                }
            }
        }
    }

    public final void golf() {
        C2946x c2946x = this.red;
        boolean z2 = c2946x.white;
        if (this.f13835c) {
            if (!a0.aw.alpha(this.f13839h, a0.aw.bravo) && !Q0.m.alpha(this.alpha.uniform, this.white)) {
                C1564b c1564b = this.alpha;
                float bravo = a0.aw.bravo(this.f13839h) * ((int) (this.white >> 32));
                float charlie = a0.aw.charlie(this.f13839h) * ((int) (this.white & 4294967295L));
                long floatToRawIntBits = (Float.floatToRawIntBits(charlie) & 4294967295L) | (Float.floatToRawIntBits(bravo) << 32);
                if (!Z.b.bravo(c1564b.victor, floatToRawIntBits)) {
                    c1564b.victor = floatToRawIntBits;
                    c1564b.alpha.romeo(floatToRawIntBits);
                }
            }
            C1564b c1564b2 = this.alpha;
            Q0.d dVar = this.f13836d;
            Q0.n nVar = this.e;
            long j5 = this.white;
            boolean alpha = Q0.m.alpha(c1564b2.uniform, j5);
            InterfaceC1566d interfaceC1566d = c1564b2.alpha;
            if (!alpha) {
                c1564b2.uniform = j5;
                long j6 = c1564b2.tango;
                interfaceC1566d.mike((int) (j6 >> 32), (int) (4294967295L & j6), j5);
                if (c1564b2.india == 9205357640488583168L) {
                    c1564b2.golf = true;
                    c1564b2.alpha();
                }
            }
            c1564b2.bravo = dVar;
            c1564b2.charlie = nVar;
            c1564b2.delta = this.f13845n;
            interfaceC1566d.coral(dVar, nVar, c1564b2, c1564b2.echo);
            if (this.f13835c) {
                this.f13835c = false;
                c2946x.tango(this, false);
            }
        }
    }

    @Override // s0.U
    public final void invalidate() {
        if (!this.f13835c && !this.yellow) {
            C2946x c2946x = this.red;
            c2946x.invalidate();
            if (true != this.f13835c) {
                this.f13835c = true;
                c2946x.tango(this, true);
            }
        }
    }
}
