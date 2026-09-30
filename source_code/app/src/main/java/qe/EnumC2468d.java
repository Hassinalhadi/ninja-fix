package qe;

import s6.E6;

/* renamed from: qe.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC2468d {
    FIELD(null),
    FILE(null),
    PROPERTY(null),
    PROPERTY_GETTER("get"),
    PROPERTY_SETTER("set"),
    RECEIVER(null),
    CONSTRUCTOR_PARAMETER("param"),
    SETTER_PARAMETER("setparam"),
    PROPERTY_DELEGATE_FIELD("delegate");

    public final String alpha;

    EnumC2468d(String str) {
        this.alpha = str == null ? E6.delta(name()) : str;
    }
}
