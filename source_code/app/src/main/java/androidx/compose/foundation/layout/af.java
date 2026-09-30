package androidx.compose.foundation.layout;

import androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class af {
    public final boolean alpha;
    public final boolean bravo;

    public af(boolean z2, boolean z10) {
        this.alpha = z2;
        this.bravo = z10;
    }

    public af(Q3.c cVar, int i4) {
        boolean z2;
        switch (i4) {
            case 2:
                cVar.getClass();
                ArrayList arrayList = new ArrayList();
                Iterator it = cVar.alpha.iterator();
                while (it.hasNext()) {
                    androidx.camera.core.impl.D d4 = (androidx.camera.core.impl.D) it.next();
                    if (CaptureIntentPreviewQuirk.class.isAssignableFrom(d4.getClass())) {
                        arrayList.add(d4);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z2 = false;
                    } else if (((CaptureIntentPreviewQuirk) it2.next()).alpha()) {
                        z2 = true;
                    }
                }
                this.alpha = z2;
                this.bravo = cVar.alpha(ImageCaptureFailedForVideoSnapshotQuirk.class);
                return;
            default:
                this.alpha = cVar.alpha(ImageCaptureFailWithAutoFlashQuirk.class);
                this.bravo = ax.b.alpha.delta(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class) != null;
                return;
        }
    }
}
