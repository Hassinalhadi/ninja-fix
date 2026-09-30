package kotlin;

import com.google.maps.android.BuildConfig;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class f implements Lazy, Serializable {
    @Override // kotlin.Lazy
    public final boolean alpha() {
        return true;
    }

    @Override // kotlin.Lazy
    public final Object getValue() {
        return null;
    }

    public final String toString() {
        return BuildConfig.TRAVIS;
    }
}
