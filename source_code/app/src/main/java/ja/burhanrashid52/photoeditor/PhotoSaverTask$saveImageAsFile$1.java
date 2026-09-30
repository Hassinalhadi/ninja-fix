package ja.burhanrashid52.photoeditor;

import Pd.c;
import Pd.e;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@e(c = "ja.burhanrashid52.photoeditor.PhotoSaverTask", f = "PhotoSaverTask.kt", l = {44}, m = "saveImageAsFile")
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PhotoSaverTask$saveImageAsFile$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PhotoSaverTask this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhotoSaverTask$saveImageAsFile$1(PhotoSaverTask photoSaverTask, Nd.c<? super PhotoSaverTask$saveImageAsFile$1> cVar) {
        super(cVar);
        this.this$0 = photoSaverTask;
    }

    @Override // Pd.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.saveImageAsFile(null, this);
    }
}
