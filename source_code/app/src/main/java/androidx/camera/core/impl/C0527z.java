package androidx.camera.core.impl;

import t6.AbstractC3066u3;

/* renamed from: androidx.camera.core.impl.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0527z implements androidx.camera.core.C {
    public final /* synthetic */ int bravo;
    public final androidx.camera.core.C charlie;

    public C0527z(long j5, int i4) {
        this.bravo = i4;
        switch (i4) {
            case 1:
                this.charlie = new W(j5, new C0526y(j5));
                return;
            default:
                this.charlie = new C0527z(j5, 1);
                return;
        }
    }

    @Override // androidx.camera.core.C
    public final long alpha() {
        switch (this.bravo) {
            case 0:
                return ((W) ((C0527z) this.charlie).charlie).bravo;
            default:
                return ((W) this.charlie).bravo;
        }
    }

    @Override // androidx.camera.core.C
    public final androidx.camera.core.B bravo(C5.b bVar) {
        switch (this.bravo) {
            case 0:
                if (!((W) ((C0527z) this.charlie).charlie).bravo(bVar).bravo) {
                    Throwable th = (Throwable) bVar.charlie;
                    if (th instanceof CameraValidator$CameraIdListIncorrectException) {
                        AbstractC3066u3.charlie("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
                        if (((CameraValidator$CameraIdListIncorrectException) th).getAvailableCameraCount() > 0) {
                            return androidx.camera.core.B.foxtrot;
                        }
                    }
                    return androidx.camera.core.B.delta;
                }
                return androidx.camera.core.B.echo;
            default:
                return ((W) this.charlie).bravo(bVar);
        }
    }
}
