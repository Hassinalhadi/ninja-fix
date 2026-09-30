package androidx.camera.core.impl;

import a7.C0409d;
import a7.C0412g;
import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;
import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.widget.EditText;
import ba.C0742c;
import bb.C0746d;
import com.clevertap.android.sdk.variables.CTVariables;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import f1.AbstractC1685e;
import f1.C1684d;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.ScheduledFuture;
import s6.T7;

/* loaded from: classes3.dex */
public final /* synthetic */ class ai implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ ai(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    private final void alpha() {
        B9.ab abVar = (B9.ab) this.purple;
        synchronized (((ArrayDeque) abVar.silver)) {
            SharedPreferences.Editor edit = ((SharedPreferences) abVar.purple).edit();
            String str = (String) abVar.white;
            StringBuilder sb2 = new StringBuilder();
            Iterator it = ((ArrayDeque) abVar.silver).iterator();
            while (it.hasNext()) {
                sb2.append((String) it.next());
                sb2.append((String) abVar.red);
            }
            edit.putString(str, sb2.toString()).commit();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2;
        boolean z10;
        Object obj;
        boolean z11;
        int i4 = 18;
        switch (this.alpha) {
            case 0:
                ((V0.k) this.purple).cancel(true);
                return;
            case 1:
                androidx.lifecycle.G g2 = (androidx.lifecycle.G) this.purple;
                int i5 = g2.purple;
                androidx.lifecycle.an anVar = g2.white;
                if (i5 == 0) {
                    g2.red = true;
                    anVar.foxtrot(androidx.lifecycle.aa.ON_PAUSE);
                }
                if (g2.alpha == 0 && g2.red) {
                    anVar.foxtrot(androidx.lifecycle.aa.ON_STOP);
                    g2.silver = true;
                    return;
                }
                return;
            case 2:
                av.s sVar = (av.s) this.purple;
                sVar.f3272n = false;
                sVar.f3271m = false;
                sVar.uniform("OpenCameraConfigAndClose is done, state: ".concat(av.q.november(sVar.A)), null);
                int mike = av.q.mike(sVar.A);
                if (mike != 1 && mike != 4) {
                    if (mike != 6) {
                        sVar.uniform("OpenCameraConfigAndClose finished while in state: ".concat(av.q.november(sVar.A)), null);
                        return;
                    }
                    int i10 = sVar.f3263d;
                    if (i10 != 0) {
                        sVar.uniform("OpenCameraConfigAndClose in error: ".concat(av.s.whiskey(i10)), null);
                        sVar.f3260a.bravo();
                        return;
                    } else {
                        sVar.fuchsia(false);
                        return;
                    }
                }
                T7.golf(null, sVar.f3264f.isEmpty());
                sVar.victor();
                return;
            case 3:
                ((CameraDevice) this.purple).close();
                return;
            case 4:
                O6.e eVar = (O6.e) this.purple;
                if (!eVar.purple) {
                    if (((av.r) eVar.silver).foxtrot.A != 7 && ((av.r) eVar.silver).foxtrot.A != 6) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    T7.golf(null, z2);
                    if (((av.r) eVar.silver).charlie()) {
                        ((av.r) eVar.silver).foxtrot.emerald(true);
                        return;
                    } else {
                        ((av.r) eVar.silver).foxtrot.fuchsia(true);
                        return;
                    }
                }
                return;
            case 5:
                av.aj ajVar = (av.aj) this.purple;
                synchronized (ajVar.alpha) {
                    if (!ajVar.bravo.isEmpty()) {
                        try {
                            ajVar.juliet(ajVar.bravo);
                            return;
                        } finally {
                            ajVar.bravo.clear();
                        }
                    }
                    return;
                }
            case 6:
                for (av.aw awVar : (LinkedHashSet) this.purple) {
                    awVar.getClass();
                    awVar.charlie(awVar);
                }
                return;
            case 7:
                C0742c c0742c = (C0742c) this.purple;
                V0.h hVar = c0742c.golf;
                if (hVar != null) {
                    hVar.bravo(null);
                    c0742c.golf = null;
                    return;
                }
                return;
            case 8:
                ((w.o) ((androidx.camera.core.au) this.purple).bravo).getClass();
                return;
            case 9:
                ((C0746d) this.purple).bravo();
                return;
            case 10:
                ((ScheduledFuture) this.purple).cancel(true);
                return;
            case 11:
                ((V0.h) this.purple).bravo(null);
                return;
            case 12:
                ((bj.l) this.purple).close();
                return;
            case 13:
                bj.c cVar = (bj.c) this.purple;
                cVar.juliet = true;
                cVar.delta();
                return;
            case 14:
                ((androidx.camera.core.J) this.purple).alpha();
                return;
            case 15:
                ((ah) this.purple).bravo();
                return;
            case 16:
                bj.n nVar = (bj.n) ((J2.t) this.purple).red;
                if (nVar != null) {
                    Iterator it = nVar.values().iterator();
                    while (it.hasNext()) {
                        ((bj.k) it.next()).bravo();
                    }
                    return;
                }
                return;
            case 17:
                bk.e eVar2 = (bk.e) this.purple;
                eVar2.foxtrot = true;
                eVar2.delta();
                return;
            case 18:
                bj.n nVar2 = (bj.n) ((B9.ab) this.purple).silver;
                if (nVar2 != null) {
                    Iterator it2 = nVar2.values().iterator();
                    while (it2.hasNext()) {
                        ((bj.k) it2.next()).bravo();
                    }
                    return;
                }
                return;
            case 19:
                ((A2.p) this.purple).bravo();
                return;
            case 20:
                ((CTVariables) this.purple).lambda$new$0();
                return;
            case 21:
                MaterialButton.alpha((MaterialButton) this.purple);
                return;
            case 22:
                EditText editText = (EditText) this.purple;
                editText.requestFocus();
                editText.post(new com.google.android.material.internal.aa(0, editText));
                return;
            case 23:
                C0412g c0412g = (C0412g) this.purple;
                C0409d c0409d = c0412g.alpha;
                if (c0409d != null) {
                    c0409d.bravo(c0412g.bravo, c0412g.charlie, true);
                    return;
                }
                return;
            case 24:
                ((com.google.android.material.textfield.c) this.purple).tango(true);
                return;
            case 25:
                com.google.android.material.textfield.i iVar = (com.google.android.material.textfield.i) this.purple;
                boolean isPopupShowing = iVar.hotel.isPopupShowing();
                iVar.tango(isPopupShowing);
                iVar.mike = isPopupShowing;
                return;
            case 26:
                ((TextInputLayout) this.purple).teal.requestLayout();
                return;
            case 27:
                alpha();
                return;
            case 28:
                StringBuilder sb2 = new StringBuilder("Service took too long to process intent: ");
                com.google.firebase.messaging.z zVar = (com.google.firebase.messaging.z) this.purple;
                sb2.append(zVar.alpha.getAction());
                sb2.append(" finishing.");
                Log.w("FirebaseMessaging", sb2.toString());
                zVar.bravo.delta(null);
                return;
            default:
                Activity activity = (Activity) this.purple;
                if (!activity.isFinishing()) {
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 >= 28) {
                        Class cls = AbstractC1685e.alpha;
                        activity.recreate();
                        return;
                    }
                    Class cls2 = AbstractC1685e.alpha;
                    if (i11 != 26 && i11 != 27) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    Method method = AbstractC1685e.foxtrot;
                    if ((!z10 || method != null) && (AbstractC1685e.echo != null || AbstractC1685e.delta != null)) {
                        try {
                            Object obj2 = AbstractC1685e.charlie.get(activity);
                            if (obj2 != null && (obj = AbstractC1685e.bravo.get(activity)) != null) {
                                Application application = activity.getApplication();
                                C1684d c1684d = new C1684d(activity);
                                application.registerActivityLifecycleCallbacks(c1684d);
                                Handler handler = AbstractC1685e.golf;
                                handler.post(new com.google.common.util.concurrent.d(14, c1684d, obj2));
                                if (i11 != 26 && i11 != 27) {
                                    z11 = false;
                                } else {
                                    z11 = true;
                                }
                                try {
                                    if (z11) {
                                        Boolean bool = Boolean.FALSE;
                                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                    } else {
                                        activity.recreate();
                                    }
                                    handler.post(new s6.E(i4, application, c1684d));
                                    return;
                                } catch (Throwable th) {
                                    handler.post(new s6.E(i4, application, c1684d));
                                    throw th;
                                }
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    activity.recreate();
                    return;
                }
                return;
        }
    }
}
