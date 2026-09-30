package d;

import androidx.recyclerview.widget.RecyclerView;
import b.C0703s;
import f.C1664a;
import f.C1665b;
import f.C1666c;
import f.C1674k;
import f.InterfaceC1673j;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s0.AbstractC2556p;

/* loaded from: classes3.dex */
public abstract class aj extends AbstractC2556p implements s0.b0 {

    /* renamed from: a, reason: collision with root package name */
    public C1665b f11982a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f11983b;

    /* renamed from: c, reason: collision with root package name */
    public long f11984c = 0;

    /* renamed from: d, reason: collision with root package name */
    public m0.ah f11985d;
    public K red;
    public Function1 silver;
    public boolean teal;
    public InterfaceC1673j white;
    public xf.e yellow;

    public aj(Function1 function1, boolean z2, InterfaceC1673j interfaceC1673j, K k6) {
        this.red = k6;
        this.silver = function1;
        this.teal = z2;
        this.white = interfaceC1673j;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(aj ajVar, Pd.c cVar) {
        ae aeVar;
        int i4;
        ajVar.getClass();
        if (cVar instanceof ae) {
            aeVar = (ae) cVar;
            int i5 = aeVar.red;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                aeVar.red = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = aeVar.alpha;
                Od.a aVar = Od.a.alpha;
                i4 = aeVar.red;
                if (i4 == 0) {
                    if (i4 == 1) {
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    C1665b c1665b = ajVar.f11982a;
                    if (c1665b != null) {
                        InterfaceC1673j interfaceC1673j = ajVar.white;
                        if (interfaceC1673j != null) {
                            C1664a c1664a = new C1664a(c1665b);
                            aeVar.red = 1;
                            if (((C1674k) interfaceC1673j).alpha(c1664a, aeVar) == aVar) {
                                return aVar;
                            }
                        }
                    }
                    ajVar.k(0L);
                    return Unit.INSTANCE;
                }
                ajVar.f11982a = null;
                ajVar.k(0L);
                return Unit.INSTANCE;
            }
        }
        aeVar = new ae(ajVar, cVar);
        Object obj2 = aeVar.alpha;
        Od.a aVar2 = Od.a.alpha;
        i4 = aeVar.red;
        if (i4 == 0) {
        }
        ajVar.f11982a = null;
        ajVar.k(0L);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:
    
        if (((f.C1674k) r2).alpha(r5, r0) == r1) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r8v4, types: [f.i, java.lang.Object, f.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(aj ajVar, C1556t c1556t, Pd.c cVar) {
        af afVar;
        int i4;
        InterfaceC1673j interfaceC1673j;
        C1556t c1556t2;
        C1665b c1665b;
        C1665b c1665b2;
        ajVar.getClass();
        if (cVar instanceof af) {
            afVar = (af) cVar;
            int i5 = afVar.teal;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                afVar.teal = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = afVar.red;
                Od.a aVar = Od.a.alpha;
                i4 = afVar.teal;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            c1665b = afVar.purple;
                            c1556t2 = afVar.alpha;
                            ResultKt.alpha(obj);
                            c1665b2 = c1665b;
                            c1556t = c1556t2;
                            ajVar.f11982a = c1665b2;
                            ajVar.j(c1556t.alpha);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1556t = afVar.alpha;
                    ResultKt.alpha(obj);
                } else {
                    ResultKt.alpha(obj);
                    C1665b c1665b3 = ajVar.f11982a;
                    if (c1665b3 != null && (r2 = ajVar.white) != null) {
                        C1664a c1664a = new C1664a(c1665b3);
                        afVar.alpha = c1556t;
                        afVar.teal = 1;
                    }
                }
                ?? obj2 = new Object();
                interfaceC1673j = ajVar.white;
                c1665b2 = obj2;
                if (interfaceC1673j != null) {
                    afVar.alpha = c1556t;
                    afVar.purple = obj2;
                    afVar.teal = 2;
                    if (((C1674k) interfaceC1673j).alpha(obj2, afVar) != aVar) {
                        c1556t2 = c1556t;
                        c1665b = obj2;
                        c1665b2 = c1665b;
                        c1556t = c1556t2;
                    }
                    return aVar;
                }
                ajVar.f11982a = c1665b2;
                ajVar.j(c1556t.alpha);
                return Unit.INSTANCE;
            }
        }
        afVar = new af(ajVar, cVar);
        Object obj3 = afVar.red;
        Od.a aVar2 = Od.a.alpha;
        i4 = afVar.teal;
        if (i4 == 0) {
        }
        ?? obj22 = new Object();
        interfaceC1673j = ajVar.white;
        c1665b2 = obj22;
        if (interfaceC1673j != null) {
        }
        ajVar.f11982a = c1665b2;
        ajVar.j(c1556t.alpha);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(aj ajVar, C1557u c1557u, Pd.c cVar) {
        ag agVar;
        int i4;
        ajVar.getClass();
        if (cVar instanceof ag) {
            agVar = (ag) cVar;
            int i5 = agVar.silver;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                agVar.silver = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = agVar.purple;
                Od.a aVar = Od.a.alpha;
                i4 = agVar.silver;
                if (i4 == 0) {
                    if (i4 == 1) {
                        c1557u = agVar.alpha;
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    C1665b c1665b = ajVar.f11982a;
                    if (c1665b != null) {
                        InterfaceC1673j interfaceC1673j = ajVar.white;
                        if (interfaceC1673j != null) {
                            C1666c c1666c = new C1666c(c1665b);
                            agVar.alpha = c1557u;
                            agVar.silver = 1;
                            if (((C1674k) interfaceC1673j).alpha(c1666c, agVar) == aVar) {
                                return aVar;
                            }
                        }
                    }
                    ajVar.k(c1557u.alpha);
                    return Unit.INSTANCE;
                }
                ajVar.f11982a = null;
                ajVar.k(c1557u.alpha);
                return Unit.INSTANCE;
            }
        }
        agVar = new ag(ajVar, cVar);
        Object obj2 = agVar.purple;
        Od.a aVar2 = Od.a.alpha;
        i4 = agVar.silver;
        if (i4 == 0) {
        }
        ajVar.f11982a = null;
        ajVar.k(c1557u.alpha);
        return Unit.INSTANCE;
    }

    @Override // s0.b0
    public final /* synthetic */ void bronze() {
    }

    @Override // s0.b0
    public void fuchsia(m0.k kVar, m0.l lVar, long j5) {
        if (this.teal && this.f11985d == null) {
            C0703s c0703s = new C0703s(2, this);
            m0.k kVar2 = m0.ab.alpha;
            m0.ah ahVar = new m0.ah(null, null, c0703s);
            b(ahVar);
            this.f11985d = ahVar;
        }
        m0.ah ahVar2 = this.f11985d;
        if (ahVar2 != null) {
            ahVar2.fuchsia(kVar, lVar, j5);
        }
    }

    public final void h() {
        C1665b c1665b = this.f11982a;
        if (c1665b != null) {
            InterfaceC1673j interfaceC1673j = this.white;
            if (interfaceC1673j != null) {
                ((C1674k) interfaceC1673j).bravo(new C1664a(c1665b));
            }
            this.f11982a = null;
        }
    }

    public abstract Object i(ah ahVar, ai aiVar);

    public abstract void j(long j5);

    @Override // s0.b0
    public final long juliet() {
        return s0.h0.alpha;
    }

    public abstract void k(long j5);

    public abstract boolean l();

    public final void m(Function1 function1, boolean z2, InterfaceC1673j interfaceC1673j, K k6, boolean z10) {
        m0.ah ahVar;
        this.silver = function1;
        boolean z11 = true;
        if (this.teal != z2) {
            this.teal = z2;
            if (!z2) {
                h();
                m0.ah ahVar2 = this.f11985d;
                if (ahVar2 != null) {
                    c(ahVar2);
                }
                this.f11985d = null;
            }
            z10 = true;
        }
        if (!Intrinsics.areEqual(this.white, interfaceC1673j)) {
            h();
            this.white = interfaceC1673j;
        }
        if (this.red != k6) {
            this.red = k6;
        } else {
            z11 = z10;
        }
        if (z11 && (ahVar = this.f11985d) != null) {
            ahVar.d();
        }
    }

    @Override // T.r
    public void onDensityChange() {
        xray();
    }

    @Override // T.r
    public final void onDetach() {
        this.f11983b = false;
        h();
        this.f11984c = 0L;
    }

    @Override // s0.b0
    public final /* synthetic */ boolean peach() {
        return false;
    }

    @Override // s0.b0
    public final void silver() {
        xray();
    }

    @Override // s0.b0
    public final void xray() {
        m0.ah ahVar = this.f11985d;
        if (ahVar != null) {
            ahVar.xray();
        }
    }
}
