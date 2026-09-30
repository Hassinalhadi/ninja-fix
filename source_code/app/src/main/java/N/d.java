package N;

import bv.aj;
import bv.ak;
import bv.an;
import bv.ao;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.io.h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pf.C2359i;
import s6.AbstractC2770s7;

/* loaded from: classes3.dex */
public class d implements Iterator, Yd.a {
    public final /* synthetic */ int alpha;
    public int purple;
    public Object red;
    public final Object silver;

    public d(Map map, Object obj) {
        this.alpha = 0;
        this.red = obj;
        this.silver = map;
    }

    public void alpha() {
        Object invoke;
        int i4;
        int i5 = this.purple;
        h hVar = (h) this.silver;
        if (i5 == -2) {
            invoke = ((Function0) hVar.bravo).invoke();
        } else {
            Function1 function1 = (Function1) hVar.charlie;
            Object obj = this.red;
            Intrinsics.checkNotNull(obj);
            invoke = function1.invoke(obj);
        }
        this.red = invoke;
        if (invoke == null) {
            i4 = 0;
        } else {
            i4 = 1;
        }
        this.purple = i4;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.alpha) {
            case 0:
                if (this.purple < ((Map) this.silver).size()) {
                    return true;
                }
                return false;
            case 1:
                return ((C2359i) this.red).hasNext();
            case 2:
                return ((C2359i) this.red).hasNext();
            default:
                if (this.purple < 0) {
                    alpha();
                }
                if (this.purple == 1) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.alpha) {
            case 0:
                if (hasNext()) {
                    Object obj = this.red;
                    this.purple++;
                    Object obj2 = ((Map) this.silver).get(obj);
                    if (obj2 != null) {
                        this.red = ((a) obj2).bravo;
                        return obj;
                    }
                    throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
                }
                throw new NoSuchElementException();
            case 1:
                return ((C2359i) this.red).next();
            case 2:
                return ((C2359i) this.red).next();
            default:
                if (this.purple < 0) {
                    alpha();
                }
                if (this.purple != 0) {
                    Object obj3 = this.red;
                    Intrinsics.charlie(obj3, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                    this.purple = -1;
                    return obj3;
                }
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        switch (this.alpha) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                int i4 = this.purple;
                if (i4 != -1) {
                    ((ak) this.silver).purple.hotel(i4);
                    this.purple = -1;
                    return;
                }
                return;
            case 2:
                int i5 = this.purple;
                if (i5 != -1) {
                    ((ao) this.silver).purple.mike(i5);
                    this.purple = -1;
                    return;
                }
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public d(h hVar) {
        this.alpha = 3;
        this.silver = hVar;
        this.purple = -2;
    }

    public d(ao aoVar) {
        this.alpha = 2;
        this.silver = aoVar;
        this.purple = -1;
        this.red = AbstractC2770s7.bravo(new an(aoVar, this, null));
    }

    public d(ak akVar) {
        this.alpha = 1;
        this.silver = akVar;
        this.purple = -1;
        this.red = AbstractC2770s7.bravo(new aj(akVar, this, null));
    }
}
