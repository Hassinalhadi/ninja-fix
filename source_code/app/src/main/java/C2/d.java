package C2;

import A8.g;
import Aa.m;
import B2.l;
import C3.f;
import E3.i;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.internal.measurement.C1383v0;
import com.google.android.gms.measurement.internal.G;
import com.google.android.gms.measurement.internal.Z0;
import com.google.android.gms.measurement.internal.ac;
import com.google.android.gms.measurement.internal.ax;
import id.C1915c;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import w.o;

/* loaded from: classes3.dex */
public final class d implements H3.a {
    public long alpha;
    public Object purple;
    public Object red;
    public Object silver;
    public Object teal;

    public /* synthetic */ d(Z0 z02) {
        this.teal = z02;
    }

    public void alpha(l token) {
        Runnable runnable;
        Intrinsics.echo(token, "token");
        synchronized (this.silver) {
            runnable = (Runnable) ((LinkedHashMap) this.teal).remove(token);
        }
        if (runnable != null) {
            ((B2.b) this.purple).alpha.removeCallbacks(runnable);
        }
    }

    public synchronized f bravo() {
        try {
            if (((f) this.teal) == null) {
                this.teal = f.uniform((File) this.red, this.alpha);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (f) this.teal;
    }

    public void charlie(l token) {
        Intrinsics.echo(token, "token");
        g gVar = new g(2, this, token);
        synchronized (this.silver) {
        }
        B2.b bVar = (B2.b) this.purple;
        bVar.alpha.postDelayed(gVar, this.alpha);
    }

    @Override // H3.a
    public File delta(E3.f fVar) {
        String tango = ((J2.c) this.purple).tango(fVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + tango + " for for Key: " + fVar);
        }
        try {
            m papa = bravo().papa(tango);
            if (papa != null) {
                return ((File[]) papa.purple)[0];
            }
            return null;
        } catch (IOException e) {
            if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
                return null;
            }
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007e, code lost:
    
        if (r2 < java.lang.Math.max(0, ((java.lang.Integer) com.google.android.gms.measurement.internal.ac.juliet.alpha(null)).intValue())) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0097, code lost:
    
        if (r2 >= java.lang.Math.max(0, ((java.lang.Integer) com.google.android.gms.measurement.internal.ac.juliet.alpha(null)).intValue())) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean echo(long j5, C1383v0 c1383v0) {
        if (((ArrayList) this.silver) == null) {
            this.silver = new ArrayList();
        }
        if (((ArrayList) this.red) == null) {
            this.red = new ArrayList();
        }
        if (((ArrayList) this.silver).isEmpty() || ((((C1383v0) ((ArrayList) this.silver).get(0)).quebec() / 1000) / 60) / 60 == ((c1383v0.quebec() / 1000) / 60) / 60) {
            long delta = this.alpha + c1383v0.delta();
            Z0 z02 = (Z0) this.teal;
            if (z02.white().j0(null, ac.f7603j0)) {
                if (!((ArrayList) this.silver).isEmpty()) {
                    z02.white();
                }
                this.alpha = delta;
                ((ArrayList) this.silver).add(c1383v0);
                ((ArrayList) this.red).add(Long.valueOf(j5));
                int size = ((ArrayList) this.silver).size();
                z02.white();
                if (size < Math.max(1, ((Integer) ac.kilo.alpha(null)).intValue())) {
                    return true;
                }
            } else {
                z02.white();
            }
        }
        return false;
    }

    public void foxtrot() {
        ax axVar = (ax) this.teal;
        axVar.W();
        ((G) axVar.alpha).f7511g.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = axVar.b0().edit();
        edit.remove((String) this.red);
        edit.remove((String) this.silver);
        edit.putLong((String) this.purple, currentTimeMillis);
        edit.apply();
    }

    @Override // H3.a
    public void hotel(E3.f fVar, C1915c c1915c) {
        H3.b bVar;
        f bravo;
        boolean z2;
        String tango = ((J2.c) this.purple).tango(fVar);
        o oVar = (o) this.silver;
        synchronized (oVar) {
            try {
                bVar = (H3.b) ((HashMap) oVar.purple).get(tango);
                if (bVar == null) {
                    bVar = ((D8.c) oVar.red).india();
                    ((HashMap) oVar.purple).put(tango, bVar);
                }
                bVar.bravo++;
            } finally {
            }
        }
        bVar.alpha.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + tango + " for for Key: " + fVar);
            }
            try {
                bravo = bravo();
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            }
            if (bravo.papa(tango) != null) {
                return;
            }
            C3.d golf = bravo.golf(tango);
            if (golf != null) {
                try {
                    if (((E3.c) c1915c.purple).azure(c1915c.red, golf.echo(), (i) c1915c.silver)) {
                        f.charlie((f) golf.silver, golf, true);
                        golf.alpha = true;
                    }
                    if (!z2) {
                        try {
                            golf.bravo();
                        } catch (IOException unused) {
                        }
                    }
                    return;
                } finally {
                    if (!golf.alpha) {
                        try {
                            golf.bravo();
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            throw new IllegalStateException("Had two simultaneous puts for: ".concat(tango));
        } finally {
            ((o) this.silver).yankee(tango);
        }
    }
}
