package P2;

import Cf.l;
import Tf.ah;
import Tf.aj;
import Tf.ak;
import Tf.u;
import Tf.v;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.r;
import pe.AbstractC2327c;
import s6.AbstractC2689j6;
import s6.AbstractC2832z6;
import t6.AbstractC2972b3;
import td.C3117a;
import vf.a0;
import vf.ad;

/* loaded from: classes3.dex */
public final class f implements Closeable, Flushable, AutoCloseable {

    /* renamed from: j, reason: collision with root package name */
    public static final Regex f1887j = new Regex("[a-z0-9_-]{1,120}");

    /* renamed from: a, reason: collision with root package name */
    public long f1888a;
    public final ah alpha;

    /* renamed from: b, reason: collision with root package name */
    public int f1889b;

    /* renamed from: c, reason: collision with root package name */
    public aj f1890c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1891d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1892f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1893g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1894h;

    /* renamed from: i, reason: collision with root package name */
    public final d f1895i;
    public final long purple;
    public final ah red;
    public final ah silver;
    public final ah teal;
    public final LinkedHashMap white;
    public final C3117a yellow;

    /* JADX WARN: Type inference failed for: r3v13, types: [Tf.v, P2.d] */
    public f(long j5, Cf.d dVar, u uVar, ah ahVar) {
        this.alpha = ahVar;
        this.purple = j5;
        if (j5 > 0) {
            this.red = ahVar.foxtrot("journal");
            this.silver = ahVar.foxtrot("journal.tmp");
            this.teal = ahVar.foxtrot("journal.bkp");
            this.white = new LinkedHashMap(0, 0.75f, true);
            a0 foxtrot = ad.foxtrot();
            dVar.getClass();
            this.yellow = ad.charlie(AbstractC2832z6.charlie(foxtrot, l.purple.jade(1)));
            this.f1895i = new v(uVar);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public static void blue(String str) {
        if (f1887j.echo(str)) {
        } else {
            throw new IllegalArgumentException(AbstractC2327c.victor('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str).toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0117, code lost:
    
        if (r1 != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0110 A[Catch: all -> 0x0035, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0011, B:11:0x0018, B:13:0x0020, B:16:0x0030, B:26:0x003e, B:28:0x0056, B:29:0x0073, B:31:0x0081, B:33:0x0088, B:36:0x005c, B:38:0x006c, B:40:0x00a8, B:42:0x00af, B:45:0x00b4, B:47:0x00c5, B:50:0x00ca, B:51:0x0105, B:53:0x0110, B:59:0x0119, B:60:0x00e2, B:62:0x00f7, B:64:0x0102, B:67:0x0098, B:69:0x011e, B:70:0x0125), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void charlie(f fVar, C3.d dVar, boolean z2) {
        long j5;
        synchronized (fVar) {
            b bVar = (b) dVar.red;
            if (Intrinsics.areEqual(bVar.golf, dVar)) {
                boolean z10 = false;
                if (z2 && !bVar.foxtrot) {
                    for (int i4 = 0; i4 < 2; i4++) {
                        if (((boolean[]) dVar.purple)[i4] && !fVar.f1895i.exists((ah) bVar.delta.get(i4))) {
                            dVar.charlie(false);
                            return;
                        }
                    }
                    for (int i5 = 0; i5 < 2; i5++) {
                        ah ahVar = (ah) bVar.delta.get(i5);
                        ah ahVar2 = (ah) bVar.charlie.get(i5);
                        if (fVar.f1895i.exists(ahVar)) {
                            fVar.f1895i.atomicMove(ahVar, ahVar2);
                        } else {
                            d dVar2 = fVar.f1895i;
                            ah ahVar3 = (ah) bVar.charlie.get(i5);
                            if (!dVar2.exists(ahVar3)) {
                                a3.h.alpha(dVar2.sink(ahVar3));
                            }
                        }
                        long j6 = bVar.bravo[i5];
                        Long l10 = fVar.f1895i.metadata(ahVar2).delta;
                        if (l10 != null) {
                            j5 = l10.longValue();
                        } else {
                            j5 = 0;
                        }
                        bVar.bravo[i5] = j5;
                        fVar.f1888a = (fVar.f1888a - j6) + j5;
                    }
                } else {
                    for (int i10 = 0; i10 < 2; i10++) {
                        fVar.f1895i.delete((ah) bVar.delta.get(i10));
                    }
                }
                bVar.golf = null;
                if (bVar.foxtrot) {
                    fVar.azure(bVar);
                    return;
                }
                fVar.f1889b++;
                aj ajVar = fVar.f1890c;
                Intrinsics.checkNotNull(ajVar);
                if (!z2 && !bVar.echo) {
                    fVar.white.remove(bVar.alpha);
                    ajVar.lavender("REMOVE");
                    ajVar.black(32);
                    ajVar.lavender(bVar.alpha);
                    ajVar.black(10);
                    ajVar.flush();
                    if (fVar.f1888a <= fVar.purple) {
                        if (fVar.f1889b >= 2000) {
                            z10 = true;
                        }
                    }
                    fVar.juliet();
                    return;
                }
                bVar.echo = true;
                ajVar.lavender("CLEAN");
                ajVar.black(32);
                ajVar.lavender(bVar.alpha);
                for (long j7 : bVar.bravo) {
                    ajVar.black(32);
                    ajVar.y(j7);
                }
                ajVar.black(10);
                ajVar.flush();
                if (fVar.f1888a <= fVar.purple) {
                }
                fVar.juliet();
                return;
            }
            throw new IllegalStateException("Check failed.");
        }
    }

    public final void azure(b bVar) {
        aj ajVar;
        int i4 = bVar.hotel;
        String str = bVar.alpha;
        if (i4 > 0 && (ajVar = this.f1890c) != null) {
            ajVar.lavender("DIRTY");
            ajVar.black(32);
            ajVar.lavender(str);
            ajVar.black(10);
            ajVar.flush();
        }
        if (bVar.hotel <= 0 && bVar.golf == null) {
            for (int i5 = 0; i5 < 2; i5++) {
                this.f1895i.delete((ah) bVar.charlie.get(i5));
                long j5 = this.f1888a;
                long[] jArr = bVar.bravo;
                this.f1888a = j5 - jArr[i5];
                jArr[i5] = 0;
            }
            this.f1889b++;
            aj ajVar2 = this.f1890c;
            if (ajVar2 != null) {
                ajVar2.lavender("REMOVE");
                ajVar2.black(32);
                ajVar2.lavender(str);
                ajVar2.black(10);
            }
            this.white.remove(str);
            if (this.f1889b >= 2000) {
                juliet();
                return;
            }
            return;
        }
        bVar.foxtrot = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        azure(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void beige() {
        while (this.f1888a > this.purple) {
            for (b bVar : this.white.values()) {
                if (!bVar.foxtrot) {
                    break;
                }
            }
            return;
        }
        this.f1893g = false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.e && !this.f1892f) {
                for (b bVar : (b[]) this.white.values().toArray(new b[0])) {
                    C3.d dVar = bVar.golf;
                    if (dVar != null) {
                        b bVar2 = (b) dVar.red;
                        if (Intrinsics.areEqual(bVar2.golf, dVar)) {
                            bVar2.foxtrot = true;
                        }
                    }
                }
                beige();
                ad.kilo(this.yellow, null);
                aj ajVar = this.f1890c;
                Intrinsics.checkNotNull(ajVar);
                ajVar.close();
                this.f1890c = null;
                this.f1892f = true;
                return;
            }
            this.f1892f = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void crimson() {
        Throwable th;
        try {
            aj ajVar = this.f1890c;
            if (ajVar != null) {
                ajVar.close();
            }
            aj bravo = Tf.b.bravo(this.f1895i.sink(this.silver, false));
            try {
                bravo.lavender("libcore.io.DiskLruCache");
                bravo.black(10);
                bravo.lavender("1");
                bravo.black(10);
                bravo.y(1);
                bravo.black(10);
                bravo.y(2);
                bravo.black(10);
                bravo.black(10);
                for (b bVar : this.white.values()) {
                    if (bVar.golf != null) {
                        bravo.lavender("DIRTY");
                        bravo.black(32);
                        bravo.lavender(bVar.alpha);
                        bravo.black(10);
                    } else {
                        bravo.lavender("CLEAN");
                        bravo.black(32);
                        bravo.lavender(bVar.alpha);
                        for (long j5 : bVar.bravo) {
                            bravo.black(32);
                            bravo.y(j5);
                        }
                        bravo.black(10);
                    }
                }
                try {
                    bravo.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    bravo.close();
                } catch (Throwable th4) {
                    AbstractC2689j6.charlie(th3, th4);
                }
                th = th3;
            }
            if (th == null) {
                if (this.f1895i.exists(this.red)) {
                    this.f1895i.atomicMove(this.red, this.teal);
                    this.f1895i.atomicMove(this.silver, this.red);
                    this.f1895i.delete(this.teal);
                } else {
                    this.f1895i.atomicMove(this.silver, this.red);
                }
                this.f1890c = Tf.b.bravo(new g(this.f1895i.appendingSink(this.red), new Aa.l(17, this)));
                this.f1889b = 0;
                this.f1891d = false;
                this.f1894h = false;
            } else {
                throw th;
            }
        } catch (Throwable th5) {
            throw th5;
        }
    }

    public final synchronized C3.d echo(String str) {
        C3.d dVar;
        try {
            if (!this.f1892f) {
                blue(str);
                golf();
                b bVar = (b) this.white.get(str);
                if (bVar != null) {
                    dVar = bVar.golf;
                } else {
                    dVar = null;
                }
                if (dVar != null) {
                    return null;
                }
                if (bVar != null && bVar.hotel != 0) {
                    return null;
                }
                if (!this.f1893g && !this.f1894h) {
                    aj ajVar = this.f1890c;
                    Intrinsics.checkNotNull(ajVar);
                    ajVar.lavender("DIRTY");
                    ajVar.black(32);
                    ajVar.lavender(str);
                    ajVar.black(10);
                    ajVar.flush();
                    if (this.f1891d) {
                        return null;
                    }
                    if (bVar == null) {
                        bVar = new b(this, str);
                        this.white.put(str, bVar);
                    }
                    C3.d dVar2 = new C3.d(this, bVar);
                    bVar.golf = dVar2;
                    return dVar2;
                }
                juliet();
                return null;
            }
            throw new IllegalStateException("cache is closed");
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (!this.e) {
            return;
        }
        if (!this.f1892f) {
            beige();
            aj ajVar = this.f1890c;
            Intrinsics.checkNotNull(ajVar);
            ajVar.flush();
            return;
        }
        throw new IllegalStateException("cache is closed");
    }

    public final synchronized c foxtrot(String str) {
        c alpha;
        if (!this.f1892f) {
            blue(str);
            golf();
            b bVar = (b) this.white.get(str);
            if (bVar != null && (alpha = bVar.alpha()) != null) {
                boolean z2 = true;
                this.f1889b++;
                aj ajVar = this.f1890c;
                Intrinsics.checkNotNull(ajVar);
                ajVar.lavender("READ");
                ajVar.black(32);
                ajVar.lavender(str);
                ajVar.black(10);
                if (this.f1889b < 2000) {
                    z2 = false;
                }
                if (z2) {
                    juliet();
                }
                return alpha;
            }
            return null;
        }
        throw new IllegalStateException("cache is closed");
    }

    public final synchronized void golf() {
        try {
            if (this.e) {
                return;
            }
            this.f1895i.delete(this.silver);
            if (this.f1895i.exists(this.teal)) {
                if (this.f1895i.exists(this.red)) {
                    this.f1895i.delete(this.teal);
                } else {
                    this.f1895i.atomicMove(this.teal, this.red);
                }
            }
            if (this.f1895i.exists(this.red)) {
                try {
                    quebec();
                    papa();
                    this.e = true;
                    return;
                } catch (IOException unused) {
                    try {
                        close();
                        AbstractC2972b3.bravo(this.f1895i, this.alpha);
                        this.f1892f = false;
                    } catch (Throwable th) {
                        this.f1892f = false;
                        throw th;
                    }
                }
            }
            crimson();
            this.e = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void juliet() {
        ad.zulu(this.yellow, null, null, new e(this, null), 3);
    }

    public final void papa() {
        Iterator it = this.white.values().iterator();
        long j5 = 0;
        while (it.hasNext()) {
            b bVar = (b) it.next();
            int i4 = 0;
            if (bVar.golf == null) {
                while (i4 < 2) {
                    j5 += bVar.bravo[i4];
                    i4++;
                }
            } else {
                bVar.golf = null;
                while (i4 < 2) {
                    ah ahVar = (ah) bVar.charlie.get(i4);
                    d dVar = this.f1895i;
                    dVar.delete(ahVar);
                    dVar.delete((ah) bVar.delta.get(i4));
                    i4++;
                }
                it.remove();
            }
        }
        this.f1888a = j5;
    }

    public final void quebec() {
        d dVar = this.f1895i;
        ah ahVar = this.red;
        ak charlie = Tf.b.charlie(dVar.source(ahVar));
        try {
            String fuchsia = charlie.fuchsia(Long.MAX_VALUE);
            String fuchsia2 = charlie.fuchsia(Long.MAX_VALUE);
            String fuchsia3 = charlie.fuchsia(Long.MAX_VALUE);
            String fuchsia4 = charlie.fuchsia(Long.MAX_VALUE);
            String fuchsia5 = charlie.fuchsia(Long.MAX_VALUE);
            if (Intrinsics.areEqual("libcore.io.DiskLruCache", fuchsia) && Intrinsics.areEqual("1", fuchsia2) && Intrinsics.areEqual(String.valueOf(1), fuchsia3) && Intrinsics.areEqual(String.valueOf(2), fuchsia4) && fuchsia5.length() <= 0) {
                int i4 = 0;
                while (true) {
                    try {
                        uniform(charlie.fuchsia(Long.MAX_VALUE));
                        i4++;
                    } catch (EOFException unused) {
                        this.f1889b = i4 - this.white.size();
                        if (!charlie.hotel()) {
                            crimson();
                        } else {
                            this.f1890c = Tf.b.bravo(new g(dVar.appendingSink(ahVar), new Aa.l(17, this)));
                        }
                        try {
                            charlie.close();
                            th = null;
                        } catch (Throwable th) {
                            th = th;
                        }
                        if (th == null) {
                            return;
                        } else {
                            throw th;
                        }
                    }
                }
            } else {
                throw new IOException("unexpected journal header: [" + fuchsia + ", " + fuchsia2 + ", " + fuchsia3 + ", " + fuchsia4 + ", " + fuchsia5 + ']');
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                charlie.close();
            } catch (Throwable th3) {
                AbstractC2689j6.charlie(th, th3);
            }
        }
    }

    public final void uniform(String str) {
        String substring;
        int emerald = StringsKt.emerald(str, ' ', 0, 6);
        if (emerald != -1) {
            int i4 = emerald + 1;
            int emerald2 = StringsKt.emerald(str, ' ', i4, 4);
            LinkedHashMap linkedHashMap = this.white;
            if (emerald2 == -1) {
                substring = str.substring(i4);
                Intrinsics.delta(substring, "substring(...)");
                if (emerald == 6 && r.quebec(str, "REMOVE", false)) {
                    linkedHashMap.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i4, emerald2);
                Intrinsics.delta(substring, "substring(...)");
            }
            Object obj = linkedHashMap.get(substring);
            if (obj == null) {
                obj = new b(this, substring);
                linkedHashMap.put(substring, obj);
            }
            b bVar = (b) obj;
            if (emerald2 != -1 && emerald == 5 && r.quebec(str, "CLEAN", false)) {
                String substring2 = str.substring(emerald2 + 1);
                Intrinsics.delta(substring2, "substring(...)");
                List navy = StringsKt.navy(substring2, new char[]{' '});
                bVar.echo = true;
                bVar.golf = null;
                int size = navy.size();
                bVar.india.getClass();
                if (size == 2) {
                    try {
                        int size2 = navy.size();
                        for (int i5 = 0; i5 < size2; i5++) {
                            bVar.bravo[i5] = Long.parseLong((String) navy.get(i5));
                        }
                        return;
                    } catch (NumberFormatException unused) {
                        throw new IOException("unexpected journal line: " + navy);
                    }
                }
                throw new IOException("unexpected journal line: " + navy);
            }
            if (emerald2 == -1 && emerald == 5 && r.quebec(str, "DIRTY", false)) {
                bVar.golf = new C3.d(this, bVar);
                return;
            } else if (emerald2 == -1 && emerald == 4 && r.quebec(str, "READ", false)) {
                return;
            } else {
                throw new IOException("unexpected journal line: ".concat(str));
            }
        }
        throw new IOException("unexpected journal line: ".concat(str));
    }
}
