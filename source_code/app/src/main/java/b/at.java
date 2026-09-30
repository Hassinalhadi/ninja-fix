package b;

import android.content.Context;
import android.widget.EdgeEffect;
import s6.W6;

/* loaded from: classes3.dex */
public final class at extends EdgeEffect {
    public final float alpha;
    public float bravo;

    public at(Context context) {
        super(context);
        this.alpha = W6.alpha(context).alpha * 1;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i4) {
        this.bravo = 0.0f;
        super.onAbsorb(i4);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f5, float f10) {
        this.bravo = 0.0f;
        super.onPull(f5, f10);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.bravo = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f5) {
        this.bravo = 0.0f;
        super.onPull(f5);
    }
}
