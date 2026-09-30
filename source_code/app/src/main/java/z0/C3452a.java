package z0;

import Xd.l;
import androidx.compose.runtime.ax;
import androidx.compose.runtime.t0;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

/* renamed from: z0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3452a extends Pd.i implements l {
    public int alpha;
    public final /* synthetic */ ScrollCaptureCallbackC3457f purple;
    public final /* synthetic */ Runnable red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3452a(ScrollCaptureCallbackC3457f scrollCaptureCallbackC3457f, Runnable runnable, Nd.c cVar) {
        super(2, cVar);
        this.purple = scrollCaptureCallbackC3457f;
        this.red = runnable;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C3452a(this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C3452a) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        ScrollCaptureCallbackC3457f scrollCaptureCallbackC3457f = this.purple;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            E0.h hVar = scrollCaptureCallbackC3457f.foxtrot;
            this.alpha = 1;
            Object bravo = hVar.bravo(0.0f - hVar.bravo, this);
            if (bravo != aVar) {
                bravo = Unit.INSTANCE;
            }
            if (bravo == aVar) {
                return aVar;
            }
        }
        ((t0) ((ax) scrollCaptureCallbackC3457f.charlie.alpha)).setValue(Boolean.FALSE);
        this.red.run();
        return Unit.INSTANCE;
    }
}
