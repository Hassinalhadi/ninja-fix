package al;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import androidx.compose.runtime.t0;
import kotlin.jvm.internal.Intrinsics;
import t6.M2;
import z5.AbstractC3466c;
import z5.C3464a;

/* loaded from: classes3.dex */
public final class f implements Drawable.Callback {
    public final /* synthetic */ int alpha;
    public Object purple;

    private final void alpha(Drawable drawable) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable d4) {
        long j5;
        switch (this.alpha) {
            case 0:
                return;
            case 1:
                ((androidx.vectordrawable.graphics.drawable.e) this.purple).invalidateSelf();
                return;
            default:
                Intrinsics.echo(d4, "d");
                C3464a c3464a = (C3464a) this.purple;
                ((t0) c3464a.red).setValue(Integer.valueOf(((Number) ((t0) c3464a.red).getValue()).intValue() + 1));
                Object obj = AbstractC3466c.alpha;
                Drawable drawable = c3464a.purple;
                if (drawable.getIntrinsicWidth() >= 0 && drawable.getIntrinsicHeight() >= 0) {
                    j5 = M2.alpha(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                } else {
                    j5 = 9205357640488583168L;
                }
                ((t0) c3464a.silver).setValue(new Z.e(j5));
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable d4, Runnable what, long j5) {
        switch (this.alpha) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.purple;
                if (callback != null) {
                    callback.scheduleDrawable(d4, what, j5);
                    return;
                }
                return;
            case 1:
                ((androidx.vectordrawable.graphics.drawable.e) this.purple).scheduleSelf(what, j5);
                return;
            default:
                Intrinsics.echo(d4, "d");
                Intrinsics.echo(what, "what");
                ((Handler) AbstractC3466c.alpha.getValue()).postAtTime(what, j5);
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable d4, Runnable what) {
        switch (this.alpha) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.purple;
                if (callback != null) {
                    callback.unscheduleDrawable(d4, what);
                    return;
                }
                return;
            case 1:
                ((androidx.vectordrawable.graphics.drawable.e) this.purple).unscheduleSelf(what);
                return;
            default:
                Intrinsics.echo(d4, "d");
                Intrinsics.echo(what, "what");
                ((Handler) AbstractC3466c.alpha.getValue()).removeCallbacks(what);
                return;
        }
    }

    public /* synthetic */ f(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }
}
