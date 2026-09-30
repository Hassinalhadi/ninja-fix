package com.google.firebase.analytics;

import B7.g;
import E7.a;
import V5.x;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.checkout.components.card.operations.network.utils.OkHttpConstants;
import com.google.android.gms.internal.measurement.J;
import com.google.android.gms.internal.measurement.ay;
import com.google.android.gms.internal.measurement.zzdj;
import com.google.android.gms.measurement.internal.InterfaceC1461o0;
import j8.C1946c;
import j8.InterfaceC1947d;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import s6.V4;

/* loaded from: classes2.dex */
public final class FirebaseAnalytics {
    public static volatile FirebaseAnalytics bravo;
    public final J alpha;

    public FirebaseAnalytics(J j5) {
        x.hotel(j5);
        this.alpha = j5;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (bravo == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (bravo == null) {
                        bravo = new FirebaseAnalytics(J.delta(context, null));
                    }
                } finally {
                }
            }
        }
        return bravo;
    }

    @Keep
    public static InterfaceC1461o0 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        J delta = J.delta(context, bundle);
        if (delta == null) {
            return null;
        }
        return new a(delta);
    }

    @Keep
    public String getFirebaseInstanceId() {
        try {
            Object obj = C1946c.mike;
            return (String) V4.alpha(((C1946c) g.charlie().bravo(InterfaceC1947d.class)).delta(), OkHttpConstants.READ_TIMEOUT_MS, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        } catch (ExecutionException e4) {
            throw new IllegalStateException(e4.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        zzdj o5 = zzdj.o(activity);
        J j5 = this.alpha;
        j5.getClass();
        j5.bravo(new ay(j5, o5, str, str2));
    }
}
