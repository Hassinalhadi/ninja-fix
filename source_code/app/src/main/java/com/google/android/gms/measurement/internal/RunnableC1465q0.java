package com.google.android.gms.measurement.internal;

import android.app.Service;
import android.content.Intent;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.q0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1465q0 implements Runnable {
    public final /* synthetic */ int alpha = 1;
    public final /* synthetic */ int purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;
    public final /* synthetic */ Cloneable teal;

    public /* synthetic */ RunnableC1465q0(av.ah ahVar, int i4, ar arVar, Intent intent) {
        this.red = ahVar;
        this.purple = i4;
        this.silver = arVar;
        this.teal = intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                ((InterfaceC1463p0) ((at) this.red).teal).bravo(this.purple, (IOException) this.silver, (byte[]) this.teal);
                return;
            default:
                Service service = (Service) ((av.ah) this.red).purple;
                K0 k02 = (K0) service;
                int i4 = this.purple;
                if (k02.alpha(i4)) {
                    ((ar) this.silver).f7636g.bravo(Integer.valueOf(i4), "Local AppMeasurementService processed last upload request. StartId");
                    ar arVar = G.lima(service, null, null).f7507b;
                    G.foxtrot(arVar);
                    arVar.f7636g.alpha("Completed wakeful intent.");
                    k02.bravo((Intent) this.teal);
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ RunnableC1465q0(at atVar, int i4, IOException iOException, byte[] bArr, Map map) {
        this.red = atVar;
        this.purple = i4;
        this.silver = iOException;
        this.teal = bArr;
    }
}
