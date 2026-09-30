package com.airbnb.lottie;

/* loaded from: classes3.dex */
public enum RenderMode {
    AUTOMATIC,
    HARDWARE,
    SOFTWARE;

    public boolean useSoftwareRendering(int i4, boolean z2, int i5) {
        int ordinal = ordinal();
        if (ordinal == 1) {
            return false;
        }
        if (ordinal == 2) {
            return true;
        }
        if ((!z2 || i4 >= 28) && i5 <= 4 && i4 > 25) {
            return false;
        }
        return true;
    }
}
