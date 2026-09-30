package bv;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class w {
    public int alpha;
    public final Fe.t bravo;
    public final W8.a charlie;
    public int delta;
    public int echo;
    public int foxtrot;

    public w(int i4) {
        this.alpha = i4;
        if (i4 > 0) {
            this.bravo = new Fe.t(2);
            this.charlie = new W8.a(18);
        } else {
            bw.a.charlie("maxSize <= 0");
            throw null;
        }
    }

    public Object alpha(Object key) {
        Intrinsics.echo(key, "key");
        return null;
    }

    public void bravo(Object key, Object oldValue, Object obj) {
        Intrinsics.echo(key, "key");
        Intrinsics.echo(oldValue, "oldValue");
    }

    public final Object charlie(Object key) {
        Object put;
        Intrinsics.echo(key, "key");
        synchronized (this.charlie) {
            Fe.t tVar = this.bravo;
            tVar.getClass();
            Object obj = tVar.alpha.get(key);
            if (obj != null) {
                this.echo++;
                return obj;
            }
            this.foxtrot++;
            Object alpha = alpha(key);
            if (alpha == null) {
                return null;
            }
            synchronized (this.charlie) {
                try {
                    Fe.t tVar2 = this.bravo;
                    tVar2.getClass();
                    put = tVar2.alpha.put(key, alpha);
                    if (put != null) {
                        Fe.t tVar3 = this.bravo;
                        tVar3.getClass();
                        tVar3.alpha.put(key, put);
                    } else {
                        this.delta += foxtrot(key, alpha);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (put != null) {
                bravo(key, alpha, put);
                return put;
            }
            india(this.alpha);
            return alpha;
        }
    }

    public final Object delta(Object key, Object value) {
        Object put;
        Intrinsics.echo(key, "key");
        Intrinsics.echo(value, "value");
        synchronized (this.charlie) {
            this.delta += foxtrot(key, value);
            Fe.t tVar = this.bravo;
            tVar.getClass();
            put = tVar.alpha.put(key, value);
            if (put != null) {
                this.delta -= foxtrot(key, put);
            }
        }
        if (put != null) {
            bravo(key, put, value);
        }
        india(this.alpha);
        return put;
    }

    public final Object echo(Object key) {
        Object remove;
        Intrinsics.echo(key, "key");
        synchronized (this.charlie) {
            Fe.t tVar = this.bravo;
            tVar.getClass();
            remove = tVar.alpha.remove(key);
            if (remove != null) {
                this.delta -= foxtrot(key, remove);
            }
        }
        if (remove != null) {
            bravo(key, remove, null);
        }
        return remove;
    }

    public final int foxtrot(Object obj, Object obj2) {
        int golf = golf(obj, obj2);
        if (golf >= 0) {
            return golf;
        }
        String message = "Negative size: " + obj + '=' + obj2;
        Intrinsics.echo(message, "message");
        throw new IllegalStateException(message);
    }

    public int golf(Object key, Object value) {
        Intrinsics.echo(key, "key");
        Intrinsics.echo(value, "value");
        return 1;
    }

    public final LinkedHashMap hotel() {
        LinkedHashMap linkedHashMap;
        synchronized (this.charlie) {
            Set entrySet = this.bravo.alpha.entrySet();
            Intrinsics.delta(entrySet, "<get-entries>(...)");
            linkedHashMap = new LinkedHashMap(entrySet.size());
            Set<Map.Entry> entrySet2 = this.bravo.alpha.entrySet();
            Intrinsics.delta(entrySet2, "<get-entries>(...)");
            for (Map.Entry entry : entrySet2) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001d A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0011, B:13:0x001d, B:15:0x0021, B:17:0x002c, B:19:0x0045, B:32:0x006d, B:33:0x0074), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006d A[EDGE_INSN: B:31:0x006d->B:32:0x006d BREAK  A[LOOP:0: B:1:0x0000->B:21:0x0066], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void india(int i4) {
        boolean z2;
        Object key;
        Object value;
        while (true) {
            synchronized (this.charlie) {
                try {
                    if (this.delta < 0 || (this.bravo.alpha.isEmpty() && this.delta != 0)) {
                        z2 = false;
                        if (!z2) {
                            if (this.delta <= i4 || this.bravo.alpha.isEmpty()) {
                                break;
                            }
                            Set entrySet = this.bravo.alpha.entrySet();
                            Intrinsics.delta(entrySet, "<get-entries>(...)");
                            Map.Entry entry = (Map.Entry) CollectionsKt.gray(entrySet);
                            if (entry == null) {
                                return;
                            }
                            key = entry.getKey();
                            value = entry.getValue();
                            Fe.t tVar = this.bravo;
                            tVar.getClass();
                            Intrinsics.echo(key, "key");
                            tVar.alpha.remove(key);
                            this.delta -= foxtrot(key, value);
                        } else {
                            break;
                        }
                    }
                    z2 = true;
                    if (!z2) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            bravo(key, value, null);
        }
    }

    public final String toString() {
        int i4;
        String str;
        synchronized (this.charlie) {
            try {
                int i5 = this.echo;
                int i10 = this.foxtrot + i5;
                if (i10 != 0) {
                    i4 = (i5 * 100) / i10;
                } else {
                    i4 = 0;
                }
                str = "LruCache[maxSize=" + this.alpha + ",hits=" + this.echo + ",misses=" + this.foxtrot + ",hitRate=" + i4 + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
