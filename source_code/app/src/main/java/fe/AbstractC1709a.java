package fe;

import java.util.Iterator;
import s6.AbstractC2770s7;

/* renamed from: fe.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1709a implements Iterable, Yd.a {
    public final char alpha;
    public final char purple;
    public final int red = 1;

    public AbstractC1709a(char c3, char c4) {
        this.alpha = c3;
        this.purple = (char) AbstractC2770s7.alpha(c3, c4, 1);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1710b(this.alpha, this.purple, this.red);
    }
}
