package d;

import bz.AbstractC0779d;
import bz.C0788m;
import bz.C0797w;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: d.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1541l extends Pd.i implements Xd.l {
    public kotlin.jvm.internal.r alpha;
    public C0788m purple;
    public int red;
    public final /* synthetic */ float silver;
    public final /* synthetic */ C1543m teal;
    public final /* synthetic */ C1538j0 white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1541l(float f5, C1543m c1543m, C1538j0 c1538j0, Nd.c cVar) {
        super(2, cVar);
        this.silver = f5;
        this.teal = c1543m;
        this.white = c1538j0;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C1541l(this.silver, this.teal, this.white, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C1541l) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.jvm.internal.r, java.lang.Object] */
    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        float f5;
        C0788m c0788m;
        kotlin.jvm.internal.r rVar;
        Od.a aVar = Od.a.alpha;
        int i4 = this.red;
        if (i4 != 0) {
            if (i4 == 1) {
                c0788m = this.purple;
                rVar = this.alpha;
                try {
                    ResultKt.alpha(obj);
                } catch (CancellationException unused) {
                    rVar.alpha = ((Number) c0788m.alpha.bravo.invoke(c0788m.red)).floatValue();
                    f5 = rVar.alpha;
                    return new Float(f5);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            f5 = this.silver;
            if (Math.abs(f5) > 1.0f) {
                ?? obj2 = new Object();
                obj2.alpha = f5;
                Object obj3 = new Object();
                C0788m bravo = AbstractC0779d.bravo(28, 0.0f, f5);
                try {
                    C1543m c1543m = this.teal;
                    C0797w c0797w = c1543m.alpha;
                    X9.e eVar = new X9.e(obj3, this.white, (Object) obj2, c1543m, 7);
                    this.alpha = obj2;
                    this.purple = bravo;
                    this.red = 1;
                    if (bz.P.charlie(bravo, c0797w, eVar, this) == aVar) {
                        return aVar;
                    }
                    rVar = obj2;
                } catch (CancellationException unused2) {
                    c0788m = bravo;
                    rVar = obj2;
                    rVar.alpha = ((Number) c0788m.alpha.bravo.invoke(c0788m.red)).floatValue();
                    f5 = rVar.alpha;
                    return new Float(f5);
                }
            }
            return new Float(f5);
        }
        f5 = rVar.alpha;
        return new Float(f5);
    }
}
