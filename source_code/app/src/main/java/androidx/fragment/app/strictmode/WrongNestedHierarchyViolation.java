package androidx.fragment.app.strictmode;

import androidx.appcompat.widget.P0;
import androidx.fragment.app.ai;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/fragment/app/strictmode/WrongNestedHierarchyViolation;", "Landroidx/fragment/app/strictmode/Violation;", "Landroidx/fragment/app/ai;", "fragment", "expectedParentFragment", "", "containerId", "<init>", "(Landroidx/fragment/app/ai;Landroidx/fragment/app/ai;I)V", "Landroidx/fragment/app/ai;", "getExpectedParentFragment", "()Landroidx/fragment/app/ai;", "I", "getContainerId", "()I", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WrongNestedHierarchyViolation extends Violation {
    private final int containerId;

    @NotNull
    private final ai expectedParentFragment;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WrongNestedHierarchyViolation(@NotNull ai fragment, @NotNull ai expectedParentFragment, int i4) {
        super(fragment, P0.cyan(r0, i4, " without using parent's childFragmentManager"));
        Intrinsics.echo(fragment, "fragment");
        Intrinsics.echo(expectedParentFragment, "expectedParentFragment");
        StringBuilder sb2 = new StringBuilder("Attempting to nest fragment ");
        sb2.append(fragment);
        sb2.append(" within the view of parent fragment ");
        sb2.append(expectedParentFragment);
        sb2.append(" via container with ID ");
        this.expectedParentFragment = expectedParentFragment;
        this.containerId = i4;
    }

    public final int getContainerId() {
        return this.containerId;
    }

    @NotNull
    public final ai getExpectedParentFragment() {
        return this.expectedParentFragment;
    }
}
