package ja.burhanrashid52.photoeditor;

import Pd.c;
import Pd.e;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@e(c = "ja.burhanrashid52.photoeditor.PhotoEditorView", f = "PhotoEditorView.kt", l = {134}, m = "saveFilter$photoeditor_release")
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PhotoEditorView$saveFilter$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PhotoEditorView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhotoEditorView$saveFilter$1(PhotoEditorView photoEditorView, Nd.c<? super PhotoEditorView$saveFilter$1> cVar) {
        super(cVar);
        this.this$0 = photoEditorView;
    }

    @Override // Pd.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.saveFilter$photoeditor_release(this);
    }
}
