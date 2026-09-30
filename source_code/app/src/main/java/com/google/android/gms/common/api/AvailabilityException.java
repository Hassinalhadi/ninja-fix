package com.google.android.gms.common.api;

import V5.x;
import android.text.TextUtils;
import ao.ad;
import bv.C0762a;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class AvailabilityException extends Exception {
    private final bv.e zaa;

    public AvailabilityException(bv.e eVar) {
        this.zaa = eVar;
    }

    public ConnectionResult getConnectionResult(g gVar) {
        bv.e eVar = this.zaa;
        T5.b bVar = gVar.echo;
        x.alpha(ad.gray("The given API (", bVar.bravo.bravo, ") was not part of the availability request."), eVar.get(bVar) != null);
        ConnectionResult connectionResult = (ConnectionResult) this.zaa.get(bVar);
        x.hotel(connectionResult);
        return connectionResult;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((bv.b) this.zaa.keySet()).iterator();
        boolean z2 = true;
        while (true) {
            C0762a c0762a = (C0762a) it;
            if (!c0762a.hasNext()) {
                break;
            }
            T5.b bVar = (T5.b) c0762a.next();
            ConnectionResult connectionResult = (ConnectionResult) this.zaa.get(bVar);
            x.hotel(connectionResult);
            z2 &= !connectionResult.o();
            arrayList.add(bVar.bravo.bravo + ": " + String.valueOf(connectionResult));
        }
        StringBuilder sb2 = new StringBuilder();
        if (z2) {
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }

    public ConnectionResult getConnectionResult(k kVar) {
        bv.e eVar = this.zaa;
        T5.b apiKey = kVar.getApiKey();
        x.alpha(ad.gray("The given API (", apiKey.bravo.bravo, ") was not part of the availability request."), eVar.get(apiKey) != null);
        ConnectionResult connectionResult = (ConnectionResult) this.zaa.get(apiKey);
        x.hotel(connectionResult);
        return connectionResult;
    }
}
