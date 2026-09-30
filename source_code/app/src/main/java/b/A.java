package b;

import androidx.recyclerview.widget.RecyclerView;
import f.C1670g;
import f.C1671h;
import f.C1674k;
import f.InterfaceC1673j;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class A extends T.r implements s0.b0 {
    public InterfaceC1673j alpha;
    public C1670g purple;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r5v3, types: [f.i, java.lang.Object, f.g] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(A a6, Pd.c cVar) {
        aw awVar;
        int i4;
        C1670g c1670g;
        a6.getClass();
        if (cVar instanceof aw) {
            awVar = (aw) cVar;
            int i5 = awVar.silver;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                awVar.silver = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = awVar.purple;
                Od.a aVar = Od.a.alpha;
                i4 = awVar.silver;
                if (i4 == 0) {
                    if (i4 == 1) {
                        c1670g = awVar.alpha;
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    if (a6.purple == null) {
                        ?? obj2 = new Object();
                        InterfaceC1673j interfaceC1673j = a6.alpha;
                        awVar.alpha = obj2;
                        awVar.silver = 1;
                        if (((C1674k) interfaceC1673j).alpha(obj2, awVar) == aVar) {
                            return aVar;
                        }
                        c1670g = obj2;
                    }
                    return Unit.INSTANCE;
                }
                a6.purple = c1670g;
                return Unit.INSTANCE;
            }
        }
        awVar = new aw(a6, cVar);
        Object obj3 = awVar.purple;
        Od.a aVar2 = Od.a.alpha;
        i4 = awVar.silver;
        if (i4 == 0) {
        }
        a6.purple = c1670g;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(A a6, Pd.c cVar) {
        ax axVar;
        int i4;
        a6.getClass();
        if (cVar instanceof ax) {
            axVar = (ax) cVar;
            int i5 = axVar.red;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                axVar.red = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = axVar.alpha;
                Od.a aVar = Od.a.alpha;
                i4 = axVar.red;
                if (i4 == 0) {
                    if (i4 == 1) {
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    C1670g c1670g = a6.purple;
                    if (c1670g != null) {
                        C1671h c1671h = new C1671h(c1670g);
                        InterfaceC1673j interfaceC1673j = a6.alpha;
                        axVar.red = 1;
                        if (((C1674k) interfaceC1673j).alpha(c1671h, axVar) == aVar) {
                            return aVar;
                        }
                    }
                    return Unit.INSTANCE;
                }
                a6.purple = null;
                return Unit.INSTANCE;
            }
        }
        axVar = new ax(a6, cVar);
        Object obj2 = axVar.alpha;
        Od.a aVar2 = Od.a.alpha;
        i4 = axVar.red;
        if (i4 == 0) {
        }
        a6.purple = null;
        return Unit.INSTANCE;
    }

    @Override // s0.b0
    public final /* synthetic */ void bronze() {
    }

    public final void d() {
        C1670g c1670g = this.purple;
        if (c1670g != null) {
            ((C1674k) this.alpha).bravo(new C1671h(c1670g));
            this.purple = null;
        }
    }

    @Override // s0.b0
    public final void fuchsia(m0.k kVar, m0.l lVar, long j5) {
        if (lVar == m0.l.purple) {
            int i4 = kVar.echo;
            if (i4 == 4) {
                vf.ad.zulu(getCoroutineScope(), null, null, new ay(this, null), 3);
            } else if (i4 == 5) {
                vf.ad.zulu(getCoroutineScope(), null, null, new az(this, null), 3);
            }
        }
    }

    @Override // s0.b0
    public final long juliet() {
        return s0.h0.alpha;
    }

    @Override // T.r
    public final void onDensityChange() {
        xray();
    }

    @Override // T.r
    public final void onDetach() {
        d();
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
        d();
    }
}
