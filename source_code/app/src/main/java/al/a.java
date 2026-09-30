package al;

import android.graphics.drawable.Animatable;
import t6.AbstractC3037o3;

/* loaded from: classes3.dex */
public final class a extends AbstractC3037o3 {
    public final /* synthetic */ int delta;
    public final Animatable echo;

    public /* synthetic */ a(Animatable animatable, int i4) {
        this.delta = i4;
        this.echo = animatable;
    }

    @Override // t6.AbstractC3037o3
    public final void charlie() {
        switch (this.delta) {
            case 0:
                this.echo.start();
                return;
            default:
                ((androidx.vectordrawable.graphics.drawable.e) this.echo).start();
                return;
        }
    }

    @Override // t6.AbstractC3037o3
    public final void delta() {
        switch (this.delta) {
            case 0:
                this.echo.stop();
                return;
            default:
                ((androidx.vectordrawable.graphics.drawable.e) this.echo).stop();
                return;
        }
    }
}
