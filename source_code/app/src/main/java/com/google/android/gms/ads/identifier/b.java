package com.google.android.gms.ads.identifier;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class b extends Thread {
    public final WeakReference alpha;
    public final long purple;
    public final CountDownLatch red = new CountDownLatch(1);
    public boolean silver = false;

    public b(AdvertisingIdClient advertisingIdClient, long j5) {
        this.alpha = new WeakReference(advertisingIdClient);
        this.purple = j5;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        AdvertisingIdClient advertisingIdClient;
        WeakReference weakReference = this.alpha;
        try {
            if (!this.red.await(this.purple, TimeUnit.MILLISECONDS) && (advertisingIdClient = (AdvertisingIdClient) weakReference.get()) != null) {
                advertisingIdClient.zza();
                this.silver = true;
            }
        } catch (InterruptedException unused) {
            AdvertisingIdClient advertisingIdClient2 = (AdvertisingIdClient) weakReference.get();
            if (advertisingIdClient2 != null) {
                advertisingIdClient2.zza();
                this.silver = true;
            }
        }
    }
}
