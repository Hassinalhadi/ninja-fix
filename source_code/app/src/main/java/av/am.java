package av;

import android.hardware.camera2.CaptureRequest;
import androidx.appcompat.widget.P0;
import androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk;
import androidx.camera.core.impl.C0505c;

/* loaded from: classes3.dex */
public final class am extends x {
    public static final am bravo;

    /* JADX WARN: Type inference failed for: r0v0, types: [av.am, java.lang.Object] */
    static {
        new U8.a(16);
        bravo = new Object();
    }

    @Override // av.x
    public final void alpha(androidx.camera.core.impl.am amVar, S2.l lVar) {
        CaptureRequest.Key key;
        CaptureRequest.Key key2;
        super.alpha(amVar, lVar);
        if (q.kilo(amVar)) {
            androidx.camera.core.impl.aw bravo2 = androidx.camera.core.impl.aw.bravo();
            C0505c c0505c = androidx.camera.core.impl.am.purple;
            if (amVar.echo(c0505c)) {
                int intValue = ((Integer) P0.victor(amVar, c0505c)).intValue();
                if (((ImageCapturePixelHDRPlusQuirk) ax.b.alpha.delta(ImageCapturePixelHDRPlusQuirk.class)) != null) {
                    if (intValue == 0) {
                        key = CaptureRequest.CONTROL_ENABLE_ZSL;
                        bravo2.hotel(au.a.yellow(key), Boolean.TRUE);
                    } else if (intValue == 1) {
                        key2 = CaptureRequest.CONTROL_ENABLE_ZSL;
                        bravo2.hotel(au.a.yellow(key2), Boolean.FALSE);
                    }
                }
            }
            lVar.echo(new ah(6, androidx.camera.core.impl.B.alpha(bravo2)));
            return;
        }
        throw new IllegalArgumentException("config is not ImageCaptureConfig");
    }
}
