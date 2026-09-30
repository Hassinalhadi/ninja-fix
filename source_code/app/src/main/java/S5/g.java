package S5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.measurement.internal.G;
import com.google.android.gms.measurement.internal.H0;
import com.google.android.gms.measurement.internal.ae;
import com.google.android.gms.measurement.internal.ar;
import com.google.android.gms.measurement.internal.zzai;
import com.google.android.gms.measurement.internal.zzbh;
import com.google.android.gms.measurement.internal.zzqb;
import com.google.android.gms.measurement.internal.zzr;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import com.zendesk.service.HttpConstants;
import f6.ThreadFactoryC1693a;
import java.lang.ref.SoftReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import s6.V4;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ boolean purple;
    public final /* synthetic */ Parcelable red;
    public final /* synthetic */ Object silver;
    public final /* synthetic */ Object teal;

    public /* synthetic */ g(H0 h02, zzr zzrVar, boolean z2, AbstractSafeParcelable abstractSafeParcelable, int i4) {
        this.alpha = i4;
        this.red = zzrVar;
        this.purple = z2;
        this.silver = abstractSafeParcelable;
        this.teal = h02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Intent intent;
        int i4;
        zzqb zzqbVar;
        zzbh zzbhVar;
        zzai zzaiVar;
        switch (this.alpha) {
            case 0:
                Intent intent2 = (Intent) this.red;
                Context context = (Context) this.silver;
                boolean z2 = this.purple;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.teal;
                try {
                    Parcelable parcelableExtra = intent2.getParcelableExtra("wrapped_intent");
                    Executor executor = null;
                    if (parcelableExtra instanceof Intent) {
                        intent = (Intent) parcelableExtra;
                    } else {
                        intent = null;
                    }
                    if (intent != null) {
                        i4 = FirebaseInstanceIdReceiver.alpha(intent);
                    } else {
                        Bundle extras = intent2.getExtras();
                        int i5 = HttpConstants.HTTP_INTERNAL_ERROR;
                        if (extras != null) {
                            CloudMessage cloudMessage = new CloudMessage(intent2);
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            synchronized (FirebaseInstanceIdReceiver.class) {
                                try {
                                    SoftReference softReference = FirebaseInstanceIdReceiver.bravo;
                                    if (softReference != null) {
                                        executor = (Executor) softReference.get();
                                    }
                                    if (executor == null) {
                                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC1693a("pscm-ack-executor"));
                                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                                        executor = Executors.unconfigurableExecutorService(threadPoolExecutor);
                                        FirebaseInstanceIdReceiver.bravo = new SoftReference(executor);
                                    }
                                } finally {
                                }
                            }
                            executor.execute(new D2.d(context, cloudMessage, countDownLatch));
                            try {
                                i5 = ((Integer) V4.bravo(new com.google.firebase.messaging.i(context).bravo(intent2))).intValue();
                            } catch (InterruptedException | ExecutionException e) {
                                Log.e("FirebaseMessaging", "Failed to send message to service.", e);
                            }
                            try {
                                if (!countDownLatch.await(TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS)) {
                                    Log.w("CloudMessagingReceiver", "Message ack timed out");
                                }
                            } catch (InterruptedException e4) {
                                Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e4.toString()));
                            }
                        }
                        i4 = i5;
                    }
                    if (z2 && pendingResult != null) {
                        pendingResult.setResultCode(i4);
                    }
                    if (pendingResult != null) {
                        pendingResult.finish();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    throw th;
                }
            case 1:
                H0 h02 = (H0) this.teal;
                ae aeVar = h02.silver;
                if (aeVar == null) {
                    ar arVar = ((G) h02.alpha).f7507b;
                    G.foxtrot(arVar);
                    arVar.white.alpha("Discarding data. Failed to set user property");
                    return;
                } else {
                    zzr zzrVar = (zzr) this.red;
                    if (this.purple) {
                        zzqbVar = null;
                    } else {
                        zzqbVar = (zzqb) this.silver;
                    }
                    h02.d0(aeVar, zzqbVar, zzrVar);
                    h02.m0();
                    return;
                }
            case 2:
                H0 h03 = (H0) this.teal;
                ae aeVar2 = h03.silver;
                if (aeVar2 == null) {
                    ar arVar2 = ((G) h03.alpha).f7507b;
                    G.foxtrot(arVar2);
                    arVar2.white.alpha("Discarding data. Failed to send event to service");
                    return;
                } else {
                    zzr zzrVar2 = (zzr) this.red;
                    if (this.purple) {
                        zzbhVar = null;
                    } else {
                        zzbhVar = (zzbh) this.silver;
                    }
                    h03.d0(aeVar2, zzbhVar, zzrVar2);
                    h03.m0();
                    return;
                }
            default:
                H0 h04 = (H0) this.teal;
                ae aeVar3 = h04.silver;
                if (aeVar3 == null) {
                    ar arVar3 = ((G) h04.alpha).f7507b;
                    G.foxtrot(arVar3);
                    arVar3.white.alpha("Discarding data. Failed to send conditional user property to service");
                    return;
                } else {
                    zzr zzrVar3 = (zzr) this.red;
                    if (this.purple) {
                        zzaiVar = null;
                    } else {
                        zzaiVar = (zzai) this.silver;
                    }
                    h04.d0(aeVar3, zzaiVar, zzrVar3);
                    h04.m0();
                    return;
                }
        }
    }

    public /* synthetic */ g(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z2, BroadcastReceiver.PendingResult pendingResult) {
        this.alpha = 0;
        this.red = intent;
        this.silver = context;
        this.purple = z2;
        this.teal = pendingResult;
    }
}
