package androidx.recyclerview.widget;

import android.util.Log;
import android.view.animation.Interpolator;

/* loaded from: classes3.dex */
public final class Y {
    public int alpha;
    public int bravo;
    public int charlie;
    public int delta;
    public Interpolator echo;
    public boolean foxtrot;
    public int golf;

    public final void alpha(RecyclerView recyclerView) {
        int i4 = this.delta;
        if (i4 >= 0) {
            this.delta = -1;
            recyclerView.jumpToPositionForSmoothScroller(i4);
            this.foxtrot = false;
            return;
        }
        if (this.foxtrot) {
            Interpolator interpolator = this.echo;
            if (interpolator != null && this.charlie < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i5 = this.charlie;
            if (i5 >= 1) {
                recyclerView.mViewFlinger.charlie(this.alpha, this.bravo, interpolator, i5);
                int i10 = this.golf + 1;
                this.golf = i10;
                if (i10 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.foxtrot = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        this.golf = 0;
    }
}
