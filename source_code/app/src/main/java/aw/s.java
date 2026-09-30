package aw;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import av.aa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class s implements u {
    public final SessionConfiguration alpha;
    public final List bravo;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [aw.r] */
    /* JADX WARN: Type inference failed for: r1v4, types: [aw.r] */
    /* JADX WARN: Type inference failed for: r1v5, types: [aw.r] */
    /* JADX WARN: Type inference failed for: r1v7, types: [aw.r] */
    public s(ArrayList arrayList, bd.h hVar, aa aaVar) {
        k kVar;
        SessionConfiguration sessionConfiguration = new SessionConfiguration(0, v.alpha(arrayList), hVar, aaVar);
        this.alpha = sessionConfiguration;
        List<OutputConfiguration> outputConfigurations = sessionConfiguration.getOutputConfigurations();
        ArrayList arrayList2 = new ArrayList(outputConfigurations.size());
        for (OutputConfiguration outputConfiguration : outputConfigurations) {
            i iVar = null;
            if (outputConfiguration != null) {
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 33) {
                    kVar = new r(outputConfiguration);
                } else if (i4 >= 28) {
                    kVar = new r(new n(outputConfiguration));
                } else if (i4 >= 26) {
                    kVar = new r(new l(outputConfiguration));
                } else if (i4 >= 24) {
                    kVar = new r(new j(outputConfiguration));
                } else {
                    kVar = null;
                }
                if (kVar != null) {
                    iVar = new i(kVar);
                }
            }
            arrayList2.add(iVar);
        }
        this.bravo = Collections.unmodifiableList(arrayList2);
    }

    @Override // aw.u
    public final Object alpha() {
        return this.alpha;
    }

    @Override // aw.u
    public final h bravo() {
        return h.alpha(this.alpha.getInputConfiguration());
    }

    @Override // aw.u
    public final Executor charlie() {
        return this.alpha.getExecutor();
    }

    @Override // aw.u
    public final int delta() {
        return this.alpha.getSessionType();
    }

    @Override // aw.u
    public final CameraCaptureSession.StateCallback echo() {
        return this.alpha.getStateCallback();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        return Objects.equals(this.alpha, ((s) obj).alpha);
    }

    @Override // aw.u
    public final List foxtrot() {
        return this.bravo;
    }

    @Override // aw.u
    public final void golf(CaptureRequest captureRequest) {
        this.alpha.setSessionParameters(captureRequest);
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    @Override // aw.u
    public final void hotel(h hVar) {
        this.alpha.setInputConfiguration(hVar.alpha.alpha);
    }
}
