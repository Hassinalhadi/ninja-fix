package p8;

import e8.InterfaceC1635c;

/* renamed from: p8.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC2291b implements InterfaceC1635c {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN(0),
    DATA_MESSAGE(1),
    /* JADX INFO: Fake field, exist only in values array */
    TOPIC(2),
    DISPLAY_NOTIFICATION(3);

    public final int alpha;

    EnumC2291b(int i4) {
        this.alpha = i4;
    }

    @Override // e8.InterfaceC1635c
    public final int alpha() {
        return this.alpha;
    }
}
