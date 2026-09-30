package androidx.camera.camera2.internal.compat;

import B9.ab;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.util.ArrayMap;
import android.view.Surface;
import androidx.camera.core.J;
import androidx.camera.core.impl.B;
import androidx.camera.core.impl.C0507e;
import androidx.camera.core.impl.P;
import androidx.camera.core.impl.V;
import androidx.camera.core.impl.ad;
import androidx.camera.core.impl.ai;
import androidx.camera.core.impl.aw;
import androidx.camera.core.impl.ay;
import androidx.lifecycle.RunnableC0643m;
import av.aj;
import av.ao;
import bd.ScheduledExecutorServiceC0750c;
import be.C0758d;
import be.C0760f;
import be.RunnableC0756b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import t6.AbstractC3003i;

/* loaded from: classes3.dex */
public final class l extends CameraDevice.StateCallback {
    public final /* synthetic */ int alpha = 1;
    public final Object bravo;
    public final Object charlie;

    public l(bd.h hVar, CameraDevice.StateCallback stateCallback) {
        this.charlie = hVar;
        this.bravo = stateCallback;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        switch (this.alpha) {
            case 0:
                ((bd.h) this.charlie).execute(new k(this, cameraDevice, 0));
                return;
            default:
                ((av.s) this.charlie).uniform("openCameraConfigAndClose camera closed", null);
                ((V0.h) this.bravo).bravo(null);
                return;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        switch (this.alpha) {
            case 0:
                ((bd.h) this.charlie).execute(new k(this, cameraDevice, 1));
                return;
            default:
                ((av.s) this.charlie).uniform("openCameraConfigAndClose camera disconnected", null);
                ((V0.h) this.bravo).bravo(null);
                return;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i4) {
        switch (this.alpha) {
            case 0:
                ((bd.h) this.charlie).execute(new ae.l(this, cameraDevice, i4, 3));
                return;
            default:
                ((av.s) this.charlie).uniform("openCameraConfigAndClose camera error " + i4, null);
                ((V0.h) this.bravo).bravo(null);
                return;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        Object obj = this.charlie;
        switch (this.alpha) {
            case 0:
                ((bd.h) obj).execute(new k(this, cameraDevice, 2));
                return;
            default:
                av.s sVar = (av.s) obj;
                sVar.uniform("openCameraConfigAndClose camera opened", null);
                aj ajVar = new aj(sVar.f3282x, new Q3.c(Collections.EMPTY_LIST), false);
                SurfaceTexture surfaceTexture = new SurfaceTexture(0);
                surfaceTexture.setDefaultBufferSize(640, 480);
                Surface surface = new Surface(surfaceTexture);
                J j5 = new J(surface);
                be.h.delta(j5.echo).foxtrot(new RunnableC0643m(5, surface, surfaceTexture), tg.k.bravo());
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                HashSet hashSet = new HashSet();
                aw bravo = aw.bravo();
                ArrayList arrayList = new ArrayList();
                ay alpha = ay.alpha();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                androidx.camera.core.t tVar = androidx.camera.core.t.delta;
                ab alpha2 = C0507e.alpha(j5);
                alpha2.teal = tVar;
                linkedHashSet.add(alpha2.whiskey());
                sVar.uniform("Start configAndClose.", null);
                ArrayList arrayList5 = new ArrayList(linkedHashSet);
                ArrayList arrayList6 = new ArrayList(arrayList2);
                ArrayList arrayList7 = new ArrayList(arrayList3);
                ArrayList arrayList8 = new ArrayList(arrayList4);
                ArrayList arrayList9 = new ArrayList(hashSet);
                B alpha3 = B.alpha(bravo);
                ArrayList arrayList10 = new ArrayList(arrayList);
                V v4 = V.bravo;
                ArrayMap arrayMap = new ArrayMap();
                ArrayMap arrayMap2 = alpha.alpha;
                for (String str : arrayMap2.keySet()) {
                    arrayMap.put(str, arrayMap2.get(str));
                }
                P p4 = new P(arrayList5, arrayList6, arrayList7, arrayList8, new ad(arrayList9, alpha3, 1, arrayList10, false, new V(arrayMap), null), null, null, null);
                ao aoVar = sVar.f3276r;
                ScheduledExecutorServiceC0750c scheduledExecutorServiceC0750c = (ScheduledExecutorServiceC0750c) aoVar.purple;
                ao aoVar2 = (ao) aoVar.silver;
                bd.h hVar = (bd.h) aoVar.alpha;
                C0758d alpha4 = C0758d.alpha(AbstractC3003i.alpha(new C0760f(ajVar.mike(p4, cameraDevice, new av.aw((Q3.c) aoVar.teal, (Q3.c) aoVar.white, aoVar2, hVar, scheduledExecutorServiceC0750c, (Handler) aoVar.red)), 0)));
                A2.ao aoVar3 = new A2.ao(15, ajVar, j5);
                alpha4.getClass();
                bd.h hVar2 = sVar.red;
                RunnableC0756b foxtrot = be.h.foxtrot(alpha4, aoVar3, hVar2);
                Objects.requireNonNull(cameraDevice);
                foxtrot.foxtrot(new ai(3, cameraDevice), hVar2);
                return;
        }
    }

    public l(av.s sVar, V0.h hVar) {
        this.charlie = sVar;
        this.bravo = hVar;
    }
}
