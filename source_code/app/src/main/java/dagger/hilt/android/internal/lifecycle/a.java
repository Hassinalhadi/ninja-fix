package dagger.hilt.android.internal.lifecycle;

import java.io.Closeable;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Closeable, AutoCloseable {
    public final /* synthetic */ RetainedLifecycleImpl alpha;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.alpha.dispatchOnCleared();
    }
}
