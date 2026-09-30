package ja.burhanrashid52.photoeditor;

import Pd.c;
import Pd.e;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@e(c = "ja.burhanrashid52.photoeditor.ImageFilterView", f = "ImageFilterView.kt", l = {269, 124}, m = "saveBitmap$photoeditor_release")
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ImageFilterView$saveBitmap$1 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ImageFilterView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageFilterView$saveBitmap$1(ImageFilterView imageFilterView, Nd.c<? super ImageFilterView$saveBitmap$1> cVar) {
        super(cVar);
        this.this$0 = imageFilterView;
    }

    @Override // Pd.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.saveBitmap$photoeditor_release(this);
    }
}
