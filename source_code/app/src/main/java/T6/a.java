package T6;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes2.dex */
public final class a implements View.OnTouchListener {
    public final Dialog alpha;
    public final int purple;
    public final int red;
    public final int silver;

    public a(Dialog dialog, Rect rect) {
        this.alpha = dialog;
        this.purple = rect.left;
        this.red = rect.top;
        this.silver = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(R.id.content);
        int left = findViewById.getLeft() + this.purple;
        int width = findViewById.getWidth() + left;
        if (new RectF(left, findViewById.getTop() + this.red, width, findViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i4 = this.silver;
            obtain.setLocation((-i4) - 1, (-i4) - 1);
        }
        view.performClick();
        return this.alpha.onTouchEvent(obtain);
    }
}
