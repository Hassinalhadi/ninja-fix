package F;

import a0.C0354h;
import a0.C0356j;
import a0.C0366t;
import android.graphics.Path;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import s6.AbstractC2797v7;

/* loaded from: classes3.dex */
public final class B extends Lambda implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;
    public final /* synthetic */ Object teal;
    public final /* synthetic */ Object white;
    public final /* synthetic */ Object yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i4) {
        super(1);
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
        this.silver = obj3;
        this.teal = obj4;
        this.white = obj5;
        this.yellow = obj6;
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [java.util.Map, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float f5;
        float f10;
        Path path;
        Object obj2 = this.teal;
        Object obj3 = this.silver;
        Object obj4 = this.yellow;
        Object obj5 = this.purple;
        Object obj6 = this.red;
        Object obj7 = this.white;
        switch (this.alpha) {
            case 0:
                c0.d dVar = (c0.d) obj;
                float floor = (float) Math.floor(dVar.lavender(F.charlie));
                long j5 = ((C0366t) ((androidx.compose.runtime.D0) obj5).getValue()).alpha;
                long j6 = ((C0366t) ((androidx.compose.runtime.D0) obj6).getValue()).alpha;
                float lavender = dVar.lavender(F.delta);
                float f11 = floor / 2.0f;
                c0.h hVar = new c0.h(floor, 0.0f, 0, 0, null, 30);
                float delta = Z.e.delta(dVar.bravo());
                boolean charlie = C0366t.charlie(j5, j6);
                c0.g gVar = c0.g.alpha;
                if (charlie) {
                    ao.ad.papa(dVar, j5, 0L, t6.M2.alpha(delta, delta), t6.F2.alpha(lavender), gVar, 226);
                    f5 = 0.0f;
                    f10 = floor;
                } else {
                    float f12 = delta - (2 * floor);
                    f5 = 0.0f;
                    f10 = floor;
                    ao.ad.papa(dVar, j5, t6.H2.alpha(floor, floor), t6.M2.alpha(f12, f12), t6.F2.alpha(Math.max(0.0f, lavender - floor)), gVar, 224);
                    float f13 = delta - f10;
                    ao.ad.papa(dVar, j6, t6.H2.alpha(f11, f11), t6.M2.alpha(f13, f13), t6.F2.alpha(lavender - f11), hVar, 224);
                }
                long j7 = ((C0366t) ((androidx.compose.runtime.D0) obj3).getValue()).alpha;
                float floatValue = ((Number) ((bz.X) obj2).getValue()).floatValue();
                float floatValue2 = ((Number) ((bz.X) obj7).getValue()).floatValue();
                c0.h hVar2 = new c0.h(f10, 0.0f, 2, 0, null, 26);
                float delta2 = Z.e.delta(dVar.bravo());
                float echo = AbstractC2797v7.echo(0.4f, 0.5f, floatValue2);
                float echo2 = AbstractC2797v7.echo(0.7f, 0.5f, floatValue2);
                float echo3 = AbstractC2797v7.echo(0.5f, 0.5f, floatValue2);
                float echo4 = AbstractC2797v7.echo(0.3f, 0.5f, floatValue2);
                ax axVar = (ax) obj4;
                axVar.alpha.delta();
                C0354h c0354h = axVar.alpha;
                c0354h.alpha.moveTo(0.2f * delta2, echo3 * delta2);
                c0354h.bravo(echo * delta2, echo2 * delta2);
                c0354h.bravo(0.8f * delta2, delta2 * echo4);
                C0356j c0356j = axVar.bravo;
                if (c0354h != null) {
                    c0356j.getClass();
                    path = c0354h.alpha;
                } else {
                    path = null;
                }
                c0356j.alpha.setPath(path, false);
                C0354h c0354h2 = axVar.charlie;
                c0354h2.delta();
                c0356j.alpha(f5, c0356j.alpha.getLength() * floatValue, c0354h2);
                ao.ad.lima(dVar, axVar.charlie, j7, 0.0f, hVar2, 52);
                return Unit.INSTANCE;
            default:
                C0090b1 c0090b1 = new C0090b1((Function0) obj7, 0);
                ge.v[] vVarArr = A0.aa.alpha;
                A0.k kVar = (A0.k) ((A0.ad) obj);
                kVar.hotel(A0.j.uniform, new A0.a((String) obj6, c0090b1));
                C0103e2 c0103e2 = (C0103e2) obj5;
                EnumC0107f2 enumC0107f2 = (EnumC0107f2) ((androidx.compose.runtime.t0) ((androidx.compose.runtime.ax) c0103e2.bravo.golf)).getValue();
                EnumC0107f2 enumC0107f22 = EnumC0107f2.red;
                vf.ab abVar = (vf.ab) obj4;
                if (enumC0107f2 == enumC0107f22) {
                    kVar.hotel(A0.j.sierra, new A0.a((String) obj3, new Ce.ab(c0103e2, abVar, c0103e2, 3)));
                } else if (c0103e2.bravo.delta().alpha.containsKey(enumC0107f22)) {
                    kVar.hotel(A0.j.tango, new A0.a((String) obj2, new Aa.i(9, c0103e2, abVar)));
                }
                return Unit.INSTANCE;
        }
    }
}
