package Cb;

import Lb.am;
import android.view.InputDevice;
import android.view.KeyEvent;
import bz.h0;
import com.app.network.network.models.Shift;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import k0.AbstractC1996c;
import k0.C1995b;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n.at;
import n.ax;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import pe.InterfaceC2328d;
import t0.InterfaceC2937r0;
import t0.U;
import vf.C3207k;
import y.C3344D;

/* loaded from: classes2.dex */
public final class l implements Function1, Callback {
    public final /* synthetic */ int alpha;
    public final Object purple;
    public final Object red;

    public /* synthetic */ l(int i4, Object obj, Object obj2) {
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
    }

    private final Object alpha(Object obj) {
        C3.d dVar = (C3.d) this.purple;
        Object obj2 = dVar.red;
        C3207k c3207k = (C3207k) this.red;
        synchronized (obj2) {
            ((ArrayList) dVar.purple).remove(c3207k);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j5;
        boolean z2;
        switch (this.alpha) {
            case 0:
                return ((A4.a) this.purple).invoke(((List) this.red).get(((Number) obj).intValue()));
            case 1:
                String reason = (String) obj;
                Intrinsics.echo(reason, "reason");
                ((Xd.l) this.purple).invoke((Shift) this.red, reason);
                return Unit.INSTANCE;
            case 2:
                return ((D0.z) this.purple).invoke(((List) this.red).get(((Number) obj).intValue()));
            case 3:
                return ((D0.z) this.purple).invoke(((List) this.red).get(((Number) obj).intValue()));
            case 4:
                int intValue = ((Number) obj).intValue();
                return ((D0.y) this.purple).invoke(Integer.valueOf(intValue), ((List) this.red).get(intValue));
            case 5:
                return ((am) this.purple).invoke(((ArrayList) this.red).get(((Number) obj).intValue()));
            case 6:
                InterfaceC2328d second = (InterfaceC2328d) obj;
                Qe.l lVar = (Qe.l) this.purple;
                InterfaceC2328d interfaceC2328d = (InterfaceC2328d) this.red;
                Intrinsics.echo(second, "second");
                lVar.delta(interfaceC2328d, second);
                return Unit.INSTANCE;
            case 7:
                S.l lVar2 = (S.l) obj;
                synchronized (S.n.charlie) {
                    j5 = S.n.echo;
                    S.n.echo = 1 + j5;
                }
                return new S.c(j5, lVar2, (Function1) this.purple, (Function1) this.red);
            case 8:
                return ((Vc.m) this.purple).invoke(((List) this.red).get(((Number) obj).intValue()));
            case 9:
                try {
                    ((Call) this.purple).cancel();
                } catch (Throwable unused) {
                }
                return Unit.INSTANCE;
            case 10:
                return alpha(obj);
            case 11:
                return ((h0) this.purple).invoke(((List) this.red).get(((Number) obj).intValue()));
            case 12:
                KeyEvent keyEvent = ((C1995b) obj).alpha;
                if (((ax) this.purple).alpha() == n.am.purple && keyEvent.getKeyCode() == 4) {
                    z2 = true;
                    if (AbstractC1996c.foxtrot(keyEvent) == 1) {
                        ((C3344D) this.red).india(null);
                        return Boolean.valueOf(z2);
                    }
                }
                z2 = false;
                return Boolean.valueOf(z2);
            default:
                KeyEvent keyEvent2 = ((C1995b) obj).alpha;
                InputDevice device = keyEvent2.getDevice();
                boolean z10 = false;
                if (device != null && device.supportsSource(513) && !device.isVirtual() && AbstractC1996c.foxtrot(keyEvent2) == 2 && keyEvent2.getSource() != 257) {
                    boolean mike = at.mike(19, keyEvent2);
                    Y.i iVar = (Y.i) this.purple;
                    if (mike) {
                        z10 = ((Y.n) iVar).foxtrot(5);
                    } else if (at.mike(20, keyEvent2)) {
                        z10 = ((Y.n) iVar).foxtrot(6);
                    } else if (at.mike(21, keyEvent2)) {
                        z10 = ((Y.n) iVar).foxtrot(3);
                    } else if (at.mike(22, keyEvent2)) {
                        z10 = ((Y.n) iVar).foxtrot(4);
                    } else if (at.mike(23, keyEvent2)) {
                        InterfaceC2937r0 interfaceC2937r0 = ((ax) this.red).charlie;
                        if (interfaceC2937r0 != null) {
                            ((U) interfaceC2937r0).bravo();
                        }
                        z10 = true;
                    }
                }
                return Boolean.valueOf(z10);
        }
    }

    @Override // okhttp3.Callback
    public void onFailure(Call call, IOException iOException) {
        if (!call.getCanceled()) {
            Result.Companion companion = Result.INSTANCE;
            ((C3207k) this.red).resumeWith(Result.m206constructorimpl(ResultKt.createFailure(iOException)));
        }
    }

    @Override // okhttp3.Callback
    public void onResponse(Call call, Response response) {
        ((C3207k) this.red).resumeWith(Result.m206constructorimpl(response));
    }
}
