package com.incognia.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.incognia.internal.Xqt;

/* loaded from: classes2.dex */
public final class Xqt extends BroadcastReceiver {

    /* renamed from: W, reason: collision with root package name */
    public final GQ f9957W;

    /* renamed from: b, reason: collision with root package name */
    public final pl2 f9958b;

    public Xqt(pl2 pl2Var, GQ gq) {
        this.f9958b = pl2Var;
        this.f9957W = gq;
    }

    public static final void b(Xqt xqt, boolean z2) {
        xqt.f9957W.invoke(Boolean.valueOf(!z2));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (str != null && str.hashCode() == -1172645946 && str.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
            final boolean z2 = false;
            if (intent != null) {
                z2 = intent.getBooleanExtra("noConnectivity", false);
            }
            this.f9958b.b(new d7p() { // from class: h9.ab
                @Override // com.incognia.internal.d7p
                public final void run() {
                    Xqt.b(Xqt.this, z2);
                }
            });
        }
    }
}
