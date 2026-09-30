package s6;

import com.airbnb.lottie.compose.LottieConstants;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class ac {
    public Object[] alpha = new Object[4];
    public int bravo = 0;
    public boolean charlie;

    public final void alpha(Object obj) {
        obj.getClass();
        bravo(this.bravo + 1);
        Object[] objArr = this.alpha;
        int i4 = this.bravo;
        this.bravo = i4 + 1;
        objArr[i4] = obj;
    }

    public final void bravo(int i4) {
        Object[] objArr = this.alpha;
        int length = objArr.length;
        if (length < i4) {
            int i5 = length + (length >> 1) + 1;
            if (i5 < i4) {
                int highestOneBit = Integer.highestOneBit(i4 - 1);
                i5 = highestOneBit + highestOneBit;
            }
            if (i5 < 0) {
                i5 = LottieConstants.IterateForever;
            }
            this.alpha = Arrays.copyOf(objArr, i5);
            this.charlie = false;
            return;
        }
        if (this.charlie) {
            this.alpha = (Object[]) objArr.clone();
            this.charlie = false;
        }
    }

    public final aj charlie() {
        this.charlie = true;
        Object[] objArr = this.alpha;
        int i4 = this.bravo;
        ad adVar = af.purple;
        if (i4 == 0) {
            return aj.teal;
        }
        return new aj(i4, objArr);
    }
}
