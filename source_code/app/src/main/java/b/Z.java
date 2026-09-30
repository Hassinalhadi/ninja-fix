package b;

import android.view.View;
import android.widget.Magnifier;

/* loaded from: classes3.dex */
public final class Z implements X {
    public static final Z bravo = new Z(0);
    public static final Z charlie = new Z(1);
    public final /* synthetic */ int alpha;

    public /* synthetic */ Z(int i4) {
        this.alpha = i4;
    }

    @Override // b.X
    public final boolean alpha() {
        switch (this.alpha) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // b.X
    public final W bravo(View view, Q0.d dVar) {
        switch (this.alpha) {
            case 0:
                return new Y(new Magnifier(view));
            default:
                return new Y(new Magnifier(view));
        }
    }
}
