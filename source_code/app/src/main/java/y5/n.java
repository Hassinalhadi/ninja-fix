package y5;

import android.content.Context;
import android.widget.OverScroller;

/* loaded from: classes3.dex */
public final class n implements Runnable {
    public final OverScroller alpha;
    public int purple;
    public int red;
    public final /* synthetic */ o silver;

    public n(o oVar, Context context) {
        this.silver = oVar;
        this.alpha = new OverScroller(context);
    }

    @Override // java.lang.Runnable
    public final void run() {
        OverScroller overScroller = this.alpha;
        if (!overScroller.isFinished() && overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            o oVar = this.silver;
            oVar.f14143f.postTranslate(this.purple - currX, this.red - currY);
            oVar.alpha();
            this.purple = currX;
            this.red = currY;
            oVar.f14139a.postOnAnimation(this);
        }
    }
}
