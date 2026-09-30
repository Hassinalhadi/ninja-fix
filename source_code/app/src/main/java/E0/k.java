package E0;

import R7.Q;
import R7.af;
import android.graphics.Rect;
import android.util.Size;
import android.view.View;
import androidx.camera.core.impl.C0505c;
import androidx.compose.foundation.lazy.layout.aa;
import androidx.compose.foundation.lazy.layout.az;
import androidx.compose.runtime.am;
import java.io.File;
import java.util.Comparator;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import s0.al;
import t0.Z;

/* loaded from: classes3.dex */
public final /* synthetic */ class k implements Comparator {
    public final /* synthetic */ int alpha;

    public /* synthetic */ k(int i4) {
        this.alpha = i4;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                return (((Number) pair.getSecond()).intValue() - ((Number) pair.getFirst()).intValue()) - (((Number) pair2.getSecond()).intValue() - ((Number) pair2.getFirst()).intValue());
            case 1:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 2:
                return ((af) ((Q) obj)).alpha.compareTo(((af) ((Q) obj2)).alpha);
            case 3:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 4:
                String name = ((File) obj).getName();
                int i4 = U7.a.foxtrot;
                return name.substring(0, i4).compareTo(((File) obj2).getName().substring(0, i4));
            case 5:
                return ((C0505c) obj).alpha.compareTo(((C0505c) obj2).alpha);
            case 6:
                return Intrinsics.golf(((az) obj2).alpha, ((az) obj).alpha);
            case 7:
                return Intrinsics.golf(((aa) obj).getIndex(), ((aa) obj2).getIndex());
            case 8:
                return Intrinsics.golf(((am) obj).bravo, ((am) obj2).bravo);
            case 9:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                return Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
            case 10:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i5 = 0; i5 < bArr.length; i5++) {
                    byte b2 = bArr[i5];
                    byte b4 = bArr2[i5];
                    if (b2 != b4) {
                        return b2 - b4;
                    }
                }
                return 0;
            case 11:
                al alVar = (al) obj;
                al alVar2 = (al) obj2;
                float f5 = alVar.f13306y.papa.f13238x;
                float f10 = alVar2.f13306y.papa.f13238x;
                if (f5 == f10) {
                    return Intrinsics.golf(alVar.whiskey(), alVar2.whiskey());
                }
                return Float.compare(f5, f10);
            case 12:
                View view = (View) obj;
                View view2 = (View) obj2;
                if (view == view2) {
                    return 0;
                }
                bv.al alVar3 = Z.delta;
                Object golf = alVar3.golf(view);
                Intrinsics.checkNotNull(golf);
                Rect rect = (Rect) golf;
                Object golf2 = alVar3.golf(view2);
                Intrinsics.checkNotNull(golf2);
                Rect rect2 = (Rect) golf2;
                int i10 = rect.top - rect2.top;
                if (i10 == 0) {
                    return rect.bottom - rect2.bottom;
                }
                return i10;
            default:
                View view3 = (View) obj;
                View view4 = (View) obj2;
                if (view3 == view4) {
                    return 0;
                }
                bv.al alVar4 = Z.delta;
                Object golf3 = alVar4.golf(view3);
                Intrinsics.checkNotNull(golf3);
                Rect rect3 = (Rect) golf3;
                Object golf4 = alVar4.golf(view4);
                Intrinsics.checkNotNull(golf4);
                Rect rect4 = (Rect) golf4;
                int i11 = rect3.left - rect4.left;
                if (i11 == 0) {
                    return (rect3.right - rect4.right) * Z.charlie;
                }
                return Z.charlie * i11;
        }
    }
}
