package m0;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputResetException;
import bx.C0769g;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import s0.AbstractC2555o;
import s0.b0;
import s0.h0;
import s6.J6;
import vf.C3207k;
import vf.Y;

/* loaded from: classes3.dex */
public final class ah extends T.r implements u, Q0.d, b0 {

    /* renamed from: a, reason: collision with root package name */
    public final J.e f12962a;
    public Object alpha;

    /* renamed from: b, reason: collision with root package name */
    public k f12963b;

    /* renamed from: c, reason: collision with root package name */
    public long f12964c;
    public Object purple;
    public PointerInputEventHandler red;
    public Y silver;
    public k teal = ab.alpha;
    public final J.e white;
    public final J.e yellow;

    public ah(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        this.alpha = obj;
        this.purple = obj2;
        this.red = pointerInputEventHandler;
        J.e eVar = new J.e(new af[16]);
        this.white = eVar;
        this.yellow = eVar;
        this.f12962a = new J.e(new af[16]);
        this.f12964c = 0L;
    }

    @Override // Q0.d
    public final float alpha() {
        return AbstractC2555o.golf(this).f13298q.alpha();
    }

    public final Object b(Xd.l lVar, Nd.c cVar) {
        C3207k c3207k = new C3207k(1, J6.delta(cVar));
        c3207k.tango();
        af afVar = new af(this, c3207k);
        synchronized (this.yellow) {
            this.white.bravo(afVar);
            Nd.j jVar = new Nd.j(J6.delta(J6.alpha(afVar, afVar, lVar)), Od.a.alpha);
            Result.Companion companion = Result.INSTANCE;
            jVar.resumeWith(Result.m206constructorimpl(Unit.INSTANCE));
        }
        c3207k.victor(new C0769g(13, afVar));
        return c3207k.sierra();
    }

    @Override // Q0.d
    public final long beige(float f5) {
        return Q0.c.hotel(this, gold(f5));
    }

    @Override // s0.b0
    public final /* synthetic */ void bronze() {
    }

    public final void c(k kVar, l lVar) {
        C3207k c3207k;
        C3207k c3207k2;
        synchronized (this.yellow) {
            J.e eVar = this.f12962a;
            eVar.charlie(eVar.red, this.white);
        }
        try {
            int ordinal = lVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    J.e eVar2 = this.f12962a;
                    int i4 = eVar2.red - 1;
                    Object[] objArr = eVar2.alpha;
                    if (i4 < objArr.length) {
                        while (i4 >= 0) {
                            af afVar = (af) objArr[i4];
                            if (lVar == afVar.silver && (c3207k2 = afVar.red) != null) {
                                afVar.red = null;
                                c3207k2.resumeWith(Result.m206constructorimpl(kVar));
                            }
                            i4--;
                        }
                    }
                    this.f12962a.india();
                }
            }
            J.e eVar3 = this.f12962a;
            Object[] objArr2 = eVar3.alpha;
            int i5 = eVar3.red;
            for (int i10 = 0; i10 < i5; i10++) {
                af afVar2 = (af) objArr2[i10];
                if (lVar == afVar2.silver && (c3207k = afVar2.red) != null) {
                    afVar2.red = null;
                    c3207k.resumeWith(Result.m206constructorimpl(kVar));
                }
            }
            this.f12962a.india();
        } catch (Throwable th) {
            this.f12962a.india();
            throw th;
        }
    }

    @Override // Q0.d
    public final float crimson(int i4) {
        return i4 / alpha();
    }

    public final void d() {
        Y y10 = this.silver;
        if (y10 != null) {
            y10.whiskey(new PointerInputResetException());
            this.silver = null;
        }
    }

    @Override // s0.b0
    public final void fuchsia(k kVar, l lVar, long j5) {
        this.f12964c = j5;
        if (lVar == l.alpha) {
            this.teal = kVar;
        }
        if (this.silver == null) {
            this.silver = vf.ad.zulu(getCoroutineScope(), null, vf.ac.silver, new ag(this, null), 1);
        }
        c(kVar, lVar);
        List list = kVar.alpha;
        int size = list.size();
        int i4 = 0;
        while (true) {
            if (i4 < size) {
                if (!q.charlie((r) list.get(i4))) {
                    break;
                } else {
                    i4++;
                }
            } else {
                kVar = null;
                break;
            }
        }
        this.f12963b = kVar;
    }

    @Override // Q0.d
    public final float gold(float f5) {
        return f5 / alpha();
    }

    @Override // Q0.d
    public final float indigo() {
        return AbstractC2555o.golf(this).f13298q.indigo();
    }

    @Override // s0.b0
    public final long juliet() {
        return h0.alpha;
    }

    @Override // Q0.d
    public final float lavender(float f5) {
        return alpha() * f5;
    }

    @Override // Q0.d
    public final /* synthetic */ long mike(long j5) {
        return Q0.c.echo(j5, this);
    }

    @Override // Q0.d
    public final /* synthetic */ int ochre(float f5) {
        return Q0.c.bravo(this, f5);
    }

    @Override // T.r
    public final void onDensityChange() {
        d();
    }

    @Override // T.r
    public final void onDetach() {
        d();
        super.onDetach();
    }

    @Override // s0.b0
    public final /* synthetic */ boolean peach() {
        return false;
    }

    @Override // Q0.d
    public final /* synthetic */ float quebec(long j5) {
        return Q0.c.delta(j5, this);
    }

    @Override // Q0.d
    public final /* synthetic */ long red(long j5) {
        return Q0.c.golf(j5, this);
    }

    @Override // s0.b0
    public final void silver() {
        d();
    }

    @Override // Q0.d
    public final /* synthetic */ float teal(long j5) {
        return Q0.c.foxtrot(j5, this);
    }

    @Override // s0.b0
    public final void xray() {
        k kVar = this.f12963b;
        if (kVar != null) {
            List list = kVar.alpha;
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (((r) list.get(i4)).delta) {
                    ArrayList arrayList = new ArrayList(list.size());
                    int size2 = list.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        r rVar = (r) list.get(i5);
                        long j5 = rVar.alpha;
                        boolean z2 = rVar.delta;
                        int i10 = rVar.india;
                        long j6 = rVar.bravo;
                        long j7 = rVar.charlie;
                        arrayList.add(new r(j5, j6, j7, false, rVar.echo, j6, j7, z2, z2, i10, 0L));
                    }
                    k kVar2 = new k(arrayList, null);
                    this.teal = kVar2;
                    c(kVar2, l.alpha);
                    c(kVar2, l.purple);
                    c(kVar2, l.red);
                    this.f12963b = null;
                    return;
                }
            }
        }
    }
}
