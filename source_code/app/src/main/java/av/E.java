package av;

import android.hardware.camera2.CameraCharacteristics;
import android.media.ImageWriter;
import androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk;
import androidx.camera.core.J;
import id.C1915c;

/* loaded from: classes3.dex */
public final class E {
    public final androidx.camera.camera2.internal.compat.j alpha;
    public final C1915c bravo;
    public boolean charlie = false;
    public final boolean delta;
    public final boolean echo;
    public S2.l foxtrot;
    public androidx.camera.core.au golf;
    public J hotel;
    public ImageWriter india;

    public E(androidx.camera.camera2.internal.compat.j jVar) {
        boolean z2;
        this.delta = false;
        this.echo = false;
        this.alpha = jVar;
        int[] iArr = (int[]) jVar.alpha(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i4 : iArr) {
                if (i4 == 4) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        this.delta = z2;
        this.echo = ax.b.alpha.delta(ZslDisablerQuirk.class) != null;
        this.bravo = new C1915c(new S7.a(12));
    }
}
