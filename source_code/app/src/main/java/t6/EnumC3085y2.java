package t6;

/* renamed from: t6.y2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC3085y2 implements InterfaceC2968b {
    UNKNOWN_FORMAT(0),
    NV16(1),
    NV21(2),
    YV12(3),
    YUV_420_888(7),
    /* JADX INFO: Fake field, exist only in values array */
    JPEG(8),
    BITMAP(4),
    /* JADX INFO: Fake field, exist only in values array */
    CM_SAMPLE_BUFFER_REF(5),
    /* JADX INFO: Fake field, exist only in values array */
    UI_IMAGE(6),
    /* JADX INFO: Fake field, exist only in values array */
    CV_PIXEL_BUFFER_REF(9);

    public final int alpha;

    EnumC3085y2(int i4) {
        this.alpha = i4;
    }

    @Override // t6.InterfaceC2968b
    public final int zza() {
        return this.alpha;
    }
}
