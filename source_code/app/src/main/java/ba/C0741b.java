package ba;

import V0.h;
import V0.i;
import a4.u;
import androidx.camera.core.CameraControl$OperationCanceledException;
import androidx.camera.core.impl.ai;
import t6.AbstractC3003i;

/* renamed from: ba.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0741b implements i {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ C0742c purple;

    public /* synthetic */ C0741b(C0742c c0742c, int i4) {
        this.alpha = i4;
        this.purple = c0742c;
    }

    @Override // V0.i
    public final Object black(final h hVar) {
        switch (this.alpha) {
            case 0:
                final C0742c c0742c = this.purple;
                c0742c.getClass();
                final int i4 = 1;
                c0742c.delta.execute(new Runnable() { // from class: ba.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i4) {
                            case 0:
                                h hVar2 = hVar;
                                C0742c c0742c2 = c0742c;
                                c0742c2.bravo = true;
                                CameraControl$OperationCanceledException cameraControl$OperationCanceledException = new CameraControl$OperationCanceledException("Camera2CameraControl was updated with new options.");
                                h hVar3 = c0742c2.golf;
                                if (hVar3 != null) {
                                    hVar3.delta(cameraControl$OperationCanceledException);
                                    c0742c2.golf = null;
                                }
                                c0742c2.golf = hVar2;
                                if (c0742c2.alpha) {
                                    av.h hVar4 = c0742c2.charlie;
                                    hVar4.getClass();
                                    be.h.delta(AbstractC3003i.alpha(new u(4, hVar4))).foxtrot(new ai(7, c0742c2), c0742c2.delta);
                                    c0742c2.bravo = false;
                                    return;
                                }
                                return;
                            default:
                                h hVar5 = hVar;
                                C0742c c0742c3 = c0742c;
                                c0742c3.bravo = true;
                                CameraControl$OperationCanceledException cameraControl$OperationCanceledException2 = new CameraControl$OperationCanceledException("Camera2CameraControl was updated with new options.");
                                h hVar6 = c0742c3.golf;
                                if (hVar6 != null) {
                                    hVar6.delta(cameraControl$OperationCanceledException2);
                                    c0742c3.golf = null;
                                }
                                c0742c3.golf = hVar5;
                                if (c0742c3.alpha) {
                                    av.h hVar7 = c0742c3.charlie;
                                    hVar7.getClass();
                                    be.h.delta(AbstractC3003i.alpha(new u(4, hVar7))).foxtrot(new ai(7, c0742c3), c0742c3.delta);
                                    c0742c3.bravo = false;
                                    return;
                                }
                                return;
                        }
                    }
                });
                return "addCaptureRequestOptions";
            default:
                final C0742c c0742c2 = this.purple;
                c0742c2.getClass();
                final int i5 = 0;
                c0742c2.delta.execute(new Runnable() { // from class: ba.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i5) {
                            case 0:
                                h hVar2 = hVar;
                                C0742c c0742c22 = c0742c2;
                                c0742c22.bravo = true;
                                CameraControl$OperationCanceledException cameraControl$OperationCanceledException = new CameraControl$OperationCanceledException("Camera2CameraControl was updated with new options.");
                                h hVar3 = c0742c22.golf;
                                if (hVar3 != null) {
                                    hVar3.delta(cameraControl$OperationCanceledException);
                                    c0742c22.golf = null;
                                }
                                c0742c22.golf = hVar2;
                                if (c0742c22.alpha) {
                                    av.h hVar4 = c0742c22.charlie;
                                    hVar4.getClass();
                                    be.h.delta(AbstractC3003i.alpha(new u(4, hVar4))).foxtrot(new ai(7, c0742c22), c0742c22.delta);
                                    c0742c22.bravo = false;
                                    return;
                                }
                                return;
                            default:
                                h hVar5 = hVar;
                                C0742c c0742c3 = c0742c2;
                                c0742c3.bravo = true;
                                CameraControl$OperationCanceledException cameraControl$OperationCanceledException2 = new CameraControl$OperationCanceledException("Camera2CameraControl was updated with new options.");
                                h hVar6 = c0742c3.golf;
                                if (hVar6 != null) {
                                    hVar6.delta(cameraControl$OperationCanceledException2);
                                    c0742c3.golf = null;
                                }
                                c0742c3.golf = hVar5;
                                if (c0742c3.alpha) {
                                    av.h hVar7 = c0742c3.charlie;
                                    hVar7.getClass();
                                    be.h.delta(AbstractC3003i.alpha(new u(4, hVar7))).foxtrot(new ai(7, c0742c3), c0742c3.delta);
                                    c0742c3.bravo = false;
                                    return;
                                }
                                return;
                        }
                    }
                });
                return "clearCaptureRequestOptions";
        }
    }
}
