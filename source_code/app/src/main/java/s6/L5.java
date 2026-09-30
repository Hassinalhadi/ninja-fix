package s6;

import android.content.Context;
import android.util.Log;
import g1.AbstractC1735d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class L5 {
    public Object alpha;
    public Object bravo;
    public Object charlie;
    public Object delta;
    public Object echo;

    public L5(Context context, Function0 function0, Function0 function02, Xd.l lVar, Xd.l lVar2) {
        this.alpha = context;
        this.bravo = function0;
        this.charlie = function02;
        this.delta = lVar;
        this.echo = lVar2;
    }

    public void alpha(boolean z2) {
        Log.d("ImageSrcCtrl", "onCameraPermissionResult(granted=" + z2 + ")");
        if (!z2) {
            Log.d("ImageSrcCtrl", "Camera denied, showing settings dialog");
            ((Xd.l) this.echo).invoke("android.permission.CAMERA", new kotlin.collections.n(22, this));
        } else {
            Log.d("ImageSrcCtrl", "Camera granted, requesting gallery permission");
            ((Function0) this.charlie).invoke();
        }
    }

    public void bravo(boolean z2) {
        Log.d("ImageSrcCtrl", "onGalleryPermissionResult(granted=" + z2 + ")");
        Xd.l lVar = (Xd.l) this.delta;
        if (!z2) {
            Log.d("ImageSrcCtrl", "Gallery denied, opening camera directly");
            lVar.invoke(Boolean.TRUE, Boolean.FALSE);
        } else {
            Log.d("ImageSrcCtrl", "Gallery accepted, opening cropper with both camera and gallery");
            Boolean bool = Boolean.TRUE;
            lVar.invoke(bool, bool);
        }
    }

    public void charlie() {
        boolean z2;
        Context context = (Context) this.alpha;
        Intrinsics.echo(context, "context");
        if (AbstractC1735d.alpha(context, "android.permission.CAMERA") == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Log.d("ImageSrcCtrl", "startCameraFirstFlow() cameraGranted=" + z2);
        if (z2) {
            Log.d("ImageSrcCtrl", "Camera already granted, requesting gallery permission");
            ((Function0) this.charlie).invoke();
        } else {
            Log.d("ImageSrcCtrl", "Requesting camera permission first");
            ((Function0) this.bravo).invoke();
        }
    }
}
