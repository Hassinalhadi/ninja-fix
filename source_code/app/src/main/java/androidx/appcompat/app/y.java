package androidx.appcompat.app;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;
import t6.AbstractC3032n3;

/* loaded from: classes3.dex */
public final class y extends ContentFrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ab f2752b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(ab abVar, an.d dVar) {
        super(dVar, null);
        this.f2752b = abVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f2752b.uniform(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x4 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (x4 < -5 || y10 < -5 || x4 > getWidth() + 5 || y10 > getHeight() + 5) {
                ab abVar = this.f2752b;
                abVar.romeo(abVar.azure(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i4) {
        setBackgroundDrawable(AbstractC3032n3.echo(i4, getContext()));
    }
}
