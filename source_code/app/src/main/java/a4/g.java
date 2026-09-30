package a4;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import com.canhub.cropper.CropImageActivity;
import com.canhub.cropper.CropImageOptions;
import com.canhub.cropper.CropImageView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g extends Pd.i implements Xd.l {
    public /* synthetic */ Object alpha;
    public final /* synthetic */ i purple;
    public final /* synthetic */ f red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, f fVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = iVar;
        this.red = fVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        g gVar = new g(this.purple, this.red, cVar);
        gVar.alpha = obj;
        return gVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmap;
        CropImageView cropImageView;
        CropImageView cropImageView2;
        CropImageView cropImageView3;
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        boolean xray = vf.ad.xray((vf.ab) this.alpha);
        f result = this.red;
        boolean z2 = false;
        if (xray && (cropImageView = (CropImageView) this.purple.teal.get()) != null) {
            Intrinsics.echo(result, "result");
            cropImageView.f3669D = null;
            cropImageView.hotel();
            Exception exc = result.golf;
            if (exc == null) {
                int i4 = result.delta;
                cropImageView.f3674c = i4;
                cropImageView.e = result.echo;
                cropImageView.f3676f = result.foxtrot;
                cropImageView.foxtrot(result.bravo, 0, result.alpha, result.charlie, i4);
            }
            ad adVar = cropImageView.f3690t;
            if (adVar != null) {
                CropImageActivity cropImageActivity = (CropImageActivity) adVar;
                Uri uri = result.alpha;
                Intrinsics.echo(uri, "uri");
                if (exc == null) {
                    CropImageOptions cropImageOptions = cropImageActivity.purple;
                    if (cropImageOptions != null) {
                        Rect rect = cropImageOptions.f3622N;
                        if (rect != null && (cropImageView3 = cropImageActivity.red) != null) {
                            cropImageView3.setCropRect(rect);
                        }
                        CropImageOptions cropImageOptions2 = cropImageActivity.purple;
                        if (cropImageOptions2 != null) {
                            int i5 = cropImageOptions2.f3623O;
                            if (i5 > 0 && (cropImageView2 = cropImageActivity.red) != null) {
                                cropImageView2.setRotatedDegrees(i5);
                            }
                            CropImageOptions cropImageOptions3 = cropImageActivity.purple;
                            if (cropImageOptions3 != null) {
                                if (cropImageOptions3.f3631X) {
                                    cropImageActivity.echo();
                                }
                            } else {
                                Intrinsics.lima("cropImageOptions");
                                throw null;
                            }
                        } else {
                            Intrinsics.lima("cropImageOptions");
                            throw null;
                        }
                    } else {
                        Intrinsics.lima("cropImageOptions");
                        throw null;
                    }
                } else {
                    cropImageActivity.foxtrot(null, exc, 1);
                }
            }
            z2 = true;
        }
        if (!z2 && (bitmap = result.bravo) != null) {
            bitmap.recycle();
        }
        return Unit.INSTANCE;
    }
}
