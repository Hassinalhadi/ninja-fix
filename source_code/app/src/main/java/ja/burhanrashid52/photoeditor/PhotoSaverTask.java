package ja.burhanrashid52.photoeditor;

import Cf.d;
import Cf.e;
import Nd.c;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ja.burhanrashid52.photoeditor.SaveFileResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vf.ad;
import vf.ao;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000  2\u00020\u0001:\u0001 B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u000fJ\u001b\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Lja/burhanrashid52/photoeditor/PhotoSaverTask;", "", "Lja/burhanrashid52/photoeditor/PhotoEditorView;", "photoEditorView", "Lja/burhanrashid52/photoeditor/BoxHelper;", "boxHelper", "Lja/burhanrashid52/photoeditor/SaveSettings;", "saveSettings", "<init>", "(Lja/burhanrashid52/photoeditor/PhotoEditorView;Lja/burhanrashid52/photoeditor/BoxHelper;Lja/burhanrashid52/photoeditor/SaveSettings;)V", "", "onBeforeSaveImage", "()V", "Landroid/graphics/Bitmap;", "buildBitmap", "()Landroid/graphics/Bitmap;", "Landroid/view/View;", "view", "captureView", "(Landroid/view/View;)Landroid/graphics/Bitmap;", "saveImageAsBitmap", "", "imagePath", "Lja/burhanrashid52/photoeditor/SaveFileResult;", "saveImageAsFile", "(Ljava/lang/String;LNd/c;)Ljava/lang/Object;", "Lja/burhanrashid52/photoeditor/PhotoEditorView;", "Lja/burhanrashid52/photoeditor/BoxHelper;", "Lja/burhanrashid52/photoeditor/SaveSettings;", "Lja/burhanrashid52/photoeditor/DrawingView;", "drawingView", "Lja/burhanrashid52/photoeditor/DrawingView;", "Companion", "photoeditor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PhotoSaverTask {

    @NotNull
    public static final String TAG = "PhotoSaverTask";

    @NotNull
    private final BoxHelper boxHelper;

    @NotNull
    private final DrawingView drawingView;

    @NotNull
    private final PhotoEditorView photoEditorView;

    @NotNull
    private SaveSettings saveSettings;

    public PhotoSaverTask(@NotNull PhotoEditorView photoEditorView, @NotNull BoxHelper boxHelper, @NotNull SaveSettings saveSettings) {
        Intrinsics.echo(photoEditorView, "photoEditorView");
        Intrinsics.echo(boxHelper, "boxHelper");
        Intrinsics.echo(saveSettings, "saveSettings");
        this.photoEditorView = photoEditorView;
        this.boxHelper = boxHelper;
        this.saveSettings = saveSettings;
        this.drawingView = photoEditorView.getDrawingView();
    }

    private final Bitmap buildBitmap() {
        if (this.saveSettings.getIsTransparencyEnabled()) {
            return BitmapUtil.INSTANCE.removeTransparency(captureView(this.photoEditorView));
        }
        return captureView(this.photoEditorView);
    }

    private final Bitmap captureView(View view) {
        Bitmap bitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(bitmap));
        Intrinsics.delta(bitmap, "bitmap");
        return bitmap;
    }

    private final void onBeforeSaveImage() {
        this.boxHelper.clearHelperBox();
        this.drawingView.destroyDrawingCache();
    }

    @NotNull
    public final Bitmap saveImageAsBitmap() {
        onBeforeSaveImage();
        Bitmap buildBitmap = buildBitmap();
        if (this.saveSettings.getIsClearViewsEnabled()) {
            this.boxHelper.clearAllViews(this.drawingView);
        }
        return buildBitmap;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object saveImageAsFile(@NotNull String str, @NotNull c<? super SaveFileResult> cVar) {
        PhotoSaverTask$saveImageAsFile$1 photoSaverTask$saveImageAsFile$1;
        int i4;
        PhotoSaverTask photoSaverTask;
        SaveFileResult saveFileResult;
        if (cVar instanceof PhotoSaverTask$saveImageAsFile$1) {
            photoSaverTask$saveImageAsFile$1 = (PhotoSaverTask$saveImageAsFile$1) cVar;
            int i5 = photoSaverTask$saveImageAsFile$1.label;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                photoSaverTask$saveImageAsFile$1.label = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = photoSaverTask$saveImageAsFile$1.result;
                Od.a aVar = Od.a.alpha;
                i4 = photoSaverTask$saveImageAsFile$1.label;
                if (i4 == 0) {
                    if (i4 == 1) {
                        photoSaverTask = (PhotoSaverTask) photoSaverTask$saveImageAsFile$1.L$0;
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    onBeforeSaveImage();
                    Bitmap buildBitmap = buildBitmap();
                    e eVar = ao.alpha;
                    d dVar = d.purple;
                    PhotoSaverTask$saveImageAsFile$result$1 photoSaverTask$saveImageAsFile$result$1 = new PhotoSaverTask$saveImageAsFile$result$1(str, buildBitmap, this, null);
                    photoSaverTask$saveImageAsFile$1.L$0 = this;
                    photoSaverTask$saveImageAsFile$1.label = 1;
                    obj = ad.blue(dVar, photoSaverTask$saveImageAsFile$result$1, photoSaverTask$saveImageAsFile$1);
                    if (obj == aVar) {
                        return aVar;
                    }
                    photoSaverTask = this;
                }
                saveFileResult = (SaveFileResult) obj;
                if ((saveFileResult instanceof SaveFileResult.Success) && photoSaverTask.saveSettings.getIsClearViewsEnabled()) {
                    photoSaverTask.boxHelper.clearAllViews(photoSaverTask.drawingView);
                }
                return saveFileResult;
            }
        }
        photoSaverTask$saveImageAsFile$1 = new PhotoSaverTask$saveImageAsFile$1(this, cVar);
        Object obj2 = photoSaverTask$saveImageAsFile$1.result;
        Od.a aVar2 = Od.a.alpha;
        i4 = photoSaverTask$saveImageAsFile$1.label;
        if (i4 == 0) {
        }
        saveFileResult = (SaveFileResult) obj2;
        if (saveFileResult instanceof SaveFileResult.Success) {
            photoSaverTask.boxHelper.clearAllViews(photoSaverTask.drawingView);
        }
        return saveFileResult;
    }
}
