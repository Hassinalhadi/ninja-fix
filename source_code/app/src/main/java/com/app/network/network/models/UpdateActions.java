package com.app.network.network.models;

import Qd.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/app/network/network/models/UpdateActions;", "", "<init>", "(Ljava/lang/String;I)V", "NO_UPDATE", AttributeActionType.RECOMMENDED, AttributeActionType.FORCE, "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UpdateActions {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ UpdateActions[] $VALUES;
    public static final UpdateActions NO_UPDATE = new UpdateActions("NO_UPDATE", 0);
    public static final UpdateActions RECOMMENDED = new UpdateActions(AttributeActionType.RECOMMENDED, 1);
    public static final UpdateActions FORCE = new UpdateActions(AttributeActionType.FORCE, 2);

    private static final /* synthetic */ UpdateActions[] $values() {
        return new UpdateActions[]{NO_UPDATE, RECOMMENDED, FORCE};
    }

    static {
        UpdateActions[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC2708l7.bravo($values);
    }

    private UpdateActions(String str, int i4) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static UpdateActions valueOf(String str) {
        return (UpdateActions) Enum.valueOf(UpdateActions.class, str);
    }

    public static UpdateActions[] values() {
        return (UpdateActions[]) $VALUES.clone();
    }
}
