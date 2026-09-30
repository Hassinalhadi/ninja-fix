package pf;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: pf.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2359i implements Iterator, Nd.c, Yd.a {
    public int alpha;
    public Object purple;
    public Iterator red;
    public Nd.c silver;

    public final RuntimeException alpha() {
        int i4 = this.alpha;
        if (i4 != 4) {
            if (i4 != 5) {
                return new IllegalStateException("Unexpected state of the iterator: " + this.alpha);
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    public final void bravo(Nd.c frame, Object obj) {
        this.purple = obj;
        this.alpha = 3;
        this.silver = frame;
        Od.a aVar = Od.a.alpha;
        Intrinsics.echo(frame, "frame");
    }

    @Override // Nd.c
    public final Nd.h getContext() {
        return Nd.i.alpha;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i4 = this.alpha;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 == 2 || i4 == 3) {
                        return true;
                    }
                    if (i4 == 4) {
                        return false;
                    }
                    throw alpha();
                }
                Iterator it = this.red;
                Intrinsics.checkNotNull(it);
                if (it.hasNext()) {
                    this.alpha = 2;
                    return true;
                }
                this.red = null;
            }
            this.alpha = 5;
            Nd.c cVar = this.silver;
            Intrinsics.checkNotNull(cVar);
            this.silver = null;
            cVar.resumeWith(Result.m206constructorimpl(Unit.INSTANCE));
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i4 = this.alpha;
        if (i4 != 0 && i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3) {
                    this.alpha = 0;
                    Object obj = this.purple;
                    this.purple = null;
                    return obj;
                }
                throw alpha();
            }
            this.alpha = 1;
            Iterator it = this.red;
            Intrinsics.checkNotNull(it);
            return it.next();
        }
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // Nd.c
    public final void resumeWith(Object obj) {
        ResultKt.alpha(obj);
        this.alpha = 4;
    }
}
