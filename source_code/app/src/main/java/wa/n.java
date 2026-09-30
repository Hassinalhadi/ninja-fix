package wa;

import android.content.Context;
import android.widget.ImageView;
import androidx.camera.core.C0533o;
import androidx.camera.core.aa;
import androidx.camera.core.ad;
import androidx.camera.core.az;
import androidx.camera.core.impl.B;
import androidx.camera.core.impl.I;
import androidx.camera.core.impl.al;
import androidx.camera.core.impl.ao;
import androidx.camera.core.impl.aw;
import androidx.camera.view.PreviewView;
import be.RunnableC0756b;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.auth.signup.SignUpActivity;
import h9.aq;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.ws.WebSocketProtocol;
import s6.AbstractC2643e5;
import wc.C3257c;
import zendesk.classic.messaging.UriResolver;
import zendesk.core.Callback;

/* loaded from: classes2.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, int i4) {
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
        this.silver = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        I i4;
        Object obj = this.silver;
        Object obj2 = this.red;
        Object obj3 = this.purple;
        switch (this.alpha) {
            case 0:
                SignUpActivity signUpActivity = (SignUpActivity) obj2;
                String str = (String) obj;
                ((HashMap) obj3).put(Integer.valueOf(signUpActivity.f12189L), str);
                switch (signUpActivity.f12189L) {
                    case WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY /* 1001 */:
                        ImageView ivIdCardSnap = signUpActivity.green().f653h0;
                        Intrinsics.delta(ivIdCardSnap, "ivIdCardSnap");
                        Intrinsics.checkNotNull(str);
                        AbstractC2643e5.charlie(ivIdCardSnap, StringsKt.b(str).toString(), R.dimen.spacing_12, 4);
                        return;
                    case 1002:
                        ImageView ivDrivingLicenseSnap = signUpActivity.green().f651g0;
                        Intrinsics.delta(ivDrivingLicenseSnap, "ivDrivingLicenseSnap");
                        AbstractC2643e5.charlie(ivDrivingLicenseSnap, str, R.dimen.spacing_12, 4);
                        return;
                    case 1003:
                        ImageView ivRegistrationSnap = signUpActivity.green().f657j0;
                        Intrinsics.delta(ivRegistrationSnap, "ivRegistrationSnap");
                        AbstractC2643e5.charlie(ivRegistrationSnap, str, R.dimen.spacing_12, 4);
                        return;
                    case 1004:
                        ImageView ivProfilePicture = signUpActivity.green().f655i0;
                        Intrinsics.delta(ivProfilePicture, "ivProfilePicture");
                        AbstractC2643e5.charlie(ivProfilePicture, str, R.dimen.spacing_12, 4);
                        return;
                    default:
                        return;
                }
            case 1:
                C3257c c3257c = (C3257c) obj2;
                PreviewView previewView = (PreviewView) obj;
                try {
                    bo.e eVar = (bo.e) ((RunnableC0756b) obj3).get();
                    c3257c.kilo = eVar;
                    az charlie = new aa(1).charlie();
                    charlie.beige(previewView.getSurfaceProvider());
                    aw awVar = new aa(0).bravo;
                    awVar.hotel(al.purple, 0);
                    al alVar = new al(B.alpha(awVar));
                    ao.echo(alVar);
                    ad adVar = new ad(alVar);
                    adVar.black(c3257c.foxtrot, new aq(16, c3257c));
                    eVar.foxtrot();
                    androidx.lifecycle.al alVar2 = c3257c.bravo;
                    C0533o DEFAULT_BACK_CAMERA = C0533o.charlie;
                    Intrinsics.delta(DEFAULT_BACK_CAMERA, "DEFAULT_BACK_CAMERA");
                    bo.b charlie2 = eVar.charlie(alVar2, DEFAULT_BACK_CAMERA, charlie, adVar);
                    c3257c.hotel = charlie2;
                    if (c3257c.india && (i4 = charlie2.red.f3380i) != null) {
                        i4.purple(true);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    Function1 function1 = c3257c.delta;
                    String message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    function1.invoke(message);
                    return;
                }
            case 2:
                ((SessionManager) obj3).lambda$setApplicationContext$0((Context) obj2, (PerfSession) obj);
                return;
            default:
                ((UriResolver) obj3).lambda$start$0((List) obj2, (Callback) obj);
                return;
        }
    }
}
