package ja.burhanrashid52.photoeditor;

import Nd.c;
import Pd.e;
import Pd.i;
import Xd.l;
import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vf.ab;

@e(c = "ja.burhanrashid52.photoeditor.PhotoEditorImpl$saveAsBitmap$3", f = "PhotoEditorImpl.kt", l = {250}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvf/ab;", "", "<anonymous>", "(Lvf/ab;)V"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class PhotoEditorImpl$saveAsBitmap$3 extends i implements l {
    final /* synthetic */ OnSaveBitmap $onSaveBitmap;
    final /* synthetic */ SaveSettings $saveSettings;
    int label;
    final /* synthetic */ PhotoEditorImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhotoEditorImpl$saveAsBitmap$3(PhotoEditorImpl photoEditorImpl, SaveSettings saveSettings, OnSaveBitmap onSaveBitmap, c<? super PhotoEditorImpl$saveAsBitmap$3> cVar) {
        super(2, cVar);
        this.this$0 = photoEditorImpl;
        this.$saveSettings = saveSettings;
        this.$onSaveBitmap = onSaveBitmap;
    }

    @Override // Pd.a
    @NotNull
    public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
        return new PhotoEditorImpl$saveAsBitmap$3(this.this$0, this.$saveSettings, this.$onSaveBitmap, cVar);
    }

    @Override // Pd.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.label;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            PhotoEditorImpl photoEditorImpl = this.this$0;
            SaveSettings saveSettings = this.$saveSettings;
            this.label = 1;
            obj = photoEditorImpl.saveAsBitmap(saveSettings, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        this.$onSaveBitmap.onBitmapReady((Bitmap) obj);
        return Unit.INSTANCE;
    }

    @Override // Xd.l
    @Nullable
    public final Object invoke(@NotNull ab abVar, @Nullable c<? super Unit> cVar) {
        return ((PhotoEditorImpl$saveAsBitmap$3) create(abVar, cVar)).invokeSuspend(Unit.INSTANCE);
    }
}
