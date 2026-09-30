package com.app.network.network.models;

import Qd.a;
import delivery.samurai.android.R;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/app/network/network/models/OrderStatus;", "", "toString", "", "<init>", "(Ljava/lang/String;II)V", "getToString", "()I", "ASSIGNED", "COLLECTING_ORDER", "ON_THE_WAY", "DELIVERED", "CANCELED", "RE_ASSIGNING", "RETURNING", "RETURNED", "NEAR_PICK_UP", "AT_PICKUP", "NEAR_DELIVERY", "AT_DELIVERY", "RETURNING_TO_BRANCH", "RETURNING_TO_AREA", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OrderStatus {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ OrderStatus[] $VALUES;
    private final int toString;
    public static final OrderStatus ASSIGNED = new OrderStatus("ASSIGNED", 0, R.string.order_assigned);
    public static final OrderStatus COLLECTING_ORDER = new OrderStatus("COLLECTING_ORDER", 1, R.string.collecting_order);
    public static final OrderStatus ON_THE_WAY = new OrderStatus("ON_THE_WAY", 2, R.string.order_on_the_way);
    public static final OrderStatus DELIVERED = new OrderStatus("DELIVERED", 3, R.string.order_delivered);
    public static final OrderStatus CANCELED = new OrderStatus("CANCELED", 4, R.string.order_is_cancelled);
    public static final OrderStatus RE_ASSIGNING = new OrderStatus("RE_ASSIGNING", 5, R.string.order_removed_from_captain);
    public static final OrderStatus RETURNING = new OrderStatus("RETURNING", 6, R.string.order_is_returning);
    public static final OrderStatus RETURNED = new OrderStatus("RETURNED", 7, R.string.order_is_returned);
    public static final OrderStatus NEAR_PICK_UP = new OrderStatus("NEAR_PICK_UP", 8, R.string.lable_near_pickup);
    public static final OrderStatus AT_PICKUP = new OrderStatus("AT_PICKUP", 9, R.string.lable_at_pickup);
    public static final OrderStatus NEAR_DELIVERY = new OrderStatus("NEAR_DELIVERY", 10, R.string.newar_delivery);
    public static final OrderStatus AT_DELIVERY = new OrderStatus("AT_DELIVERY", 11, R.string.label_at_deleivery);
    public static final OrderStatus RETURNING_TO_BRANCH = new OrderStatus("RETURNING_TO_BRANCH", 12, R.string.order_is_returning);
    public static final OrderStatus RETURNING_TO_AREA = new OrderStatus("RETURNING_TO_AREA", 13, R.string.order_is_return_to_area);

    private static final /* synthetic */ OrderStatus[] $values() {
        return new OrderStatus[]{ASSIGNED, COLLECTING_ORDER, ON_THE_WAY, DELIVERED, CANCELED, RE_ASSIGNING, RETURNING, RETURNED, NEAR_PICK_UP, AT_PICKUP, NEAR_DELIVERY, AT_DELIVERY, RETURNING_TO_BRANCH, RETURNING_TO_AREA};
    }

    static {
        OrderStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC2708l7.bravo($values);
    }

    private OrderStatus(String str, int i4, int i5) {
        this.toString = i5;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static OrderStatus valueOf(String str) {
        return (OrderStatus) Enum.valueOf(OrderStatus.class, str);
    }

    public static OrderStatus[] values() {
        return (OrderStatus[]) $VALUES.clone();
    }

    public final int getToString() {
        return this.toString;
    }
}
