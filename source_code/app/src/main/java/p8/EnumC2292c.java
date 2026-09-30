package p8;

import e8.InterfaceC1635c;

/* renamed from: p8.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC2292c implements InterfaceC1635c {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_OS(0),
    ANDROID(1),
    /* JADX INFO: Fake field, exist only in values array */
    IOS(2),
    /* JADX INFO: Fake field, exist only in values array */
    WEB(3);

    public final int alpha;

    EnumC2292c(int i4) {
        this.alpha = i4;
    }

    @Override // e8.InterfaceC1635c
    public final int alpha() {
        return this.alpha;
    }
}
