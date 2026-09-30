package androidx.fragment.app.strictmode;

import androidx.fragment.app.ai;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b&\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/fragment/app/strictmode/Violation;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Landroidx/fragment/app/ai;", "fragment", "", "violationMessage", "<init>", "(Landroidx/fragment/app/ai;Ljava/lang/String;)V", "Landroidx/fragment/app/ai;", "getFragment", "()Landroidx/fragment/app/ai;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class Violation extends RuntimeException {

    @NotNull
    private final ai fragment;

    public /* synthetic */ Violation(ai aiVar, String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(aiVar, (i4 & 2) != 0 ? null : str);
    }

    @NotNull
    public final ai getFragment() {
        return this.fragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Violation(@NotNull ai fragment, @Nullable String str) {
        super(str);
        Intrinsics.echo(fragment, "fragment");
        this.fragment = fragment;
    }
}
