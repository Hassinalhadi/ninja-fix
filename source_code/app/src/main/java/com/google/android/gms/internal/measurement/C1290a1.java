package com.google.android.gms.internal.measurement;

import F.C0092c;
import af.C0439j;
import af.C0440k;
import android.content.Context;
import android.database.ContentObserver;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Binder;
import android.os.UserManager;
import android.text.TextUtils;
import android.util.Log;
import g1.AbstractC1735d;
import gf.InterfaceC1788c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import pe.InterfaceC2326b;
import pe.InterfaceC2332h;
import s6.T7;
import t6.AbstractC3017k3;
import t6.AbstractC3066u3;
import xf.EnumC3340a;
import y.C3344D;
import y.InterfaceC3386z;

/* renamed from: com.google.android.gms.internal.measurement.a1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1290a1 implements InterfaceC1788c {
    public static C1290a1 delta;
    public boolean alpha;
    public Object bravo;
    public final Object charlie;

    public C1290a1() {
        this.alpha = false;
        this.bravo = null;
        this.charlie = null;
    }

    public static boolean charlie(androidx.camera.core.t tVar, androidx.camera.core.t tVar2) {
        T7.golf("Fully specified range is not actually fully specified.", tVar2.bravo());
        int i4 = tVar.alpha;
        int i5 = tVar2.alpha;
        if (i4 != 2 || i5 != 1) {
            if (i4 == 2 || i4 == 0 || i4 == i5) {
                int i10 = tVar.bravo;
                if (i10 == 0 || i10 == tVar2.bravo) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static boolean delta(androidx.camera.core.t tVar, androidx.camera.core.t tVar2, HashSet hashSet) {
        if (!hashSet.contains(tVar2)) {
            AbstractC3066u3.bravo("DynamicRangeResolver", "Candidate Dynamic range is not within constraints.\nDynamic range to resolve:\n  " + tVar + "\nCandidate dynamic range:\n  " + tVar2);
            return false;
        }
        return charlie(tVar, tVar2);
    }

    public static androidx.camera.core.t foxtrot(androidx.camera.core.t tVar, LinkedHashSet linkedHashSet, HashSet hashSet) {
        if (tVar.alpha != 1) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                androidx.camera.core.t tVar2 = (androidx.camera.core.t) it.next();
                T7.foxtrot(tVar2, "Fully specified DynamicRange cannot be null.");
                T7.golf("Fully specified DynamicRange must have fully defined encoding.", tVar2.bravo());
                if (tVar2.alpha != 1 && delta(tVar, tVar2, hashSet)) {
                    return tVar2;
                }
            }
            return null;
        }
        return null;
    }

    public static void hotel(HashSet hashSet, androidx.camera.core.t tVar, androidx.core.widget.f fVar) {
        T7.golf("Cannot update already-empty constraints.", !hashSet.isEmpty());
        Set charlie = ((aw.c) fVar.purple).charlie(tVar);
        if (!charlie.isEmpty()) {
            HashSet hashSet2 = new HashSet(hashSet);
            hashSet.retainAll(charlie);
            if (hashSet.isEmpty()) {
                throw new IllegalArgumentException("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  " + tVar + "\nConstraints:\n  " + TextUtils.join("\n  ", charlie) + "\nExisting constraints:\n  " + TextUtils.join("\n  ", hashSet2));
            }
        }
    }

    public static C1290a1 juliet(Context context) {
        C1290a1 c1290a1;
        C1290a1 c1290a12;
        synchronized (C1290a1.class) {
            try {
                if (delta == null) {
                    if (AbstractC1735d.bravo(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                        c1290a12 = new C1290a1(context);
                    } else {
                        c1290a12 = new C1290a1();
                    }
                    delta = c1290a12;
                }
                C1290a1 c1290a13 = delta;
                if (c1290a13 != null && ((Z0) c1290a13.charlie) != null && !c1290a13.alpha) {
                    try {
                        context.getContentResolver().registerContentObserver(S0.alpha, true, (Z0) delta.charlie);
                        C1290a1 c1290a14 = delta;
                        c1290a14.getClass();
                        c1290a14.alpha = true;
                    } catch (SecurityException e) {
                        Log.e("GservicesLoader", "Unable to register Gservices content observer", e);
                    }
                }
                c1290a1 = delta;
                c1290a1.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1290a1;
    }

    public static synchronized void lima() {
        Context context;
        synchronized (C1290a1.class) {
            try {
                C1290a1 c1290a1 = delta;
                if (c1290a1 != null && (context = (Context) c1290a1.bravo) != null && ((Z0) c1290a1.charlie) != null && c1290a1.alpha) {
                    context.getContentResolver().unregisterContentObserver((Z0) delta.charlie);
                }
                delta = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // gf.InterfaceC1788c
    public boolean alpha(kotlin.reflect.jvm.internal.impl.types.ap c12, kotlin.reflect.jvm.internal.impl.types.ap c22) {
        InterfaceC2326b a6 = (InterfaceC2326b) this.bravo;
        Intrinsics.echo(a6, "$a");
        InterfaceC2326b b2 = (InterfaceC2326b) this.charlie;
        Intrinsics.echo(b2, "$b");
        Intrinsics.echo(c12, "c1");
        Intrinsics.echo(c22, "c2");
        if (Intrinsics.areEqual(c12, c22)) {
            return true;
        }
        InterfaceC2332h kilo = c12.kilo();
        InterfaceC2332h kilo2 = c22.kilo();
        if ((kilo instanceof pe.aq) && (kilo2 instanceof pe.aq)) {
            return Qe.c.alpha.delta((pe.aq) kilo, (pe.aq) kilo2, this.alpha, new C0092c(4, a6, b2));
        }
        return false;
    }

    public boolean bravo(long j5) {
        Object obj;
        ArrayList arrayList = (ArrayList) ((com.google.android.play.core.integrity.c) this.charlie).purple;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 < size) {
                obj = arrayList.get(i4);
                if (m0.q.delta(((m0.t) obj).alpha, j5)) {
                    break;
                }
                i4++;
            } else {
                obj = null;
                break;
            }
        }
        m0.t tVar = (m0.t) obj;
        if (tVar == null) {
            return false;
        }
        return tVar.hotel;
    }

    public void echo() {
        ((xf.e) this.bravo).juliet(new CancellationException("onBack cancelled"), true);
        ((vf.Y) this.charlie).foxtrot(null);
    }

    public void golf() {
        if (this.alpha) {
            C3344D.alpha((C3344D) this.charlie, (D0.am) this.bravo);
        }
    }

    public long india(I0.aa aaVar, long j5, boolean z2, InterfaceC3386z interfaceC3386z) {
        n.am amVar;
        long echo = C3344D.echo((C3344D) this.charlie, aaVar, j5, z2, false, interfaceC3386z, false);
        if (!D0.am.alpha(echo, (D0.am) this.bravo)) {
            this.alpha = false;
        }
        if (D0.am.charlie(echo)) {
            amVar = n.am.red;
        } else {
            amVar = n.am.purple;
        }
        ((C3344D) this.charlie).romeo(amVar);
        return echo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0045, code lost:
    
        if (r5.isUserRunning(android.os.Process.myUserHandle()) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0047, code lost:
    
        r6 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String kilo(String str) {
        Object bravo;
        int i4;
        boolean z2;
        boolean isUserUnlocked;
        Context context = (Context) this.bravo;
        if (context != null) {
            if (V0.alpha()) {
                boolean z10 = true;
                if (!V0.bravo) {
                    synchronized (V0.class) {
                        try {
                            if (!V0.bravo) {
                                i4 = 1;
                                while (true) {
                                    z2 = false;
                                    if (i4 <= 2) {
                                        if (V0.alpha == null) {
                                            V0.alpha = (UserManager) context.getSystemService(UserManager.class);
                                        }
                                        UserManager userManager = V0.alpha;
                                        if (userManager != null) {
                                            isUserUnlocked = userManager.isUserUnlocked();
                                            if (isUserUnlocked) {
                                                break;
                                            }
                                        } else {
                                            z2 = true;
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                                if (z2) {
                                    V0.alpha = null;
                                }
                                if (z2) {
                                    V0.bravo = true;
                                }
                                z10 = z2;
                            }
                        } catch (NullPointerException e) {
                            Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e);
                            V0.alpha = null;
                            i4++;
                        } finally {
                        }
                    }
                }
                if (!z10) {
                }
            }
            try {
                try {
                    C1378u c1378u = new C1378u(this, str);
                    try {
                        bravo = c1378u.bravo();
                    } catch (SecurityException unused) {
                        long clearCallingIdentity = Binder.clearCallingIdentity();
                        try {
                            bravo = c1378u.bravo();
                        } finally {
                            Binder.restoreCallingIdentity(clearCallingIdentity);
                        }
                    }
                    return (String) bravo;
                } catch (SecurityException e4) {
                    e = e4;
                    Log.e("GservicesLoader", "Unable to read GServices for: ".concat(str), e);
                    return null;
                }
            } catch (IllegalStateException e5) {
                e = e5;
                Log.e("GservicesLoader", "Unable to read GServices for: ".concat(str), e);
                return null;
            } catch (NullPointerException e10) {
                e = e10;
                Log.e("GservicesLoader", "Unable to read GServices for: ".concat(str), e);
                return null;
            }
        }
        return null;
    }

    public C1290a1(InterfaceC2326b interfaceC2326b, InterfaceC2326b interfaceC2326b2, boolean z2) {
        this.alpha = z2;
        this.bravo = interfaceC2326b;
        this.charlie = interfaceC2326b2;
    }

    public C1290a1(Context context) {
        this.alpha = false;
        this.bravo = context;
        this.charlie = new ContentObserver(null);
    }

    public C1290a1(bv.u uVar, com.google.android.play.core.integrity.c cVar) {
        this.bravo = uVar;
        this.charlie = cVar;
    }

    public C1290a1(androidx.camera.camera2.internal.compat.j jVar) {
        this.bravo = jVar;
        this.charlie = androidx.core.widget.f.azure(jVar);
        int[] iArr = (int[]) jVar.alpha(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        boolean z2 = false;
        if (iArr != null) {
            int length = iArr.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    break;
                }
                if (iArr[i4] == 18) {
                    z2 = true;
                    break;
                }
                i4++;
            }
        }
        this.alpha = z2;
    }

    public C1290a1(vf.ab abVar, boolean z2, Xd.l lVar, C0440k c0440k) {
        this.alpha = z2;
        this.bravo = AbstractC3017k3.bravo(-2, 4, EnumC3340a.alpha);
        this.charlie = vf.ad.zulu(abVar, null, null, new C0439j(c0440k, lVar, this, null), 3);
    }

    public C1290a1(C3344D c3344d) {
        this.charlie = c3344d;
        this.alpha = true;
    }
}
