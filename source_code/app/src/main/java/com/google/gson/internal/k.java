package com.google.gson.internal;

import com.squareup.moshi.ae;
import com.squareup.moshi.af;
import java.util.AbstractMap;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public abstract class k implements Iterator {
    public int purple;
    public Map.Entry red;
    public final /* synthetic */ AbstractMap teal;
    public final /* synthetic */ int alpha = 0;
    public Map.Entry silver = null;

    public k(m mVar) {
        this.teal = mVar;
        this.red = mVar.white.silver;
        this.purple = mVar.teal;
    }

    public l alpha() {
        l lVar = (l) this.red;
        m mVar = (m) this.teal;
        if (lVar != mVar.white) {
            if (mVar.teal == this.purple) {
                this.red = lVar.silver;
                this.silver = lVar;
                return lVar;
            }
            throw new ConcurrentModificationException();
        }
        throw new NoSuchElementException();
    }

    public ae bravo() {
        ae aeVar = (ae) this.red;
        af afVar = (af) this.teal;
        if (aeVar != afVar.red) {
            if (afVar.teal == this.purple) {
                this.red = aeVar.silver;
                this.silver = aeVar;
                return aeVar;
            }
            throw new ConcurrentModificationException();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.alpha) {
            case 0:
                if (((l) this.red) != ((m) this.teal).white) {
                    return true;
                }
                return false;
            default:
                if (((ae) this.red) != ((af) this.teal).red) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.alpha) {
            case 0:
                return alpha();
            default:
                return bravo();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.alpha) {
            case 0:
                l lVar = (l) this.silver;
                if (lVar != null) {
                    m mVar = (m) this.teal;
                    mVar.charlie(lVar, true);
                    this.silver = null;
                    this.purple = mVar.teal;
                    return;
                }
                throw new IllegalStateException();
            default:
                ae aeVar = (ae) this.silver;
                if (aeVar != null) {
                    af afVar = (af) this.teal;
                    afVar.charlie(aeVar, true);
                    this.silver = null;
                    this.purple = afVar.teal;
                    return;
                }
                throw new IllegalStateException();
        }
    }

    public k(af afVar) {
        this.teal = afVar;
        this.red = afVar.red.silver;
        this.purple = afVar.teal;
    }
}
