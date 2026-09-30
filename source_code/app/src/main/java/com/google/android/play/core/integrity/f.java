package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import p7.r;

/* loaded from: classes2.dex */
public final class f extends h {
    public final /* synthetic */ p red;
    public final /* synthetic */ long silver;
    public final /* synthetic */ G6.h teal;
    public final /* synthetic */ i white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, G6.h hVar, p pVar, long j5, G6.h hVar2) {
        super(iVar, hVar);
        this.red = pVar;
        this.silver = j5;
        this.teal = hVar2;
        this.white = iVar;
    }

    @Override // p7.u
    public final void bravo() {
        p pVar = this.red;
        G6.h hVar = this.teal;
        i iVar = this.white;
        if (i.delta(iVar)) {
            alpha(new StandardIntegrityException(-2, null));
            return;
        }
        if (i.charlie(iVar)) {
            alpha(new StandardIntegrityException(-14, null));
            return;
        }
        try {
            r rVar = iVar.echo.november;
            Bundle alpha = i.alpha(iVar, pVar, this.silver);
            g gVar = new g(iVar, hVar, 0);
            p7.p pVar2 = (p7.p) rVar;
            pVar2.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
            int i4 = p7.n.alpha;
            obtain.writeInt(1);
            alpha.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(gVar);
            try {
                pVar2.golf.transact(3, obtain, null, 1);
            } finally {
                obtain.recycle();
            }
        } catch (RemoteException e) {
            iVar.alpha.alpha(e, "requestExpressIntegrityToken(%s, %s, %s)", pVar.alpha, pVar.bravo, 244414812773L);
            hVar.charlie(new StandardIntegrityException(-100, e));
        }
    }
}
