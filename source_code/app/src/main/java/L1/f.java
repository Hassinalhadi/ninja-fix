package L1;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import s6.AbstractC2662g6;

/* loaded from: classes3.dex */
public final class f extends AbstractC2662g6 {
    public final TextView alpha;
    public final d bravo;
    public boolean charlie = true;

    public f(TextView textView) {
        this.alpha = textView;
        this.bravo = new d(textView);
    }

    @Override // s6.AbstractC2662g6
    public final InputFilter[] bravo(InputFilter[] inputFilterArr) {
        if (!this.charlie) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i4 = 0; i4 < inputFilterArr.length; i4++) {
                InputFilter inputFilter = inputFilterArr[i4];
                if (inputFilter instanceof d) {
                    sparseArray.put(i4, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i5 = 0;
            for (int i10 = 0; i10 < length; i10++) {
                if (sparseArray.indexOfKey(i10) < 0) {
                    inputFilterArr2[i5] = inputFilterArr[i10];
                    i5++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i11 = 0;
        while (true) {
            d dVar = this.bravo;
            if (i11 < length2) {
                if (inputFilterArr[i11] == dVar) {
                    return inputFilterArr;
                }
                i11++;
            } else {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = dVar;
                return inputFilterArr3;
            }
        }
    }

    @Override // s6.AbstractC2662g6
    public final boolean charlie() {
        return this.charlie;
    }

    @Override // s6.AbstractC2662g6
    public final void delta(boolean z2) {
        if (z2) {
            foxtrot();
        }
    }

    @Override // s6.AbstractC2662g6
    public final void echo(boolean z2) {
        this.charlie = z2;
        foxtrot();
        TextView textView = this.alpha;
        textView.setFilters(bravo(textView.getFilters()));
    }

    public final void foxtrot() {
        TextView textView = this.alpha;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.charlie) {
            if (!(transformationMethod instanceof j) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new j(transformationMethod);
            }
        } else if (transformationMethod instanceof j) {
            transformationMethod = ((j) transformationMethod).alpha;
        }
        textView.setTransformationMethod(transformationMethod);
    }
}
