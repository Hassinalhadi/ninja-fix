package com.fingerprintjs.android.fpjs_pro_internal;

import android.location.Location;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes3.dex */
public final class G0 implements E0 {
    public final CountDownLatch alpha = new CountDownLatch(1);
    public volatile Location bravo;

    public final void alpha(Location location) {
        if (this.alpha.getCount() == 0) {
            return;
        }
        this.bravo = location;
        this.alpha.countDown();
    }

    public final Object bravo() {
        this.alpha.await();
        if (this.alpha.getCount() == 0) {
            return this.bravo;
        }
        throw new IllegalStateException("Check failed.");
    }
}
