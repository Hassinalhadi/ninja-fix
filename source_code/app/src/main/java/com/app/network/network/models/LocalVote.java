package com.app.network.network.models;

import Qd.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/app/network/network/models/LocalVote;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "UP", "DOWN", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LocalVote {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ LocalVote[] $VALUES;
    public static final LocalVote NONE = new LocalVote("NONE", 0);
    public static final LocalVote UP = new LocalVote("UP", 1);
    public static final LocalVote DOWN = new LocalVote("DOWN", 2);

    private static final /* synthetic */ LocalVote[] $values() {
        return new LocalVote[]{NONE, UP, DOWN};
    }

    static {
        LocalVote[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC2708l7.bravo($values);
    }

    private LocalVote(String str, int i4) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static LocalVote valueOf(String str) {
        return (LocalVote) Enum.valueOf(LocalVote.class, str);
    }

    public static LocalVote[] values() {
        return (LocalVote[]) $VALUES.clone();
    }
}
