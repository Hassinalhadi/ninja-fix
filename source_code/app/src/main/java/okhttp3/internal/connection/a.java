package okhttp3.internal.connection;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ boolean alpha(RoutePlanner routePlanner, RealConnection realConnection, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 1) != 0) {
                realConnection = null;
            }
            return routePlanner.hasNext(realConnection);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hasNext");
    }
}
