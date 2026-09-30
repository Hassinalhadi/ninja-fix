package d;

import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: d.k0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1540k0 extends Pd.i implements Xd.l {
    public C1548o0 alpha;
    public kotlin.jvm.internal.t purple;
    public long red;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f12003s;
    public int silver;
    public /* synthetic */ Object teal;
    public final /* synthetic */ C1548o0 white;
    public final /* synthetic */ kotlin.jvm.internal.t yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1540k0(C1548o0 c1548o0, kotlin.jvm.internal.t tVar, long j5, Nd.c cVar) {
        super(2, cVar);
        this.white = c1548o0;
        this.yellow = tVar;
        this.f12003s = j5;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        C1540k0 c1540k0 = new C1540k0(this.white, this.yellow, this.f12003s, cVar);
        c1540k0.teal = obj;
        return c1540k0;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C1540k0) create((C1542l0) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        C1548o0 c1548o0;
        kotlin.jvm.internal.t tVar;
        float charlie;
        long j5;
        C1548o0 c1548o02;
        long alpha;
        Od.a aVar = Od.a.alpha;
        int i4 = this.silver;
        if (i4 != 0) {
            if (i4 == 1) {
                j5 = this.red;
                tVar = this.purple;
                c1548o0 = this.alpha;
                c1548o02 = (C1548o0) this.teal;
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            C1542l0 c1542l0 = (C1542l0) this.teal;
            c1548o0 = this.white;
            C1538j0 c1538j0 = new C1538j0(c1548o0, c1542l0);
            C1543m c1543m = c1548o0.charlie;
            tVar = this.yellow;
            long j6 = tVar.alpha;
            K k6 = c1548o0.delta;
            K k10 = K.purple;
            long j7 = this.f12003s;
            if (k6 == k10) {
                charlie = Q0.r.bravo(j7);
            } else {
                charlie = Q0.r.charlie(j7);
            }
            float delta = c1548o0.delta(charlie);
            this.teal = c1548o0;
            this.alpha = c1548o0;
            this.purple = tVar;
            this.red = j6;
            this.silver = 1;
            c1543m.getClass();
            obj = vf.ad.blue(androidx.compose.foundation.gestures.a.charlie, new C1541l(delta, c1543m, c1538j0, null), this);
            if (obj == aVar) {
                return aVar;
            }
            j5 = j6;
            c1548o02 = c1548o0;
        }
        float delta2 = c1548o02.delta(((Number) obj).floatValue());
        if (c1548o0.delta == K.purple) {
            alpha = Q0.r.alpha(delta2, 0.0f, 2, j5);
        } else {
            alpha = Q0.r.alpha(0.0f, delta2, 1, j5);
        }
        tVar.alpha = alpha;
        return Unit.INSTANCE;
    }
}
