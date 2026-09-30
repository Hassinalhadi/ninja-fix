package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import E5.i;
import E5.s;
import K5.f;
import O5.a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.clevertap.android.sdk.Constants;
import id.C1915c;

/* loaded from: classes3.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int alpha = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter(Constants.INAPP_PRIORITY)).intValue();
        int i4 = intent.getExtras().getInt("attemptNumber");
        s.bravo(context);
        C1915c alpha2 = i.alpha();
        alpha2.zulu(queryParameter);
        alpha2.silver = a.bravo(intValue);
        if (queryParameter2 != null) {
            alpha2.red = Base64.decode(queryParameter2, 0);
        }
        K5.i iVar = s.alpha().delta;
        i hotel = alpha2.hotel();
        K5.a aVar = new K5.a(0);
        iVar.getClass();
        iVar.echo.execute(new f(iVar, hotel, i4, aVar));
    }
}
