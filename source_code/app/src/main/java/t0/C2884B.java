package t0;

import android.os.Build;
import android.view.ViewConfiguration;
import s6.Z6;

/* renamed from: t0.B, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2884B implements C0 {
    public final ViewConfiguration alpha;

    public C2884B(ViewConfiguration viewConfiguration) {
        this.alpha = viewConfiguration;
    }

    @Override // t0.C0
    public final long alpha() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // t0.C0
    public final long bravo() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // t0.C0
    public final float charlie() {
        int scaledHandwritingSlop;
        if (Build.VERSION.SDK_INT >= 34) {
            scaledHandwritingSlop = this.alpha.getScaledHandwritingSlop();
            return scaledHandwritingSlop;
        }
        return 2.0f;
    }

    @Override // t0.C0
    public final long delta() {
        float f5 = 48;
        return Z6.alpha(f5, f5);
    }

    @Override // t0.C0
    public final float echo() {
        return this.alpha.getScaledMaximumFlingVelocity();
    }

    @Override // t0.C0
    public final float foxtrot() {
        return this.alpha.getScaledTouchSlop();
    }

    @Override // t0.C0
    public final float golf() {
        int scaledHandwritingGestureLineMargin;
        if (Build.VERSION.SDK_INT >= 34) {
            scaledHandwritingGestureLineMargin = this.alpha.getScaledHandwritingGestureLineMargin();
            return scaledHandwritingGestureLineMargin;
        }
        return 16.0f;
    }
}
