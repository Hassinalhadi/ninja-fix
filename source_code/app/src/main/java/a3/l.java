package a3;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.Preview3AThreadCrashQuirk;
import androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk;
import androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;
import androidx.camera.core.impl.B;
import androidx.camera.core.impl.ad;
import androidx.camera.core.impl.ah;
import androidx.camera.core.impl.aw;
import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class l implements j {
    public final boolean alpha;

    public l(Q3.c cVar) {
        this.alpha = cVar.alpha(Preview3AThreadCrashQuirk.class);
    }

    public static ad charlie(ad adVar) {
        S2.l lVar = new S2.l();
        lVar.alpha = adVar.charlie;
        Iterator it = Collections.unmodifiableList(adVar.alpha).iterator();
        while (it.hasNext()) {
            ((HashSet) lVar.red).add((ah) it.next());
        }
        lVar.echo(adVar.bravo);
        aw bravo = aw.bravo();
        bravo.hotel(au.a.yellow(CaptureRequest.FLASH_MODE), 0);
        lVar.echo(new av.ah(6, B.alpha(bravo)));
        return lVar.hotel();
    }

    @Override // a3.j
    public boolean alpha() {
        return this.alpha;
    }

    @Override // a3.j
    public boolean bravo(Y2.h hVar) {
        return this.alpha;
    }

    public boolean delta(ArrayList arrayList, boolean z2) {
        if (this.alpha && z2) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) ((CaptureRequest) it.next()).get(CaptureRequest.FLASH_MODE);
                if (num != null && num.intValue() == 2) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public boolean echo(ArrayList arrayList, boolean z2) {
        if (this.alpha && z2) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) ((CaptureRequest) it.next()).get(CaptureRequest.CONTROL_AE_MODE)).intValue();
                if (intValue == 2 || intValue == 3) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public l(int i4) {
        switch (i4) {
            case 3:
                this.alpha = ax.b.alpha.delta(TorchIsClosedAfterImageCapturingQuirk.class) != null;
                return;
            case 4:
                this.alpha = bg.a.alpha.delta(SurfaceOrderQuirk.class) != null;
                return;
            default:
                this.alpha = ((StillCaptureFlashStopRepeatingQuirk) ax.b.alpha.delta(StillCaptureFlashStopRepeatingQuirk.class)) != null;
                return;
        }
    }

    public l(boolean z2) {
        this.alpha = z2;
    }
}
