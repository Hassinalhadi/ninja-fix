package com.incognia.internal;

import android.os.Looper;
import android.util.Log;
import ao.ad;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.GoogleApiAvailability;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.n;

/* loaded from: classes2.dex */
public final class Ppm extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k8E f9448b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ppm(k8E k8e) {
        super(0);
        this.f9448b = k8e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0096, code lost:
    
        if (com.incognia.internal.eSs.f10363b.get() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a1, code lost:
    
        android.util.Log.w("Incognia", "GooglePlayServices access error. Did you add the dependency?");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009f, code lost:
    
        if (com.incognia.internal.eSs.f10363b.get() == false) goto L38;
     */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        Integer num;
        String str;
        String name = k8E.class.getName();
        if (!Looper.getMainLooper().equals(Looper.myLooper())) {
            boolean z2 = false;
            try {
                if (k8E.b(this.f9448b, "com.google.android.gms.common.GoogleApiAvailability")) {
                    int isGooglePlayServicesAvailable = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(this.f9448b.f10743b);
                    num = Integer.valueOf(isGooglePlayServicesAvailable);
                    if (isGooglePlayServicesAvailable == 0) {
                        z2 = true;
                    }
                } else {
                    num = null;
                }
                if (!z2) {
                    if (num != null) {
                        k8E k8e = this.f9448b;
                        if (eSs.f10363b.get()) {
                            StringBuilder sb2 = new StringBuilder("GooglePlayServices access error. \n                        |Google Play Services is available returned error code: \n                        |");
                            sb2.append(num);
                            sb2.append(" (");
                            int intValue = num.intValue();
                            k8e.getClass();
                            if (intValue != 1) {
                                if (intValue != 2) {
                                    if (intValue != 3) {
                                        if (intValue != 9) {
                                            if (intValue != 18) {
                                                str = "Unknown Code";
                                            } else {
                                                str = "Service Updating";
                                            }
                                        } else {
                                            str = "Service Invalid";
                                        }
                                    } else {
                                        str = "Service Disabled";
                                    }
                                } else {
                                    str = "Service Version Update Required";
                                }
                            } else {
                                str = "Service Missing";
                            }
                            sb2.append(str);
                            sb2.append(')');
                            Log.w("Incognia", n.delta(sb2.toString()));
                        }
                    }
                }
            } catch (Throwable unused) {
            }
            return Boolean.valueOf(z2);
        }
        throw new RuntimeException(ad.gray(Constants.AES_PREFIX, name, "]: You can't execute this operation on the UI Thread"));
    }
}
