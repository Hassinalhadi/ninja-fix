package m9;

import android.view.GestureDetector;
import android.view.MotionEvent;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: m9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2108a extends GestureDetector.SimpleOnGestureListener {
    public final u9.a alpha;
    public final u9.a bravo;

    public C2108a(u9.a aVar, u9.a aVar2) {
        this.alpha = aVar;
        this.bravo = aVar2;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent event) {
        Intrinsics.foxtrot(event, "event");
        u9.a aVar = this.bravo;
        if (aVar != null) {
            aVar.invoke(event);
            return Boolean.FALSE.booleanValue();
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent event) {
        Intrinsics.foxtrot(event, "event");
        u9.a aVar = this.alpha;
        if (aVar != null) {
            aVar.invoke(event);
            return Boolean.FALSE.booleanValue();
        }
        return false;
    }
}
