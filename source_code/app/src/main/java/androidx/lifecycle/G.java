package androidx.lifecycle;

import android.os.Handler;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class G implements al {

    /* renamed from: b, reason: collision with root package name */
    public static final G f3128b = new G();
    public int alpha;
    public int purple;
    public Handler teal;
    public boolean red = true;
    public boolean silver = true;
    public final an white = new an(this);
    public final androidx.camera.core.impl.ai yellow = new androidx.camera.core.impl.ai(1, this);

    /* renamed from: a, reason: collision with root package name */
    public final C0631a f3129a = new C0631a(this);

    public final void alpha() {
        int i4 = this.purple + 1;
        this.purple = i4;
        if (i4 == 1) {
            if (this.red) {
                this.white.foxtrot(aa.ON_RESUME);
                this.red = false;
            } else {
                Handler handler = this.teal;
                Intrinsics.checkNotNull(handler);
                handler.removeCallbacks(this.yellow);
            }
        }
    }

    @Override // androidx.lifecycle.al
    public final ac getLifecycle() {
        return this.white;
    }
}
