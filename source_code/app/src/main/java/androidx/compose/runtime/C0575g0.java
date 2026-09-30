package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.compose.runtime.g0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0575g0 implements Iterable, Yd.a {

    /* renamed from: a, reason: collision with root package name */
    public int f3003a;

    /* renamed from: c, reason: collision with root package name */
    public HashMap f3005c;

    /* renamed from: d, reason: collision with root package name */
    public bv.aa f3006d;
    public int purple;
    public int silver;
    public int teal;
    public boolean yellow;
    public int[] alpha = new int[0];
    public Object[] red = new Object[0];
    public final Object white = new Object();

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f3004b = new ArrayList();

    public final int alpha(C0562a c0562a) {
        if (this.yellow) {
            r.charlie("Use active SlotWriter to determine anchor location instead");
        }
        if (!c0562a.alpha()) {
            J.alpha("Anchor refers to a group that was removed");
        }
        return c0562a.alpha;
    }

    public final void bravo() {
        this.f3005c = new HashMap();
    }

    public final C0573f0 delta() {
        if (!this.yellow) {
            this.teal++;
            return new C0573f0(this);
        }
        throw new IllegalStateException("Cannot read while a writer is pending");
    }

    public final j0 hotel() {
        if (this.yellow) {
            r.charlie("Cannot start a writer when another writer is pending");
        }
        if (this.teal > 0) {
            r.charlie("Cannot start a writer when a reader is pending");
        }
        this.yellow = true;
        this.f3003a++;
        return new j0(this);
    }

    public final boolean india(C0562a c0562a) {
        int echo;
        if (c0562a.alpha() && (echo = i0.echo(this.f3004b, c0562a.alpha, this.purple)) >= 0 && Intrinsics.areEqual(this.f3004b.get(echo), c0562a)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new aj(this, 0, this.purple);
    }

    public final ak kilo(int i4) {
        C0562a c0562a;
        int i5;
        ArrayList arrayList;
        int echo;
        HashMap hashMap = this.f3005c;
        if (hashMap != null) {
            if (this.yellow) {
                r.charlie("use active SlotWriter to crate an anchor for location instead");
            }
            if (i4 >= 0 && i4 < (i5 = this.purple) && (echo = i0.echo((arrayList = this.f3004b), i4, i5)) >= 0) {
                c0562a = (C0562a) arrayList.get(echo);
            } else {
                c0562a = null;
            }
            if (c0562a != null) {
                return (ak) hashMap.get(c0562a);
            }
        }
        return null;
    }
}
