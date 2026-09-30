package bo;

import B9.ab;
import O7.l;
import V0.k;
import android.content.Context;
import android.os.Trace;
import androidx.camera.core.C0533o;
import androidx.camera.core.InterfaceC0532n;
import androidx.camera.core.O;
import androidx.camera.core.impl.AbstractC0521t;
import androidx.camera.core.impl.C0506d;
import androidx.camera.core.impl.InterfaceC0523v;
import androidx.camera.core.impl.InterfaceC0525x;
import androidx.camera.core.impl.J;
import androidx.camera.core.impl.aj;
import androidx.camera.core.q;
import androidx.lifecycle.al;
import av.i;
import av.z;
import bf.C0761a;
import bf.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import t6.P2;
import t6.j4;

/* loaded from: classes3.dex */
public final class e {
    public static final e golf = new e();
    public k bravo;
    public q delta;
    public Context echo;
    public final Object alpha = new Object();
    public final ab charlie = new ab();
    public final HashMap foxtrot = new HashMap();

    public static final l alpha(e eVar, C0533o c0533o) {
        eVar.getClass();
        Iterator it = c0533o.alpha.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.delta(next, "cameraSelector.cameraFilterSet");
            C0506d c0506d = InterfaceC0532n.alpha;
            if (!Intrinsics.areEqual(c0506d, c0506d)) {
                synchronized (aj.alpha) {
                }
                Intrinsics.checkNotNull(eVar.echo);
            }
        }
        return AbstractC0521t.alpha;
    }

    public static final void bravo(e eVar, int i4) {
        int i5;
        boolean z2;
        q qVar = eVar.delta;
        if (qVar == null) {
            return;
        }
        Intrinsics.checkNotNull(qVar);
        i iVar = qVar.foxtrot;
        if (iVar != null) {
            Be.e eVar2 = iVar.bravo;
            if (i4 != eVar2.alpha) {
                Iterator it = ((ArrayList) eVar2.bravo).iterator();
                while (it.hasNext()) {
                    androidx.camera.core.impl.ab abVar = (androidx.camera.core.impl.ab) it.next();
                    int i10 = eVar2.alpha;
                    synchronized (abVar.bravo) {
                        boolean z10 = true;
                        if (i4 == 2) {
                            i5 = 2;
                        } else {
                            i5 = 1;
                        }
                        abVar.charlie = i5;
                        if (i10 != 2 && i4 == 2) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (i10 != 2 || i4 == 2) {
                            z10 = false;
                        }
                        if (z2 || z10) {
                            abVar.bravo();
                        }
                    }
                }
            }
            if (eVar2.alpha == 2 && i4 != 2) {
                ((ArrayList) eVar2.delta).clear();
            }
            eVar2.alpha = i4;
            return;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public final b charlie(al lifecycleOwner, C0533o cameraSelector, O... oArr) {
        int i4;
        Intrinsics.echo(lifecycleOwner, "lifecycleOwner");
        Intrinsics.echo(cameraSelector, "cameraSelector");
        Trace.beginSection(P2.foxtrot("CX:bindToLifecycle"));
        try {
            q qVar = this.delta;
            if (qVar == null) {
                i4 = 0;
            } else {
                Intrinsics.checkNotNull(qVar);
                i iVar = qVar.foxtrot;
                if (iVar != null) {
                    i4 = iVar.bravo.alpha;
                } else {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
            }
            if (i4 != 2) {
                bravo(this, 1);
                return delta(lifecycleOwner, cameraSelector, CollectionsKt.emptyList(), (O[]) Arrays.copyOf(oArr, oArr.length));
            }
            throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first");
        } finally {
            Trace.endSection();
        }
    }

    public final b delta(al lifecycleOwner, C0533o primaryCameraSelector, List effects, O... useCases) {
        b bVar;
        Intrinsics.echo(lifecycleOwner, "lifecycleOwner");
        Intrinsics.echo(primaryCameraSelector, "primaryCameraSelector");
        Intrinsics.echo(effects, "effects");
        Intrinsics.echo(useCases, "useCases");
        Trace.beginSection(P2.foxtrot("CX:bindToLifecycle-internal"));
        try {
            j4.alpha();
            q qVar = this.delta;
            Intrinsics.checkNotNull(qVar);
            InterfaceC0525x charlie = primaryCameraSelector.charlie(qVar.alpha.india());
            Intrinsics.delta(charlie, "primaryCameraSelector.se…cameraRepository.cameras)");
            charlie.november(true);
            J echo = echo(primaryCameraSelector);
            ab abVar = this.charlie;
            C0761a whiskey = f.whiskey(echo, null);
            synchronized (abVar.purple) {
                bVar = (b) ((HashMap) abVar.white).get(new a(lifecycleOwner, whiskey));
            }
            Collection cyan = this.charlie.cyan();
            for (O o5 : ArraysKt.filterNotNull(useCases)) {
                for (Object lifecycleCameras : cyan) {
                    Intrinsics.delta(lifecycleCameras, "lifecycleCameras");
                    b bVar2 = (b) lifecycleCameras;
                    if (bVar2.papa(o5) && !Intrinsics.areEqual(bVar2, bVar)) {
                        throw new IllegalStateException(String.format("Use case %s already bound to a different lifecycle.", Arrays.copyOf(new Object[]{o5}, 1)));
                    }
                }
            }
            if (bVar == null) {
                ab abVar2 = this.charlie;
                q qVar2 = this.delta;
                Intrinsics.checkNotNull(qVar2);
                i iVar = qVar2.foxtrot;
                if (iVar != null) {
                    Be.e eVar = iVar.bravo;
                    q qVar3 = this.delta;
                    Intrinsics.checkNotNull(qVar3);
                    J2.e eVar2 = qVar3.golf;
                    if (eVar2 != null) {
                        q qVar4 = this.delta;
                        Intrinsics.checkNotNull(qVar4);
                        z zVar = qVar4.hotel;
                        if (zVar != null) {
                            bVar = abVar2.amber(lifecycleOwner, new f(charlie, null, echo, null, eVar, eVar2, zVar));
                        } else {
                            throw new IllegalStateException("CameraX not initialized yet.");
                        }
                    } else {
                        throw new IllegalStateException("CameraX not initialized yet.");
                    }
                } else {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
            }
            if (useCases.length == 0) {
                Intrinsics.checkNotNull(bVar);
            } else {
                ab abVar3 = this.charlie;
                Intrinsics.checkNotNull(bVar);
                List listOf = CollectionsKt.listOf(Arrays.copyOf(useCases, useCases.length));
                q qVar5 = this.delta;
                Intrinsics.checkNotNull(qVar5);
                i iVar2 = qVar5.foxtrot;
                if (iVar2 != null) {
                    abVar3.victor(bVar, effects, listOf, iVar2.bravo);
                } else {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
            }
            Trace.endSection();
            return bVar;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final J echo(C0533o cameraSelector) {
        Object obj;
        Intrinsics.echo(cameraSelector, "cameraSelector");
        Trace.beginSection(P2.foxtrot("CX:getCameraInfo"));
        try {
            q qVar = this.delta;
            Intrinsics.checkNotNull(qVar);
            InterfaceC0523v oscar = cameraSelector.charlie(qVar.alpha.india()).oscar();
            Intrinsics.delta(oscar, "cameraSelector.select(mC…meras).cameraInfoInternal");
            l alpha = alpha(this, cameraSelector);
            C0761a c0761a = new C0761a(oscar.bravo(), (C0506d) alpha.purple);
            synchronized (this.alpha) {
                obj = this.foxtrot.get(c0761a);
                if (obj == null) {
                    obj = new J(oscar, alpha);
                    this.foxtrot.put(c0761a, obj);
                }
            }
            return (J) obj;
        } finally {
            Trace.endSection();
        }
    }

    public final void foxtrot() {
        Trace.beginSection(P2.foxtrot("CX:unbindAll"));
        try {
            j4.alpha();
            bravo(this, 0);
            this.charlie.ochre();
        } finally {
            Trace.endSection();
        }
    }
}
