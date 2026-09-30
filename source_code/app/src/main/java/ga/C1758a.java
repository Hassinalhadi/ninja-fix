package ga;

import android.graphics.Bitmap;
import b9.C0738b;
import ja.burhanrashid52.photoeditor.shape.ShapeBuilder;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2746q0;

/* renamed from: ga.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1758a extends Pd.i implements Xd.l {
    public final /* synthetic */ String alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1758a(String str, Nd.c cVar) {
        super(2, cVar);
        this.alpha = str;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C1758a(this.alpha, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C1758a) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        int i4;
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        C0738b alpha = AbstractC2746q0.alpha(this.alpha);
        int[] iArr = new int[360000];
        for (int i5 = 0; i5 < 600; i5++) {
            int i10 = i5 * 600;
            for (int i11 = 0; i11 < 600; i11++) {
                int i12 = i10 + i11;
                if (alpha.alpha(i11, i5)) {
                    i4 = ShapeBuilder.DEFAULT_SHAPE_COLOR;
                } else {
                    i4 = -1;
                }
                iArr[i12] = i4;
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(600, 600, Bitmap.Config.ARGB_8888);
        Intrinsics.delta(createBitmap, "createBitmap(...)");
        createBitmap.setPixels(iArr, 0, 600, 0, 0, 600, 600);
        return createBitmap;
    }
}
