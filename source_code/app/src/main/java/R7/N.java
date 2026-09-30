package R7;

import KingArchersMougraphAlsopromas0.AlwaysMougraohSmootihbngmode;
import KingArchersMougraphAlsopromas0.hidden.Hidden0;
import android.os.Build;

/* compiled from: Dex2C */
/* loaded from: classes.dex */
public final class N {
    public final boolean alpha;

    static {
        AlwaysMougraohSmootihbngmode.registerNativesForClass(14, N.class);
        Hidden0.special_clinit_14_00(N.class);
    }

    public N(boolean z2) {
        String str = Build.VERSION.RELEASE;
        String str2 = Build.VERSION.CODENAME;
        if (str == null) {
            throw new NullPointerException("Null osRelease");
        }
        if (str2 == null) {
            throw new NullPointerException("Null osCodeName");
        }
        this.alpha = false;
    }

    public final native boolean equals(Object obj);

    public final native int hashCode();

    public final native String toString();
}
