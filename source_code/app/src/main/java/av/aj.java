package av;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk;
import androidx.camera.core.impl.AbstractC0512j;
import androidx.camera.core.impl.C0507e;
import androidx.camera.core.impl.InterfaceC0519q;
import androidx.camera.core.impl.P;
import androidx.camera.core.impl.utils.SurfaceUtil;
import be.C0758d;
import be.RunnableC0756b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import s6.T7;
import t6.AbstractC3003i;
import t6.AbstractC3066u3;
import t6.J3;
import t6.O3;

/* loaded from: classes3.dex */
public final class aj {
    public aw delta;
    public aw echo;
    public P foxtrot;
    public int india;
    public V0.k juliet;
    public V0.h kilo;
    public final Ce.y oscar;
    public final androidx.core.widget.f papa;
    public final androidx.compose.foundation.layout.af quebec;
    public final boolean romeo;
    public final Object alpha = new Object();
    public final ArrayList bravo = new ArrayList();
    public final HashMap golf = new HashMap();
    public List hotel = Collections.EMPTY_LIST;
    public HashMap lima = new HashMap();
    public final a3.l mike = new a3.l(2);
    public final a3.l november = new a3.l(3);
    public final ai charlie = new ai(this);

    public aj(androidx.core.widget.f fVar, Q3.c cVar, boolean z2) {
        this.india = 1;
        this.india = 2;
        this.papa = fVar;
        this.oscar = new Ce.y(cVar.alpha(CaptureNoResponseQuirk.class));
        this.quebec = new androidx.compose.foundation.layout.af(cVar, 2);
        this.romeo = z2;
    }

    public static v bravo(List list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        CameraCaptureSession.CaptureCallback vVar;
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC0512j abstractC0512j = (AbstractC0512j) it.next();
            if (abstractC0512j == null) {
                vVar = null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                O3.bravo(abstractC0512j, arrayList2);
                if (arrayList2.size() == 1) {
                    vVar = (CameraCaptureSession.CaptureCallback) arrayList2.get(0);
                } else {
                    vVar = new v(arrayList2);
                }
            }
            arrayList.add(vVar);
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return new v(arrayList);
    }

    public static HashMap charlie(HashMap hashMap, HashMap hashMap2) {
        HashMap hashMap3 = new HashMap();
        for (Integer num : hashMap.keySet()) {
            num.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) hashMap.get(num)).iterator();
            if (!it.hasNext()) {
                AbstractC3066u3.charlie("CaptureSession", "Skips to create instances for multi-resolution output. imageFormat: 0, streamInfos size: " + arrayList.size());
            } else {
                SurfaceUtil.alpha((Surface) hashMap2.get(((C0507e) it.next()).alpha));
                af.bravo();
                throw null;
            }
        }
        return hashMap3;
    }

    public static ArrayList golf(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            aw.i iVar = (aw.i) it.next();
            if (!arrayList2.contains(iVar.alpha.echo())) {
                arrayList2.add(iVar.alpha.echo());
                arrayList3.add(iVar);
            }
        }
        return arrayList3;
    }

    public static HashMap hotel(ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0507e c0507e = (C0507e) it.next();
            if (c0507e.delta > 0 && c0507e.bravo.isEmpty()) {
                int i4 = c0507e.delta;
                List list = (List) hashMap.get(Integer.valueOf(i4));
                if (list == null) {
                    list = new ArrayList();
                    hashMap.put(Integer.valueOf(i4), list);
                }
                list.add(c0507e);
            }
        }
        HashMap hashMap2 = new HashMap();
        for (Integer num : hashMap.keySet()) {
            num.getClass();
            if (((List) hashMap.get(num)).size() >= 2) {
                hashMap2.put(num, (List) hashMap.get(num));
            }
        }
        return hashMap2;
    }

    public final void alpha() {
        synchronized (this.alpha) {
            try {
                int mike = q.mike(this.india);
                if (mike != 0) {
                    if (mike != 1) {
                        if (mike != 2) {
                            if (mike == 3 || mike == 4) {
                                T7.foxtrot(this.delta, "The Opener shouldn't null in state:".concat(q.oscar(this.india)));
                                this.delta.uniform();
                                this.india = 6;
                                this.oscar.charlie();
                                this.foxtrot = null;
                            }
                        } else {
                            T7.foxtrot(this.delta, "The Opener shouldn't null in state:".concat(q.oscar(this.india)));
                            this.delta.uniform();
                        }
                    }
                    this.india = 8;
                } else {
                    throw new IllegalStateException("close() should not be possible in state: ".concat(q.oscar(this.india)));
                }
            } finally {
            }
        }
    }

    public final void delta() {
        if (this.india == 8) {
            AbstractC3066u3.bravo("CaptureSession", "Skipping finishClose due to being state RELEASED.");
            return;
        }
        this.india = 8;
        this.echo = null;
        V0.h hVar = this.kilo;
        if (hVar != null) {
            hVar.bravo(null);
            this.kilo = null;
        }
    }

    public final List echo() {
        List unmodifiableList;
        synchronized (this.alpha) {
            unmodifiableList = Collections.unmodifiableList(this.bravo);
        }
        return unmodifiableList;
    }

    public final aw.i foxtrot(C0507e c0507e, HashMap hashMap, String str) {
        long j5;
        Surface surface = (Surface) hashMap.get(c0507e.alpha);
        T7.foxtrot(surface, "Surface in OutputConfig not found in configuredSurfaceMap.");
        aw.i iVar = new aw.i(c0507e.delta, surface);
        aw.r rVar = iVar.alpha;
        if (str != null) {
            rVar.india(str);
        } else {
            rVar.india(null);
        }
        boolean z2 = true;
        int i4 = c0507e.charlie;
        if (i4 == 0) {
            rVar.hotel(1);
        } else if (i4 == 1) {
            rVar.hotel(2);
        }
        List list = c0507e.bravo;
        if (!list.isEmpty()) {
            rVar.bravo();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Surface surface2 = (Surface) hashMap.get((androidx.camera.core.impl.ah) it.next());
                T7.foxtrot(surface2, "Surface in OutputConfig not found in configuredSurfaceMap.");
                rVar.alpha(surface2);
            }
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 33) {
            androidx.core.widget.f fVar = this.papa;
            fVar.getClass();
            if (i5 < 33) {
                z2 = false;
            }
            T7.golf("DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.", z2);
            DynamicRangeProfiles alpha = ((aw.c) fVar.purple).alpha();
            if (alpha != null) {
                androidx.camera.core.t tVar = c0507e.echo;
                Long alpha2 = aw.b.alpha(tVar, alpha);
                if (alpha2 == null) {
                    AbstractC3066u3.charlie("CaptureSession", "Requested dynamic range is not supported. Defaulting to STANDARD dynamic range profile.\nRequested dynamic range:\n  " + tVar);
                } else {
                    j5 = alpha2.longValue();
                    rVar.golf(j5);
                    return iVar;
                }
            }
        }
        j5 = 1;
        rVar.golf(j5);
        return iVar;
    }

    public final boolean india() {
        boolean z2;
        synchronized (this.alpha) {
            int i4 = this.india;
            if (i4 != 5 && i4 != 4) {
                z2 = false;
            }
            z2 = true;
        }
        return z2;
    }

    public final void juliet(ArrayList arrayList) {
        androidx.camera.camera2.internal.compat.e eVar;
        ArrayList arrayList2;
        boolean z2;
        InterfaceC0519q interfaceC0519q;
        synchronized (this.alpha) {
            try {
                if (this.india != 5) {
                    AbstractC3066u3.bravo("CaptureSession", "Skipping issueBurstCaptureRequest due to session closed");
                    return;
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                try {
                    eVar = new androidx.camera.camera2.internal.compat.e(2);
                    arrayList2 = new ArrayList();
                    AbstractC3066u3.bravo("CaptureSession", "Issuing capture request.");
                    Iterator it = arrayList.iterator();
                    z2 = false;
                    while (it.hasNext()) {
                        androidx.camera.core.impl.ad adVar = (androidx.camera.core.impl.ad) it.next();
                        if (Collections.unmodifiableList(adVar.alpha).isEmpty()) {
                            AbstractC3066u3.bravo("CaptureSession", "Skipping issuing empty capture request.");
                        } else {
                            Iterator it2 = Collections.unmodifiableList(adVar.alpha).iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    androidx.camera.core.impl.ah ahVar = (androidx.camera.core.impl.ah) it2.next();
                                    if (!this.golf.containsKey(ahVar)) {
                                        AbstractC3066u3.bravo("CaptureSession", "Skipping capture request with invalid surface: " + ahVar);
                                        break;
                                    }
                                } else {
                                    if (adVar.charlie == 2) {
                                        z2 = true;
                                    }
                                    S2.l lVar = new S2.l(adVar);
                                    if (adVar.charlie == 5 && (interfaceC0519q = adVar.golf) != null) {
                                        lVar.yellow = interfaceC0519q;
                                    }
                                    P p4 = this.foxtrot;
                                    if (p4 != null) {
                                        lVar.echo(p4.golf.bravo);
                                    }
                                    lVar.echo(adVar.bravo);
                                    androidx.camera.core.impl.ad hotel = lVar.hotel();
                                    aw awVar = this.echo;
                                    awVar.golf.getClass();
                                    CaptureRequest charlie = J3.charlie(hotel, ((CameraCaptureSession) ((J2.l) awVar.golf.purple).alpha).getDevice(), this.golf, false, this.quebec);
                                    if (charlie == null) {
                                        AbstractC3066u3.bravo("CaptureSession", "Skipping issuing request without surface.");
                                        return;
                                    }
                                    ArrayList arrayList3 = new ArrayList();
                                    Iterator it3 = adVar.delta.iterator();
                                    while (it3.hasNext()) {
                                        O3.bravo((AbstractC0512j) it3.next(), arrayList3);
                                    }
                                    eVar.alpha(charlie, arrayList3);
                                    arrayList2.add(charlie);
                                }
                            }
                        }
                    }
                } catch (CameraAccessException e) {
                    AbstractC3066u3.charlie("CaptureSession", "Unable to access camera: " + e.getMessage());
                    Thread.dumpStack();
                }
                if (!arrayList2.isEmpty()) {
                    if (this.mike.echo(arrayList2, z2)) {
                        aw awVar2 = this.echo;
                        T7.foxtrot(awVar2.golf, "Need to call openCaptureSession before using this API.");
                        ((CameraCaptureSession) ((J2.l) awVar2.golf.purple).alpha).stopRepeating();
                        eVar.bravo = new ag(this);
                    }
                    if (this.november.delta(arrayList2, z2)) {
                        eVar.alpha((CaptureRequest) arrayList2.get(arrayList2.size() - 1), Collections.singletonList(new v(this)));
                    }
                    this.echo.india(arrayList2, eVar);
                    return;
                }
                AbstractC3066u3.bravo("CaptureSession", "Skipping issuing burst request due to no valid request elements");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void kilo(List list) {
        synchronized (this.alpha) {
            try {
                switch (q.mike(this.india)) {
                    case 0:
                        throw new IllegalStateException("issueCaptureRequests() should not be possible in state: ".concat(q.oscar(this.india)));
                    case 1:
                    case 2:
                    case 3:
                        this.bravo.addAll(list);
                        break;
                    case 4:
                        this.bravo.addAll(list);
                        this.oscar.bravo().foxtrot(new androidx.camera.core.impl.ai(5, this), tg.k.bravo());
                        break;
                    case 5:
                    case 6:
                    case 7:
                        throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
                }
            } finally {
            }
        }
    }

    public final void lima(P p4) {
        synchronized (this.alpha) {
            try {
            } catch (Throwable th) {
                throw th;
            }
            if (p4 == null) {
                AbstractC3066u3.bravo("CaptureSession", "Skipping issueRepeatingCaptureRequests for no configuration case.");
                return;
            }
            if (this.india != 5) {
                AbstractC3066u3.bravo("CaptureSession", "Skipping issueRepeatingCaptureRequests due to session closed");
                return;
            }
            androidx.camera.core.impl.ad adVar = p4.golf;
            if (Collections.unmodifiableList(adVar.alpha).isEmpty()) {
                AbstractC3066u3.bravo("CaptureSession", "Skipping issueRepeatingCaptureRequests for no surface.");
                try {
                    aw awVar = this.echo;
                    T7.foxtrot(awVar.golf, "Need to call openCaptureSession before using this API.");
                    ((CameraCaptureSession) ((J2.l) awVar.golf.purple).alpha).stopRepeating();
                } catch (CameraAccessException e) {
                    AbstractC3066u3.charlie("CaptureSession", "Unable to access camera: " + e.getMessage());
                    Thread.dumpStack();
                }
                return;
            }
            try {
                AbstractC3066u3.bravo("CaptureSession", "Issuing request for session.");
                aw awVar2 = this.echo;
                awVar2.golf.getClass();
                CaptureRequest charlie = J3.charlie(adVar, ((CameraCaptureSession) ((J2.l) awVar2.golf.purple).alpha).getDevice(), this.golf, true, this.quebec);
                if (charlie == null) {
                    AbstractC3066u3.bravo("CaptureSession", "Skipping issuing empty request for session.");
                    return;
                } else {
                    this.echo.romeo(charlie, this.oscar.alpha(bravo(adVar.delta, new CameraCaptureSession.CaptureCallback[0])));
                    return;
                }
            } catch (CameraAccessException e4) {
                AbstractC3066u3.charlie("CaptureSession", "Unable to access camera: " + e4.getMessage());
                Thread.dumpStack();
                return;
            }
            throw th;
        }
    }

    public final com.google.common.util.concurrent.e mike(P p4, CameraDevice cameraDevice, aw awVar) {
        synchronized (this.alpha) {
            try {
                if (q.mike(this.india) != 1) {
                    AbstractC3066u3.charlie("CaptureSession", "Open not allowed in state: ".concat(q.oscar(this.india)));
                    return new be.j(1, new IllegalStateException("open() should not allow the state: ".concat(q.oscar(this.india))));
                }
                this.india = 3;
                ArrayList arrayList = new ArrayList(p4.bravo());
                this.hotel = arrayList;
                this.delta = awVar;
                C0758d alpha = C0758d.alpha(awVar.sierra(arrayList));
                A2.p pVar = new A2.p(this, p4, cameraDevice, 11);
                bd.h hVar = this.delta.delta;
                alpha.getClass();
                RunnableC0756b foxtrot = be.h.foxtrot(alpha, pVar, hVar);
                ah ahVar = new ah(0, this);
                foxtrot.foxtrot(new be.g(0, foxtrot, ahVar), this.delta.delta);
                return be.h.delta(foxtrot);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x000f. Please report as an issue. */
    public final com.google.common.util.concurrent.e november() {
        synchronized (this.alpha) {
            try {
                switch (q.mike(this.india)) {
                    case 0:
                        throw new IllegalStateException("release() should not be possible in state: ".concat(q.oscar(this.india)));
                    case 2:
                        T7.foxtrot(this.delta, "The Opener shouldn't null in state:".concat(q.oscar(this.india)));
                        this.delta.uniform();
                    case 1:
                        this.india = 8;
                        return be.j.red;
                    case 4:
                    case 5:
                        aw awVar = this.echo;
                        if (awVar != null) {
                            awVar.juliet();
                        }
                    case 3:
                        this.india = 7;
                        this.oscar.charlie();
                        T7.foxtrot(this.delta, "The Opener shouldn't null in state:".concat(q.oscar(this.india)));
                        if (this.delta.uniform()) {
                            delta();
                            return be.j.red;
                        }
                    case 6:
                        if (this.juliet == null) {
                            this.juliet = AbstractC3003i.alpha(new ag(this));
                        }
                        return this.juliet;
                    default:
                        return be.j.red;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void oscar(P p4) {
        synchronized (this.alpha) {
            try {
                switch (q.mike(this.india)) {
                    case 0:
                        throw new IllegalStateException("setSessionConfig() should not be possible in state: ".concat(q.oscar(this.india)));
                    case 1:
                    case 2:
                    case 3:
                        this.foxtrot = p4;
                        break;
                    case 4:
                        this.foxtrot = p4;
                        if (p4 == null) {
                            return;
                        }
                        if (!this.golf.keySet().containsAll(p4.bravo())) {
                            AbstractC3066u3.charlie("CaptureSession", "Does not have the proper configured lists");
                            return;
                        } else {
                            AbstractC3066u3.bravo("CaptureSession", "Attempting to submit CaptureRequest after setting");
                            lima(this.foxtrot);
                            break;
                        }
                    case 5:
                    case 6:
                    case 7:
                        throw new IllegalStateException("Session configuration cannot be set on a closed/released session.");
                }
            } finally {
            }
        }
    }
}
