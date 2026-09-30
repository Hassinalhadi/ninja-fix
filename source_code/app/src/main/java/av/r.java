package av;

import android.hardware.camera2.CameraDevice;
import android.os.SystemClock;
import androidx.camera.core.C0497d;
import bd.ScheduledExecutorServiceC0750c;
import com.clevertap.android.sdk.Constants;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import s6.T7;
import t6.AbstractC3066u3;

/* loaded from: classes3.dex */
public final class r extends CameraDevice.StateCallback {
    public final bd.h alpha;
    public final ScheduledExecutorServiceC0750c bravo;
    public O6.e charlie;
    public ScheduledFuture delta;
    public final B8.h echo;
    public final /* synthetic */ s foxtrot;

    public r(s sVar, bd.h hVar, ScheduledExecutorServiceC0750c scheduledExecutorServiceC0750c, long j5) {
        this.foxtrot = sVar;
        this.alpha = hVar;
        this.bravo = scheduledExecutorServiceC0750c;
        this.echo = new B8.h(this, j5);
    }

    public final boolean alpha() {
        if (this.delta == null) {
            return false;
        }
        this.foxtrot.uniform("Cancelling scheduled re-open: " + this.charlie, null);
        this.charlie.purple = true;
        this.charlie = null;
        this.delta.cancel(false);
        this.delta = null;
        return true;
    }

    public final void bravo() {
        boolean z2;
        boolean z10 = true;
        if (this.charlie == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        T7.golf(null, z2);
        if (this.delta != null) {
            z10 = false;
        }
        T7.golf(null, z10);
        B8.h hVar = this.echo;
        hVar.getClass();
        long uptimeMillis = SystemClock.uptimeMillis();
        if (hVar.bravo == -1) {
            hVar.bravo = uptimeMillis;
        }
        long j5 = uptimeMillis - hVar.bravo;
        long charlie = hVar.charlie();
        s sVar = this.foxtrot;
        if (j5 >= charlie) {
            hVar.bravo = -1L;
            AbstractC3066u3.charlie("Camera2CameraImpl", "Camera reopening attempted for " + hVar.charlie() + "ms without success.");
            sVar.bronze(4, null, false);
            return;
        }
        this.charlie = new O6.e(this, this.alpha);
        sVar.uniform("Attempting camera re-open in " + hVar.bravo() + "ms: " + this.charlie + " activeResuming = " + sVar.f3280v, null);
        this.delta = this.bravo.schedule(this.charlie, (long) hVar.bravo(), TimeUnit.MILLISECONDS);
    }

    public final boolean charlie() {
        s sVar = this.foxtrot;
        if (sVar.f3280v) {
            int i4 = sVar.f3263d;
            if (i4 == 1 || i4 == 2) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        boolean z2;
        this.foxtrot.uniform("CameraDevice.onClosed()", null);
        if (this.foxtrot.f3262c == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        T7.golf("Unexpected onClose callback on camera device: " + cameraDevice, z2);
        int mike = q.mike(this.foxtrot.A);
        if (mike != 1 && mike != 4) {
            if (mike != 5 && mike != 6) {
                throw new IllegalStateException("Camera closed while in state: ".concat(q.november(this.foxtrot.A)));
            }
            s sVar = this.foxtrot;
            int i4 = sVar.f3263d;
            if (i4 != 0) {
                sVar.uniform("Camera closed due to error: ".concat(s.whiskey(i4)), null);
                bravo();
                return;
            } else {
                sVar.fuchsia(false);
                return;
            }
        }
        T7.golf(null, this.foxtrot.f3264f.isEmpty());
        this.foxtrot.sierra();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        this.foxtrot.uniform("CameraDevice.onDisconnected()", null);
        onError(cameraDevice, 1);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i4) {
        boolean z2;
        s sVar = this.foxtrot;
        sVar.f3262c = cameraDevice;
        sVar.f3263d = i4;
        J2.c cVar = sVar.f3284z;
        ((s) cVar.red).uniform("Camera receive onErrorCallback", null);
        cVar.juliet();
        int mike = q.mike(this.foxtrot.A);
        if (mike != 1) {
            switch (mike) {
                case 4:
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    String id2 = cameraDevice.getId();
                    String whiskey = s.whiskey(i4);
                    String lima = q.lima(this.foxtrot.A);
                    StringBuilder india = q.india("CameraDevice.onError(): ", id2, " failed with ", whiskey, " while in ");
                    india.append(lima);
                    india.append(" state. Will attempt recovering from error.");
                    AbstractC3066u3.bravo("Camera2CameraImpl", india.toString());
                    int i5 = 6;
                    boolean z10 = false;
                    if (this.foxtrot.A != 8 && this.foxtrot.A != 9 && this.foxtrot.A != 10 && this.foxtrot.A != 7 && this.foxtrot.A != 6) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    T7.golf("Attempt to handle open error from non open state: ".concat(q.november(this.foxtrot.A)), z2);
                    int i10 = 3;
                    if (i4 != 1 && i4 != 2 && i4 != 4) {
                        AbstractC3066u3.charlie("Camera2CameraImpl", "Error observed on open (or opening) camera device " + cameraDevice.getId() + ": " + s.whiskey(i4) + " closing camera.");
                        if (i4 == 3) {
                            i5 = 5;
                        }
                        this.foxtrot.bronze(5, new C0497d(i5, null), true);
                        this.foxtrot.romeo();
                        return;
                    }
                    AbstractC3066u3.bravo("Camera2CameraImpl", q.golf("Attempt to reopen camera[", cameraDevice.getId(), "] after error[", s.whiskey(i4), Constants.AES_SUFFIX));
                    s sVar2 = this.foxtrot;
                    if (sVar2.f3263d != 0) {
                        z10 = true;
                    }
                    T7.golf("Can only reopen camera device after error if the camera device is actually in an error state.", z10);
                    if (i4 != 1) {
                        if (i4 == 2) {
                            i10 = 1;
                        }
                    } else {
                        i10 = 2;
                    }
                    sVar2.bronze(7, new C0497d(i10, null), true);
                    sVar2.romeo();
                    return;
                default:
                    throw new IllegalStateException("onError() should not be possible from state: ".concat(q.november(this.foxtrot.A)));
            }
        }
        String id3 = cameraDevice.getId();
        String whiskey2 = s.whiskey(i4);
        String lima2 = q.lima(this.foxtrot.A);
        StringBuilder india2 = q.india("CameraDevice.onError(): ", id3, " failed with ", whiskey2, " while in ");
        india2.append(lima2);
        india2.append(" state. Will finish closing camera.");
        AbstractC3066u3.charlie("Camera2CameraImpl", india2.toString());
        this.foxtrot.romeo();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        this.foxtrot.uniform("CameraDevice.onOpened()", null);
        s sVar = this.foxtrot;
        sVar.f3262c = cameraDevice;
        sVar.f3263d = 0;
        this.echo.bravo = -1L;
        int mike = q.mike(sVar.A);
        if (mike != 1 && mike != 4) {
            if (mike != 5 && mike != 6 && mike != 7) {
                throw new IllegalStateException("onOpened() should not be possible from state: ".concat(q.november(this.foxtrot.A)));
            }
            this.foxtrot.coral(9);
            androidx.camera.core.impl.ab abVar = this.foxtrot.f3268j;
            String id2 = cameraDevice.getId();
            s sVar2 = this.foxtrot;
            if (abVar.echo(id2, sVar2.f3267i.hotel(sVar2.f3262c.getId()))) {
                this.foxtrot.beige();
                return;
            }
            return;
        }
        T7.golf(null, this.foxtrot.f3264f.isEmpty());
        this.foxtrot.f3262c.close();
        this.foxtrot.f3262c = null;
    }
}
