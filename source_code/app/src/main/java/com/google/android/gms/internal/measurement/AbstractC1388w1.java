package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.w1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1388w1 implements Cloneable {
    public final AbstractC1392x1 alpha;
    public AbstractC1392x1 purple;

    public AbstractC1388w1(AbstractC1392x1 abstractC1392x1) {
        this.alpha = abstractC1392x1;
        if (!abstractC1392x1.lima()) {
            this.purple = (AbstractC1392x1) abstractC1392x1.mike(4);
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    public static void alpha(int i4, List list) {
        String delta = av.q.delta(list.size() - i4, "Element at index ", " is null.");
        int size = list.size();
        while (true) {
            size--;
            if (size >= i4) {
                list.remove(size);
            } else {
                throw new NullPointerException(delta);
            }
        }
    }

    /* renamed from: bravo, reason: merged with bridge method [inline-methods] */
    public final AbstractC1388w1 clone() {
        AbstractC1388w1 abstractC1388w1 = (AbstractC1388w1) this.alpha.mike(5);
        abstractC1388w1.purple = foxtrot();
        return abstractC1388w1;
    }

    public final void charlie(AbstractC1392x1 abstractC1392x1) {
        AbstractC1392x1 abstractC1392x12 = this.alpha;
        if (!abstractC1392x12.equals(abstractC1392x1)) {
            if (!this.purple.lima()) {
                AbstractC1392x1 abstractC1392x13 = (AbstractC1392x1) abstractC1392x12.mike(4);
                U1.charlie.alpha(abstractC1392x13.getClass()).delta(abstractC1392x13, this.purple);
                this.purple = abstractC1392x13;
            }
            AbstractC1392x1 abstractC1392x14 = this.purple;
            U1.charlie.alpha(abstractC1392x14.getClass()).delta(abstractC1392x14, abstractC1392x1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, androidx.compose.foundation.layout.ag] */
    public final void delta(byte[] bArr, int i4, C1368r1 c1368r1) {
        if (!this.purple.lima()) {
            AbstractC1392x1 abstractC1392x1 = (AbstractC1392x1) this.alpha.mike(4);
            U1.charlie.alpha(abstractC1392x1.getClass()).delta(abstractC1392x1, this.purple);
            this.purple = abstractC1392x1;
        }
        try {
            X1 alpha = U1.charlie.alpha(this.purple.getClass());
            AbstractC1392x1 abstractC1392x12 = this.purple;
            ?? obj = new Object();
            c1368r1.getClass();
            alpha.india(abstractC1392x12, bArr, 0, i4, obj);
        } catch (zzmm e) {
            throw e;
        } catch (IOException e4) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e4);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public final AbstractC1392x1 echo() {
        AbstractC1392x1 foxtrot = foxtrot();
        foxtrot.getClass();
        boolean z2 = true;
        byte byteValue = ((Byte) foxtrot.mike(1)).byteValue();
        if (byteValue != 1) {
            if (byteValue == 0) {
                z2 = false;
            } else {
                z2 = U1.charlie.alpha(foxtrot.getClass()).charlie(foxtrot);
                foxtrot.mike(2);
            }
        }
        if (z2) {
            return foxtrot;
        }
        throw new zzod(foxtrot);
    }

    public final AbstractC1392x1 foxtrot() {
        if (!this.purple.lima()) {
            return this.purple;
        }
        AbstractC1392x1 abstractC1392x1 = this.purple;
        abstractC1392x1.getClass();
        U1.charlie.alpha(abstractC1392x1.getClass()).bravo(abstractC1392x1);
        abstractC1392x1.india();
        return this.purple;
    }

    public final void golf() {
        if (!this.purple.lima()) {
            AbstractC1392x1 abstractC1392x1 = (AbstractC1392x1) this.alpha.mike(4);
            U1.charlie.alpha(abstractC1392x1.getClass()).delta(abstractC1392x1, this.purple);
            this.purple = abstractC1392x1;
        }
    }
}
