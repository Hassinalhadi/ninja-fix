package zendesk.commonui;

import a4.s;
import ah.h;
import ai.d;
import ai.e;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import androidx.appcompat.widget.P0;
import androidx.lifecycle.InterfaceC0640j;
import androidx.lifecycle.al;
import com.airbnb.lottie.compose.LottieConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001&B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u000fJ\r\u0010\u0013\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0018\u001a\u00020\r2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001eR\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\"\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010\"R\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\"R\u0016\u0010$\u001a\u00020\u00078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lzendesk/commonui/PhotoPickerLifecycleObserver;", "Landroidx/lifecycle/j;", "Lah/h;", "registry", "Lzendesk/commonui/PhotoPickerSelectionCallback;", "selectionCallback", "Lkotlin/Function0;", "Landroid/net/Uri;", "restoredInputUriPhoto", "<init>", "(Lah/h;Lzendesk/commonui/PhotoPickerSelectionCallback;Lkotlin/jvm/functions/Function0;)V", "Landroidx/lifecycle/al;", "owner", "", "setupGalleryPicker", "(Landroidx/lifecycle/al;)V", "setupDocumentPicker", "setupTakePicture", "onCreate", "selectMedia", "()V", "", "", "input", "selectDocument", "([Ljava/lang/String;)V", "takePicture", "(Landroid/net/Uri;)V", "Lah/h;", "Lzendesk/commonui/PhotoPickerSelectionCallback;", "Lkotlin/jvm/functions/Function0;", "Lah/b;", "Lah/j;", "galleryPicker", "Lah/b;", "documentPicker", "inputUriPhotoTaken", "Landroid/net/Uri;", "Companion", "common-ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PhotoPickerLifecycleObserver implements InterfaceC0640j {

    @NotNull
    private static final String DOCUMENT_PICKER_KEY = "DOCUMENT_PICKER";

    @NotNull
    private static final String GALLERY_PICKER_KEY = "GALLERY_PICKER";

    @NotNull
    private static final String TAKE_PICTURE_KEY = "TAKE_PICTURE";
    private ah.b documentPicker;
    private ah.b galleryPicker;
    private Uri inputUriPhotoTaken;

    @NotNull
    private final h registry;

    @NotNull
    private final Function0<Uri> restoredInputUriPhoto;

    @NotNull
    private final PhotoPickerSelectionCallback selectionCallback;
    private ah.b takePicture;

    /* JADX WARN: Multi-variable type inference failed */
    public PhotoPickerLifecycleObserver(@NotNull h registry, @NotNull PhotoPickerSelectionCallback selectionCallback, @NotNull Function0<? extends Uri> restoredInputUriPhoto) {
        Intrinsics.echo(registry, "registry");
        Intrinsics.echo(selectionCallback, "selectionCallback");
        Intrinsics.echo(restoredInputUriPhoto, "restoredInputUriPhoto");
        this.registry = registry;
        this.selectionCallback = selectionCallback;
        this.restoredInputUriPhoto = restoredInputUriPhoto;
    }

    private final void setupDocumentPicker(al owner) {
        this.documentPicker = this.registry.delta(DOCUMENT_PICKER_KEY, owner, new s(2), new b(this, 1));
    }

    public static final void setupDocumentPicker$lambda$1(PhotoPickerLifecycleObserver this$0, List list) {
        Intrinsics.echo(this$0, "this$0");
        PhotoPickerSelectionCallback photoPickerSelectionCallback = this$0.selectionCallback;
        Intrinsics.checkNotNull(list);
        photoPickerSelectionCallback.onMediaSelected(list);
    }

    private final void setupGalleryPicker(al owner) {
        this.galleryPicker = this.registry.delta(GALLERY_PICKER_KEY, owner, new ai.c(), new b(this, 2));
    }

    public static final void setupGalleryPicker$lambda$0(PhotoPickerLifecycleObserver this$0, List list) {
        Intrinsics.echo(this$0, "this$0");
        PhotoPickerSelectionCallback photoPickerSelectionCallback = this$0.selectionCallback;
        Intrinsics.checkNotNull(list);
        photoPickerSelectionCallback.onMediaSelected(list);
    }

    private final void setupTakePicture(al owner) {
        this.takePicture = this.registry.delta(TAKE_PICTURE_KEY, owner, new s(7), new b(this, 0));
    }

    public static final void setupTakePicture$lambda$3(PhotoPickerLifecycleObserver this$0, Boolean bool) {
        Intrinsics.echo(this$0, "this$0");
        this$0.inputUriPhotoTaken = this$0.restoredInputUriPhoto.invoke();
        Intrinsics.checkNotNull(bool);
        if (bool.booleanValue()) {
            PhotoPickerSelectionCallback photoPickerSelectionCallback = this$0.selectionCallback;
            Uri uri = this$0.inputUriPhotoTaken;
            if (uri != null) {
                photoPickerSelectionCallback.onPhotoTaken(uri);
            } else {
                Intrinsics.lima("inputUriPhotoTaken");
                throw null;
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0640j
    public void onCreate(@NotNull al owner) {
        Intrinsics.echo(owner, "owner");
        setupGalleryPicker(owner);
        setupDocumentPicker(owner);
        setupTakePicture(owner);
    }

    @Override // androidx.lifecycle.InterfaceC0640j
    public /* bridge */ /* synthetic */ void onDestroy(@NotNull al alVar) {
        P0.quebec(alVar);
    }

    @Override // androidx.lifecycle.InterfaceC0640j
    public /* bridge */ /* synthetic */ void onPause(@NotNull al alVar) {
        P0.romeo(alVar);
    }

    @Override // androidx.lifecycle.InterfaceC0640j
    public /* bridge */ /* synthetic */ void onResume(@NotNull al alVar) {
        P0.sierra(alVar);
    }

    @Override // androidx.lifecycle.InterfaceC0640j
    public /* bridge */ /* synthetic */ void onStart(@NotNull al alVar) {
        P0.tango(alVar);
    }

    @Override // androidx.lifecycle.InterfaceC0640j
    public /* bridge */ /* synthetic */ void onStop(@NotNull al alVar) {
        P0.uniform(alVar);
    }

    public final void selectDocument(@NotNull String[] input) {
        Intrinsics.echo(input, "input");
        ah.b bVar = this.documentPicker;
        if (bVar != null) {
            bVar.alpha(input);
        } else {
            Intrinsics.lima("documentPicker");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        if (r2 >= 2) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r6 >= 2) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, ah.j] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void selectMedia() {
        int pickImagesMaxLimit;
        int extensionVersion;
        int extensionVersion2;
        ah.b bVar = this.galleryPicker;
        if (bVar != 0) {
            e eVar = e.alpha;
            int i4 = Build.VERSION.SDK_INT;
            if (i4 < 33) {
                if (i4 >= 30) {
                    extensionVersion2 = SdkExtensions.getExtensionVersion(30);
                }
                pickImagesMaxLimit = LottieConstants.IterateForever;
                d dVar = d.alpha;
                ?? obj = new Object();
                obj.alpha = eVar;
                if (i4 < 33) {
                    if (i4 >= 30) {
                        extensionVersion = SdkExtensions.getExtensionVersion(30);
                    }
                    obj.alpha = eVar;
                    obj.bravo = pickImagesMaxLimit;
                    obj.charlie = dVar;
                    bVar.alpha(obj);
                    return;
                }
                MediaStore.getPickImagesMaxLimit();
                obj.alpha = eVar;
                obj.bravo = pickImagesMaxLimit;
                obj.charlie = dVar;
                bVar.alpha(obj);
                return;
            }
            pickImagesMaxLimit = MediaStore.getPickImagesMaxLimit();
            d dVar2 = d.alpha;
            ?? obj2 = new Object();
            obj2.alpha = eVar;
            if (i4 < 33) {
            }
            MediaStore.getPickImagesMaxLimit();
            obj2.alpha = eVar;
            obj2.bravo = pickImagesMaxLimit;
            obj2.charlie = dVar2;
            bVar.alpha(obj2);
            return;
        }
        Intrinsics.lima("galleryPicker");
        throw null;
    }

    public final void takePicture(@NotNull Uri input) {
        Intrinsics.echo(input, "input");
        this.inputUriPhotoTaken = input;
        ah.b bVar = this.takePicture;
        if (bVar != null) {
            bVar.alpha(input);
        } else {
            Intrinsics.lima("takePicture");
            throw null;
        }
    }
}
