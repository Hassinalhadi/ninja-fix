package com.checkout.components.kmp.rememberme.shared.model.customization;

import Qd.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/checkout/components/kmp/rememberme/shared/model/customization/FontStyle;", "", "<init>", "(Ljava/lang/String;I)V", "Normal", "Italic", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FontStyle {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ FontStyle[] $VALUES;
    public static final FontStyle Normal = new FontStyle("Normal", 0);
    public static final FontStyle Italic = new FontStyle("Italic", 1);

    private static final /* synthetic */ FontStyle[] $values() {
        return new FontStyle[]{Normal, Italic};
    }

    static {
        FontStyle[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC2708l7.bravo($values);
    }

    private FontStyle(String str, int i4) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static FontStyle valueOf(String str) {
        return (FontStyle) Enum.valueOf(FontStyle.class, str);
    }

    public static FontStyle[] values() {
        return (FontStyle[]) $VALUES.clone();
    }
}
