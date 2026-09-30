package ja.burhanrashid52.photoeditor;

import Nd.c;
import Pd.e;
import Pd.i;
import Xd.l;
import ja.burhanrashid52.photoeditor.PhotoEditor;
import ja.burhanrashid52.photoeditor.SaveFileResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vf.ab;

@e(c = "ja.burhanrashid52.photoeditor.PhotoEditorImpl$saveAsFile$3", f = "PhotoEditorImpl.kt", l = {236}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvf/ab;", "", "<anonymous>", "(Lvf/ab;)V"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class PhotoEditorImpl$saveAsFile$3 extends i implements l {
    final /* synthetic */ String $imagePath;
    final /* synthetic */ PhotoEditor.OnSaveListener $onSaveListener;
    final /* synthetic */ SaveSettings $saveSettings;
    int label;
    final /* synthetic */ PhotoEditorImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhotoEditorImpl$saveAsFile$3(PhotoEditorImpl photoEditorImpl, String str, SaveSettings saveSettings, PhotoEditor.OnSaveListener onSaveListener, c<? super PhotoEditorImpl$saveAsFile$3> cVar) {
        super(2, cVar);
        this.this$0 = photoEditorImpl;
        this.$imagePath = str;
        this.$saveSettings = saveSettings;
        this.$onSaveListener = onSaveListener;
    }

    @Override // Pd.a
    @NotNull
    public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
        return new PhotoEditorImpl$saveAsFile$3(this.this$0, this.$imagePath, this.$saveSettings, this.$onSaveListener, cVar);
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
            String str = this.$imagePath;
            SaveSettings saveSettings = this.$saveSettings;
            this.label = 1;
            obj = photoEditorImpl.saveAsFile(str, saveSettings, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        SaveFileResult saveFileResult = (SaveFileResult) obj;
        if (saveFileResult instanceof SaveFileResult.Success) {
            this.$onSaveListener.onSuccess(this.$imagePath);
        } else if (saveFileResult instanceof SaveFileResult.Failure) {
            this.$onSaveListener.onFailure(((SaveFileResult.Failure) saveFileResult).getException());
        }
        return Unit.INSTANCE;
    }

    @Override // Xd.l
    @Nullable
    public final Object invoke(@NotNull ab abVar, @Nullable c<? super Unit> cVar) {
        return ((PhotoEditorImpl$saveAsFile$3) create(abVar, cVar)).invokeSuspend(Unit.INSTANCE);
    }
}
