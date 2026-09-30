package l2;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.internal.Intrinsics;
import s2.InterfaceC2595c;
import s2.InterfaceC2596d;

/* loaded from: classes3.dex */
public final class p implements InterfaceC2596d, InterfaceC2595c, AutoCloseable {

    /* renamed from: b, reason: collision with root package name */
    public static final TreeMap f12943b = new TreeMap();

    /* renamed from: a, reason: collision with root package name */
    public int f12944a;
    public final int alpha;
    public volatile String purple;
    public final long[] red;
    public final double[] silver;
    public final String[] teal;
    public final byte[][] white;
    public final int[] yellow;

    public p(int i4) {
        this.alpha = i4;
        int i5 = i4 + 1;
        this.yellow = new int[i5];
        this.red = new long[i5];
        this.silver = new double[i5];
        this.teal = new String[i5];
        this.white = new byte[i5];
    }

    public static final p foxtrot(int i4, String str) {
        TreeMap treeMap = f12943b;
        synchronized (treeMap) {
            Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i4));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                p pVar = (p) ceilingEntry.getValue();
                pVar.purple = str;
                pVar.f12944a = i4;
                return pVar;
            }
            p pVar2 = new p(i4);
            pVar2.purple = str;
            pVar2.f12944a = i4;
            return pVar2;
        }
    }

    @Override // s2.InterfaceC2595c
    public final void b(int i4) {
        this.yellow[i4] = 1;
    }

    @Override // s2.InterfaceC2596d
    public final void charlie(InterfaceC2595c interfaceC2595c) {
        int i4 = this.f12944a;
        if (1 <= i4) {
            int i5 = 1;
            while (true) {
                int i10 = this.yellow[i5];
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                if (i10 == 5) {
                                    byte[] bArr = this.white[i5];
                                    if (bArr != null) {
                                        interfaceC2595c.ivory(i5, bArr);
                                    } else {
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                }
                            } else {
                                String str = this.teal[i5];
                                if (str != null) {
                                    interfaceC2595c.oscar(i5, str);
                                } else {
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                            }
                        } else {
                            interfaceC2595c.zulu(i5, this.silver[i5]);
                        }
                    } else {
                        interfaceC2595c.gold(i5, this.red[i5]);
                    }
                } else {
                    interfaceC2595c.b(i5);
                }
                if (i5 != i4) {
                    i5++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // s2.InterfaceC2596d
    public final String echo() {
        String str = this.purple;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // s2.InterfaceC2595c
    public final void gold(int i4, long j5) {
        this.yellow[i4] = 2;
        this.red[i4] = j5;
    }

    public final void golf() {
        TreeMap treeMap = f12943b;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.alpha), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                Intrinsics.delta(it, "queryPool.descendingKeySet().iterator()");
                while (true) {
                    int i4 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i4;
                }
            }
        }
    }

    @Override // s2.InterfaceC2595c
    public final void ivory(int i4, byte[] bArr) {
        this.yellow[i4] = 5;
        this.white[i4] = bArr;
    }

    @Override // s2.InterfaceC2595c
    public final void oscar(int i4, String value) {
        Intrinsics.echo(value, "value");
        this.yellow[i4] = 4;
        this.teal[i4] = value;
    }

    @Override // s2.InterfaceC2595c
    public final void zulu(int i4, double d4) {
        this.yellow[i4] = 3;
        this.silver[i4] = d4;
    }
}
