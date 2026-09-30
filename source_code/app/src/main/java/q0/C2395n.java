package q0;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;

/* renamed from: q0.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2395n extends AbstractC2367C {
    public final /* synthetic */ int white;

    public C2395n(int i4, int i5, int i10) {
        this.white = i10;
        switch (i10) {
            case 1:
                yellow((i5 & 4294967295L) | (i4 << 32));
                return;
            case 2:
                yellow((i5 & 4294967295L) | (i4 << 32));
                return;
            default:
                yellow((i5 & 4294967295L) | (i4 << 32));
                return;
        }
    }

    private final void b(long j5, float f5, Function1 function1) {
    }

    private final void c(long j5, float f5, Function1 function1) {
    }

    private final void d(long j5, float f5, Function1 function1) {
    }

    @Override // q0.AbstractC2367C
    public final int magenta(C2396o c2396o) {
        switch (this.white) {
            case 0:
                return RecyclerView.UNDEFINED_DURATION;
            case 1:
                return RecyclerView.UNDEFINED_DURATION;
            default:
                return RecyclerView.UNDEFINED_DURATION;
        }
    }

    @Override // q0.AbstractC2367C
    public final void silver(long j5, float f5, Function1 function1) {
        int i4 = this.white;
    }
}
