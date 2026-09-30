package com.incognia.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.incognia.internal.G2;

/* loaded from: classes2.dex */
public final class G2 extends BroadcastReceiver {

    /* renamed from: W, reason: collision with root package name */
    public final Svj f8744W;

    /* renamed from: b, reason: collision with root package name */
    public final pl2 f8745b;

    public G2(pl2 pl2Var, Svj svj) {
        this.f8745b = pl2Var;
        this.f8744W = svj;
    }

    public static final void W(G2 g2) {
        g2.f8744W.invoke();
    }

    public static final void b(G2 g2) {
        g2.f8744W.invoke();
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1875733435) {
                if (hashCode == 1878357501 && str.equals("android.net.wifi.SCAN_RESULTS")) {
                    final int i4 = 0;
                    this.f8745b.b(new d7p(this) { // from class: h9.f
                        public final /* synthetic */ G2 bravo;

                        {
                            this.bravo = this;
                        }

                        @Override // com.incognia.internal.d7p
                        public final void run() {
                            switch (i4) {
                                case 0:
                                    G2.b(this.bravo);
                                    return;
                                default:
                                    G2.W(this.bravo);
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
            }
            if (str.equals("android.net.wifi.WIFI_STATE_CHANGED")) {
                int i5 = 0;
                if (intent != null) {
                    i5 = intent.getIntExtra("wifi_state", 0);
                }
                if (i5 == 1) {
                    final int i10 = 1;
                    this.f8745b.b(new d7p(this) { // from class: h9.f
                        public final /* synthetic */ G2 bravo;

                        {
                            this.bravo = this;
                        }

                        @Override // com.incognia.internal.d7p
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    G2.b(this.bravo);
                                    return;
                                default:
                                    G2.W(this.bravo);
                                    return;
                            }
                        }
                    });
                }
            }
        }
    }
}
