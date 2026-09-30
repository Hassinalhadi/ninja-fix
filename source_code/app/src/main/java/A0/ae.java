package A0;

import android.media.MediaCodec;
import androidx.camera.core.az;
import androidx.camera.core.impl.C0507e;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.incognia.internal.l65;
import com.incognia.internal.lBB;
import java.util.Comparator;
import kotlin.jvm.functions.Function1;
import s6.AbstractC2769s6;

/* loaded from: classes3.dex */
public final /* synthetic */ class ae implements Comparator {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ ae(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i4;
        switch (this.alpha) {
            case 0:
                return ((Number) ((w) this.purple).invoke(obj, obj2)).intValue();
            case 1:
                for (Function1 function1 : (Function1[]) this.purple) {
                    int bravo = AbstractC2769s6.bravo((Comparable) function1.invoke(obj), (Comparable) function1.invoke(obj2));
                    if (bravo != 0) {
                        return bravo;
                    }
                }
                return 0;
            case 2:
                C0507e c0507e = (C0507e) obj2;
                ((a3.l) this.purple).getClass();
                Class cls = ((C0507e) obj).alpha.juliet;
                int i5 = 1;
                if (cls == MediaCodec.class) {
                    i4 = 2;
                } else if (cls == az.class) {
                    i4 = 0;
                } else {
                    i4 = 1;
                }
                Class cls2 = c0507e.alpha.juliet;
                if (cls2 == MediaCodec.class) {
                    i5 = 2;
                } else if (cls2 == az.class) {
                    i5 = 0;
                }
                return i4 - i5;
            case 3:
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.purple;
                int compareTo = Boolean.valueOf(materialButton.f7910h).compareTo(Boolean.valueOf(materialButton2.f7910h));
                if (compareTo == 0) {
                    int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                    if (compareTo2 == 0) {
                        return Integer.compare(materialButtonToggleGroup.indexOfChild(materialButton), materialButtonToggleGroup.indexOfChild(materialButton2));
                    }
                    return compareTo2;
                }
                return compareTo;
            default:
                return lBB.b((l65) this.purple, obj, obj2);
        }
    }
}
