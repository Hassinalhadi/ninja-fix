package com.clevertap.android.sdk.inapp.data;

import Qd.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/clevertap/android/sdk/inapp/data/CtCacheType;", "", "<init>", "(Ljava/lang/String;I)V", "IMAGE", "GIF", "FILES", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CtCacheType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CtCacheType[] $VALUES;
    public static final CtCacheType IMAGE = new CtCacheType("IMAGE", 0);
    public static final CtCacheType GIF = new CtCacheType("GIF", 1);
    public static final CtCacheType FILES = new CtCacheType("FILES", 2);

    private static final /* synthetic */ CtCacheType[] $values() {
        return new CtCacheType[]{IMAGE, GIF, FILES};
    }

    static {
        CtCacheType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC2708l7.bravo($values);
    }

    private CtCacheType(String str, int i4) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static CtCacheType valueOf(String str) {
        return (CtCacheType) Enum.valueOf(CtCacheType.class, str);
    }

    public static CtCacheType[] values() {
        return (CtCacheType[]) $VALUES.clone();
    }
}
