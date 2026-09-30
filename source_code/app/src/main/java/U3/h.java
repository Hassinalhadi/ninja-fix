package U3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import ao.ad;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.engine.k;
import com.bumptech.glide.load.engine.l;
import com.bumptech.glide.load.engine.p;
import com.bumptech.glide.load.engine.w;
import com.clevertap.android.sdk.Constants;
import id.C1915c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import s6.AbstractC2805w6;

/* loaded from: classes3.dex */
public final class h implements c, V3.d {
    public static final boolean black = Log.isLoggable("GlideRequest", 2);
    public final String alpha;
    public boolean amber;
    public final RuntimeException azure;
    public int beige;
    public final Z3.e bravo;
    public final Object charlie;
    public final e delta;
    public final Object echo;
    public final Context foxtrot;
    public final com.bumptech.glide.f golf;
    public final Object hotel;
    public final Class india;
    public final a juliet;
    public final int kilo;
    public final int lima;
    public final com.bumptech.glide.g mike;
    public final V3.e november;
    public final ArrayList oscar;
    public final W3.a papa;
    public final Executor quebec;
    public w romeo;
    public C1915c sierra;
    public long tango;
    public volatile l uniform;
    public Drawable victor;
    public Drawable whiskey;
    public Drawable xray;
    public int yankee;
    public int zulu;

    /* JADX WARN: Type inference failed for: r0v3, types: [Z3.e, java.lang.Object] */
    public h(Context context, com.bumptech.glide.f fVar, Object obj, Object obj2, Class cls, a aVar, int i4, int i5, com.bumptech.glide.g gVar, V3.e eVar, e eVar2, ArrayList arrayList, d dVar, l lVar, W3.a aVar2, Executor executor) {
        String str;
        if (black) {
            str = String.valueOf(hashCode());
        } else {
            str = null;
        }
        this.alpha = str;
        this.bravo = new Object();
        this.charlie = obj;
        this.foxtrot = context;
        this.golf = fVar;
        this.hotel = obj2;
        this.india = cls;
        this.juliet = aVar;
        this.kilo = i4;
        this.lima = i5;
        this.mike = gVar;
        this.november = eVar;
        this.delta = eVar2;
        this.oscar = arrayList;
        this.echo = dVar;
        this.uniform = lVar;
        this.papa = aVar2;
        this.quebec = executor;
        this.beige = 1;
        if (this.azure == null && ((Map) fVar.hotel.purple).containsKey(com.bumptech.glide.d.class)) {
            this.azure = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // U3.c
    public final boolean alpha() {
        boolean z2;
        synchronized (this.charlie) {
            if (this.beige == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        return z2;
    }

    public final void bravo() {
        if (!this.amber) {
            this.bravo.alpha();
            this.november.delta(this);
            C1915c c1915c = this.sierra;
            if (c1915c != null) {
                synchronized (((l) c1915c.silver)) {
                    ((p) c1915c.purple).juliet((h) c1915c.red);
                }
                this.sierra = null;
                return;
            }
            return;
        }
        throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
    }

    public final Drawable charlie() {
        if (this.whiskey == null) {
            a aVar = this.juliet;
            aVar.getClass();
            this.whiskey = null;
            int i4 = aVar.teal;
            if (i4 > 0) {
                Resources.Theme theme = aVar.f2125i;
                Context context = this.foxtrot;
                if (theme == null) {
                    theme = context.getTheme();
                }
                this.whiskey = AbstractC2805w6.alpha(context, context, i4, theme);
            }
        }
        return this.whiskey;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [U3.d, java.lang.Object] */
    @Override // U3.c
    public final void clear() {
        synchronized (this.charlie) {
            try {
                if (!this.amber) {
                    this.bravo.alpha();
                    if (this.beige == 6) {
                        return;
                    }
                    bravo();
                    w wVar = this.romeo;
                    if (wVar != null) {
                        this.romeo = null;
                    } else {
                        wVar = null;
                    }
                    ?? r32 = this.echo;
                    if (r32 == 0 || r32.bravo(this)) {
                        this.november.mike(charlie());
                    }
                    this.beige = 6;
                    if (wVar != null) {
                        this.uniform.getClass();
                        l.golf(wVar);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void delta(String str) {
        StringBuilder beige = ad.beige(str, " this: ");
        beige.append(this.alpha);
        Log.v("GlideRequest", beige.toString());
    }

    @Override // U3.c
    public final boolean echo(c cVar) {
        int i4;
        int i5;
        Object obj;
        Class cls;
        a aVar;
        com.bumptech.glide.g gVar;
        int i10;
        int i11;
        int i12;
        Object obj2;
        Class cls2;
        a aVar2;
        com.bumptech.glide.g gVar2;
        int i13;
        boolean equals;
        boolean hotel;
        if (!(cVar instanceof h)) {
            return false;
        }
        synchronized (this.charlie) {
            try {
                i4 = this.kilo;
                i5 = this.lima;
                obj = this.hotel;
                cls = this.india;
                aVar = this.juliet;
                gVar = this.mike;
                ArrayList arrayList = this.oscar;
                if (arrayList != null) {
                    i10 = arrayList.size();
                } else {
                    i10 = 0;
                }
            } finally {
            }
        }
        h hVar = (h) cVar;
        synchronized (hVar.charlie) {
            try {
                i11 = hVar.kilo;
                i12 = hVar.lima;
                obj2 = hVar.hotel;
                cls2 = hVar.india;
                aVar2 = hVar.juliet;
                gVar2 = hVar.mike;
                ArrayList arrayList2 = hVar.oscar;
                if (arrayList2 != null) {
                    i13 = arrayList2.size();
                } else {
                    i13 = 0;
                }
            } finally {
            }
        }
        if (i4 != i11 || i5 != i12) {
            return false;
        }
        char[] cArr = Y3.l.alpha;
        if (obj == null) {
            if (obj2 == null) {
                equals = true;
            } else {
                equals = false;
            }
        } else {
            equals = obj.equals(obj2);
        }
        if (!equals || !cls.equals(cls2)) {
            return false;
        }
        if (aVar == null) {
            if (aVar2 == null) {
                hotel = true;
            } else {
                hotel = false;
            }
        } else {
            hotel = aVar.hotel(aVar2);
        }
        if (!hotel || gVar != gVar2 || i10 != i13) {
            return false;
        }
        return true;
    }

    @Override // U3.c
    public final boolean foxtrot() {
        boolean z2;
        synchronized (this.charlie) {
            if (this.beige == 6) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        return z2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [U3.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [U3.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [U3.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [U3.d, java.lang.Object] */
    public final void golf(GlideException glideException, int i4) {
        boolean z2;
        Drawable drawable;
        this.bravo.alpha();
        synchronized (this.charlie) {
            try {
                glideException.setOrigin(this.azure);
                int i5 = this.golf.india;
                if (i5 <= i4) {
                    Log.w("Glide", "Load failed for [" + this.hotel + "] with dimensions [" + this.yankee + "x" + this.zulu + Constants.AES_SUFFIX, glideException);
                    if (i5 <= 4) {
                        glideException.logRootCauses("Glide");
                    }
                }
                this.sierra = null;
                this.beige = 5;
                ?? r02 = this.echo;
                if (r02 != 0) {
                    r02.golf(this);
                }
                boolean z10 = true;
                this.amber = true;
                try {
                    ArrayList arrayList = this.oscar;
                    if (arrayList != null) {
                        Iterator it = arrayList.iterator();
                        z2 = false;
                        while (it.hasNext()) {
                            f fVar = (f) it.next();
                            V3.e eVar = this.november;
                            ?? r72 = this.echo;
                            if (r72 != 0) {
                                r72.charlie().alpha();
                            }
                            z2 |= fVar.hotel(glideException, eVar);
                        }
                    } else {
                        z2 = false;
                    }
                    e eVar2 = this.delta;
                    if (eVar2 != null) {
                        V3.e eVar3 = this.november;
                        ?? r62 = this.echo;
                        if (r62 != 0) {
                            r62.charlie().alpha();
                        }
                        eVar2.hotel(glideException, eVar3);
                    }
                    if (!z2) {
                        ?? r92 = this.echo;
                        if (r92 != 0 && !r92.juliet(this)) {
                            z10 = false;
                        }
                        if (this.hotel == null) {
                            if (this.xray == null) {
                                a aVar = this.juliet;
                                aVar.getClass();
                                this.xray = null;
                                int i10 = aVar.f2121d;
                                if (i10 > 0) {
                                    Resources.Theme theme = aVar.f2125i;
                                    Context context = this.foxtrot;
                                    if (theme == null) {
                                        theme = context.getTheme();
                                    }
                                    this.xray = AbstractC2805w6.alpha(context, context, i10, theme);
                                }
                            }
                            drawable = this.xray;
                        } else {
                            drawable = null;
                        }
                        if (drawable == null) {
                            if (this.victor == null) {
                                a aVar2 = this.juliet;
                                aVar2.getClass();
                                this.victor = null;
                                int i11 = aVar2.silver;
                                if (i11 > 0) {
                                    Resources.Theme theme2 = this.juliet.f2125i;
                                    Context context2 = this.foxtrot;
                                    if (theme2 == null) {
                                        theme2 = context2.getTheme();
                                    }
                                    this.victor = AbstractC2805w6.alpha(context2, context2, i11, theme2);
                                }
                            }
                            drawable = this.victor;
                        }
                        if (drawable == null) {
                            drawable = charlie();
                        }
                        this.november.juliet(drawable);
                    }
                } finally {
                    this.amber = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r9v14, types: [U3.d, java.lang.Object] */
    public final void hotel(w wVar, E3.a aVar, boolean z2) {
        Object obj;
        String str;
        this.bravo.alpha();
        w wVar2 = null;
        try {
            synchronized (this.charlie) {
                try {
                    this.sierra = null;
                    if (wVar == null) {
                        golf(new GlideException("Expected to receive a Resource<R> with an object of " + this.india + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj2 = wVar.get();
                    try {
                        if (obj2 != null && this.india.isAssignableFrom(obj2.getClass())) {
                            ?? r92 = this.echo;
                            if (r92 != 0 && !r92.hotel(this)) {
                                this.romeo = null;
                                this.beige = 4;
                                this.uniform.getClass();
                                l.golf(wVar);
                            }
                            juliet(wVar, obj2, aVar);
                            return;
                        }
                        this.romeo = null;
                        StringBuilder sb2 = new StringBuilder("Expected to receive an object of ");
                        sb2.append(this.india);
                        sb2.append(" but instead got ");
                        if (obj2 != null) {
                            obj = obj2.getClass();
                        } else {
                            obj = "";
                        }
                        sb2.append(obj);
                        sb2.append("{");
                        sb2.append(obj2);
                        sb2.append("} inside Resource{");
                        sb2.append(wVar);
                        sb2.append("}.");
                        if (obj2 != null) {
                            str = "";
                        } else {
                            str = " To indicate failure return a null Resource object, rather than a Resource object containing null data.";
                        }
                        sb2.append(str);
                        golf(new GlideException(sb2.toString()), 5);
                        this.uniform.getClass();
                        l.golf(wVar);
                    } catch (Throwable th) {
                        wVar2 = wVar;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (wVar2 != null) {
                this.uniform.getClass();
                l.golf(wVar2);
            }
            throw th3;
        }
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [U3.d, java.lang.Object] */
    @Override // U3.c
    public final void india() {
        synchronized (this.charlie) {
            try {
                if (!this.amber) {
                    this.bravo.alpha();
                    int i4 = Y3.h.bravo;
                    this.tango = SystemClock.elapsedRealtimeNanos();
                    int i5 = 3;
                    if (this.hotel == null) {
                        if (Y3.l.india(this.kilo, this.lima)) {
                            this.yankee = this.kilo;
                            this.zulu = this.lima;
                        }
                        if (this.xray == null) {
                            a aVar = this.juliet;
                            aVar.getClass();
                            this.xray = null;
                            int i10 = aVar.f2121d;
                            if (i10 > 0) {
                                Resources.Theme theme = aVar.f2125i;
                                Context context = this.foxtrot;
                                if (theme == null) {
                                    theme = context.getTheme();
                                }
                                this.xray = AbstractC2805w6.alpha(context, context, i10, theme);
                            }
                        }
                        if (this.xray == null) {
                            i5 = 5;
                        }
                        golf(new GlideException("Received null model"), i5);
                        return;
                    }
                    int i11 = this.beige;
                    if (i11 != 2) {
                        boolean z2 = false;
                        if (i11 == 4) {
                            hotel(this.romeo, E3.a.teal, false);
                            return;
                        }
                        ArrayList arrayList = this.oscar;
                        if (arrayList != null) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                            }
                        }
                        this.beige = 3;
                        if (Y3.l.india(this.kilo, this.lima)) {
                            kilo(this.kilo, this.lima);
                        } else {
                            this.november.november(this);
                        }
                        int i12 = this.beige;
                        if (i12 == 2 || i12 == 3) {
                            ?? r12 = this.echo;
                            if (r12 == 0 || r12.juliet(this)) {
                                z2 = true;
                            }
                            if (z2) {
                                this.november.kilo(charlie());
                            }
                        }
                        if (black) {
                            delta("finished run method in " + Y3.h.alpha(this.tango));
                        }
                        return;
                    }
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // U3.c
    public final boolean isComplete() {
        boolean z2;
        synchronized (this.charlie) {
            if (this.beige == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        return z2;
    }

    @Override // U3.c
    public final boolean isRunning() {
        boolean z2;
        synchronized (this.charlie) {
            int i4 = this.beige;
            if (i4 != 2 && i4 != 3) {
                z2 = false;
            }
            z2 = true;
        }
        return z2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [U3.d, java.lang.Object] */
    public final void juliet(w wVar, Object obj, E3.a aVar) {
        boolean z2;
        ?? r02 = this.echo;
        if (r02 != 0) {
            r02.charlie().alpha();
        }
        this.beige = 4;
        this.romeo = wVar;
        int i4 = this.golf.india;
        Object obj2 = this.hotel;
        if (i4 <= 3) {
            Log.d("Glide", "Finished loading " + obj.getClass().getSimpleName() + " from " + aVar + " for " + obj2 + " with size [" + this.yankee + "x" + this.zulu + "] in " + Y3.h.alpha(this.tango) + " ms");
        }
        if (r02 != 0) {
            r02.delta(this);
        }
        this.amber = true;
        try {
            ArrayList arrayList = this.oscar;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                z2 = false;
                while (it.hasNext()) {
                    z2 |= ((f) it.next()).india(obj, obj2, aVar);
                }
            } else {
                z2 = false;
            }
            e eVar = this.delta;
            if (eVar != null) {
                eVar.india(obj, obj2, aVar);
            }
            if (!z2) {
                this.papa.getClass();
                this.november.golf(obj);
            }
            this.amber = false;
        } catch (Throwable th) {
            this.amber = false;
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void kilo(int i4, int i5) {
        int round;
        h hVar = this;
        int i10 = i4;
        hVar.bravo.alpha();
        Object obj = hVar.charlie;
        synchronized (obj) {
            try {
                try {
                    boolean z2 = black;
                    if (z2) {
                        hVar.delta("Got onSizeReady in " + Y3.h.alpha(hVar.tango));
                    }
                    if (hVar.beige == 3) {
                        hVar.beige = 2;
                        hVar.juliet.getClass();
                        if (i10 != Integer.MIN_VALUE) {
                            i10 = Math.round(i10 * 1.0f);
                        }
                        hVar.yankee = i10;
                        if (i5 == Integer.MIN_VALUE) {
                            round = i5;
                        } else {
                            round = Math.round(1.0f * i5);
                        }
                        hVar.zulu = round;
                        if (z2) {
                            hVar.delta("finished setup for calling load in " + Y3.h.alpha(hVar.tango));
                        }
                        l lVar = hVar.uniform;
                        com.bumptech.glide.f fVar = hVar.golf;
                        Object obj2 = hVar.hotel;
                        a aVar = hVar.juliet;
                        E3.f fVar2 = aVar.f2119b;
                        try {
                            int i11 = hVar.yankee;
                            int i12 = hVar.zulu;
                            Class cls = aVar.f2123g;
                            try {
                                Class cls2 = hVar.india;
                                com.bumptech.glide.g gVar = hVar.mike;
                                k kVar = aVar.purple;
                                try {
                                    Y3.c cVar = aVar.f2122f;
                                    boolean z10 = aVar.f2120c;
                                    boolean z11 = aVar.f2127k;
                                    try {
                                        E3.i iVar = aVar.e;
                                        boolean z12 = aVar.white;
                                        boolean z13 = aVar.f2128l;
                                        Executor executor = hVar.quebec;
                                        hVar = obj;
                                        try {
                                            hVar.sierra = lVar.alpha(fVar, obj2, fVar2, i11, i12, cls, cls2, gVar, kVar, cVar, z10, z11, iVar, z12, z13, hVar, executor);
                                            if (hVar.beige != 2) {
                                                hVar.sierra = null;
                                            }
                                            if (z2) {
                                                hVar.delta("finished onSizeReady in " + Y3.h.alpha(hVar.tango));
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        hVar = obj;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    hVar = obj;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                hVar = obj;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            hVar = obj;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            } catch (Throwable th7) {
                th = th7;
                hVar = obj;
            }
        }
    }

    @Override // U3.c
    public final void pause() {
        synchronized (this.charlie) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.charlie) {
            obj = this.hotel;
            cls = this.india;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + Constants.AES_SUFFIX;
    }
}
