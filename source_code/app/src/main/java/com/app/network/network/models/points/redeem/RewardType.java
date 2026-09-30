package com.app.network.network.models.points.redeem;

import Qd.a;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/app/network/network/models/points/redeem/RewardType;", "", "<init>", "(Ljava/lang/String;I)V", "WALLET", "MOBILE", "TSHIRT", "Companion", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RewardType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ RewardType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final RewardType WALLET = new RewardType("WALLET", 0);
    public static final RewardType MOBILE = new RewardType("MOBILE", 1);
    public static final RewardType TSHIRT = new RewardType("TSHIRT", 2);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/app/network/network/models/points/redeem/RewardType$Companion;", "", "<init>", "()V", "from", "Lcom/app/network/network/models/points/redeem/RewardType;", "value", "", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final RewardType from(@NotNull String value) {
            Intrinsics.echo(value, "value");
            try {
                String upperCase = value.toUpperCase(Locale.ROOT);
                Intrinsics.delta(upperCase, "toUpperCase(...)");
                return RewardType.valueOf(upperCase);
            } catch (Exception unused) {
                return RewardType.WALLET;
            }
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ RewardType[] $values() {
        return new RewardType[]{WALLET, MOBILE, TSHIRT};
    }

    static {
        RewardType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC2708l7.bravo($values);
        INSTANCE = new Companion(null);
    }

    private RewardType(String str, int i4) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static RewardType valueOf(String str) {
        return (RewardType) Enum.valueOf(RewardType.class, str);
    }

    public static RewardType[] values() {
        return (RewardType[]) $VALUES.clone();
    }
}
