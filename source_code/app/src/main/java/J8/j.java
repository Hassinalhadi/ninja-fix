package J8;

/* loaded from: classes2.dex */
public enum j implements d8.f {
    /* JADX INFO: Fake field, exist only in values array */
    COLLECTION_UNKNOWN(0),
    COLLECTION_SDK_NOT_INSTALLED(1),
    COLLECTION_ENABLED(2),
    COLLECTION_DISABLED(3),
    /* JADX INFO: Fake field, exist only in values array */
    COLLECTION_DISABLED_REMOTE(4),
    /* JADX INFO: Fake field, exist only in values array */
    COLLECTION_SAMPLED(5);

    public final int alpha;

    j(int i4) {
        this.alpha = i4;
    }

    @Override // d8.f
    public final int alpha() {
        return this.alpha;
    }
}
