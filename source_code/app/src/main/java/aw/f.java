package aw;

import android.hardware.camera2.params.InputConfiguration;
import java.util.Objects;

/* loaded from: classes3.dex */
public class f {
    public final InputConfiguration alpha;

    public f(Object obj) {
        this.alpha = (InputConfiguration) obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        return Objects.equals(this.alpha, ((f) obj).alpha);
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public final String toString() {
        return this.alpha.toString();
    }
}
