package androidx.compose.foundation.lazy.layout;

import bz.C0788m;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll;", "Ljava/util/concurrent/CancellationException;", "Lkotlin/coroutines/cancellation/CancellationException;", "", "itemOffset", "Lbz/m;", "", "Lbz/n;", "previousAnimation", "<init>", "(ILbz/m;)V", "I", "getItemOffset", "()I", "Lbz/m;", "getPreviousAnimation", "()Lbz/m;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class ItemFoundInScroll extends CancellationException {
    private final int itemOffset;

    @NotNull
    private final C0788m previousAnimation;

    public ItemFoundInScroll(int i4, @NotNull C0788m c0788m) {
        this.itemOffset = i4;
        this.previousAnimation = c0788m;
    }

    public final int getItemOffset() {
        return this.itemOffset;
    }

    @NotNull
    public final C0788m getPreviousAnimation() {
        return this.previousAnimation;
    }
}
