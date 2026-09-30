package ja.burhanrashid52.photoeditor;

import Nd.c;
import Pd.e;
import Pd.i;
import Xd.l;
import android.graphics.Bitmap;
import ja.burhanrashid52.photoeditor.SaveFileResult;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vf.ab;

@e(c = "ja.burhanrashid52.photoeditor.PhotoSaverTask$saveImageAsFile$result$1", f = "PhotoSaverTask.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvf/ab;", "Lja/burhanrashid52/photoeditor/SaveFileResult;", "<anonymous>", "(Lvf/ab;)Lja/burhanrashid52/photoeditor/SaveFileResult;"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class PhotoSaverTask$saveImageAsFile$result$1 extends i implements l {
    final /* synthetic */ Bitmap $capturedBitmap;
    final /* synthetic */ String $imagePath;
    int label;
    final /* synthetic */ PhotoSaverTask this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhotoSaverTask$saveImageAsFile$result$1(String str, Bitmap bitmap, PhotoSaverTask photoSaverTask, c<? super PhotoSaverTask$saveImageAsFile$result$1> cVar) {
        super(2, cVar);
        this.$imagePath = str;
        this.$capturedBitmap = bitmap;
        this.this$0 = photoSaverTask;
    }

    @Override // Pd.a
    @NotNull
    public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
        return new PhotoSaverTask$saveImageAsFile$result$1(this.$imagePath, this.$capturedBitmap, this.this$0, cVar);
    }

    @Override // Pd.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        SaveSettings saveSettings;
        SaveSettings saveSettings2;
        Od.a aVar = Od.a.alpha;
        if (this.label == 0) {
            ResultKt.alpha(obj);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(this.$imagePath), false);
                Bitmap bitmap = this.$capturedBitmap;
                PhotoSaverTask photoSaverTask = this.this$0;
                try {
                    saveSettings = photoSaverTask.saveSettings;
                    Bitmap.CompressFormat compressFormat = saveSettings.getCompressFormat();
                    saveSettings2 = photoSaverTask.saveSettings;
                    bitmap.compress(compressFormat, saveSettings2.getCompressQuality(), fileOutputStream);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    return SaveFileResult.Success.INSTANCE;
                } finally {
                }
            } catch (IOException e) {
                return new SaveFileResult.Failure(e);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // Xd.l
    @Nullable
    public final Object invoke(@NotNull ab abVar, @Nullable c<? super SaveFileResult> cVar) {
        return ((PhotoSaverTask$saveImageAsFile$result$1) create(abVar, cVar)).invokeSuspend(Unit.INSTANCE);
    }
}
