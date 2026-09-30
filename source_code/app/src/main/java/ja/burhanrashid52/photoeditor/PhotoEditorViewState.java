package ja.burhanrashid52.photoeditor;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0005J\u0006\u0010\u0016\u001a\u00020\u0014J\u0006\u0010\u0017\u001a\u00020\u0014J\u0006\u0010\u0018\u001a\u00020\u0014J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u0005J\u000e\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0007J\u000e\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0007J\u0006\u0010\u001e\u001a\u00020\u0005J\u000e\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0005J\u000e\u0010 \u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0005J\u000e\u0010 \u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0007J\u000e\u0010!\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\t¨\u0006\""}, d2 = {"Lja/burhanrashid52/photoeditor/PhotoEditorViewState;", "", "()V", "addedViews", "", "Landroid/view/View;", "addedViewsCount", "", "getAddedViewsCount", "()I", "currentSelectedView", "getCurrentSelectedView", "()Landroid/view/View;", "setCurrentSelectedView", "(Landroid/view/View;)V", "redoViews", "Ljava/util/Stack;", "redoViewsCount", "getRedoViewsCount", "addAddedView", "", "view", "clearAddedViews", "clearCurrentSelectedView", "clearRedoViews", "containsAddedView", "", "getAddedView", "index", "getRedoView", "popRedoView", "pushRedoView", "removeAddedView", "replaceAddedView", "photoeditor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PhotoEditorViewState {

    @Nullable
    private View currentSelectedView;

    @NotNull
    private final List<View> addedViews = new ArrayList();

    @NotNull
    private final Stack<View> redoViews = new Stack<>();

    public final void addAddedView(@NotNull View view) {
        Intrinsics.echo(view, "view");
        this.addedViews.add(view);
    }

    public final void clearAddedViews() {
        this.addedViews.clear();
    }

    public final void clearCurrentSelectedView() {
        this.currentSelectedView = null;
    }

    public final void clearRedoViews() {
        this.redoViews.clear();
    }

    public final boolean containsAddedView(@NotNull View view) {
        Intrinsics.echo(view, "view");
        return this.addedViews.contains(view);
    }

    @NotNull
    public final View getAddedView(int index) {
        return this.addedViews.get(index);
    }

    public final int getAddedViewsCount() {
        return this.addedViews.size();
    }

    @Nullable
    public final View getCurrentSelectedView() {
        return this.currentSelectedView;
    }

    @NotNull
    public final View getRedoView(int index) {
        View view = this.redoViews.get(index);
        Intrinsics.delta(view, "redoViews[index]");
        return view;
    }

    public final int getRedoViewsCount() {
        return this.redoViews.size();
    }

    @NotNull
    public final View popRedoView() {
        View pop = this.redoViews.pop();
        Intrinsics.delta(pop, "redoViews.pop()");
        return pop;
    }

    public final void pushRedoView(@NotNull View view) {
        Intrinsics.echo(view, "view");
        this.redoViews.push(view);
    }

    public final void removeAddedView(@NotNull View view) {
        Intrinsics.echo(view, "view");
        this.addedViews.remove(view);
    }

    public final boolean replaceAddedView(@NotNull View view) {
        Intrinsics.echo(view, "view");
        int indexOf = this.addedViews.indexOf(view);
        if (indexOf > -1) {
            this.addedViews.set(indexOf, view);
            return true;
        }
        return false;
    }

    public final void setCurrentSelectedView(@Nullable View view) {
        this.currentSelectedView = view;
    }

    @NotNull
    public final View removeAddedView(int index) {
        return this.addedViews.remove(index);
    }
}
