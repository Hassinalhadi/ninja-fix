package s1;

import android.os.Build;
import androidx.core.widget.NestedScrollView;
import com.google.android.gms.measurement.internal.C1467s;

/* renamed from: s1.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2592z {
    public final InterfaceC2591y alpha;

    public C2592z(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.alpha = new C2590x(nestedScrollView);
        } else {
            this.alpha = new C1467s(15);
        }
    }
}
