package t0;

import android.view.MotionEvent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: t0.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2934q extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ C2946x purple;
    public final /* synthetic */ MotionEvent red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2934q(C2946x c2946x, MotionEvent motionEvent, int i4) {
        super(0);
        this.alpha = i4;
        this.purple = c2946x;
        this.red = motionEvent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                return Boolean.valueOf(C2946x.bravo(this.red, this.purple));
            default:
                return Boolean.valueOf(C2946x.bravo(this.red, this.purple));
        }
    }
}
