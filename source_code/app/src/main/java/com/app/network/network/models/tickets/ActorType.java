package com.app.network.network.models.tickets;

import P8.c;
import Qd.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/app/network/network/models/tickets/ActorType;", "", "<init>", "(Ljava/lang/String;I)V", "CAPTAIN", "ADMIN", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ActorType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ActorType[] $VALUES;

    @c("CAPTAIN")
    public static final ActorType CAPTAIN = new ActorType("CAPTAIN", 0);

    @c("ADMIN")
    public static final ActorType ADMIN = new ActorType("ADMIN", 1);

    private static final /* synthetic */ ActorType[] $values() {
        return new ActorType[]{CAPTAIN, ADMIN};
    }

    static {
        ActorType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC2708l7.bravo($values);
    }

    private ActorType(String str, int i4) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static ActorType valueOf(String str) {
        return (ActorType) Enum.valueOf(ActorType.class, str);
    }

    public static ActorType[] values() {
        return (ActorType[]) $VALUES.clone();
    }
}
