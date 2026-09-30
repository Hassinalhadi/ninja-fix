package F;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import l0.InterfaceC2044a;

/* renamed from: F.a2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0087a2 implements InterfaceC2044a {
    public final /* synthetic */ C0103e2 alpha;
    public final /* synthetic */ Function1 purple;

    public C0087a2(C0103e2 c0103e2, Function1 function1) {
        d.K k6 = d.K.alpha;
        this.alpha = c0103e2;
        this.purple = function1;
    }

    @Override // l0.InterfaceC2044a
    public final long black(int i4, long j5) {
        float echo;
        d.K k6 = d.K.alpha;
        float delta = Z.b.delta(j5);
        if (delta < 0.0f && i4 == 1) {
            androidx.compose.material3.internal.t tVar = this.alpha.bravo;
            float foxtrot = tVar.foxtrot(delta);
            if (Float.isNaN(tVar.echo())) {
                echo = 0.0f;
            } else {
                echo = tVar.echo();
            }
            ((androidx.compose.runtime.n0) ((androidx.compose.runtime.aw) tVar.lima)).kilo(foxtrot);
            return t6.H2.alpha(0.0f, foxtrot - echo);
        }
        return 0L;
    }

    @Override // l0.InterfaceC2044a
    public final long maroon(int i4, long j5, long j6) {
        float echo;
        if (i4 == 1) {
            androidx.compose.material3.internal.t tVar = this.alpha.bravo;
            d.K k6 = d.K.alpha;
            float foxtrot = tVar.foxtrot(Z.b.delta(j6));
            if (Float.isNaN(tVar.echo())) {
                echo = 0.0f;
            } else {
                echo = tVar.echo();
            }
            ((androidx.compose.runtime.n0) ((androidx.compose.runtime.aw) tVar.lima)).kilo(foxtrot);
            return t6.H2.alpha(0.0f, foxtrot - echo);
        }
        return 0L;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Map, java.lang.Object] */
    @Override // l0.InterfaceC2044a
    public final Object navy(long j5, Nd.c cVar) {
        float f5;
        d.K k6 = d.K.alpha;
        float charlie = Q0.r.charlie(j5);
        C0103e2 c0103e2 = this.alpha;
        float golf = c0103e2.bravo.golf();
        Float silver = CollectionsKt.silver(c0103e2.bravo.delta().alpha.values());
        if (silver != null) {
            f5 = silver.floatValue();
        } else {
            f5 = Float.NaN;
        }
        if (charlie < 0.0f && golf > f5) {
            this.purple.invoke(new Float(charlie));
        } else {
            j5 = 0;
        }
        return new Q0.r(j5);
    }

    @Override // l0.InterfaceC2044a
    public final Object oscar(long j5, long j6, Nd.c cVar) {
        d.K k6 = d.K.alpha;
        this.purple.invoke(new Float(Q0.r.charlie(j6)));
        return new Q0.r(j6);
    }
}
