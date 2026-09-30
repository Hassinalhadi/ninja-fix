package t6;

import a0.AbstractC0343ac;
import androidx.compose.ui.draw.ShadowGraphicsLayerElement;

/* loaded from: classes2.dex */
public abstract class ac {
    public static T.s alpha(T.s sVar, float f5, a0.as asVar, long j5, long j6, int i4) {
        boolean z2;
        long j7;
        long j10;
        boolean z10;
        if ((i4 & 4) != 0) {
            if (Float.compare(f5, 0) > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            z2 = z10;
        } else {
            z2 = false;
        }
        if ((i4 & 8) != 0) {
            j7 = AbstractC0343ac.alpha;
        } else {
            j7 = j5;
        }
        if ((i4 & 16) != 0) {
            j10 = AbstractC0343ac.alpha;
        } else {
            j10 = j6;
        }
        if (Float.compare(f5, 0) <= 0 && !z2) {
            return sVar;
        }
        return sVar.then(new ShadowGraphicsLayerElement(f5, asVar, z2, j7, j10));
    }
}
