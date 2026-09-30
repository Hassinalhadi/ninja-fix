package G;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.aw;
import androidx.compose.runtime.n0;
import androidx.recyclerview.widget.RecyclerView;
import bz.C0778c;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import l0.C2050g;
import l0.InterfaceC2044a;
import s0.AbstractC2556p;
import s0.AbstractC2557q;
import s0.InterfaceC2553m;
import s6.AbstractC2645e7;
import s6.J4;
import t0.AbstractC2901T;
import t6.H2;
import vf.ad;

/* loaded from: classes3.dex */
public final class t extends AbstractC2556p implements InterfaceC2553m, InterfaceC2044a {
    public boolean red;
    public Function0 silver;
    public v white;
    public float yellow;
    public boolean teal = true;

    /* renamed from: a, reason: collision with root package name */
    public final C2050g f1347a = new C2050g(this, null);

    /* renamed from: b, reason: collision with root package name */
    public final aw f1348b = C0564b.victor(0.0f);

    /* renamed from: c, reason: collision with root package name */
    public final aw f1349c = C0564b.victor(0.0f);

    public t(boolean z2, Function0 function0, v vVar, float f5) {
        this.red = z2;
        this.silver = function0;
        this.white = vVar;
        this.yellow = f5;
    }

    @Override // l0.InterfaceC2044a
    public final long black(int i4, long j5) {
        if (!this.white.alpha.echo() && this.teal && i4 == 1 && Z.b.delta(j5) < 0.0f) {
            return g(j5);
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Pd.c cVar) {
        m mVar;
        int i4;
        t tVar;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i5 = mVar.silver;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                mVar.silver = i5 - RecyclerView.UNDEFINED_DURATION;
                m mVar2 = mVar;
                Object obj = mVar2.purple;
                Object obj2 = Od.a.alpha;
                i4 = mVar2.silver;
                if (i4 == 0) {
                    if (i4 == 1) {
                        tVar = mVar2.alpha;
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    v vVar = this.white;
                    mVar2.alpha = this;
                    mVar2.silver = 1;
                    vVar.getClass();
                    Object charlie = C0778c.charlie(vVar.alpha, new Float(0.0f), null, null, mVar2, 14);
                    if (charlie != obj2) {
                        charlie = Unit.INSTANCE;
                    }
                    if (charlie == obj2) {
                        return obj2;
                    }
                    tVar = this;
                }
                ((n0) tVar.f1349c).kilo(0.0f);
                ((n0) tVar.f1348b).kilo(0.0f);
                return Unit.INSTANCE;
            }
        }
        mVar = new m(this, cVar);
        m mVar22 = mVar;
        Object obj3 = mVar22.purple;
        Object obj22 = Od.a.alpha;
        i4 = mVar22.silver;
        if (i4 == 0) {
        }
        ((n0) tVar.f1349c).kilo(0.0f);
        ((n0) tVar.f1348b).kilo(0.0f);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(Pd.c cVar) {
        n nVar;
        int i4;
        t tVar;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i5 = nVar.silver;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                nVar.silver = i5 - RecyclerView.UNDEFINED_DURATION;
                n nVar2 = nVar;
                Object obj = nVar2.purple;
                Object obj2 = Od.a.alpha;
                i4 = nVar2.silver;
                if (i4 == 0) {
                    if (i4 == 1) {
                        tVar = nVar2.alpha;
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    v vVar = this.white;
                    nVar2.alpha = this;
                    nVar2.silver = 1;
                    vVar.getClass();
                    Object charlie = C0778c.charlie(vVar.alpha, new Float(1.0f), null, null, nVar2, 14);
                    if (charlie != obj2) {
                        charlie = Unit.INSTANCE;
                    }
                    if (charlie == obj2) {
                        return obj2;
                    }
                    tVar = this;
                }
                ((n0) tVar.f1349c).kilo(tVar.h());
                ((n0) tVar.f1348b).kilo(tVar.h());
                return Unit.INSTANCE;
            }
        }
        nVar = new n(this, cVar);
        n nVar22 = nVar;
        Object obj3 = nVar22.purple;
        Object obj22 = Od.a.alpha;
        i4 = nVar22.silver;
        if (i4 == 0) {
        }
        ((n0) tVar.f1349c).kilo(tVar.h());
        ((n0) tVar.f1348b).kilo(tVar.h());
        return Unit.INSTANCE;
    }

    public final long g(long j5) {
        float juliet;
        float h4;
        if (this.red) {
            juliet = 0.0f;
        } else {
            aw awVar = this.f1349c;
            float delta = Z.b.delta(j5) + ((n0) awVar).juliet();
            if (delta < 0.0f) {
                delta = 0.0f;
            }
            juliet = delta - ((n0) awVar).juliet();
            ((n0) awVar).kilo(delta);
            if (((n0) awVar).juliet() * 0.5f <= h()) {
                h4 = ((n0) awVar).juliet() * 0.5f;
            } else {
                float charlie = J4.charlie(Math.abs((((n0) awVar).juliet() * 0.5f) / h()) - 1.0f, 0.0f, 2.0f);
                h4 = h() + (h() * (charlie - (((float) Math.pow(charlie, 2)) / 4)));
            }
            ((n0) this.f1348b).kilo(h4);
        }
        return H2.alpha(0.0f, juliet);
    }

    public final int h() {
        return ((Q0.d) AbstractC2557q.echo(this, AbstractC2901T.hotel)).ochre(this.yellow);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(float f5, Pd.c cVar) {
        r rVar;
        int i4;
        t tVar;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i5 = rVar.teal;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                rVar.teal = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = rVar.red;
                Od.a aVar = Od.a.alpha;
                i4 = rVar.teal;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            f5 = rVar.purple;
                            tVar = rVar.alpha;
                            ResultKt.alpha(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        f5 = rVar.purple;
                        tVar = rVar.alpha;
                        ResultKt.alpha(obj);
                        tVar.silver.invoke();
                    }
                } else {
                    ResultKt.alpha(obj);
                    if (this.red) {
                        return new Float(0.0f);
                    }
                    if (((n0) this.f1349c).juliet() * 0.5f > h()) {
                        rVar.alpha = this;
                        rVar.purple = f5;
                        rVar.teal = 1;
                        if (f(rVar) != aVar) {
                            tVar = this;
                            tVar.silver.invoke();
                        }
                    } else {
                        rVar.alpha = this;
                        rVar.purple = f5;
                        rVar.teal = 2;
                        if (e(rVar) != aVar) {
                            tVar = this;
                        }
                    }
                    return aVar;
                }
                if (((n0) tVar.f1349c).juliet() != 0.0f || f5 < 0.0f) {
                    f5 = 0.0f;
                }
                ((n0) tVar.f1349c).kilo(0.0f);
                return new Float(f5);
            }
        }
        rVar = new r(this, cVar);
        Object obj2 = rVar.red;
        Od.a aVar2 = Od.a.alpha;
        i4 = rVar.teal;
        if (i4 == 0) {
        }
        if (((n0) tVar.f1349c).juliet() != 0.0f) {
        }
        f5 = 0.0f;
        ((n0) tVar.f1349c).kilo(0.0f);
        return new Float(f5);
    }

    @Override // l0.InterfaceC2044a
    public final long maroon(int i4, long j5, long j6) {
        if (!this.white.alpha.echo() && this.teal && i4 == 1) {
            long g2 = g(j6);
            ad.zulu(getCoroutineScope(), null, null, new p(this, null), 3);
            return g2;
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // l0.InterfaceC2044a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object navy(long j5, Nd.c cVar) {
        q qVar;
        int i4;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i5 = qVar.red;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                qVar.red = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = qVar.alpha;
                Object obj2 = Od.a.alpha;
                i4 = qVar.red;
                if (i4 == 0) {
                    if (i4 == 1) {
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    float charlie = Q0.r.charlie(j5);
                    qVar.red = 1;
                    obj = i(charlie, qVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                }
                return new Q0.r(AbstractC2645e7.alpha(0.0f, ((Number) obj).floatValue()));
            }
        }
        qVar = new q(this, (Pd.c) cVar);
        Object obj3 = qVar.alpha;
        Object obj22 = Od.a.alpha;
        i4 = qVar.red;
        if (i4 == 0) {
        }
        return new Q0.r(AbstractC2645e7.alpha(0.0f, ((Number) obj3).floatValue()));
    }

    @Override // T.r
    public final void onAttach() {
        b(this.f1347a);
        ad.zulu(getCoroutineScope(), null, null, new o(this, null), 3);
    }

    @Override // l0.InterfaceC2044a
    public final Object oscar(long j5, long j6, Nd.c cVar) {
        return new Q0.r(0L);
    }
}
