package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1363q implements Iterator {
    public final /* synthetic */ int alpha;
    public int purple = 0;
    public final /* synthetic */ Object red;

    public /* synthetic */ C1363q(int i4, Object obj) {
        this.alpha = i4;
        this.red = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.alpha) {
            case 0:
                if (this.purple < ((r) this.red).alpha.length()) {
                    return true;
                }
                return false;
            case 1:
                if (this.purple < ((r) this.red).alpha.length()) {
                    return true;
                }
                return false;
            default:
                if (this.purple < ((C1308e) this.red).november()) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        switch (this.alpha) {
            case 0:
                int i4 = this.purple;
                if (i4 < ((r) this.red).alpha.length()) {
                    this.purple = i4 + 1;
                    return new r(String.valueOf(i4));
                }
                throw new NoSuchElementException();
            case 1:
                int i5 = this.purple;
                r rVar = (r) this.red;
                if (i5 < rVar.alpha.length()) {
                    this.purple = i5 + 1;
                    return new r(String.valueOf(rVar.alpha.charAt(i5)));
                }
                throw new NoSuchElementException();
            default:
                int i10 = this.purple;
                C1308e c1308e = (C1308e) this.red;
                if (i10 < c1308e.november()) {
                    int i11 = this.purple;
                    this.purple = i11 + 1;
                    return c1308e.oscar(i11);
                }
                throw new NoSuchElementException(ao.ad.zulu(this.purple, "Out of bounds index: "));
        }
    }
}
