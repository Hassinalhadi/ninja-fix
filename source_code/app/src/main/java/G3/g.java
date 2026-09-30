package G3;

import android.util.Log;
import com.airbnb.lottie.compose.LottieConstants;
import j.C1919b;
import j.m;
import j.n;
import j.o;
import j.q;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.NavigableMap;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public final class g {
    public final int alpha;
    public int bravo;
    public final Object charlie;
    public final Object delta;
    public final Object echo;
    public final Object foxtrot;

    public g(o oVar, int i4, int i5, j.j jVar, Be.e eVar) {
        this.foxtrot = oVar;
        this.charlie = oVar;
        this.alpha = i4;
        this.bravo = i5;
        this.delta = jVar;
        this.echo = eVar;
    }

    public long alpha(int i4, int i5) {
        int i10;
        o oVar = (o) this.charlie;
        int[] iArr = oVar.alpha;
        if (i5 == 1) {
            i10 = iArr[i4];
        } else {
            int i11 = (i5 + i4) - 1;
            int[] iArr2 = oVar.bravo;
            i10 = (iArr2[i11] + iArr[i11]) - iArr2[i4];
        }
        if (i10 < 0) {
            i10 = 0;
        }
        if (i10 < 0) {
            Q0.j.alpha("width must be >= 0");
        }
        return Q0.b.hotel(i10, i10, 0, LottieConstants.IterateForever);
    }

    public synchronized void bravo() {
        delta(0);
    }

    public void charlie(int i4, Class cls) {
        NavigableMap india = india(cls);
        Integer num = (Integer) india.get(Integer.valueOf(i4));
        if (num != null) {
            if (num.intValue() == 1) {
                india.remove(Integer.valueOf(i4));
                return;
            } else {
                india.put(Integer.valueOf(i4), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i4 + ", this: " + this);
    }

    public void delta(int i4) {
        while (this.bravo > i4) {
            Object J4 = ((J2.e) this.charlie).J();
            Y3.f.bravo(J4);
            c foxtrot = foxtrot(J4.getClass());
            this.bravo -= foxtrot.bravo() * foxtrot.alpha(J4);
            charlie(foxtrot.alpha(J4), J4.getClass());
            if (Log.isLoggable(foxtrot.charlie(), 2)) {
                Log.v(foxtrot.charlie(), "evicted: " + foxtrot.alpha(J4));
            }
        }
    }

    public synchronized Object echo(int i4, Class cls) {
        e eVar;
        int i5;
        try {
            Integer num = (Integer) india(cls).ceilingKey(Integer.valueOf(i4));
            if (num == null || ((i5 = this.bravo) != 0 && this.alpha / i5 < 2 && num.intValue() > i4 * 8)) {
                f fVar = (f) this.delta;
                i iVar = (i) ((ArrayDeque) fVar.alpha).poll();
                if (iVar == null) {
                    iVar = fVar.X();
                }
                eVar = (e) iVar;
                eVar.bravo = i4;
                eVar.charlie = cls;
            }
            f fVar2 = (f) this.delta;
            int intValue = num.intValue();
            i iVar2 = (i) ((ArrayDeque) fVar2.alpha).poll();
            if (iVar2 == null) {
                iVar2 = fVar2.X();
            }
            eVar = (e) iVar2;
            eVar.bravo = intValue;
            eVar.charlie = cls;
        } catch (Throwable th) {
            throw th;
        }
        return hotel(eVar, cls);
    }

    public c foxtrot(Class cls) {
        c cVar;
        HashMap hashMap = (HashMap) this.foxtrot;
        c cVar2 = (c) hashMap.get(cls);
        if (cVar2 == null) {
            if (cls.equals(int[].class)) {
                cVar = new c(1);
            } else if (cls.equals(byte[].class)) {
                cVar = new c(0);
            } else {
                throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
            }
            hashMap.put(cls, cVar);
            return cVar;
        }
        return cVar2;
    }

    public n golf(int i4) {
        int i5;
        q foxtrot = ((Be.e) this.echo).foxtrot(i4);
        List list = foxtrot.bravo;
        int size = list.size();
        int i10 = foxtrot.alpha;
        if (size != 0 && i10 + size != this.alpha) {
            i5 = this.bravo;
        } else {
            i5 = 0;
        }
        m[] mVarArr = new m[size];
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            int i13 = (int) ((C1919b) list.get(i12)).alpha;
            m X10 = ((j.j) this.delta).X(i10 + i12, i11, i13, i5, alpha(i11, i13));
            i11 += i13;
            mVarArr[i12] = X10;
        }
        return new n(i4, mVarArr, (o) this.foxtrot, foxtrot.bravo, i5);
    }

    public Object hotel(e eVar, Class cls) {
        c foxtrot = foxtrot(cls);
        Object B = ((J2.e) this.charlie).B(eVar);
        if (B != null) {
            this.bravo -= foxtrot.bravo() * foxtrot.alpha(B);
            charlie(foxtrot.alpha(B), cls);
        }
        if (B == null) {
            if (Log.isLoggable(foxtrot.charlie(), 2)) {
                Log.v(foxtrot.charlie(), "Allocated " + eVar.bravo + " bytes");
            }
            int i4 = eVar.bravo;
            switch (foxtrot.alpha) {
                case 0:
                    return new byte[i4];
                default:
                    return new int[i4];
            }
        }
        return B;
    }

    public NavigableMap india(Class cls) {
        HashMap hashMap = (HashMap) this.echo;
        NavigableMap navigableMap = (NavigableMap) hashMap.get(cls);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            hashMap.put(cls, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    public synchronized void juliet(Object obj) {
        Class<?> cls = obj.getClass();
        c foxtrot = foxtrot(cls);
        int alpha = foxtrot.alpha(obj);
        int bravo = foxtrot.bravo() * alpha;
        if (bravo <= this.alpha / 2) {
            f fVar = (f) this.delta;
            i iVar = (i) ((ArrayDeque) fVar.alpha).poll();
            if (iVar == null) {
                iVar = fVar.X();
            }
            e eVar = (e) iVar;
            eVar.bravo = alpha;
            eVar.charlie = cls;
            ((J2.e) this.charlie).H(eVar, obj);
            NavigableMap india = india(cls);
            Integer num = (Integer) india.get(Integer.valueOf(eVar.bravo));
            Integer valueOf = Integer.valueOf(eVar.bravo);
            int i4 = 1;
            if (num != null) {
                i4 = 1 + num.intValue();
            }
            india.put(valueOf, Integer.valueOf(i4));
            this.bravo += bravo;
            delta(this.alpha);
        }
    }

    public synchronized void kilo(int i4) {
        try {
            if (i4 >= 40) {
                bravo();
            } else if (i4 >= 20 || i4 == 15) {
                delta(this.alpha / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public g(int i4) {
        this.charlie = new J2.e();
        this.delta = new f(0);
        this.echo = new HashMap();
        this.foxtrot = new HashMap();
        this.alpha = i4;
    }
}
