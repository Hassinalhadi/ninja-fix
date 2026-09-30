package s1;

import android.view.WindowInsets;

/* loaded from: classes3.dex */
public abstract class Z {
    public static int alpha(int i4) {
        int statusBars;
        int i5 = 0;
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i4 & i10) != 0) {
                if (i10 == 1) {
                    statusBars = WindowInsets.Type.statusBars();
                } else if (i10 == 2) {
                    statusBars = WindowInsets.Type.navigationBars();
                } else if (i10 == 4) {
                    statusBars = WindowInsets.Type.captionBar();
                } else if (i10 == 8) {
                    statusBars = WindowInsets.Type.ime();
                } else if (i10 == 16) {
                    statusBars = WindowInsets.Type.systemGestures();
                } else if (i10 == 32) {
                    statusBars = WindowInsets.Type.mandatorySystemGestures();
                } else if (i10 == 64) {
                    statusBars = WindowInsets.Type.tappableElement();
                } else if (i10 == 128) {
                    statusBars = WindowInsets.Type.displayCutout();
                } else if (i10 == 512) {
                    statusBars = WindowInsets.Type.systemOverlays();
                }
                i5 |= statusBars;
            }
        }
        return i5;
    }
}
