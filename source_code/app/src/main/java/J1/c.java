package J1;

import android.view.View;
import s6.O5;

/* loaded from: classes3.dex */
public final class c extends O5 {
    public final /* synthetic */ int alpha;

    public /* synthetic */ c(int i4) {
        this.alpha = i4;
    }

    @Override // s6.O5
    public final float golf(Object obj) {
        switch (this.alpha) {
            case 0:
                return ((View) obj).getAlpha();
            case 1:
                return ((View) obj).getScaleX();
            case 2:
                return ((View) obj).getScaleY();
            case 3:
                return ((View) obj).getRotation();
            case 4:
                return ((View) obj).getRotationX();
            default:
                return ((View) obj).getRotationY();
        }
    }

    @Override // s6.O5
    public final void mike(Object obj, float f5) {
        switch (this.alpha) {
            case 0:
                ((View) obj).setAlpha(f5);
                return;
            case 1:
                ((View) obj).setScaleX(f5);
                return;
            case 2:
                ((View) obj).setScaleY(f5);
                return;
            case 3:
                ((View) obj).setRotation(f5);
                return;
            case 4:
                ((View) obj).setRotationX(f5);
                return;
            default:
                ((View) obj).setRotationY(f5);
                return;
        }
    }
}
