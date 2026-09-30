package a4;

import android.graphics.Bitmap;
import com.canhub.cropper.CropImageActivity;
import com.canhub.cropper.CropImageView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: a4.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0404b extends Pd.i implements Xd.l {
    public /* synthetic */ Object alpha;
    public final /* synthetic */ e purple;
    public final /* synthetic */ C0403a red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0404b(e eVar, C0403a c0403a, Nd.c cVar) {
        super(2, cVar);
        this.purple = eVar;
        this.red = c0403a;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        C0404b c0404b = new C0404b(this.purple, this.red, cVar);
        c0404b.alpha = obj;
        return c0404b;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C0404b) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmap;
        CropImageView cropImageView;
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        boolean xray = vf.ad.xray((vf.ab) this.alpha);
        C0403a result = this.red;
        boolean z2 = false;
        if (xray && (cropImageView = (CropImageView) this.purple.purple.get()) != null) {
            Intrinsics.echo(result, "result");
            cropImageView.f3670E = null;
            cropImageView.hotel();
            z zVar = cropImageView.f3691u;
            if (zVar != null) {
                float[] cropPoints = cropImageView.getCropPoints();
                cropImageView.getCropRect();
                cropImageView.getWholeImageRect();
                cropImageView.getF3675d();
                Intrinsics.echo(cropPoints, "cropPoints");
                ((CropImageActivity) zVar).foxtrot(result.bravo, result.charlie, result.delta);
            }
            z2 = true;
        }
        if (!z2 && (bitmap = result.alpha) != null) {
            bitmap.recycle();
        }
        return Unit.INSTANCE;
    }
}
