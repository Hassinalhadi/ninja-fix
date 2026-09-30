package com.checkout.components.kmp.rememberme.shared.model;

import Qd.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/checkout/components/kmp/rememberme/shared/model/ClickTarget;", "", "<init>", "(Ljava/lang/String;I)V", "INFO_TEXT", "CHANGE_TEXT", "CONTINUE_WITHOUT_SAVED_DETAILS_TEXT", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ClickTarget {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ClickTarget[] $VALUES;
    public static final ClickTarget INFO_TEXT = new ClickTarget("INFO_TEXT", 0);
    public static final ClickTarget CHANGE_TEXT = new ClickTarget("CHANGE_TEXT", 1);
    public static final ClickTarget CONTINUE_WITHOUT_SAVED_DETAILS_TEXT = new ClickTarget("CONTINUE_WITHOUT_SAVED_DETAILS_TEXT", 2);

    private static final /* synthetic */ ClickTarget[] $values() {
        return new ClickTarget[]{INFO_TEXT, CHANGE_TEXT, CONTINUE_WITHOUT_SAVED_DETAILS_TEXT};
    }

    static {
        ClickTarget[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC2708l7.bravo($values);
    }

    private ClickTarget(String str, int i4) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static ClickTarget valueOf(String str) {
        return (ClickTarget) Enum.valueOf(ClickTarget.class, str);
    }

    public static ClickTarget[] values() {
        return (ClickTarget[]) $VALUES.clone();
    }
}
