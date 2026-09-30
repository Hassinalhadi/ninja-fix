package m0;

import android.view.MotionEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class w extends Lambda implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ x purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(x xVar, int i4) {
        super(1);
        this.alpha = i4;
        this.purple = xVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                MotionEvent motionEvent = (MotionEvent) obj;
                T0.d dVar = this.purple.alpha;
                if (dVar != null) {
                    dVar.invoke(motionEvent);
                    return Unit.INSTANCE;
                }
                Intrinsics.lima("onTouchEvent");
                throw null;
            default:
                MotionEvent motionEvent2 = (MotionEvent) obj;
                T0.d dVar2 = this.purple.alpha;
                if (dVar2 != null) {
                    dVar2.invoke(motionEvent2);
                    return Unit.INSTANCE;
                }
                Intrinsics.lima("onTouchEvent");
                throw null;
        }
    }
}
