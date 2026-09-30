package com.airbnb.lottie.model.content;

import j1.EnumC1927a;

/* loaded from: classes3.dex */
public enum LBlendMode {
    NORMAL,
    MULTIPLY,
    SCREEN,
    OVERLAY,
    DARKEN,
    LIGHTEN,
    COLOR_DODGE,
    COLOR_BURN,
    HARD_LIGHT,
    SOFT_LIGHT,
    DIFFERENCE,
    EXCLUSION,
    HUE,
    SATURATION,
    COLOR,
    LUMINOSITY,
    ADD,
    HARD_MIX;

    public EnumC1927a toNativeBlendMode() {
        int ordinal = ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal != 5) {
                            if (ordinal != 16) {
                                return null;
                            }
                            return EnumC1927a.red;
                        }
                        return EnumC1927a.f12874a;
                    }
                    return EnumC1927a.yellow;
                }
                return EnumC1927a.white;
            }
            return EnumC1927a.teal;
        }
        return EnumC1927a.silver;
    }
}
