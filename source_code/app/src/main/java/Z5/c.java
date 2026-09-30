package Z5;

import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;

/* loaded from: classes2.dex */
public interface c extends IInterface {
    void victor(Status status, ModuleInstallResponse moduleInstallResponse);

    void xray(Status status, ModuleAvailabilityResponse moduleAvailabilityResponse);
}
