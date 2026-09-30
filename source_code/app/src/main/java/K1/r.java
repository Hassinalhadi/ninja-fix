package K1;

import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class r implements p {
    public final /* synthetic */ int alpha;
    public final String purple;

    public /* synthetic */ r(String str, int i4) {
        this.alpha = i4;
        this.purple = str;
    }

    @Override // K1.p
    public boolean k(CharSequence charSequence, int i4, int i5, y yVar) {
        if (TextUtils.equals(charSequence.subSequence(i4, i5), this.purple)) {
            yVar.charlie = (yVar.charlie & 3) | 4;
            return false;
        }
        return true;
    }

    @Override // K1.p
    public Object magenta() {
        return this;
    }

    public String toString() {
        switch (this.alpha) {
            case 2:
                return this.purple;
            default:
                return super.toString();
        }
    }
}
