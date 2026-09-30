package com.checkout.components.kmp.rememberme.shared.model.customization;

import Qd.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/checkout/components/kmp/rememberme/shared/model/customization/FontWeight;", "", "<init>", "(Ljava/lang/String;I)V", "Light", "Normal", "Medium", "SemiBold", "Bold", "ExtraBold", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FontWeight {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ FontWeight[] $VALUES;
    public static final FontWeight Light = new FontWeight("Light", 0);
    public static final FontWeight Normal = new FontWeight("Normal", 1);
    public static final FontWeight Medium = new FontWeight("Medium", 2);
    public static final FontWeight SemiBold = new FontWeight("SemiBold", 3);
    public static final FontWeight Bold = new FontWeight("Bold", 4);
    public static final FontWeight ExtraBold = new FontWeight("ExtraBold", 5);

    private static final /* synthetic */ FontWeight[] $values() {
        return new FontWeight[]{Light, Normal, Medium, SemiBold, Bold, ExtraBold};
    }

    static {
        FontWeight[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC2708l7.bravo($values);
    }

    private FontWeight(String str, int i4) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static FontWeight valueOf(String str) {
        return (FontWeight) Enum.valueOf(FontWeight.class, str);
    }

    public static FontWeight[] values() {
        return (FontWeight[]) $VALUES.clone();
    }
}
