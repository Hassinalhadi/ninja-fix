package T0;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.runtime.C0584p;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import l0.C2047d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s0.W;
import t0.AbstractC2902a;

/* loaded from: classes3.dex */
public final class t extends j {

    /* renamed from: t, reason: collision with root package name */
    public final View f2085t;

    /* renamed from: u, reason: collision with root package name */
    public final C2047d f2086u;

    /* renamed from: v, reason: collision with root package name */
    public R.f f2087v;

    /* renamed from: w, reason: collision with root package name */
    public Function1 f2088w;

    /* renamed from: x, reason: collision with root package name */
    public Function1 f2089x;

    /* renamed from: y, reason: collision with root package name */
    public Function1 f2090y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public t(Context context, Function1 function1, C0584p c0584p, R.g gVar, int i4, W w4) {
        super(context, c0584p, i4, r4, r5, w4);
        Object obj;
        View view = (View) function1.invoke(context);
        C2047d c2047d = new C2047d();
        this.f2085t = view;
        this.f2086u = c2047d;
        setClipChildren(false);
        String valueOf = String.valueOf(i4);
        if (gVar != null) {
            obj = gVar.delta(valueOf);
        } else {
            obj = null;
        }
        SparseArray<Parcelable> sparseArray = obj instanceof SparseArray ? (SparseArray) obj : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        if (gVar != null) {
            setSavableRegistryEntry(gVar.echo(valueOf, new i(this, 2)));
        }
        b bVar = androidx.compose.ui.viewinterop.a.alpha;
        this.f2088w = bVar;
        this.f2089x = bVar;
        this.f2090y = bVar;
    }

    public static final void golf(t tVar) {
        tVar.setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(R.f fVar) {
        R.f fVar2 = this.f2087v;
        if (fVar2 != null) {
            ((J2.t) fVar2).azure();
        }
        this.f2087v = fVar;
    }

    @NotNull
    public final C2047d getDispatcher() {
        return this.f2086u;
    }

    @NotNull
    public final Function1<View, Unit> getReleaseBlock() {
        return this.f2090y;
    }

    @NotNull
    public final Function1<View, Unit> getResetBlock() {
        return this.f2089x;
    }

    @Nullable
    public /* bridge */ /* synthetic */ AbstractC2902a getSubCompositionView() {
        return null;
    }

    @NotNull
    public final Function1<View, Unit> getUpdateBlock() {
        return this.f2088w;
    }

    @NotNull
    public View getViewRoot() {
        return this;
    }

    public final void setReleaseBlock(@NotNull Function1<View, Unit> function1) {
        this.f2090y = function1;
        setRelease(new i(this, 3));
    }

    public final void setResetBlock(@NotNull Function1<View, Unit> function1) {
        this.f2089x = function1;
        setReset(new i(this, 4));
    }

    public final void setUpdateBlock(@NotNull Function1<View, Unit> function1) {
        this.f2088w = function1;
        setUpdate(new i(this, 5));
    }
}
