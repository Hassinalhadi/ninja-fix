package S5;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import bv.aw;
import com.checkout.components.redirecthandler.customtab.RedirectCustomTabEventLogger;
import com.google.android.gms.cloudmessaging.zzd;
import com.google.android.gms.internal.measurement.ai;
import java.util.Objects;
import java.util.regex.Matcher;

/* loaded from: classes2.dex */
public final class d extends ai {
    public final /* synthetic */ a alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, Looper looper) {
        super(looper);
        this.alpha = aVar;
        Looper.getMainLooper();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        a aVar = this.alpha;
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new e());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof zzd) {
                        aVar.golf = (zzd) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        aVar.foxtrot = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!Objects.equals(action, "com.google.android.c2dm.intent.REGISTRATION")) {
                    if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", "Unexpected response action: ".concat(String.valueOf(action)));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra == null) {
                    String stringExtra2 = intent2.getStringExtra(RedirectCustomTabEventLogger.RESULT_ERROR);
                    if (stringExtra2 == null) {
                        Log.w("Rpc", "Unexpected response, no error or registration id ".concat(String.valueOf(intent2.getExtras())));
                        return;
                    }
                    if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", "Received InstanceID error ".concat(stringExtra2));
                    }
                    if (stringExtra2.startsWith("|")) {
                        String[] split = stringExtra2.split("\\|");
                        if (split.length > 2 && Objects.equals(split[1], "ID")) {
                            String str = split[2];
                            String str2 = split[3];
                            if (str2.startsWith(":")) {
                                str2 = str2.substring(1);
                            }
                            aVar.delta(intent2.putExtra(RedirectCustomTabEventLogger.RESULT_ERROR, str2).getExtras(), str);
                            return;
                        }
                        Log.w("Rpc", "Unexpected structured response ".concat(stringExtra2));
                        return;
                    }
                    synchronized (aVar.alpha) {
                        int i4 = 0;
                        while (true) {
                            try {
                                aw awVar = aVar.alpha;
                                if (i4 < awVar.red) {
                                    aVar.delta(intent2.getExtras(), (String) awVar.foxtrot(i4));
                                    i4++;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return;
                }
                Matcher matcher = a.juliet.matcher(stringExtra);
                if (!matcher.matches()) {
                    if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", "Unexpected response string: ".concat(stringExtra));
                        return;
                    }
                    return;
                }
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                if (group != null) {
                    Bundle extras = intent2.getExtras();
                    extras.putString("registration_id", group2);
                    aVar.delta(extras, group);
                    return;
                }
                return;
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }
}
