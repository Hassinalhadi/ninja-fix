package ja.burhanrashid52.photoeditor;

import Nd.c;
import Pd.e;
import Pd.i;
import Xd.l;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vf.ab;

@e(c = "ja.burhanrashid52.photoeditor.PhotoEditorImpl$saveAsFile$2", f = "PhotoEditorImpl.kt", l = {216, 218}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvf/ab;", "Lja/burhanrashid52/photoeditor/SaveFileResult;", "<anonymous>", "(Lvf/ab;)Lja/burhanrashid52/photoeditor/SaveFileResult;"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class PhotoEditorImpl$saveAsFile$2 extends i implements l {
    final /* synthetic */ String $imagePath;
    final /* synthetic */ SaveSettings $saveSettings;
    int label;
    final /* synthetic */ PhotoEditorImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhotoEditorImpl$saveAsFile$2(PhotoEditorImpl photoEditorImpl, SaveSettings saveSettings, String str, c<? super PhotoEditorImpl$saveAsFile$2> cVar) {
        super(2, cVar);
        this.this$0 = photoEditorImpl;
        this.$saveSettings = saveSettings;
        this.$imagePath = str;
    }

    @Override // Pd.a
    @NotNull
    public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
        return new PhotoEditorImpl$saveAsFile$2(this.this$0, this.$saveSettings, this.$imagePath, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if (r6.saveFilter$photoeditor_release(r5) == r0) goto L16;
     */
    @Override // Pd.a
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        PhotoEditorView photoEditorView;
        PhotoEditorView photoEditorView2;
        BoxHelper boxHelper;
        Od.a aVar = Od.a.alpha;
        int i4 = this.label;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    ResultKt.alpha(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.alpha(obj);
        } else {
            ResultKt.alpha(obj);
            photoEditorView = this.this$0.photoEditorView;
            this.label = 1;
        }
        photoEditorView2 = this.this$0.photoEditorView;
        boxHelper = this.this$0.mBoxHelper;
        PhotoSaverTask photoSaverTask = new PhotoSaverTask(photoEditorView2, boxHelper, this.$saveSettings);
        String str = this.$imagePath;
        this.label = 2;
        Object saveImageAsFile = photoSaverTask.saveImageAsFile(str, this);
        if (saveImageAsFile == aVar) {
            return aVar;
        }
        return saveImageAsFile;
    }

    @Override // Xd.l
    @Nullable
    public final Object invoke(@NotNull ab abVar, @Nullable c<? super SaveFileResult> cVar) {
        return ((PhotoEditorImpl$saveAsFile$2) create(abVar, cVar)).invokeSuspend(Unit.INSTANCE);
    }
}
