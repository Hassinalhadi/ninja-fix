package com.clevertap.android.sdk;

import android.content.Context;
import av.ao;
import com.clevertap.android.sdk.cryption.CryptHandler;
import com.clevertap.android.sdk.cryption.CryptRepository;
import com.clevertap.android.sdk.db.DBManager;
import com.google.firebase.messaging.FirebaseMessaging;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.Unit;

/* renamed from: com.clevertap.android.sdk.r, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class CallableC1002r implements Callable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Context purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;
    public final /* synthetic */ Object teal;
    public final /* synthetic */ Object white;

    public /* synthetic */ CallableC1002r(Context context, Object obj, Object obj2, Object obj3, Object obj4, int i4) {
        this.alpha = i4;
        this.purple = context;
        this.red = obj;
        this.silver = obj2;
        this.teal = obj3;
        this.white = obj4;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Unit coreState$lambda$1;
        com.google.firebase.messaging.t tVar;
        com.google.firebase.messaging.t tVar2;
        switch (this.alpha) {
            case 0:
                coreState$lambda$1 = CleverTapFactory.getCoreState$lambda$1(this.purple, (CleverTapInstanceConfig) this.red, (DBManager) this.silver, (CryptHandler) this.teal, (CryptRepository) this.white);
                return coreState$lambda$1;
            default:
                Context context = this.purple;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) this.red;
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.silver;
                S.j jVar = (S.j) this.teal;
                ao aoVar = (ao) this.white;
                synchronized (com.google.firebase.messaging.t.class) {
                    try {
                        WeakReference weakReference = com.google.firebase.messaging.t.delta;
                        if (weakReference != null) {
                            tVar = (com.google.firebase.messaging.t) weakReference.get();
                        } else {
                            tVar = null;
                        }
                        if (tVar == null) {
                            tVar2 = new com.google.firebase.messaging.t(context.getSharedPreferences("com.google.android.gms.appid", 0), scheduledThreadPoolExecutor);
                            tVar2.bravo();
                            com.google.firebase.messaging.t.delta = new WeakReference(tVar2);
                        } else {
                            tVar2 = tVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new com.google.firebase.messaging.u(firebaseMessaging, jVar, tVar2, aoVar, context, scheduledThreadPoolExecutor);
        }
    }
}
