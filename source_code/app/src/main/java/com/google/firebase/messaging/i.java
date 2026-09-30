package com.google.firebase.messaging;

import B2.ai;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import bv.aw;
import com.google.android.gms.tasks.Task;
import e6.AbstractC1630b;
import java.util.concurrent.ExecutorService;
import s6.V4;

/* loaded from: classes2.dex */
public final class i {
    public static final Object charlie = new Object();
    public static aa delta;
    public final Object alpha;
    public final Object bravo;

    public i(ExecutorService executorService) {
        this.bravo = new aw(0);
        this.alpha = executorService;
    }

    public static G6.q alpha(Context context, Intent intent, boolean z2) {
        aa aaVar;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (charlie) {
            try {
                if (delta == null) {
                    delta = new aa(context);
                }
                aaVar = delta;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            if (o.kilo().oscar(context)) {
                x.charlie(context, aaVar, intent);
            } else {
                aaVar.bravo(intent);
            }
            return V4.echo(-1);
        }
        return aaVar.bravo(intent).mike(new ap.a(1), new S7.a(29));
    }

    public G6.q bravo(final Intent intent) {
        boolean z2;
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        final boolean z10 = false;
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        boolean delta2 = AbstractC1630b.delta();
        final Context context = (Context) this.alpha;
        if (delta2 && context.getApplicationInfo().targetSdkVersion >= 26) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((intent.getFlags() & 268435456) != 0) {
            z10 = true;
        }
        if (z2 && !z10) {
            return alpha(context, intent, z10);
        }
        ap.a aVar = (ap.a) this.bravo;
        return V4.charlie(aVar, new ai(6, context, intent)).foxtrot(aVar, new G6.c() { // from class: com.google.firebase.messaging.h
            @Override // G6.c
            public final Object ivory(Task task) {
                if (AbstractC1630b.delta() && ((Integer) task.hotel()).intValue() == 402) {
                    return i.alpha(context, intent, z10).mike(new ap.a(1), new S7.a(28));
                }
                return task;
            }
        });
    }

    public i(Context context) {
        this.alpha = context;
        this.bravo = new ap.a(1);
    }
}
