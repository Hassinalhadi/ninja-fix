package a0;

import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* loaded from: classes3.dex */
public final class ap implements InterfaceC0342ab {

    /* renamed from: a, reason: collision with root package name */
    public long f2575a;
    public int alpha;

    /* renamed from: b, reason: collision with root package name */
    public float f2576b;

    /* renamed from: c, reason: collision with root package name */
    public float f2577c;

    /* renamed from: d, reason: collision with root package name */
    public long f2578d;
    public as e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2579f;

    /* renamed from: g, reason: collision with root package name */
    public int f2580g;

    /* renamed from: h, reason: collision with root package name */
    public long f2581h;

    /* renamed from: i, reason: collision with root package name */
    public Q0.d f2582i;

    /* renamed from: j, reason: collision with root package name */
    public Q0.n f2583j;

    /* renamed from: k, reason: collision with root package name */
    public int f2584k;

    /* renamed from: l, reason: collision with root package name */
    public ao f2585l;
    public float purple;
    public float red;
    public float silver;
    public float teal;
    public float white;
    public long yellow;

    @Override // Q0.d
    public final float alpha() {
        return this.f2582i.alpha();
    }

    @Override // Q0.d
    public final long beige(float f5) {
        return Q0.c.hotel(this, gold(f5));
    }

    public final void charlie(float f5) {
        if (this.silver == f5) {
            return;
        }
        this.alpha |= 4;
        this.silver = f5;
    }

    @Override // Q0.d
    public final float crimson(int i4) {
        return i4 / alpha();
    }

    public final void delta(long j5) {
        if (!C0366t.charlie(this.yellow, j5)) {
            this.alpha |= 64;
            this.yellow = j5;
        }
    }

    public final void foxtrot(boolean z2) {
        if (this.f2579f != z2) {
            this.alpha |= Http2.INITIAL_MAX_FRAME_SIZE;
            this.f2579f = z2;
        }
    }

    @Override // Q0.d
    public final float gold(float f5) {
        return f5 / alpha();
    }

    public final void golf(float f5) {
        if (this.f2576b == f5) {
            return;
        }
        this.alpha |= Barcode.FORMAT_UPC_E;
        this.f2576b = f5;
    }

    public final void hotel(float f5) {
        if (this.purple == f5) {
            return;
        }
        this.alpha |= 1;
        this.purple = f5;
    }

    public final void india(float f5) {
        if (this.red == f5) {
            return;
        }
        this.alpha |= 2;
        this.red = f5;
    }

    @Override // Q0.d
    public final float indigo() {
        return this.f2582i.indigo();
    }

    public final void juliet(float f5) {
        if (this.white == f5) {
            return;
        }
        this.alpha |= 32;
        this.white = f5;
    }

    public final void kilo(as asVar) {
        if (!Intrinsics.areEqual(this.e, asVar)) {
            this.alpha |= 8192;
            this.e = asVar;
        }
    }

    @Override // Q0.d
    public final float lavender(float f5) {
        return alpha() * f5;
    }

    public final void lima(long j5) {
        if (!C0366t.charlie(this.f2575a, j5)) {
            this.alpha |= 128;
            this.f2575a = j5;
        }
    }

    @Override // Q0.d
    public final /* synthetic */ long mike(long j5) {
        return Q0.c.echo(j5, this);
    }

    public final void november(long j5) {
        if (!aw.alpha(this.f2578d, j5)) {
            this.alpha |= 4096;
            this.f2578d = j5;
        }
    }

    @Override // Q0.d
    public final /* synthetic */ int ochre(float f5) {
        return Q0.c.bravo(this, f5);
    }

    public final void oscar(float f5) {
        if (this.teal == f5) {
            return;
        }
        this.alpha |= 16;
        this.teal = f5;
    }

    @Override // Q0.d
    public final /* synthetic */ float quebec(long j5) {
        return Q0.c.delta(j5, this);
    }

    @Override // Q0.d
    public final /* synthetic */ long red(long j5) {
        return Q0.c.golf(j5, this);
    }

    @Override // Q0.d
    public final /* synthetic */ float teal(long j5) {
        return Q0.c.foxtrot(j5, this);
    }
}
