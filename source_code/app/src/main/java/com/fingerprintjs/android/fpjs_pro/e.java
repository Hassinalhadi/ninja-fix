package com.fingerprintjs.android.fpjs_pro;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class e {
    public static final /* synthetic */ e[] alpha;

    static {
        e[] eVarArr = {new e("US", 0, "https://api.fpjs.io"), new e("EU", 1, "https://eu.api.fpjs.io"), new e("AP", 2, "https://ap.api.fpjs.io")};
        alpha = eVarArr;
        AbstractC2708l7.bravo(eVarArr);
    }

    public e(String str, int i4, String str2) {
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) alpha.clone();
    }
}
