package aw;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import av.aa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class t implements u {
    public final List alpha;
    public final aa bravo;
    public final bd.h charlie;
    public h delta = null;

    public t(ArrayList arrayList, bd.h hVar, aa aaVar) {
        this.alpha = Collections.unmodifiableList(new ArrayList(arrayList));
        this.bravo = aaVar;
        this.charlie = hVar;
    }

    @Override // aw.u
    public final Object alpha() {
        return null;
    }

    @Override // aw.u
    public final h bravo() {
        return this.delta;
    }

    @Override // aw.u
    public final Executor charlie() {
        return this.charlie;
    }

    @Override // aw.u
    public final int delta() {
        return 0;
    }

    @Override // aw.u
    public final CameraCaptureSession.StateCallback echo() {
        return this.bravo;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof t) {
                t tVar = (t) obj;
                if (Objects.equals(this.delta, tVar.delta)) {
                    List list = this.alpha;
                    int size = list.size();
                    List list2 = tVar.alpha;
                    if (size == list2.size()) {
                        for (int i4 = 0; i4 < list.size(); i4++) {
                            if (((i) list.get(i4)).equals(list2.get(i4))) {
                            }
                        }
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // aw.u
    public final List foxtrot() {
        return this.alpha;
    }

    @Override // aw.u
    public final void golf(CaptureRequest captureRequest) {
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.alpha.hashCode() ^ 31;
        int i4 = (hashCode2 << 5) - hashCode2;
        h hVar = this.delta;
        if (hVar == null) {
            hashCode = 0;
        } else {
            hashCode = hVar.alpha.alpha.hashCode();
        }
        int i5 = hashCode ^ i4;
        return (i5 << 5) - i5;
    }

    @Override // aw.u
    public final void hotel(h hVar) {
        this.delta = hVar;
    }
}
