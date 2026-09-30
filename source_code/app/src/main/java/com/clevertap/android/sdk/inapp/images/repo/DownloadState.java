package com.clevertap.android.sdk.inapp.images.repo;

import Qd.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/clevertap/android/sdk/inapp/images/repo/DownloadState;", "", "<init>", "(Ljava/lang/String;I)V", "QUEUED", "IN_PROGRESS", "SUCCESSFUL", "FAILED", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DownloadState {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ DownloadState[] $VALUES;
    public static final DownloadState QUEUED = new DownloadState("QUEUED", 0);
    public static final DownloadState IN_PROGRESS = new DownloadState("IN_PROGRESS", 1);
    public static final DownloadState SUCCESSFUL = new DownloadState("SUCCESSFUL", 2);
    public static final DownloadState FAILED = new DownloadState("FAILED", 3);

    private static final /* synthetic */ DownloadState[] $values() {
        return new DownloadState[]{QUEUED, IN_PROGRESS, SUCCESSFUL, FAILED};
    }

    static {
        DownloadState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC2708l7.bravo($values);
    }

    private DownloadState(String str, int i4) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static DownloadState valueOf(String str) {
        return (DownloadState) Enum.valueOf(DownloadState.class, str);
    }

    public static DownloadState[] values() {
        return (DownloadState[]) $VALUES.clone();
    }
}
