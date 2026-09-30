package Oe;

import androidx.datastore.preferences.protobuf.au;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.O;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.P;
import com.google.protobuf.aw;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ag implements Iterator {
    public final /* synthetic */ int alpha;
    public int purple = -1;
    public boolean red;
    public Iterator silver;
    public final /* synthetic */ AbstractMap teal;

    public /* synthetic */ ag(AbstractMap abstractMap, int i4) {
        this.alpha = i4;
        this.teal = abstractMap;
    }

    public Iterator alpha() {
        switch (this.alpha) {
            case 0:
                if (this.silver == null) {
                    this.silver = ((ab) this.teal).red.entrySet().iterator();
                }
                return this.silver;
            case 1:
                if (this.silver == null) {
                    this.silver = ((au) this.teal).purple.entrySet().iterator();
                }
                return this.silver;
            default:
                if (this.silver == null) {
                    this.silver = ((aw) this.teal).red.entrySet().iterator();
                }
                return this.silver;
        }
    }

    public Iterator bravo() {
        if (this.silver == null) {
            this.silver = ((O) this.teal).red.entrySet().iterator();
        }
        return this.silver;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.alpha) {
            case 0:
                if (this.purple + 1 < ((ab) this.teal).purple.size() || alpha().hasNext()) {
                    return true;
                }
                return false;
            case 1:
                int i4 = this.purple + 1;
                au auVar = (au) this.teal;
                if (i4 < auVar.alpha.size()) {
                    return true;
                }
                if (!auVar.purple.isEmpty() && alpha().hasNext()) {
                    return true;
                }
                return false;
            case 2:
                int i5 = this.purple + 1;
                O o5 = (O) this.teal;
                if (i5 < o5.purple) {
                    return true;
                }
                if (!o5.red.isEmpty() && bravo().hasNext()) {
                    return true;
                }
                return false;
            default:
                int i10 = this.purple + 1;
                aw awVar = (aw) this.teal;
                if (i10 < awVar.purple.size()) {
                    return true;
                }
                if (!awVar.red.isEmpty() && alpha().hasNext()) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.alpha) {
            case 0:
                this.red = true;
                int i4 = this.purple + 1;
                this.purple = i4;
                ab abVar = (ab) this.teal;
                if (i4 < abVar.purple.size()) {
                    return (Map.Entry) abVar.purple.get(this.purple);
                }
                return (Map.Entry) alpha().next();
            case 1:
                this.red = true;
                int i5 = this.purple + 1;
                this.purple = i5;
                au auVar = (au) this.teal;
                if (i5 < auVar.alpha.size()) {
                    return (Map.Entry) auVar.alpha.get(this.purple);
                }
                return (Map.Entry) alpha().next();
            case 2:
                this.red = true;
                int i10 = this.purple + 1;
                this.purple = i10;
                O o5 = (O) this.teal;
                if (i10 < o5.purple) {
                    return (P) o5.alpha[i10];
                }
                return (Map.Entry) bravo().next();
            default:
                this.red = true;
                int i11 = this.purple + 1;
                this.purple = i11;
                aw awVar = (aw) this.teal;
                if (i11 < awVar.purple.size()) {
                    return (Map.Entry) awVar.purple.get(this.purple);
                }
                return (Map.Entry) alpha().next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        AbstractMap abstractMap = this.teal;
        switch (this.alpha) {
            case 0:
                if (this.red) {
                    this.red = false;
                    int i4 = ab.white;
                    ab abVar = (ab) abstractMap;
                    abVar.bravo();
                    if (this.purple < abVar.purple.size()) {
                        int i5 = this.purple;
                        this.purple = i5 - 1;
                        abVar.foxtrot(i5);
                        return;
                    }
                    alpha().remove();
                    return;
                }
                throw new IllegalStateException("remove() was called before next()");
            case 1:
                if (this.red) {
                    this.red = false;
                    int i10 = au.white;
                    au auVar = (au) abstractMap;
                    auVar.bravo();
                    if (this.purple < auVar.alpha.size()) {
                        int i11 = this.purple;
                        this.purple = i11 - 1;
                        auVar.hotel(i11);
                        return;
                    }
                    alpha().remove();
                    return;
                }
                throw new IllegalStateException("remove() was called before next()");
            case 2:
                if (this.red) {
                    this.red = false;
                    int i12 = O.yellow;
                    O o5 = (O) abstractMap;
                    o5.golf();
                    int i13 = this.purple;
                    if (i13 < o5.purple) {
                        this.purple = i13 - 1;
                        o5.echo(i13);
                        return;
                    } else {
                        bravo().remove();
                        return;
                    }
                }
                throw new IllegalStateException("remove() was called before next()");
            default:
                if (this.red) {
                    this.red = false;
                    int i14 = aw.yellow;
                    aw awVar = (aw) abstractMap;
                    awVar.bravo();
                    if (this.purple < awVar.purple.size()) {
                        int i15 = this.purple;
                        this.purple = i15 - 1;
                        awVar.golf(i15);
                        return;
                    }
                    alpha().remove();
                    return;
                }
                throw new IllegalStateException("remove() was called before next()");
        }
    }
}
