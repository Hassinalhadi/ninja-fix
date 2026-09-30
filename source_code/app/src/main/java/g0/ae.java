package g0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class ae extends Lambda implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ af purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ae(af afVar, int i4) {
        super(1);
        this.alpha = i4;
        this.purple = afVar;
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                af afVar = this.purple;
                afVar.delta = true;
                afVar.foxtrot.invoke();
                return Unit.INSTANCE;
            default:
                c0.d dVar = (c0.d) obj;
                af afVar2 = this.purple;
                C1723c c1723c = afVar2.bravo;
                float f5 = afVar2.kilo;
                float f10 = afVar2.lima;
                J2.t lime = dVar.lime();
                long oscar = lime.oscar();
                lime.mike().golf();
                try {
                    ((av.ah) lime.alpha).purple(f5, f10, 0L);
                    c1723c.alpha(dVar);
                    ao.ad.coral(lime, oscar);
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    ao.ad.coral(lime, oscar);
                    throw th;
                }
        }
    }
}
