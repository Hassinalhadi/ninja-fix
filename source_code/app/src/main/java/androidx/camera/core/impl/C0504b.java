package androidx.camera.core.impl;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.impl.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0504b {
    public final Executor alpha;
    public final Handler bravo;

    public C0504b(Executor executor, Handler handler) {
        if (executor != null) {
            this.alpha = executor;
            if (handler != null) {
                this.bravo = handler;
                return;
            }
            throw new NullPointerException("Null schedulerHandler");
        }
        throw new NullPointerException("Null cameraExecutor");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0504b) {
            C0504b c0504b = (C0504b) obj;
            if (this.alpha.equals(c0504b.alpha) && this.bravo.equals(c0504b.bravo)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.alpha.hashCode() ^ 1000003) * 1000003) ^ this.bravo.hashCode();
    }

    public final String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.alpha + ", schedulerHandler=" + this.bravo + "}";
    }
}
