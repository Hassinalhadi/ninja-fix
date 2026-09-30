package B9;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: B9.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0060q extends z1.g {

    /* renamed from: f, reason: collision with root package name */
    public long f607f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0060q(View view) {
        super(view, 0, null);
        Object[] november = z1.g.november(view, 1, null, null);
        this.f607f = -1L;
        ((ConstraintLayout) november[0]).setTag(null);
        papa(view);
        lima();
    }

    @Override // z1.g
    public final void foxtrot() {
        synchronized (this) {
            this.f607f = 0L;
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f607f != 0) {
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // z1.g
    public final void lima() {
        synchronized (this) {
            this.f607f = 1L;
        }
        oscar();
    }
}
