package O6;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.firebase.messaging.o;
import g.C1718a;
import i7.AbstractC1900f;
import t6.A3;

/* loaded from: classes2.dex */
public final class d extends A3 {
    public int alpha;
    public int bravo = -1;
    public final /* synthetic */ SwipeDismissBehavior charlie;

    public d(SwipeDismissBehavior swipeDismissBehavior) {
        this.charlie = swipeDismissBehavior;
    }

    @Override // t6.A3
    public final int alpha(int i4, View view) {
        boolean z2;
        int width;
        int width2;
        int width3;
        if (view.getLayoutDirection() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i5 = this.charlie.teal;
        if (i5 == 0) {
            if (z2) {
                width = this.alpha - view.getWidth();
                width2 = this.alpha;
            } else {
                width = this.alpha;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i5 == 1) {
            if (z2) {
                width = this.alpha;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.alpha - view.getWidth();
                width2 = this.alpha;
            }
        } else {
            width = this.alpha - view.getWidth();
            width2 = view.getWidth() + this.alpha;
        }
        return Math.min(Math.max(width, i4), width2);
    }

    @Override // t6.A3
    public final int bravo(int i4, View view) {
        return view.getTop();
    }

    @Override // t6.A3
    public final int delta(View view) {
        return view.getWidth();
    }

    @Override // t6.A3
    public final void hotel(int i4, View view) {
        this.bravo = i4;
        this.alpha = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.charlie;
            swipeDismissBehavior.silver = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.silver = false;
        }
    }

    @Override // t6.A3
    public final void india(int i4) {
        C1718a c1718a = this.charlie.purple;
        if (c1718a != null) {
            AbstractC1900f abstractC1900f = (AbstractC1900f) c1718a.purple;
            if (i4 != 0) {
                if (i4 == 1 || i4 == 2) {
                    o.lima().quebec(abstractC1900f.tango);
                    return;
                }
                return;
            }
            o.lima().romeo(abstractC1900f.tango);
        }
    }

    @Override // t6.A3
    public final void juliet(View view, int i4, int i5) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.charlie;
        float f5 = width * swipeDismissBehavior.white;
        float width2 = view.getWidth() * swipeDismissBehavior.yellow;
        float abs = Math.abs(i4 - this.alpha);
        if (abs <= f5) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((abs - f5) / (width2 - f5))), 1.0f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x004e, code lost:
    
        if (java.lang.Math.abs(r9.getLeft() - r8.alpha) >= java.lang.Math.round(r9.getWidth() * 0.5f)) goto L27;
     */
    @Override // t6.A3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void kilo(View view, float f5, float f10) {
        int i4;
        C1718a c1718a;
        boolean z2;
        this.bravo = -1;
        int width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.charlie;
        boolean z10 = true;
        if (f5 != 0.0f) {
            if (view.getLayoutDirection() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i5 = swipeDismissBehavior.teal;
            if (i5 != 2) {
                if (i5 == 0) {
                    i4 = this.alpha;
                    z10 = false;
                } else {
                    i4 = this.alpha;
                    z10 = false;
                }
            }
            if (f5 >= 0.0f) {
                int left = view.getLeft();
                int i10 = this.alpha;
                if (left >= i10) {
                    i4 = i10 + width;
                }
            }
            i4 = this.alpha - width;
        }
        if (swipeDismissBehavior.alpha.quebec(i4, view.getTop())) {
            view.postOnAnimation(new e(swipeDismissBehavior, view, z10));
        } else if (z10 && (c1718a = swipeDismissBehavior.purple) != null) {
            c1718a.beige(view);
        }
    }

    @Override // t6.A3
    public final boolean oscar(int i4, View view) {
        int i5 = this.bravo;
        if ((i5 == -1 || i5 == i4) && this.charlie.echo(view)) {
            return true;
        }
        return false;
    }
}
