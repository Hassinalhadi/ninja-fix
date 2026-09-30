package z0;

import Xd.l;
import a0.ao;
import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import java.util.function.Consumer;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

/* renamed from: z0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3453b extends Pd.i implements l {
    public int alpha;
    public final /* synthetic */ ScrollCaptureCallbackC3457f purple;
    public final /* synthetic */ ScrollCaptureSession red;
    public final /* synthetic */ Rect silver;
    public final /* synthetic */ Consumer teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3453b(ScrollCaptureCallbackC3457f scrollCaptureCallbackC3457f, ScrollCaptureSession scrollCaptureSession, Rect rect, Consumer consumer, Nd.c cVar) {
        super(2, cVar);
        this.purple = scrollCaptureCallbackC3457f;
        this.red = scrollCaptureSession;
        this.silver = rect;
        this.teal = consumer;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C3453b(this.purple, this.red, this.silver, this.teal, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C3453b) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            ScrollCaptureSession scrollCaptureSession = this.red;
            Rect rect = this.silver;
            Q0.l lVar = new Q0.l(rect.left, rect.top, rect.right, rect.bottom);
            this.alpha = 1;
            obj = ScrollCaptureCallbackC3457f.alpha(this.purple, scrollCaptureSession, lVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        this.teal.accept(ao.yankee((Q0.l) obj));
        return Unit.INSTANCE;
    }
}
