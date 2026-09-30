package Fc;

import androidx.lifecycle.az;
import com.app.network.network.models.AppState;
import com.app.network.network.models.DeviceInfo;
import com.google.mlkit.vision.barcode.common.Barcode;
import delivery.samurai.android.AndroidApp;
import delivery.samurai.android.ui.splash.AuthViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.http2.Http2;

/* loaded from: classes2.dex */
public final /* synthetic */ class w implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ AuthViewModel purple;
    public final /* synthetic */ DeviceInfo red;
    public final /* synthetic */ az silver;

    public /* synthetic */ w(AuthViewModel authViewModel, DeviceInfo deviceInfo, az azVar, int i4) {
        this.alpha = i4;
        this.purple = authViewModel;
        this.red = deviceInfo;
        this.silver = azVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DeviceInfo copy;
        DeviceInfo copy2;
        DeviceInfo deviceInfo = (DeviceInfo) obj;
        switch (this.alpha) {
            case 0:
                AuthViewModel authViewModel = this.purple;
                AndroidApp access$getApp$p = AuthViewModel.access$getApp$p(authViewModel);
                copy = deviceInfo.copy((r32 & 1) != 0 ? deviceInfo.deviceType : null, (r32 & 2) != 0 ? deviceInfo.appBuild : null, (r32 & 4) != 0 ? deviceInfo.installationUid : null, (r32 & 8) != 0 ? deviceInfo.os : null, (r32 & 16) != 0 ? deviceInfo.appVersion : null, (r32 & 32) != 0 ? deviceInfo.deviceManufacturer : null, (r32 & 64) != 0 ? deviceInfo.deviceModel : null, (r32 & 128) != 0 ? deviceInfo.bundleId : null, (r32 & Barcode.FORMAT_QR_CODE) != 0 ? deviceInfo.fcmToken : null, (r32 & 512) != 0 ? deviceInfo.apnToken : null, (r32 & Barcode.FORMAT_UPC_E) != 0 ? deviceInfo.mac : null, (r32 & 2048) != 0 ? deviceInfo.androidId : null, (r32 & 4096) != 0 ? deviceInfo.cleverTapId : null, (r32 & 8192) != 0 ? deviceInfo.language : this.red.getLanguage(), (r32 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? deviceInfo.locationPermissionAllowed : null);
                L9.d.fuchsia(access$getApp$p, copy);
                L9.d.ivory(AuthViewModel.access$getApp$p(authViewModel), deviceInfo.getInstallationUid());
                this.silver.postValue(AppState.DEVICE_REGISTERED);
                return Unit.INSTANCE;
            default:
                AndroidApp access$getApp$p2 = AuthViewModel.access$getApp$p(this.purple);
                copy2 = deviceInfo.copy((r32 & 1) != 0 ? deviceInfo.deviceType : null, (r32 & 2) != 0 ? deviceInfo.appBuild : null, (r32 & 4) != 0 ? deviceInfo.installationUid : null, (r32 & 8) != 0 ? deviceInfo.os : null, (r32 & 16) != 0 ? deviceInfo.appVersion : null, (r32 & 32) != 0 ? deviceInfo.deviceManufacturer : null, (r32 & 64) != 0 ? deviceInfo.deviceModel : null, (r32 & 128) != 0 ? deviceInfo.bundleId : null, (r32 & Barcode.FORMAT_QR_CODE) != 0 ? deviceInfo.fcmToken : null, (r32 & 512) != 0 ? deviceInfo.apnToken : null, (r32 & Barcode.FORMAT_UPC_E) != 0 ? deviceInfo.mac : null, (r32 & 2048) != 0 ? deviceInfo.androidId : null, (r32 & 4096) != 0 ? deviceInfo.cleverTapId : null, (r32 & 8192) != 0 ? deviceInfo.language : this.red.getLanguage(), (r32 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? deviceInfo.locationPermissionAllowed : null);
                L9.d.fuchsia(access$getApp$p2, copy2);
                this.silver.postValue(AppState.DEVICE_INFO_UPDATED);
                return Unit.INSTANCE;
        }
    }
}
