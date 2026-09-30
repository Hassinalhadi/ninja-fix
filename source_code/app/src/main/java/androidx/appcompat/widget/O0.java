package androidx.appcompat.widget;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes3.dex */
public final class O0 extends TouchDelegate {
    public final View alpha;
    public final Rect bravo;
    public final Rect charlie;
    public final Rect delta;
    public final int echo;
    public boolean foxtrot;

    public O0(View view, Rect rect, Rect rect2) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.echo = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.bravo = rect3;
        Rect rect4 = new Rect();
        this.delta = rect4;
        Rect rect5 = new Rect();
        this.charlie = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i4 = -scaledTouchSlop;
        rect4.inset(i4, i4);
        rect5.set(rect2);
        this.alpha = view;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean z10;
        int x4 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z11 = true;
        if (action != 0) {
            if (action != 1 && action != 2) {
                if (action == 3) {
                    z10 = this.foxtrot;
                    this.foxtrot = false;
                }
                z2 = true;
                z11 = false;
            } else {
                z10 = this.foxtrot;
                if (z10 && !this.delta.contains(x4, y10)) {
                    z11 = z10;
                    z2 = false;
                }
            }
            z11 = z10;
            z2 = true;
        } else {
            if (this.bravo.contains(x4, y10)) {
                this.foxtrot = true;
                z2 = true;
            }
            z2 = true;
            z11 = false;
        }
        if (!z11) {
            return false;
        }
        Rect rect = this.charlie;
        View view = this.alpha;
        if (z2 && !rect.contains(x4, y10)) {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        } else {
            motionEvent.setLocation(x4 - rect.left, y10 - rect.top);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
