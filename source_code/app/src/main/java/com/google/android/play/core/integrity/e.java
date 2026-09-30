package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import p7.r;

/* loaded from: classes2.dex */
public final class e extends h {
    public final /* synthetic */ G6.h red;
    public final /* synthetic */ i silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, G6.h hVar, G6.h hVar2) {
        super(iVar, hVar);
        this.red = hVar2;
        this.silver = iVar;
    }

    @Override // p7.u
    public final void bravo() {
        G6.h hVar = this.red;
        i iVar = this.silver;
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
            Bundle bravo = i.bravo(iVar);
            g gVar = new g(iVar, hVar, 1);
            p7.p pVar = (p7.p) rVar;
            pVar.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
            int i4 = p7.n.alpha;
            obtain.writeInt(1);
            bravo.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(gVar);
            try {
                pVar.golf.transact(2, obtain, null, 1);
            } finally {
                obtain.recycle();
            }
        } catch (RemoteException e) {
            iVar.alpha.alpha(e, "warmUpIntegrityToken(%s)", 244414812773L);
            hVar.charlie(new StandardIntegrityException(-100, e));
        }
    }
}
