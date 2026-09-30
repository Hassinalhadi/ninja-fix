package androidx.compose.foundation.layout;

import a0.C0354h;
import android.graphics.Matrix;
import android.graphics.Path;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import q0.AbstractC2366B;
import q0.AbstractC2367C;

/* loaded from: classes3.dex */
public final /* synthetic */ class aw implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ int red;
    public final /* synthetic */ int silver;

    public /* synthetic */ aw(int i4, AbstractC2367C abstractC2367C, int i5) {
        this.alpha = 2;
        this.red = i4;
        this.purple = abstractC2367C;
        this.silver = i5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                AbstractC2366B.hotel((AbstractC2366B) obj, (AbstractC2367C) this.purple, this.red, this.silver);
                return Unit.INSTANCE;
            case 1:
                AbstractC2366B.hotel((AbstractC2366B) obj, (AbstractC2367C) this.purple, this.red, this.silver);
                return Unit.INSTANCE;
            case 2:
                AbstractC2366B.hotel((AbstractC2366B) obj, (AbstractC2367C) this.purple, Zd.a.delta((this.red - r0.alpha) / 2.0f), Zd.a.delta((this.silver - r0.purple) / 2.0f));
                return Unit.INSTANCE;
            default:
                D0.q qVar = (D0.q) obj;
                D0.a aVar = qVar.alpha;
                int delta = qVar.delta(this.red);
                int delta2 = qVar.delta(this.silver);
                CharSequence charSequence = aVar.echo;
                if (delta < 0 || delta > delta2 || delta2 > charSequence.length()) {
                    StringBuilder hotel = av.q.hotel(delta, delta2, "start(", ") or end(", ") is out of range [0..");
                    hotel.append(charSequence.length());
                    hotel.append("], or start > end!");
                    J0.a.alpha(hotel.toString());
                }
                Path path = new Path();
                E0.r rVar = aVar.delta;
                rVar.foxtrot.getSelectionPath(delta, delta2, path);
                int i4 = rVar.hotel;
                if (i4 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i4);
                }
                long floatToRawIntBits = (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(qVar.foxtrot) & 4294967295L);
                Matrix matrix = new Matrix();
                Intrinsics.checkNotNull(matrix);
                matrix.setTranslate(Float.intBitsToFloat((int) (floatToRawIntBits >> 32)), Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)));
                Intrinsics.checkNotNull(matrix);
                path.transform(matrix);
                int i5 = (int) 0;
                ((C0354h) this.purple).alpha.addPath(path, Float.intBitsToFloat(i5), Float.intBitsToFloat(i5));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ aw(Object obj, int i4, int i5, int i10) {
        this.alpha = i10;
        this.purple = obj;
        this.red = i4;
        this.silver = i5;
    }
}
