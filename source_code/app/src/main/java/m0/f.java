package m0;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import s0.AbstractC2555o;
import s0.AbstractC2557q;
import s0.C2545e;
import s0.InterfaceC2553m;
import s0.b0;
import s0.h0;
import s0.j0;

/* loaded from: classes3.dex */
public abstract class f extends T.r implements j0, b0, InterfaceC2553m {
    public s0.r alpha;
    public C2095a purple;
    public boolean red;

    public f(C2095a c2095a, s0.r rVar) {
        this.alpha = rVar;
        this.purple = c2095a;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    public final void b() {
        C2095a c2095a;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        AbstractC2557q.quebec(this, new Lambda(1));
        f fVar = (f) objectRef.alpha;
        if (fVar == null || (c2095a = fVar.purple) == null) {
            c2095a = this.purple;
        }
        c(c2095a);
    }

    @Override // s0.b0
    public final /* synthetic */ void bronze() {
    }

    public abstract void c(o oVar);

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.q, java.lang.Object] */
    public final void d() {
        ?? obj = new Object();
        obj.alpha = true;
        AbstractC2557q.romeo(this, new W.e(obj));
        if (obj.alpha) {
            b();
        }
    }

    public abstract boolean e(int i4);

    public final void f() {
        if (this.red) {
            this.red = false;
            if (isAttached()) {
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                AbstractC2557q.quebec(this, new d(objectRef));
                f fVar = (f) objectRef.alpha;
                if (fVar != null) {
                    fVar.b();
                } else {
                    c(null);
                }
            }
        }
    }

    @Override // s0.b0
    public final void fuchsia(k kVar, l lVar, long j5) {
        if (lVar == l.purple) {
            List list = kVar.alpha;
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (e(((r) list.get(i4)).india)) {
                    int i5 = kVar.echo;
                    if (i5 == 4) {
                        this.red = true;
                        d();
                        return;
                    } else {
                        if (i5 == 5) {
                            f();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    @Override // s0.b0
    public final long juliet() {
        s0.r rVar = this.alpha;
        if (rVar != null) {
            Q0.d dVar = AbstractC2555o.golf(this).f13298q;
            int i4 = h0.bravo;
            return C2545e.charlie(dVar.ochre(rVar.alpha), dVar.ochre(rVar.bravo), dVar.ochre(rVar.charlie), dVar.ochre(rVar.delta));
        }
        return h0.alpha;
    }

    @Override // T.r
    public final void onDensityChange() {
        xray();
    }

    @Override // T.r
    public final void onDetach() {
        f();
        super.onDetach();
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
        f();
    }
}
