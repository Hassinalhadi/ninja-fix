package b;

import android.view.KeyEvent;
import f.InterfaceC1673j;
import k0.AbstractC1996c;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ai extends AbstractC0701p {

    /* renamed from: p, reason: collision with root package name */
    public boolean f3295p;

    /* renamed from: q, reason: collision with root package name */
    public final bv.ad f3296q;

    /* renamed from: r, reason: collision with root package name */
    public final bv.ad f3297r;

    public ai(InterfaceC1673j interfaceC1673j, Function0 function0) {
        super(interfaceC1673j, null, false, true, null, null, function0);
        this.f3295p = true;
        int i4 = bv.s.alpha;
        this.f3296q = new bv.ad(6);
        this.f3297r = new bv.ad(6);
    }

    @Override // b.AbstractC0701p
    public final void e(A0.ad adVar) {
    }

    @Override // b.AbstractC0701p
    public final m0.ah f() {
        C0703s c0703s = new C0703s(1, this);
        m0.k kVar = m0.ab.alpha;
        return new m0.ah(null, null, c0703s);
    }

    @Override // b.AbstractC0701p
    public final void k() {
        o();
    }

    @Override // b.AbstractC0701p
    public final boolean l(KeyEvent keyEvent) {
        return false;
    }

    @Override // b.AbstractC0701p
    public final void m(KeyEvent keyEvent) {
        long delta = AbstractC1996c.delta(keyEvent);
        bv.ad adVar = this.f3296q;
        boolean z2 = false;
        if (adVar.delta(delta) != null) {
            vf.I i4 = (vf.I) adVar.delta(delta);
            if (i4 != null) {
                if (i4.echo()) {
                    i4.foxtrot(null);
                } else {
                    z2 = true;
                }
            }
            adVar.foxtrot(delta);
        }
        if (!z2) {
            this.f3308b.invoke();
        }
    }

    public final void o() {
        char c3;
        long j5;
        long j6;
        char c4;
        bv.ad adVar = this.f3296q;
        Object[] objArr = adVar.charlie;
        long[] jArr = adVar.alpha;
        int length = jArr.length - 2;
        char c10 = 7;
        if (length >= 0) {
            int i4 = 0;
            j5 = 128;
            while (true) {
                long j7 = jArr[i4];
                j6 = 255;
                if ((((~j7) << c10) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    int i10 = 0;
                    while (i10 < i5) {
                        if ((j7 & 255) < 128) {
                            c4 = c10;
                            ((vf.I) objArr[(i4 << 3) + i10]).foxtrot(null);
                        } else {
                            c4 = c10;
                        }
                        j7 >>= 8;
                        i10++;
                        c10 = c4;
                    }
                    c3 = c10;
                    if (i5 != 8) {
                        break;
                    }
                } else {
                    c3 = c10;
                }
                if (i4 == length) {
                    break;
                }
                i4++;
                c10 = c3;
            }
        } else {
            c3 = 7;
            j5 = 128;
            j6 = 255;
        }
        adVar.alpha();
        bv.ad adVar2 = this.f3297r;
        Object[] objArr2 = adVar2.charlie;
        long[] jArr2 = adVar2.alpha;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i11 = 0;
            while (true) {
                long j10 = jArr2[i11];
                if ((((~j10) << c3) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length2)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((j10 & j6) >= j5) {
                            j10 >>= 8;
                        } else {
                            ((af) objArr2[(i11 << 3) + i13]).getClass();
                            throw null;
                        }
                    }
                    if (i12 != 8) {
                        break;
                    }
                }
                if (i11 == length2) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        adVar2.alpha();
    }

    @Override // T.r
    public final void onReset() {
        super.onReset();
        o();
    }
}
