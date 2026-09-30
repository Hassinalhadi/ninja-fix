package com.google.firebase.analytics.connector.internal;

import B7.g;
import F7.b;
import I7.c;
import I7.j;
import I7.k;
import U8.a;
import V5.x;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import bd.ExecutorC0748a;
import com.google.android.gms.internal.measurement.J;
import com.google.firebase.components.ComponentRegistrar;
import f8.InterfaceC1697c;
import g8.d;
import java.util.Arrays;
import java.util.List;
import s6.H0;

@Keep
/* loaded from: classes2.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    public static b lambda$getComponents$0(c cVar) {
        g gVar = (g) cVar.charlie(g.class);
        Context context = (Context) cVar.charlie(Context.class);
        InterfaceC1697c interfaceC1697c = (InterfaceC1697c) cVar.charlie(InterfaceC1697c.class);
        x.hotel(gVar);
        x.hotel(context);
        x.hotel(interfaceC1697c);
        x.hotel(context.getApplicationContext());
        if (F7.c.charlie == null) {
            synchronized (F7.c.class) {
                try {
                    if (F7.c.charlie == null) {
                        Bundle bundle = new Bundle(1);
                        gVar.alpha();
                        if ("[DEFAULT]".equals(gVar.bravo)) {
                            ((k) interfaceC1697c).alpha(new ExecutorC0748a(1), new a(3));
                            bundle.putBoolean("dataCollectionDefaultEnabled", gVar.hotel());
                        }
                        F7.c.charlie = new F7.c(J.delta(context, bundle).delta);
                    }
                } finally {
                }
            }
        }
        return F7.c.charlie;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<I7.b> getComponents() {
        I7.a bravo = I7.b.bravo(b.class);
        bravo.alpha(j.charlie(g.class));
        bravo.alpha(j.charlie(Context.class));
        bravo.alpha(j.charlie(InterfaceC1697c.class));
        bravo.foxtrot = new d(3);
        bravo.charlie(2);
        return Arrays.asList(bravo.bravo(), H0.alpha("fire-analytics", "22.4.0"));
    }
}
