package g7;

import com.google.android.material.button.MaterialButton;
import s6.O5;

/* loaded from: classes2.dex */
public final class h extends O5 {
    public final int alpha;

    public h(int i4) {
        this.alpha = i4;
    }

    @Override // s6.O5
    public final float golf(Object obj) {
        float[] fArr = ((i) obj).f12670v;
        if (fArr != null) {
            return fArr[this.alpha];
        }
        return 0.0f;
    }

    @Override // s6.O5
    public final void mike(Object obj, float f5) {
        i iVar = (i) obj;
        float[] fArr = iVar.f12670v;
        if (fArr != null) {
            int i4 = this.alpha;
            if (fArr[i4] != f5) {
                fArr[i4] = f5;
                a4.u uVar = iVar.f12672x;
                if (uVar != null) {
                    int india = (int) (iVar.india() * 0.11f);
                    MaterialButton materialButton = (MaterialButton) uVar.purple;
                    if (materialButton.f7919q != india) {
                        materialButton.f7919q = india;
                        materialButton.juliet();
                        materialButton.invalidate();
                    }
                }
                iVar.invalidateSelf();
            }
        }
    }
}
