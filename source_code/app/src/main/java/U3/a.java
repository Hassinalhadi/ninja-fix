package U3;

import Y3.l;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import bv.aw;
import com.bumptech.glide.load.engine.k;
import com.bumptech.glide.load.resource.bitmap.m;
import com.bumptech.glide.load.resource.bitmap.r;
import com.google.mlkit.vision.barcode.common.Barcode;
import okhttp3.internal.http2.Http2;

/* loaded from: classes3.dex */
public abstract class a implements Cloneable {
    public int alpha;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2120c;

    /* renamed from: d, reason: collision with root package name */
    public int f2121d;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2124h;

    /* renamed from: i, reason: collision with root package name */
    public Resources.Theme f2125i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2126j;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2128l;
    public int silver;
    public int teal;
    public k purple = k.delta;
    public com.bumptech.glide.g red = com.bumptech.glide.g.red;
    public boolean white = true;
    public int yellow = -1;

    /* renamed from: a, reason: collision with root package name */
    public int f2118a = -1;

    /* renamed from: b, reason: collision with root package name */
    public E3.f f2119b = X3.c.bravo;
    public E3.i e = new E3.i();

    /* renamed from: f, reason: collision with root package name */
    public Y3.c f2122f = new aw(0);

    /* renamed from: g, reason: collision with root package name */
    public Class f2123g = Object.class;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2127k = true;

    public static boolean india(int i4, int i5) {
        if ((i4 & i5) != 0) {
            return true;
        }
        return false;
    }

    public a alpha(a aVar) {
        if (this.f2126j) {
            return clone().alpha(aVar);
        }
        int i4 = aVar.alpha;
        if (india(aVar.alpha, 1048576)) {
            this.f2128l = aVar.f2128l;
        }
        if (india(aVar.alpha, 4)) {
            this.purple = aVar.purple;
        }
        if (india(aVar.alpha, 8)) {
            this.red = aVar.red;
        }
        if (india(aVar.alpha, 16)) {
            this.silver = 0;
            this.alpha &= -33;
        }
        if (india(aVar.alpha, 32)) {
            this.silver = aVar.silver;
            this.alpha &= -17;
        }
        if (india(aVar.alpha, 64)) {
            this.teal = 0;
            this.alpha &= -129;
        }
        if (india(aVar.alpha, 128)) {
            this.teal = aVar.teal;
            this.alpha &= -65;
        }
        if (india(aVar.alpha, Barcode.FORMAT_QR_CODE)) {
            this.white = aVar.white;
        }
        if (india(aVar.alpha, 512)) {
            this.f2118a = aVar.f2118a;
            this.yellow = aVar.yellow;
        }
        if (india(aVar.alpha, Barcode.FORMAT_UPC_E)) {
            this.f2119b = aVar.f2119b;
        }
        if (india(aVar.alpha, 4096)) {
            this.f2123g = aVar.f2123g;
        }
        if (india(aVar.alpha, 8192)) {
            this.f2121d = 0;
            this.alpha &= -16385;
        }
        if (india(aVar.alpha, Http2.INITIAL_MAX_FRAME_SIZE)) {
            this.f2121d = aVar.f2121d;
            this.alpha &= -8193;
        }
        if (india(aVar.alpha, 32768)) {
            this.f2125i = aVar.f2125i;
        }
        if (india(aVar.alpha, 131072)) {
            this.f2120c = aVar.f2120c;
        }
        if (india(aVar.alpha, 2048)) {
            this.f2122f.putAll(aVar.f2122f);
            this.f2127k = aVar.f2127k;
        }
        this.alpha |= aVar.alpha;
        this.e.bravo.golf(aVar.e.bravo);
        oscar();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.bumptech.glide.load.resource.bitmap.d, java.lang.Object] */
    public final a bravo() {
        return uniform(m.charlie, new Object());
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [bv.e, Y3.c, bv.aw] */
    @Override // 
    /* renamed from: charlie, reason: merged with bridge method [inline-methods] */
    public a clone() {
        try {
            a aVar = (a) super.clone();
            E3.i iVar = new E3.i();
            aVar.e = iVar;
            iVar.bravo.golf(this.e.bravo);
            ?? awVar = new aw(0);
            aVar.f2122f = awVar;
            awVar.putAll(this.f2122f);
            aVar.f2124h = false;
            aVar.f2126j = false;
            return aVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final a delta(Class cls) {
        if (this.f2126j) {
            return clone().delta(cls);
        }
        this.f2123g = cls;
        this.alpha |= 4096;
        oscar();
        return this;
    }

    public final a echo(k kVar) {
        if (this.f2126j) {
            return clone().echo(kVar);
        }
        this.purple = kVar;
        this.alpha |= 4;
        oscar();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return hotel((a) obj);
        }
        return false;
    }

    public final a foxtrot(int i4) {
        if (this.f2126j) {
            return clone().foxtrot(i4);
        }
        this.silver = i4;
        this.alpha = (this.alpha | 32) & (-17);
        oscar();
        return this;
    }

    public final a golf(int i4) {
        if (this.f2126j) {
            return clone().golf(i4);
        }
        this.f2121d = i4;
        this.alpha = (this.alpha | Http2.INITIAL_MAX_FRAME_SIZE) & (-8193);
        oscar();
        return this;
    }

    public int hashCode() {
        char[] cArr = l.alpha;
        return l.hotel(l.hotel(l.hotel(l.hotel(l.hotel(l.hotel(l.hotel(l.golf(0, l.golf(0, l.golf(1, l.golf(this.f2120c ? 1 : 0, l.golf(this.f2118a, l.golf(this.yellow, l.golf(this.white ? 1 : 0, l.hotel(l.golf(this.f2121d, l.hotel(l.golf(this.teal, l.hotel(l.golf(this.silver, l.golf(Float.floatToIntBits(1.0f), 17)), null)), null)), null)))))))), this.purple), this.red), this.e), this.f2122f), this.f2123g), this.f2119b), this.f2125i);
    }

    public final boolean hotel(a aVar) {
        aVar.getClass();
        if (Float.compare(1.0f, 1.0f) == 0 && this.silver == aVar.silver) {
            char[] cArr = l.alpha;
            if (this.teal == aVar.teal && this.f2121d == aVar.f2121d && this.white == aVar.white && this.yellow == aVar.yellow && this.f2118a == aVar.f2118a && this.f2120c == aVar.f2120c && this.purple.equals(aVar.purple) && this.red == aVar.red && this.e.equals(aVar.e) && this.f2122f.equals(aVar.f2122f) && this.f2123g.equals(aVar.f2123g) && this.f2119b.equals(aVar.f2119b) && l.bravo(this.f2125i, aVar.f2125i)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final a juliet(m mVar, com.bumptech.glide.load.resource.bitmap.d dVar) {
        if (this.f2126j) {
            return clone().juliet(mVar, dVar);
        }
        papa(m.golf, mVar);
        return tango(dVar, false);
    }

    public final a kilo(int i4, int i5) {
        if (this.f2126j) {
            return clone().kilo(i4, i5);
        }
        this.f2118a = i4;
        this.yellow = i5;
        this.alpha |= 512;
        oscar();
        return this;
    }

    public final a lima(int i4) {
        if (this.f2126j) {
            return clone().lima(i4);
        }
        this.teal = i4;
        this.alpha = (this.alpha | 128) & (-65);
        oscar();
        return this;
    }

    public final a mike() {
        com.bumptech.glide.g gVar = com.bumptech.glide.g.silver;
        if (this.f2126j) {
            return clone().mike();
        }
        this.red = gVar;
        this.alpha |= 8;
        oscar();
        return this;
    }

    public final a november(E3.h hVar) {
        if (this.f2126j) {
            return clone().november(hVar);
        }
        this.e.bravo.remove(hVar);
        oscar();
        return this;
    }

    public final void oscar() {
        if (!this.f2124h) {
        } else {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    public final a papa(E3.h hVar, Object obj) {
        if (this.f2126j) {
            return clone().papa(hVar, obj);
        }
        Y3.f.bravo(hVar);
        Y3.f.bravo(obj);
        this.e.bravo.put(hVar, obj);
        oscar();
        return this;
    }

    public final a quebec(E3.f fVar) {
        if (this.f2126j) {
            return clone().quebec(fVar);
        }
        this.f2119b = fVar;
        this.alpha |= Barcode.FORMAT_UPC_E;
        oscar();
        return this;
    }

    public final a romeo() {
        if (this.f2126j) {
            return clone().romeo();
        }
        this.white = false;
        this.alpha |= Barcode.FORMAT_QR_CODE;
        oscar();
        return this;
    }

    public final a sierra(Resources.Theme theme) {
        if (this.f2126j) {
            return clone().sierra(theme);
        }
        this.f2125i = theme;
        if (theme != null) {
            this.alpha |= 32768;
            return papa(N3.c.bravo, theme);
        }
        this.alpha &= -32769;
        return november(N3.c.bravo);
    }

    public final a tango(E3.m mVar, boolean z2) {
        if (this.f2126j) {
            return clone().tango(mVar, z2);
        }
        r rVar = new r(mVar, z2);
        victor(Bitmap.class, mVar, z2);
        victor(Drawable.class, rVar, z2);
        victor(BitmapDrawable.class, rVar, z2);
        victor(P3.c.class, new P3.d(mVar), z2);
        oscar();
        return this;
    }

    public final a uniform(m mVar, com.bumptech.glide.load.resource.bitmap.d dVar) {
        if (this.f2126j) {
            return clone().uniform(mVar, dVar);
        }
        papa(m.golf, mVar);
        return tango(dVar, true);
    }

    public final a victor(Class cls, E3.m mVar, boolean z2) {
        if (this.f2126j) {
            return clone().victor(cls, mVar, z2);
        }
        Y3.f.bravo(mVar);
        this.f2122f.put(cls, mVar);
        int i4 = this.alpha;
        this.alpha = 67584 | i4;
        this.f2127k = false;
        if (z2) {
            this.alpha = i4 | 198656;
            this.f2120c = true;
        }
        oscar();
        return this;
    }

    public final a whiskey() {
        if (this.f2126j) {
            return clone().whiskey();
        }
        this.f2128l = true;
        this.alpha |= 1048576;
        oscar();
        return this;
    }
}
