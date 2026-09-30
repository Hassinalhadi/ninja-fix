package J8;

/* loaded from: classes2.dex */
public enum ac implements d8.f {
    /* JADX INFO: Fake field, exist only in values array */
    LOG_ENVIRONMENT_UNKNOWN(0),
    /* JADX INFO: Fake field, exist only in values array */
    LOG_ENVIRONMENT_AUTOPUSH(1),
    /* JADX INFO: Fake field, exist only in values array */
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);

    public final int alpha;

    ac(int i4) {
        this.alpha = i4;
    }

    @Override // d8.f
    public final int alpha() {
        return this.alpha;
    }
}
