package o9;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import androidx.compose.material3.internal.aj;
import com.google.android.material.appbar.f;
import gf.t;
import kotlin.jvm.internal.Intrinsics;
import u9.b;

/* renamed from: o9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnTouchListenerC2201a implements View.OnTouchListener {
    public final int alpha;
    public boolean purple;
    public float red;
    public final View silver;
    public final b teal;
    public final t white;
    public final b yellow;

    public ViewOnTouchListenerC2201a(View swipeView, b bVar, t tVar, b bVar2) {
        Intrinsics.foxtrot(swipeView, "swipeView");
        this.silver = swipeView;
        this.teal = bVar;
        this.white = tVar;
        this.yellow = bVar2;
        this.alpha = swipeView.getHeight() / 4;
    }

    public final void alpha(float f5) {
        ViewPropertyAnimator updateListener = this.silver.animate().translationY(f5).setDuration(200L).setInterpolator(new AccelerateInterpolator()).setUpdateListener(new f(3, this));
        Intrinsics.bravo(updateListener, "swipeView.animate()\n    …ionY, translationLimit) }");
        updateListener.setListener(new O6.b(10, new aj(this, f5))).start();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View v4, MotionEvent event) {
        float f5;
        Intrinsics.foxtrot(v4, "v");
        Intrinsics.foxtrot(event, "event");
        int action = event.getAction();
        View view = this.silver;
        if (action != 0) {
            int i4 = this.alpha;
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                } else {
                    if (this.purple) {
                        float y10 = event.getY() - this.red;
                        view.setTranslationY(y10);
                        this.white.invoke(Float.valueOf(y10), Integer.valueOf(i4));
                        return true;
                    }
                    return true;
                }
            }
            if (this.purple) {
                this.purple = false;
                int height = v4.getHeight();
                if (view.getTranslationY() < (-i4)) {
                    f5 = -height;
                } else if (view.getTranslationY() > i4) {
                    f5 = height;
                } else {
                    f5 = 0.0f;
                }
                if (f5 != 0.0f && !((Boolean) this.yellow.invoke()).booleanValue()) {
                    this.teal.invoke();
                    return true;
                }
                alpha(f5);
            }
            return true;
        }
        Rect rect = new Rect();
        if (view != null) {
            view.getHitRect(rect);
        }
        if (rect.contains((int) event.getX(), (int) event.getY())) {
            this.purple = true;
        }
        this.red = event.getY();
        return true;
    }
}
