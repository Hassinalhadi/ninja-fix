package ea;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ea.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC1644b {
    public static final /* synthetic */ EnumC1644b[] alpha;

    static {
        EnumC1644b[] enumC1644bArr = {new EnumC1644b("LOGIN_SUCCEEDED", 0, "login_succeeded"), new EnumC1644b("DUTY_ONLINE", 1, "duty_online"), new EnumC1644b("DUTY_OFFLINE", 2, "duty_offline"), new EnumC1644b("ORDER_OFFERED", 3, "order_offered"), new EnumC1644b("ORDER_ACCEPTED", 4, "order_accepted"), new EnumC1644b("ORDER_REJECTED", 5, "order_rejected"), new EnumC1644b("ARRIVED_AT_PICKUP", 6, "arrived_at_pickup"), new EnumC1644b("ORDER_PICKED_UP", 7, "order_picked_up"), new EnumC1644b("ARRIVED_AT_DROPOFF", 8, "arrived_at_dropoff"), new EnumC1644b("ORDER_DELIVERED", 9, "order_delivered"), new EnumC1644b("ORDER_CANCELLED", 10, "order_cancelled")};
        alpha = enumC1644bArr;
        AbstractC2708l7.bravo(enumC1644bArr);
    }

    public EnumC1644b(String str, int i4, String str2) {
    }

    public static EnumC1644b valueOf(String str) {
        return (EnumC1644b) Enum.valueOf(EnumC1644b.class, str);
    }

    public static EnumC1644b[] values() {
        return (EnumC1644b[]) alpha.clone();
    }
}
