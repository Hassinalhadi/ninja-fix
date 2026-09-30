package P2;

import Xd.l;
import java.io.IOException;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

/* loaded from: classes3.dex */
public final class e extends Pd.i implements l {
    public final /* synthetic */ f alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, Nd.c cVar) {
        super(2, cVar);
        this.alpha = fVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new e(this.alpha, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [Tf.ao, java.lang.Object] */
    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        boolean z2;
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        f fVar = this.alpha;
        synchronized (fVar) {
            if (fVar.e && !fVar.f1892f) {
                try {
                    fVar.beige();
                } catch (IOException unused) {
                    fVar.f1893g = true;
                }
                try {
                    if (fVar.f1889b >= 2000) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        fVar.crimson();
                    }
                } catch (IOException unused2) {
                    fVar.f1894h = true;
                    fVar.f1890c = Tf.b.bravo(new Object());
                }
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
    }
}
