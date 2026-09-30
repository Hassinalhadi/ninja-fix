package s6;

/* loaded from: classes2.dex */
public enum K5 implements O {
    TYPE_UNKNOWN(0),
    TYPE_CONTACT_INFO(1),
    TYPE_EMAIL(2),
    TYPE_ISBN(3),
    TYPE_PHONE(4),
    TYPE_PRODUCT(5),
    TYPE_SMS(6),
    TYPE_TEXT(7),
    TYPE_URL(8),
    TYPE_WIFI(9),
    TYPE_GEO(10),
    TYPE_CALENDAR_EVENT(11),
    TYPE_DRIVER_LICENSE(12);

    public final int alpha;

    K5(int i4) {
        this.alpha = i4;
    }

    @Override // s6.O
    public final int zza() {
        return this.alpha;
    }
}
