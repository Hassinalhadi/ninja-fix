package av;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import bd.ScheduledExecutorServiceC0750c;
import be.C0758d;
import be.RunnableC0756b;
import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import s6.T7;
import t6.AbstractC3003i;
import t6.AbstractC3066u3;
import t6.AbstractC3071v3;

/* loaded from: classes3.dex */
public final class aw extends as {
    public final ao bravo;
    public final Handler charlie;
    public final bd.h delta;
    public final ScheduledExecutorServiceC0750c echo;
    public ai foxtrot;
    public O7.l golf;
    public V0.k hotel;
    public V0.h india;
    public C0758d juliet;
    public final ScheduledExecutorServiceC0750c oscar;
    public ArrayList quebec;
    public be.k romeo;
    public final W7.a sierra;
    public final ah tango;
    public final Ce.y uniform;
    public final a3.l victor;
    public final Object alpha = new Object();
    public List kilo = null;
    public boolean lima = false;
    public boolean mike = false;
    public boolean november = false;
    public final Object papa = new Object();
    public final AtomicBoolean whiskey = new AtomicBoolean(false);

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, W7.a] */
    public aw(Q3.c cVar, Q3.c cVar2, ao aoVar, bd.h hVar, ScheduledExecutorServiceC0750c scheduledExecutorServiceC0750c, Handler handler) {
        this.bravo = aoVar;
        this.charlie = handler;
        this.delta = hVar;
        this.echo = scheduledExecutorServiceC0750c;
        ?? obj = new Object();
        obj.alpha = cVar2.alpha(TextureViewIsClosedQuirk.class);
        obj.bravo = cVar.alpha(PreviewOrientationIncorrectQuirk.class);
        obj.charlie = cVar.alpha(ConfigureSurfaceToSecondarySessionFailQuirk.class);
        this.sierra = obj;
        this.uniform = new Ce.y(cVar.alpha(CaptureSessionStuckQuirk.class) || cVar.alpha(IncorrectCaptureStateQuirk.class));
        this.tango = new ah(cVar2, 3);
        this.victor = new a3.l(cVar2);
        this.oscar = scheduledExecutorServiceC0750c;
    }

    @Override // av.as
    public final void alpha(aw awVar) {
        Objects.requireNonNull(this.foxtrot);
        this.foxtrot.alpha(awVar);
    }

    @Override // av.as
    public final void bravo(aw awVar) {
        Objects.requireNonNull(this.foxtrot);
        this.foxtrot.bravo(awVar);
    }

    @Override // av.as
    public final void charlie(aw awVar) {
        synchronized (this.papa) {
            this.sierra.bravo(this.quebec);
        }
        lima("onClosed()");
        oscar(awVar);
    }

    @Override // av.as
    public final void delta(aw awVar) {
        aw awVar2;
        Objects.requireNonNull(this.foxtrot);
        quebec();
        this.uniform.charlie();
        ao aoVar = this.bravo;
        Iterator it = aoVar.xray().iterator();
        while (it.hasNext() && (awVar2 = (aw) it.next()) != this) {
            awVar2.quebec();
            awVar2.uniform.charlie();
        }
        synchronized (aoVar.purple) {
            ((LinkedHashSet) aoVar.teal).remove(this);
        }
        this.foxtrot.delta(awVar);
    }

    @Override // av.as
    public final void echo(aw awVar) {
        aw awVar2;
        aw awVar3;
        aw awVar4;
        lima("Session onConfigured()");
        ah ahVar = this.tango;
        ArrayList victor = this.bravo.victor();
        ArrayList uniform = this.bravo.uniform();
        if (((CaptureSessionOnClosedNotCalledQuirk) ahVar.purple) != null) {
            LinkedHashSet<aw> linkedHashSet = new LinkedHashSet();
            Iterator it = victor.iterator();
            while (it.hasNext() && (awVar4 = (aw) it.next()) != awVar) {
                linkedHashSet.add(awVar4);
            }
            for (aw awVar5 : linkedHashSet) {
                awVar5.getClass();
                awVar5.delta(awVar5);
            }
        }
        Objects.requireNonNull(this.foxtrot);
        ao aoVar = this.bravo;
        synchronized (aoVar.purple) {
            ((LinkedHashSet) aoVar.red).add(this);
            ((LinkedHashSet) aoVar.teal).remove(this);
        }
        Iterator it2 = aoVar.xray().iterator();
        while (it2.hasNext() && (awVar3 = (aw) it2.next()) != this) {
            awVar3.quebec();
            awVar3.uniform.charlie();
        }
        this.foxtrot.echo(awVar);
        if (((CaptureSessionOnClosedNotCalledQuirk) ahVar.purple) != null) {
            LinkedHashSet<aw> linkedHashSet2 = new LinkedHashSet();
            Iterator it3 = uniform.iterator();
            while (it3.hasNext() && (awVar2 = (aw) it3.next()) != awVar) {
                linkedHashSet2.add(awVar2);
            }
            for (aw awVar6 : linkedHashSet2) {
                awVar6.getClass();
                awVar6.charlie(awVar6);
            }
        }
    }

    @Override // av.as
    public final void foxtrot(aw awVar) {
        Objects.requireNonNull(this.foxtrot);
        this.foxtrot.foxtrot(awVar);
    }

    @Override // av.as
    public final void golf(aw awVar) {
        V0.k kVar;
        synchronized (this.alpha) {
            try {
                if (!this.november) {
                    this.november = true;
                    T7.foxtrot(this.hotel, "Need to call openCaptureSession before using this API.");
                    kVar = this.hotel;
                } else {
                    kVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (kVar != null) {
            kVar.purple.foxtrot(new at(this, awVar, 0), tg.k.bravo());
        }
    }

    @Override // av.as
    public final void hotel(aw awVar, Surface surface) {
        Objects.requireNonNull(this.foxtrot);
        this.foxtrot.hotel(awVar, surface);
    }

    public final int india(ArrayList arrayList, androidx.camera.camera2.internal.compat.e eVar) {
        CameraCaptureSession.CaptureCallback alpha = this.uniform.alpha(eVar);
        T7.foxtrot(this.golf, "Need to call openCaptureSession before using this API.");
        return ((J2.l) this.golf.purple).golf(arrayList, this.delta, alpha);
    }

    public final void juliet() {
        if (!this.whiskey.compareAndSet(false, true)) {
            lima("close() has been called. Skip this invocation.");
            return;
        }
        if (this.victor.alpha) {
            try {
                lima("Call abortCaptures() before closing session.");
                T7.foxtrot(this.golf, "Need to call openCaptureSession before using this API.");
                ((CameraCaptureSession) ((J2.l) this.golf.purple).alpha).abortCaptures();
            } catch (Exception e) {
                lima("Exception when calling abortCaptures()" + e);
            }
        }
        lima("Session call close()");
        this.uniform.bravo().foxtrot(new au(this, 1), this.delta);
    }

    public final void kilo(CameraCaptureSession cameraCaptureSession) {
        if (this.golf == null) {
            this.golf = new O7.l(cameraCaptureSession, this.charlie);
        }
    }

    public final void lima(String str) {
        AbstractC3066u3.bravo("SyncCaptureSessionImpl", Constants.AES_PREFIX + this + "] " + str);
    }

    public final void mike(List list) {
        synchronized (this.alpha) {
            quebec();
            if (!list.isEmpty()) {
                int i4 = 0;
                do {
                    try {
                        ((androidx.camera.core.impl.ah) list.get(i4)).delta();
                        i4++;
                    } catch (DeferrableSurface$SurfaceClosedException e) {
                        for (int i5 = i4 - 1; i5 >= 0; i5--) {
                            ((androidx.camera.core.impl.ah) list.get(i5)).bravo();
                        }
                        throw e;
                    }
                } while (i4 < list.size());
            }
            this.kilo = list;
        }
    }

    public final boolean november() {
        boolean z2;
        synchronized (this.alpha) {
            if (this.hotel != null) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        return z2;
    }

    public final void oscar(aw awVar) {
        V0.k kVar;
        synchronized (this.alpha) {
            try {
                if (!this.lima) {
                    this.lima = true;
                    T7.foxtrot(this.hotel, "Need to call openCaptureSession before using this API.");
                    kVar = this.hotel;
                } else {
                    kVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        quebec();
        this.uniform.charlie();
        if (kVar != null) {
            kVar.purple.foxtrot(new at(this, awVar, 1), tg.k.bravo());
        }
    }

    public final com.google.common.util.concurrent.e papa(CameraDevice cameraDevice, aw.v vVar, List list) {
        com.google.common.util.concurrent.e delta;
        synchronized (this.papa) {
            try {
                ArrayList uniform = this.bravo.uniform();
                ArrayList arrayList = new ArrayList();
                Iterator it = uniform.iterator();
                while (it.hasNext()) {
                    aw awVar = (aw) it.next();
                    arrayList.add(AbstractC3003i.alpha(new F8.h(awVar.uniform.bravo(), awVar.oscar, 1500L)));
                }
                be.k kVar = new be.k(new ArrayList(arrayList), false, tg.k.bravo());
                this.romeo = kVar;
                C0758d alpha = C0758d.alpha(kVar);
                av avVar = new av(this, cameraDevice, vVar, list);
                bd.h hVar = this.delta;
                alpha.getClass();
                delta = be.h.delta(be.h.foxtrot(alpha, avVar, hVar));
            } catch (Throwable th) {
                throw th;
            }
        }
        return delta;
    }

    public final void quebec() {
        synchronized (this.alpha) {
            try {
                List list = this.kilo;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((androidx.camera.core.impl.ah) it.next()).bravo();
                    }
                    this.kilo = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int romeo(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        CameraCaptureSession.CaptureCallback alpha = this.uniform.alpha(captureCallback);
        T7.foxtrot(this.golf, "Need to call openCaptureSession before using this API.");
        return ((J2.l) this.golf.purple).papa(captureRequest, this.delta, alpha);
    }

    public final com.google.common.util.concurrent.e sierra(ArrayList arrayList) {
        com.google.common.util.concurrent.e tango;
        synchronized (this.papa) {
            this.quebec = arrayList;
            tango = tango(arrayList);
        }
        return tango;
    }

    public final com.google.common.util.concurrent.e tango(ArrayList arrayList) {
        synchronized (this.alpha) {
            try {
                if (this.mike) {
                    return new be.j(1, new CancellationException("Opener is disabled"));
                }
                C0758d alpha = C0758d.alpha(AbstractC3071v3.bravo(arrayList, this.delta, this.echo));
                A2.ao aoVar = new A2.ao(16, this, arrayList);
                bd.h hVar = this.delta;
                alpha.getClass();
                RunnableC0756b foxtrot = be.h.foxtrot(alpha, aoVar, hVar);
                this.juliet = foxtrot;
                return be.h.delta(foxtrot);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean uniform() {
        boolean victor;
        synchronized (this.papa) {
            try {
                if (november()) {
                    this.sierra.bravo(this.quebec);
                } else {
                    be.k kVar = this.romeo;
                    if (kVar != null) {
                        kVar.cancel(true);
                    }
                }
                victor = victor();
            } catch (Throwable th) {
                throw th;
            }
        }
        return victor;
    }

    public final boolean victor() {
        boolean z2;
        C0758d c0758d = null;
        try {
            synchronized (this.alpha) {
                try {
                    if (!this.mike) {
                        C0758d c0758d2 = this.juliet;
                        if (c0758d2 != null) {
                            c0758d = c0758d2;
                        }
                        this.mike = true;
                    }
                    z2 = !november();
                } finally {
                }
            }
            return z2;
        } finally {
            if (c0758d != null) {
                c0758d.cancel(true);
            }
        }
    }

    public final O7.l whiskey() {
        this.golf.getClass();
        return this.golf;
    }
}
