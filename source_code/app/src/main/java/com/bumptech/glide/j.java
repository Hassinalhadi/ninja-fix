package com.bumptech.glide;

import Oe.ah;
import R3.s;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class j extends U3.a {

    /* renamed from: m, reason: collision with root package name */
    public final Context f3552m;

    /* renamed from: n, reason: collision with root package name */
    public final m f3553n;

    /* renamed from: o, reason: collision with root package name */
    public final Class f3554o;

    /* renamed from: p, reason: collision with root package name */
    public final f f3555p;

    /* renamed from: q, reason: collision with root package name */
    public a f3556q;

    /* renamed from: r, reason: collision with root package name */
    public Object f3557r;

    /* renamed from: s, reason: collision with root package name */
    public ArrayList f3558s;

    /* renamed from: t, reason: collision with root package name */
    public j f3559t;

    /* renamed from: u, reason: collision with root package name */
    public j f3560u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f3561v = true;

    /* renamed from: w, reason: collision with root package name */
    public boolean f3562w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f3563x;

    static {
    }

    public j(b bVar, m mVar, Class cls, Context context) {
        U3.g gVar;
        this.f3553n = mVar;
        this.f3554o = cls;
        this.f3552m = context;
        bv.e eVar = mVar.alpha.red.foxtrot;
        a aVar = (a) eVar.get(cls);
        if (aVar == null) {
            Iterator it = ((ah) eVar.entrySet()).iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    aVar = (a) entry.getValue();
                }
            }
        }
        this.f3556q = aVar == null ? f.kilo : aVar;
        this.f3555p = bVar.red;
        Iterator it2 = mVar.f3609b.iterator();
        while (it2.hasNext()) {
            xray((U3.f) it2.next());
        }
        synchronized (mVar) {
            gVar = mVar.f3610c;
        }
        alpha(gVar);
    }

    @Override // U3.a
    /* renamed from: amber, reason: merged with bridge method [inline-methods] */
    public final j clone() {
        j jVar = (j) super.clone();
        jVar.f3556q = jVar.f3556q.clone();
        if (jVar.f3558s != null) {
            jVar.f3558s = new ArrayList(jVar.f3558s);
        }
        j jVar2 = jVar.f3559t;
        if (jVar2 != null) {
            jVar.f3559t = jVar2.clone();
        }
        j jVar3 = jVar.f3560u;
        if (jVar3 != null) {
            jVar.f3560u = jVar3.clone();
        }
        return jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0086  */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.bumptech.glide.load.resource.bitmap.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.bumptech.glide.load.resource.bitmap.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.bumptech.glide.load.resource.bitmap.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.bumptech.glide.load.resource.bitmap.d, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V3.a azure(ImageView imageView) {
        U3.a aVar;
        Class cls;
        V3.a aVar2;
        Y3.l.alpha();
        Y3.f.bravo(imageView);
        if (!U3.a.india(this.alpha, 2048) && imageView.getScaleType() != null) {
            switch (i.alpha[imageView.getScaleType().ordinal()]) {
                case 1:
                    aVar = clone().juliet(com.bumptech.glide.load.resource.bitmap.m.delta, new Object());
                    break;
                case 2:
                    aVar = clone().juliet(com.bumptech.glide.load.resource.bitmap.m.charlie, new Object());
                    aVar.f2127k = true;
                    break;
                case 3:
                case 4:
                case 5:
                    aVar = clone().juliet(com.bumptech.glide.load.resource.bitmap.m.bravo, new Object());
                    aVar.f2127k = true;
                    break;
                case 6:
                    aVar = clone().juliet(com.bumptech.glide.load.resource.bitmap.m.charlie, new Object());
                    aVar.f2127k = true;
                    break;
            }
            this.f3555p.charlie.getClass();
            cls = this.f3554o;
            if (!Bitmap.class.equals(cls)) {
                aVar2 = new V3.a(imageView, 0);
            } else if (Drawable.class.isAssignableFrom(cls)) {
                aVar2 = new V3.a(imageView, 1);
            } else {
                throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
            }
            beige(aVar2, null, aVar, Y3.f.alpha);
            return aVar2;
        }
        aVar = this;
        this.f3555p.charlie.getClass();
        cls = this.f3554o;
        if (!Bitmap.class.equals(cls)) {
        }
        beige(aVar2, null, aVar, Y3.f.alpha);
        return aVar2;
    }

    public final void beige(V3.e eVar, U3.e eVar2, U3.a aVar, Executor executor) {
        Y3.f.bravo(eVar);
        if (this.f3562w) {
            U3.c zulu = zulu(new Object(), eVar, eVar2, null, this.f3556q, aVar.red, aVar.f2118a, aVar.yellow, aVar, executor);
            U3.c lima = eVar.lima();
            if (zulu.echo(lima) && (aVar.white || !lima.isComplete())) {
                Y3.f.charlie(lima, "Argument must not be null");
                if (!lima.isRunning()) {
                    lima.india();
                    return;
                }
                return;
            }
            this.f3553n.india(eVar);
            eVar.echo(zulu);
            m mVar = this.f3553n;
            synchronized (mVar) {
                mVar.white.alpha.add(eVar);
                s sVar = mVar.silver;
                ((Set) sVar.red).add(zulu);
                if (!sVar.purple) {
                    zulu.india();
                } else {
                    zulu.clear();
                    if (Log.isLoggable("RequestTracker", 2)) {
                        Log.v("RequestTracker", "Paused, delaying request");
                    }
                    ((HashSet) sVar.silver).add(zulu);
                }
            }
            return;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    public final j black(L9.c cVar) {
        if (this.f2126j) {
            return clone().black(cVar);
        }
        this.f3558s = null;
        return xray(cVar);
    }

    public final j blue(File file) {
        return crimson(file);
    }

    public final j bronze(Integer num) {
        PackageInfo packageInfo;
        String uuid;
        j crimson = crimson(num);
        Context context = this.f3552m;
        j jVar = (j) crimson.sierra(context.getTheme());
        ConcurrentHashMap concurrentHashMap = X3.b.alpha;
        String packageName = context.getPackageName();
        ConcurrentHashMap concurrentHashMap2 = X3.b.alpha;
        E3.f fVar = (E3.f) concurrentHashMap2.get(packageName);
        if (fVar == null) {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("AppVersionSignature", "Cannot resolve info for" + context.getPackageName(), e);
                packageInfo = null;
            }
            if (packageInfo != null) {
                uuid = String.valueOf(packageInfo.versionCode);
            } else {
                uuid = UUID.randomUUID().toString();
            }
            X3.d dVar = new X3.d(uuid);
            E3.f fVar2 = (E3.f) concurrentHashMap2.putIfAbsent(packageName, dVar);
            if (fVar2 == null) {
                fVar = dVar;
            } else {
                fVar = fVar2;
            }
        }
        return (j) jVar.quebec(new X3.a(context.getResources().getConfiguration().uiMode & 48, fVar));
    }

    public final j coral(String str) {
        return crimson(str);
    }

    public final j crimson(Object obj) {
        if (this.f2126j) {
            return clone().crimson(obj);
        }
        this.f3557r = obj;
        this.f3562w = true;
        oscar();
        return this;
    }

    @Override // U3.a
    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (super.equals(jVar)) {
                if (Objects.equals(this.f3554o, jVar.f3554o) && this.f3556q.equals(jVar.f3556q) && Objects.equals(this.f3557r, jVar.f3557r) && Objects.equals(this.f3558s, jVar.f3558s) && Objects.equals(this.f3559t, jVar.f3559t) && Objects.equals(this.f3560u, jVar.f3560u) && this.f3561v == jVar.f3561v && this.f3562w == jVar.f3562w) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // U3.a
    public final int hashCode() {
        return Y3.l.golf(this.f3562w ? 1 : 0, Y3.l.golf(this.f3561v ? 1 : 0, Y3.l.hotel(Y3.l.hotel(Y3.l.hotel(Y3.l.hotel(Y3.l.hotel(Y3.l.hotel(Y3.l.hotel(super.hashCode(), this.f3554o), this.f3556q), this.f3557r), this.f3558s), this.f3559t), this.f3560u), null)));
    }

    public final j xray(U3.f fVar) {
        if (this.f2126j) {
            return clone().xray(fVar);
        }
        if (fVar != null) {
            if (this.f3558s == null) {
                this.f3558s = new ArrayList();
            }
            this.f3558s.add(fVar);
        }
        oscar();
        return this;
    }

    @Override // U3.a
    /* renamed from: yankee, reason: merged with bridge method [inline-methods] */
    public final j alpha(U3.a aVar) {
        Y3.f.bravo(aVar);
        return (j) super.alpha(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final U3.c zulu(Object obj, V3.e eVar, U3.e eVar2, U3.d dVar, a aVar, g gVar, int i4, int i5, U3.a aVar2, Executor executor) {
        U3.d dVar2;
        U3.d dVar3;
        U3.a aVar3;
        U3.h hVar;
        a aVar4;
        g gVar2;
        if (this.f3560u != null) {
            dVar3 = new U3.b(obj, dVar);
            dVar2 = dVar3;
        } else {
            dVar2 = null;
            dVar3 = dVar;
        }
        j jVar = this.f3559t;
        if (jVar != null) {
            if (!this.f3563x) {
                a aVar5 = jVar.f3556q;
                if (jVar.f3561v) {
                    aVar4 = aVar;
                } else {
                    aVar4 = aVar5;
                }
                if (U3.a.india(jVar.alpha, 8)) {
                    gVar2 = this.f3559t.red;
                } else {
                    int ordinal = gVar.ordinal();
                    if (ordinal != 0 && ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                gVar2 = g.red;
                            } else {
                                throw new IllegalArgumentException("unknown priority: " + this.red);
                            }
                        } else {
                            gVar2 = g.purple;
                        }
                    } else {
                        gVar2 = g.alpha;
                    }
                }
                g gVar3 = gVar2;
                j jVar2 = this.f3559t;
                int i10 = jVar2.f2118a;
                int i11 = jVar2.yellow;
                if (Y3.l.india(i4, i5)) {
                    j jVar3 = this.f3559t;
                    if (!Y3.l.india(jVar3.f2118a, jVar3.yellow)) {
                        i10 = aVar2.f2118a;
                        i11 = aVar2.yellow;
                    }
                }
                int i12 = i11;
                int i13 = i10;
                U3.i iVar = new U3.i(obj, dVar3);
                Object obj2 = this.f3557r;
                ArrayList arrayList = this.f3558s;
                f fVar = this.f3555p;
                U3.h hVar2 = new U3.h(this.f3552m, fVar, obj, obj2, this.f3554o, aVar2, i4, i5, gVar, eVar, eVar2, arrayList, iVar, fVar.golf, aVar.alpha, executor);
                this.f3563x = true;
                j jVar4 = this.f3559t;
                U3.c zulu = jVar4.zulu(obj, eVar, eVar2, iVar, aVar4, gVar3, i13, i12, jVar4, executor);
                this.f3563x = false;
                iVar.charlie = hVar2;
                iVar.delta = zulu;
                aVar3 = aVar2;
                hVar = iVar;
            } else {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
        } else {
            Object obj3 = this.f3557r;
            ArrayList arrayList2 = this.f3558s;
            f fVar2 = this.f3555p;
            aVar3 = aVar2;
            hVar = new U3.h(this.f3552m, fVar2, obj, obj3, this.f3554o, aVar3, i4, i5, gVar, eVar, eVar2, arrayList2, dVar3, fVar2.golf, aVar.alpha, executor);
        }
        if (dVar2 == null) {
            return hVar;
        }
        j jVar5 = this.f3560u;
        int i14 = jVar5.f2118a;
        int i15 = jVar5.yellow;
        if (Y3.l.india(i4, i5)) {
            j jVar6 = this.f3560u;
            if (!Y3.l.india(jVar6.f2118a, jVar6.yellow)) {
                i14 = aVar3.f2118a;
                i15 = aVar3.yellow;
            }
        }
        int i16 = i15;
        j jVar7 = this.f3560u;
        U3.b bVar = dVar2;
        U3.c zulu2 = jVar7.zulu(obj, eVar, eVar2, bVar, jVar7.f3556q, jVar7.red, i14, i16, jVar7, executor);
        bVar.charlie = hVar;
        bVar.delta = zulu2;
        return bVar;
    }
}
