package s6;

/* renamed from: s6.j5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC2688j5 implements O {
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

    EnumC2688j5(int i4) {
        this.alpha = i4;
    }

    @Override // s6.O
    public final int zza() {
        return this.alpha;
    }
}
