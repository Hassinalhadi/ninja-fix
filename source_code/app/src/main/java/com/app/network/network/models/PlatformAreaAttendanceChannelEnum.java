package com.app.network.network.models;

import Qd.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/app/network/network/models/PlatformAreaAttendanceChannelEnum;", "", "<init>", "(Ljava/lang/String;I)V", "QR_CODE", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PlatformAreaAttendanceChannelEnum {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ PlatformAreaAttendanceChannelEnum[] $VALUES;
    public static final PlatformAreaAttendanceChannelEnum QR_CODE = new PlatformAreaAttendanceChannelEnum("QR_CODE", 0);

    private static final /* synthetic */ PlatformAreaAttendanceChannelEnum[] $values() {
        return new PlatformAreaAttendanceChannelEnum[]{QR_CODE};
    }

    static {
        PlatformAreaAttendanceChannelEnum[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC2708l7.bravo($values);
    }

    private PlatformAreaAttendanceChannelEnum(String str, int i4) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static PlatformAreaAttendanceChannelEnum valueOf(String str) {
        return (PlatformAreaAttendanceChannelEnum) Enum.valueOf(PlatformAreaAttendanceChannelEnum.class, str);
    }

    public static PlatformAreaAttendanceChannelEnum[] values() {
        return (PlatformAreaAttendanceChannelEnum[]) $VALUES.clone();
    }
}
