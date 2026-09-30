package androidx.camera.core.impl;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes3.dex */
public final class L extends K {
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.camera.core.impl.L, androidx.camera.core.impl.K] */
    public static L delta(Z z2, Size size) {
        if (z2.victor() != null) {
            ?? k6 = new K();
            P azure = z2.azure();
            B b2 = B.red;
            int i4 = P.alpha().golf.charlie;
            if (azure != null) {
                i4 = azure.golf.charlie;
                for (CameraDevice.StateCallback stateCallback : azure.charlie) {
                    ArrayList arrayList = k6.charlie;
                    if (!arrayList.contains(stateCallback)) {
                        arrayList.add(stateCallback);
                    }
                }
                for (CameraCaptureSession.StateCallback stateCallback2 : azure.delta) {
                    ArrayList arrayList2 = k6.delta;
                    if (!arrayList2.contains(stateCallback2)) {
                        arrayList2.add(stateCallback2);
                    }
                }
                k6.bravo.charlie(azure.golf.delta);
                b2 = azure.golf.bravo;
            }
            S2.l lVar = k6.bravo;
            lVar.getClass();
            lVar.silver = aw.delta(b2);
            if (z2 instanceof C) {
                Rational rational = ay.a.alpha;
                if (((PreviewPixelHDRnetQuirk) ax.b.alpha.delta(PreviewPixelHDRnetQuirk.class)) != null && !ay.a.alpha.equals(new Rational(size.getWidth(), size.getHeight()))) {
                    aw bravo = aw.bravo();
                    bravo.hotel(au.a.yellow(CaptureRequest.TONEMAP_MODE), 2);
                    k6.bravo.echo(new av.ah(6, B.alpha(bravo)));
                }
            }
            k6.bravo.alpha = ((Integer) z2.plum(au.a.f3240a, Integer.valueOf(i4))).intValue();
            CameraDevice.StateCallback stateCallback3 = (CameraDevice.StateCallback) z2.plum(au.a.f3242c, new CameraDevice.StateCallback());
            ArrayList arrayList3 = k6.charlie;
            if (!arrayList3.contains(stateCallback3)) {
                arrayList3.add(stateCallback3);
            }
            CameraCaptureSession.StateCallback stateCallback4 = (CameraCaptureSession.StateCallback) z2.plum(au.a.f3243d, new CameraCaptureSession.StateCallback());
            ArrayList arrayList4 = k6.delta;
            if (!arrayList4.contains(stateCallback4)) {
                arrayList4.add(stateCallback4);
            }
            av.ae aeVar = new av.ae((CameraCaptureSession.CaptureCallback) z2.plum(au.a.e, new CameraCaptureSession.CaptureCallback()));
            k6.bravo.delta(aeVar);
            ArrayList arrayList5 = k6.echo;
            if (!arrayList5.contains(aeVar)) {
                arrayList5.add(aeVar);
            }
            int fuchsia = z2.fuchsia();
            if (fuchsia != 0) {
                S2.l lVar2 = k6.bravo;
                lVar2.getClass();
                if (fuchsia != 0) {
                    ((aw) lVar2.silver).hotel(Z.blue, Integer.valueOf(fuchsia));
                }
            }
            int lime = z2.lime();
            if (lime != 0) {
                S2.l lVar3 = k6.bravo;
                lVar3.getClass();
                if (lime != 0) {
                    ((aw) lVar3.silver).hotel(Z.black, Integer.valueOf(lime));
                }
            }
            aw bravo2 = aw.bravo();
            C0505c c0505c = au.a.f3244f;
            bravo2.hotel(c0505c, (String) z2.plum(c0505c, null));
            C0505c c0505c2 = au.a.f3241b;
            Long l10 = (Long) z2.plum(c0505c2, -1L);
            l10.getClass();
            bravo2.hotel(c0505c2, l10);
            k6.bravo.echo(bravo2);
            k6.bravo.echo(androidx.camera.core.r.delta(z2).charlie());
            return k6;
        }
        throw new IllegalStateException("Implementation is missing option unpacker for " + z2.blue(z2.toString()));
    }

    public final void alpha(af afVar) {
        this.bravo.echo(afVar);
    }

    public final void bravo(ah ahVar, androidx.camera.core.t tVar, int i4) {
        B9.ab alpha = C0507e.alpha(ahVar);
        if (tVar != null) {
            alpha.teal = tVar;
            alpha.red = Integer.valueOf(i4);
            this.alpha.add(alpha.whiskey());
            ((HashSet) this.bravo.red).add(ahVar);
            return;
        }
        throw new NullPointerException("Null dynamicRange");
    }

    public final P charlie() {
        return new P(new ArrayList(this.alpha), new ArrayList(this.charlie), new ArrayList(this.delta), new ArrayList(this.echo), this.bravo.hotel(), this.foxtrot, this.golf, this.hotel);
    }
}
