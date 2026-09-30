package H5;

import e8.InterfaceC1635c;

/* loaded from: classes3.dex */
public enum c implements InterfaceC1635c {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);

    public final int alpha;

    c(int i4) {
        this.alpha = i4;
    }

    @Override // e8.InterfaceC1635c
    public final int alpha() {
        return this.alpha;
    }
}
