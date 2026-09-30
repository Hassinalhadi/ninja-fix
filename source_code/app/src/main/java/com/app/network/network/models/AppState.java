package com.app.network.network.models;

import Qd.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/app/network/network/models/AppState;", "", "<init>", "(Ljava/lang/String;I)V", "REGISTERING_DEVICE", "DEVICE_REGISTERED", "CAPTAIN_LOGGED_IN", "CAPTAIN_LOGGED_OUT", "CAPTAIN_NOT_LOGGED_IN", "NO_LOCATION_PERMISSION", "DEVICE_INFO_UPDATED", "ERROR", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AppState {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AppState[] $VALUES;
    public static final AppState REGISTERING_DEVICE = new AppState("REGISTERING_DEVICE", 0);
    public static final AppState DEVICE_REGISTERED = new AppState("DEVICE_REGISTERED", 1);
    public static final AppState CAPTAIN_LOGGED_IN = new AppState("CAPTAIN_LOGGED_IN", 2);
    public static final AppState CAPTAIN_LOGGED_OUT = new AppState("CAPTAIN_LOGGED_OUT", 3);
    public static final AppState CAPTAIN_NOT_LOGGED_IN = new AppState("CAPTAIN_NOT_LOGGED_IN", 4);
    public static final AppState NO_LOCATION_PERMISSION = new AppState("NO_LOCATION_PERMISSION", 5);
    public static final AppState DEVICE_INFO_UPDATED = new AppState("DEVICE_INFO_UPDATED", 6);
    public static final AppState ERROR = new AppState("ERROR", 7);

    private static final /* synthetic */ AppState[] $values() {
        return new AppState[]{REGISTERING_DEVICE, DEVICE_REGISTERED, CAPTAIN_LOGGED_IN, CAPTAIN_LOGGED_OUT, CAPTAIN_NOT_LOGGED_IN, NO_LOCATION_PERMISSION, DEVICE_INFO_UPDATED, ERROR};
    }

    static {
        AppState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC2708l7.bravo($values);
    }

    private AppState(String str, int i4) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static AppState valueOf(String str) {
        return (AppState) Enum.valueOf(AppState.class, str);
    }

    public static AppState[] values() {
        return (AppState[]) $VALUES.clone();
    }
}
