package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Process;
import androidx.appcompat.widget.P0;
import com.checkout.components.redirecthandler.customtab.RedirectCustomTabEventLogger;
import m6.AbstractBinderC2100a;
import p7.s;
import p7.t;

/* loaded from: classes2.dex */
public final class g extends AbstractBinderC2100a implements s {
    public final G6.h hotel;
    public final /* synthetic */ i india;
    public final /* synthetic */ int juliet;
    public final t kilo;
    public final /* synthetic */ i lima;

    public g(i iVar, G6.h hVar, byte b2) {
        this.india = iVar;
        attachInterface(this, "com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
        this.hotel = hVar;
    }

    public final void lime(Bundle bundle) {
        this.india.echo.charlie(this.hotel);
    }

    public final void magenta(Bundle bundle) {
        this.india.echo.charlie(this.hotel);
    }

    @Override // p7.s
    public void oscar(Bundle bundle) {
        switch (this.juliet) {
            case 0:
                lime(bundle);
                this.kilo.bravo("onRequestExpressIntegrityToken", new Object[0]);
                this.lima.delta.getClass();
                int i4 = bundle.getInt(RedirectCustomTabEventLogger.RESULT_ERROR);
                StandardIntegrityException standardIntegrityException = null;
                if (i4 != 0) {
                    standardIntegrityException = new StandardIntegrityException(i4, null);
                }
                G6.h hVar = this.hotel;
                if (standardIntegrityException != null) {
                    hVar.charlie(standardIntegrityException);
                    return;
                }
                bundle.getLong("request.token.sid");
                P0.azure(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat("IntegrityDialogWrapper");
                String string = bundle.getString("token");
                if (string != null) {
                    hVar.delta(new l(string));
                    return;
                }
                throw new NullPointerException("Null token");
            default:
                lime(bundle);
                return;
        }
    }

    @Override // p7.s
    public void zulu(Bundle bundle) {
        switch (this.juliet) {
            case 1:
                magenta(bundle);
                this.kilo.bravo("onWarmUpExpressIntegrityToken", new Object[0]);
                this.lima.delta.getClass();
                int i4 = bundle.getInt(RedirectCustomTabEventLogger.RESULT_ERROR);
                StandardIntegrityException standardIntegrityException = null;
                if (i4 != 0) {
                    standardIntegrityException = new StandardIntegrityException(i4, null);
                }
                G6.h hVar = this.hotel;
                if (standardIntegrityException != null) {
                    hVar.charlie(standardIntegrityException);
                    return;
                } else {
                    hVar.delta(Long.valueOf(bundle.getLong("warm.up.sid")));
                    return;
                }
            default:
                magenta(bundle);
                return;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(i iVar, G6.h hVar, int i4) {
        this(iVar, hVar, (byte) 0);
        this.juliet = i4;
        switch (i4) {
            case 1:
                this.lima = iVar;
                this(iVar, hVar, (byte) 0);
                this.kilo = new t("OnWarmUpIntegrityTokenCallback");
                return;
            default:
                this.lima = iVar;
                this.kilo = new t("OnRequestIntegrityTokenCallback");
                return;
        }
    }
}
