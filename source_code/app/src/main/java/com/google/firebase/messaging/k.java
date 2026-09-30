package com.google.firebase.messaging;

import av.ah;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.tasks.OnSuccessListener;
import s6.AbstractC2629d0;

/* loaded from: classes2.dex */
public final /* synthetic */ class k implements OnSuccessListener {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ FirebaseMessaging purple;

    public /* synthetic */ k(FirebaseMessaging firebaseMessaging, int i4) {
        this.alpha = i4;
        this.purple = firebaseMessaging;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener, com.clevertap.android.sdk.task.OnSuccessListener
    public final void onSuccess(Object obj) {
        boolean z2;
        switch (this.alpha) {
            case 0:
                u uVar = (u) obj;
                if (this.purple.echo.hotel() && uVar.hotel.alpha() != null) {
                    synchronized (uVar) {
                        z2 = uVar.golf;
                    }
                    if (!z2) {
                        uVar.hotel(0L);
                        return;
                    }
                    return;
                }
                return;
            default:
                CloudMessage cloudMessage = (CloudMessage) obj;
                ah ahVar = FirebaseMessaging.kilo;
                FirebaseMessaging firebaseMessaging = this.purple;
                firebaseMessaging.getClass();
                if (cloudMessage != null) {
                    AbstractC2629d0.bravo(cloudMessage.alpha);
                    firebaseMessaging.golf();
                    return;
                }
                return;
        }
    }
}
