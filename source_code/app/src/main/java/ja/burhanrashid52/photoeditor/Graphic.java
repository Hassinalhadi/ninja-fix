package ja.burhanrashid52.photoeditor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import ja.burhanrashid52.photoeditor.MultiTouchListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b \u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0004J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010 \u001a\u00020\u001eH\u0004J\u0010\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u0012H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lja/burhanrashid52/photoeditor/Graphic;", "", "context", "Landroid/content/Context;", "layoutId", "", "viewType", "Lja/burhanrashid52/photoeditor/ViewType;", "graphicManager", "Lja/burhanrashid52/photoeditor/GraphicManager;", "(Landroid/content/Context;ILja/burhanrashid52/photoeditor/ViewType;Lja/burhanrashid52/photoeditor/GraphicManager;)V", "getContext", "()Landroid/content/Context;", "getGraphicManager", "()Lja/burhanrashid52/photoeditor/GraphicManager;", "getLayoutId", "()I", "rootView", "Landroid/view/View;", "getRootView", "()Landroid/view/View;", "getViewType", "()Lja/burhanrashid52/photoeditor/ViewType;", "buildGestureController", "Lja/burhanrashid52/photoeditor/MultiTouchListener$OnGestureControl;", "photoEditorView", "Lja/burhanrashid52/photoeditor/PhotoEditorView;", "viewState", "Lja/burhanrashid52/photoeditor/PhotoEditorViewState;", "setupRemoveView", "", "setupView", "toggleSelection", "updateView", "view", "photoeditor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class Graphic {

    @NotNull
    private final Context context;

    @Nullable
    private final GraphicManager graphicManager;
    private final int layoutId;

    @NotNull
    private final View rootView;

    @NotNull
    private final ViewType viewType;

    public Graphic(@NotNull Context context, int i4, @NotNull ViewType viewType, @Nullable GraphicManager graphicManager) {
        Intrinsics.echo(context, "context");
        Intrinsics.echo(viewType, "viewType");
        this.context = context;
        this.layoutId = i4;
        this.viewType = viewType;
        this.graphicManager = graphicManager;
        if (i4 != 0) {
            View inflate = LayoutInflater.from(context).inflate(i4, (ViewGroup) null);
            Intrinsics.delta(inflate, "from(context).inflate(layoutId, null)");
            this.rootView = inflate;
            setupView(inflate);
            setupRemoveView(inflate);
            return;
        }
        throw new UnsupportedOperationException("Layout id cannot be zero. Please define a layout");
    }

    public static /* synthetic */ void alpha(Graphic graphic, View view) {
        setupRemoveView$lambda$0(graphic, view);
    }

    private final void setupRemoveView(View rootView) {
        rootView.setTag(this.viewType);
        ImageView imageView = (ImageView) rootView.findViewById(R.id.imgPhotoEditorClose);
        if (imageView != null) {
            imageView.setOnClickListener(new com.clevertap.android.sdk.inapp.fragment.a(8, this));
        }
    }

    public static final void setupRemoveView$lambda$0(Graphic this$0, View view) {
        Intrinsics.echo(this$0, "this$0");
        GraphicManager graphicManager = this$0.graphicManager;
        if (graphicManager != null) {
            graphicManager.removeView(this$0);
        }
    }

    @NotNull
    public final MultiTouchListener.OnGestureControl buildGestureController(@NotNull PhotoEditorView photoEditorView, @NotNull final PhotoEditorViewState viewState) {
        Intrinsics.echo(photoEditorView, "photoEditorView");
        Intrinsics.echo(viewState, "viewState");
        final BoxHelper boxHelper = new BoxHelper(photoEditorView, viewState);
        return new MultiTouchListener.OnGestureControl() { // from class: ja.burhanrashid52.photoeditor.Graphic$buildGestureController$1
            @Override // ja.burhanrashid52.photoeditor.MultiTouchListener.OnGestureControl
            public void onClick() {
                BoxHelper.this.clearHelperBox();
                this.toggleSelection();
                viewState.setCurrentSelectedView(this.getRootView());
            }

            @Override // ja.burhanrashid52.photoeditor.MultiTouchListener.OnGestureControl
            public void onLongClick() {
                Graphic graphic = this;
                graphic.updateView(graphic.getRootView());
            }
        };
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Nullable
    public final GraphicManager getGraphicManager() {
        return this.graphicManager;
    }

    public final int getLayoutId() {
        return this.layoutId;
    }

    @NotNull
    public final View getRootView() {
        return this.rootView;
    }

    @NotNull
    public final ViewType getViewType() {
        return this.viewType;
    }

    public void setupView(@NotNull View rootView) {
        Intrinsics.echo(rootView, "rootView");
    }

    public final void toggleSelection() {
        View findViewById = this.rootView.findViewById(R.id.frmBorder);
        View findViewById2 = this.rootView.findViewById(R.id.imgPhotoEditorClose);
        if (findViewById != null) {
            findViewById.setBackgroundResource(R.drawable.rounded_border_tv);
            findViewById.setTag(Boolean.TRUE);
        }
        if (findViewById2 != null) {
            findViewById2.setVisibility(0);
        }
    }

    public void updateView(@NotNull View view) {
        Intrinsics.echo(view, "view");
    }
}
