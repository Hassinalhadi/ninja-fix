package z0;

import A0.j;
import A0.v;
import Xd.l;
import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: z0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3456e extends Pd.i implements l {
    public int alpha;
    public /* synthetic */ float purple;
    public final /* synthetic */ ScrollCaptureCallbackC3457f red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3456e(ScrollCaptureCallbackC3457f scrollCaptureCallbackC3457f, Nd.c cVar) {
        super(2, cVar);
        this.red = scrollCaptureCallbackC3457f;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        C3456e c3456e = new C3456e(this.red, cVar);
        c3456e.purple = ((Number) obj).floatValue();
        return c3456e;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C3456e) create(Float.valueOf(((Number) obj).floatValue()), (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            float f5 = this.purple;
            ScrollCaptureCallbackC3457f scrollCaptureCallbackC3457f = this.red;
            l lVar = (l) v.delta(scrollCaptureCallbackC3457f.alpha.delta, j.echo);
            if (lVar != null) {
                Z.b bVar = new Z.b((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L));
                this.alpha = 1;
                obj = lVar.invoke(bVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                throw Q0.c.xray("Required value was null.");
            }
        }
        return new Float(Float.intBitsToFloat((int) (((Z.b) obj).alpha & 4294967295L)));
    }
}
