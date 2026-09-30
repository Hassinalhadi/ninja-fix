package ae;

import android.content.Intent;
import android.content.IntentSender;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import androidx.camera.core.impl.AbstractC0512j;
import androidx.camera.core.impl.C0515m;
import androidx.camera.core.impl.InterfaceC0519q;
import j2.InterfaceC1935b;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ int red;
    public final /* synthetic */ Object silver;

    public /* synthetic */ l(int i4, int i5, Object obj, Object obj2) {
        this.alpha = i5;
        this.purple = obj;
        this.red = i4;
        this.silver = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ah.a aVar;
        switch (this.alpha) {
            case 0:
                Object obj = ((ai.a) this.silver).alpha;
                m mVar = (m) this.purple;
                String str = (String) mVar.alpha.get(Integer.valueOf(this.red));
                if (str != null) {
                    ah.d dVar = (ah.d) mVar.echo.get(str);
                    if (dVar != null) {
                        aVar = dVar.alpha;
                    } else {
                        aVar = null;
                    }
                    if (aVar == null) {
                        mVar.golf.remove(str);
                        mVar.foxtrot.put(str, obj);
                        return;
                    }
                    ah.a aVar2 = dVar.alpha;
                    Intrinsics.charlie(aVar2, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
                    if (mVar.delta.remove(str)) {
                        aVar2.charlie(obj);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((m) this.purple).alpha(this.red, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.silver));
                return;
            case 2:
                ((CameraCaptureSession.CaptureCallback) ((androidx.camera.camera2.internal.compat.e) this.purple).charlie).onCaptureSequenceAborted((CameraCaptureSession) this.silver, this.red);
                return;
            case 3:
                ((CameraDevice.StateCallback) ((androidx.camera.camera2.internal.compat.l) this.purple).bravo).onError((CameraDevice) this.silver, this.red);
                return;
            case 4:
                ((AbstractC0512j) this.purple).charlie(this.red, (C0515m) this.silver);
                return;
            case 5:
                ((AbstractC0512j) this.purple).bravo(this.red, (InterfaceC0519q) this.silver);
                return;
            default:
                ((InterfaceC1935b) ((F8.c) this.purple).charlie).charlie(this.red, (Serializable) this.silver);
                return;
        }
    }

    public /* synthetic */ l(Object obj, AutoCloseable autoCloseable, int i4, int i5) {
        this.alpha = i5;
        this.purple = obj;
        this.silver = autoCloseable;
        this.red = i4;
    }
}
