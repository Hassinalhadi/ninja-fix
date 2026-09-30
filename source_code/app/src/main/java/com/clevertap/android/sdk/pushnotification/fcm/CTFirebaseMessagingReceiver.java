package com.clevertap.android.sdk.pushnotification.fcm;

import A2.s;
import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import com.clevertap.android.sdk.CTXtensions;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.Utils;
import com.clevertap.android.sdk.interfaces.NotificationRenderedListener;
import com.clevertap.android.sdk.pushnotification.PushNotificationUtil;
import com.google.firebase.messaging.RemoteMessage;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class CTFirebaseMessagingReceiver extends BroadcastReceiver implements NotificationRenderedListener {
    private static final String TAG = "CTRM";
    private CountDownTimer countDownTimer;
    private boolean isPRFinished;
    private String key = "";
    private BroadcastReceiver.PendingResult pendingResult;
    private long start;

    /* renamed from: com.clevertap.android.sdk.pushnotification.fcm.CTFirebaseMessagingReceiver$1 */
    /* loaded from: classes3.dex */
    public class AnonymousClass1 extends CountDownTimer {
        public AnonymousClass1(long j5, long j6) {
            super(j5, j6);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            CTFirebaseMessagingReceiver.this.finishReceiverAndCancelTimer("receiver life time is expired");
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j5) {
        }
    }

    public void finishReceiverAndCancelTimer(String str) {
        try {
            Logger.v(TAG, "got a signal to kill receiver and timer because " + str);
            if (!this.key.trim().isEmpty()) {
                CleverTapAPI.removeNotificationRenderedListener(this.key);
            }
            long nanoTime = System.nanoTime();
            if (this.pendingResult != null && !this.isPRFinished) {
                Logger.v(TAG, "informing OS to kill receiver...");
                this.pendingResult.finish();
                this.isPRFinished = true;
                CountDownTimer countDownTimer = this.countDownTimer;
                if (countDownTimer != null) {
                    countDownTimer.cancel();
                }
                Logger.v(TAG, "informed OS to kill receiver...");
                Logger.v(TAG, "receiver was alive for " + TimeUnit.NANOSECONDS.toSeconds(nanoTime - this.start) + " seconds");
                return;
            }
            Logger.v(TAG, "have already informed OS to kill receiver, can not inform again else OS will get angry :-O");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public /* synthetic */ void lambda$onReceive$0(Context context, Bundle bundle) {
        try {
            CleverTapAPI globalInstance = CleverTapAPI.getGlobalInstance(context, PushNotificationUtil.getAccountIdFromNotificationBundle(bundle));
            if (globalInstance != null) {
                CTXtensions.flushPushImpressionsOnPostAsyncSafely(globalInstance, "CTRM#flushQueueSync", Constants.D_SRC_PI_R, context);
            }
        } catch (Exception e) {
            e.printStackTrace();
            Logger.v(TAG, "Failed executing CTRM flushQueueSync thread.", e);
        } finally {
            finishReceiverAndCancelTimer("flush from receiver is done!");
        }
    }

    @Override // com.clevertap.android.sdk.interfaces.NotificationRenderedListener
    @SuppressLint({"RestrictedApi"})
    public void onNotificationRendered(boolean z2) {
        Logger.v(TAG, "push impression sent successfully by core, i should inform OS to kill receiver. my callback key is " + this.key);
        finishReceiverAndCancelTimer("push impression sent successfully by core");
    }

    @Override // android.content.BroadcastReceiver
    @SuppressLint({"RestrictedApi"})
    public void onReceive(Context context, Intent intent) {
        RemoteMessage remoteMessage;
        Bundle bundle;
        this.start = System.nanoTime();
        Logger.d(TAG, "received a message from Firebase");
        if (context != null && intent != null && (bundle = new FcmNotificationParser().toBundle((remoteMessage = new RemoteMessage(intent.getExtras())))) != null) {
            if (remoteMessage.getPriority() != 2) {
                Logger.d(TAG, "returning from CTRM because message priority is not normal");
                return;
            }
            long parseLong = Long.parseLong(bundle.getString("ctrmt", "4500"));
            this.pendingResult = goAsync();
            if (CleverTapAPI.getNotificationInfo(bundle).fromCleverTap) {
                if (Utils.isRenderFallback(remoteMessage, context)) {
                    String buildPushNotificationRenderedListenerKey = PushNotificationUtil.buildPushNotificationRenderedListenerKey(PushNotificationUtil.getAccountIdFromNotificationBundle(bundle), PushNotificationUtil.getPushIdFromNotificationBundle(bundle));
                    this.key = buildPushNotificationRenderedListenerKey;
                    CleverTapAPI.addNotificationRenderedListener(buildPushNotificationRenderedListenerKey, this);
                    AnonymousClass1 anonymousClass1 = new CountDownTimer(parseLong, 1000L) { // from class: com.clevertap.android.sdk.pushnotification.fcm.CTFirebaseMessagingReceiver.1
                        public AnonymousClass1(long parseLong2, long j6) {
                            super(parseLong2, j6);
                        }

                        @Override // android.os.CountDownTimer
                        public void onFinish() {
                            CTFirebaseMessagingReceiver.this.finishReceiverAndCancelTimer("receiver life time is expired");
                        }

                        @Override // android.os.CountDownTimer
                        public void onTick(long j5) {
                        }
                    };
                    this.countDownTimer = anonymousClass1;
                    anonymousClass1.start();
                    new Thread(new s(this, context, bundle, 24)).start();
                    return;
                }
                Logger.v(TAG, "Notification payload does not have a fallback key.");
                finishReceiverAndCancelTimer("isRenderFallback is false");
                return;
            }
            Logger.v(TAG, "Notification payload is not from CleverTap.");
            finishReceiverAndCancelTimer("push is not from CleverTap.");
        }
    }
}
