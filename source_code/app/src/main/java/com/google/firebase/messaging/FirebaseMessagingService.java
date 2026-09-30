package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.checkout.components.redirecthandler.customtab.RedirectCustomTabEventLogger;
import com.google.android.gms.internal.measurement.C1298c;
import f6.ThreadFactoryC1693a;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import s6.AbstractC2629d0;
import s6.V4;

/* loaded from: classes2.dex */
public class FirebaseMessagingService extends g {
    public static final String ACTION_DIRECT_BOOT_REMOTE_INTENT = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
    static final String ACTION_NEW_TOKEN = "com.google.firebase.messaging.NEW_TOKEN";
    static final String ACTION_REMOTE_INTENT = "com.google.android.c2dm.intent.RECEIVE";
    static final String EXTRA_TOKEN = "token";
    private static final int RECENTLY_RECEIVED_MESSAGE_IDS_MAX_SIZE = 10;
    private static final Queue<String> recentlyReceivedMessageIds = new ArrayDeque(10);
    private S5.a rpc;

    private boolean alreadyReceivedMessage(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue<String> queue = recentlyReceivedMessageIds;
        if (queue.contains(str)) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received duplicate message: " + str);
                return true;
            }
            return true;
        }
        if (queue.size() >= 10) {
            queue.remove();
        }
        queue.add(str);
        return false;
    }

    private void dispatchMessage(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (com.google.android.material.internal.s.jade(extras)) {
            com.google.android.material.internal.s sVar = new com.google.android.material.internal.s(extras);
            ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC1693a("Firebase-Messaging-Network-Io"));
            try {
                if (new C1298c(this, sVar, newSingleThreadExecutor).sierra()) {
                    return;
                }
                newSingleThreadExecutor.shutdown();
                if (AbstractC2629d0.delta(intent)) {
                    AbstractC2629d0.charlie(intent.getExtras(), "_nf");
                }
            } finally {
                newSingleThreadExecutor.shutdown();
            }
        }
        onMessageReceived(new RemoteMessage(extras));
    }

    private String getMessageId(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        if (stringExtra == null) {
            return intent.getStringExtra("message_id");
        }
        return stringExtra;
    }

    private S5.a getRpc(Context context) {
        if (this.rpc == null) {
            this.rpc = new S5.a(context.getApplicationContext());
        }
        return this.rpc;
    }

    private void handleMessageIntent(Intent intent) {
        Integer num;
        int i4;
        if (!alreadyReceivedMessage(intent.getStringExtra("google.message_id"))) {
            passMessageIntentToSdk(intent);
        }
        S5.a rpc = getRpc(this);
        if (rpc.charlie.oscar() >= 233700000) {
            Bundle bundle = new Bundle();
            String stringExtra = intent.getStringExtra("google.message_id");
            if (stringExtra == null) {
                stringExtra = intent.getStringExtra("message_id");
            }
            bundle.putString("google.message_id", stringExtra);
            if (intent.hasExtra("google.product_id")) {
                num = Integer.valueOf(intent.getIntExtra("google.product_id", 0));
            } else {
                num = null;
            }
            if (num != null) {
                bundle.putInt("google.product_id", num.intValue());
            }
            S5.k charlie = S5.k.charlie(rpc.bravo);
            synchronized (charlie) {
                i4 = charlie.alpha;
                charlie.alpha = i4 + 1;
            }
            charlie.echo(new S5.j(i4, 3, bundle, 0));
            return;
        }
        V4.delta(new IOException("SERVICE_NOT_AVAILABLE"));
    }

    private void passMessageIntentToSdk(Intent intent) {
        String stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = "gcm";
        }
        char c3 = 65535;
        switch (stringExtra.hashCode()) {
            case -2062414158:
                if (stringExtra.equals("deleted_messages")) {
                    c3 = 0;
                    break;
                }
                break;
            case 102161:
                if (stringExtra.equals("gcm")) {
                    c3 = 1;
                    break;
                }
                break;
            case 814694033:
                if (stringExtra.equals("send_error")) {
                    c3 = 2;
                    break;
                }
                break;
            case 814800675:
                if (stringExtra.equals("send_event")) {
                    c3 = 3;
                    break;
                }
                break;
        }
        switch (c3) {
            case 0:
                onDeletedMessages();
                return;
            case 1:
                AbstractC2629d0.bravo(intent);
                dispatchMessage(intent);
                return;
            case 2:
                onSendError(getMessageId(intent), new SendException(intent.getStringExtra(RedirectCustomTabEventLogger.RESULT_ERROR)));
                return;
            case 3:
                onMessageSent(intent.getStringExtra("google.message_id"));
                return;
            default:
                Log.w("FirebaseMessaging", "Received message with unknown type: ".concat(stringExtra));
                return;
        }
    }

    public static void resetForTesting() {
        recentlyReceivedMessageIds.clear();
    }

    @Override // com.google.firebase.messaging.g
    public Intent getStartCommandIntent(Intent intent) {
        return (Intent) ((ArrayDeque) o.kilo().delta).poll();
    }

    @Override // com.google.firebase.messaging.g
    public void handleIntent(Intent intent) {
        String action = intent.getAction();
        if (!ACTION_REMOTE_INTENT.equals(action) && !ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(action)) {
            if (ACTION_NEW_TOKEN.equals(action)) {
                onNewToken(intent.getStringExtra(EXTRA_TOKEN));
                return;
            }
            Log.d("FirebaseMessaging", "Unknown intent action: " + intent.getAction());
            return;
        }
        handleMessageIntent(intent);
    }

    public void onDeletedMessages() {
    }

    public void onMessageReceived(RemoteMessage remoteMessage) {
    }

    @Deprecated
    public void onMessageSent(String str) {
    }

    public void onNewToken(String str) {
    }

    @Deprecated
    public void onSendError(String str, Exception exc) {
    }

    public void setRpcForTesting(S5.a aVar) {
        this.rpc = aVar;
    }
}
