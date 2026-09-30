package com.app.network.network.models.points;

import P8.c;
import Qd.a;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/app/network/network/models/points/PointsTransactionType;", "", Constants.KEY_TYPE, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "INITIAL", "REWARD", "PENALTY", "EXPIRY", "REDEEM", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PointsTransactionType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ PointsTransactionType[] $VALUES;

    @NotNull
    private final String type;

    @c("initial")
    public static final PointsTransactionType INITIAL = new PointsTransactionType("INITIAL", 0, "initial");

    @c("reward")
    public static final PointsTransactionType REWARD = new PointsTransactionType("REWARD", 1, "reward");

    @c("penalty")
    public static final PointsTransactionType PENALTY = new PointsTransactionType("PENALTY", 2, "penalty");

    @c("expiry")
    public static final PointsTransactionType EXPIRY = new PointsTransactionType("EXPIRY", 3, "expiry");

    @c("redeem")
    public static final PointsTransactionType REDEEM = new PointsTransactionType("REDEEM", 4, "redeem");

    private static final /* synthetic */ PointsTransactionType[] $values() {
        return new PointsTransactionType[]{INITIAL, REWARD, PENALTY, EXPIRY, REDEEM};
    }

    static {
        PointsTransactionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC2708l7.bravo($values);
    }

    private PointsTransactionType(String str, int i4, String str2) {
        this.type = str2;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static PointsTransactionType valueOf(String str) {
        return (PointsTransactionType) Enum.valueOf(PointsTransactionType.class, str);
    }

    public static PointsTransactionType[] values() {
        return (PointsTransactionType[]) $VALUES.clone();
    }

    @NotNull
    public final String getType() {
        return this.type;
    }
}
