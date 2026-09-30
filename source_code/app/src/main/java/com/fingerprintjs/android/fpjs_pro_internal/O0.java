package com.fingerprintjs.android.fpjs_pro_internal;

import android.hardware.input.InputManager;

/* loaded from: classes3.dex */
public final class O0 {
    public static int bravo = 0;
    public static int charlie = 1;
    public final InputManager alpha;

    public O0(InputManager inputManager) {
        this.alpha = inputManager;
    }

    public static final /* synthetic */ InputManager alpha(O0 o02) {
        int i4 = bravo;
        int i5 = ((i4 | 123) << 1) - (i4 ^ 123);
        charlie = i5 % 128;
        int i10 = i5 % 2;
        InputManager inputManager = o02.alpha;
        if (i10 != 0) {
            charlie = (i4 + 61) % 128;
            return inputManager;
        }
        throw null;
    }
}
