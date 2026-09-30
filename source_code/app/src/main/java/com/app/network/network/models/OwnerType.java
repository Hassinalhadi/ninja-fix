package com.app.network.network.models;

import Qd.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/app/network/network/models/OwnerType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "CUSTOMER", "CAPTAIN", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OwnerType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ OwnerType[] $VALUES;

    @NotNull
    private final String value;
    public static final OwnerType CUSTOMER = new OwnerType("CUSTOMER", 0, "CUSTOMER");
    public static final OwnerType CAPTAIN = new OwnerType("CAPTAIN", 1, "CAPTAIN");

    private static final /* synthetic */ OwnerType[] $values() {
        return new OwnerType[]{CUSTOMER, CAPTAIN};
    }

    static {
        OwnerType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC2708l7.bravo($values);
    }

    private OwnerType(String str, int i4, String str2) {
        this.value = str2;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static OwnerType valueOf(String str) {
        return (OwnerType) Enum.valueOf(OwnerType.class, str);
    }

    public static OwnerType[] values() {
        return (OwnerType[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
