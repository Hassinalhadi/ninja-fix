package I;

import androidx.compose.runtime.C0562a;
import androidx.compose.runtime.InterfaceC0566c;
import androidx.compose.runtime.j0;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.collections.ArraysKt;
import s6.AbstractC2786u5;

/* loaded from: classes3.dex */
public final class am extends AbstractC2786u5 {
    public int bravo;
    public int delta;
    public int foxtrot;
    public aj[] alpha = new aj[16];
    public int[] charlie = new int[16];
    public Object[] echo = new Object[16];

    public final void bravo() {
        this.bravo = 0;
        this.delta = 0;
        ArraysKt.coral(0, this.foxtrot, null, this.echo);
        this.foxtrot = 0;
    }

    public final void charlie(InterfaceC0566c interfaceC0566c, j0 j0Var, B9.r rVar, ak akVar) {
        if (echo()) {
            al alVar = new al(this);
            while (true) {
                am amVar = (am) alVar.echo;
                aj ajVar = amVar.alpha[alVar.bravo];
                C0562a delta = ajVar.delta(alVar);
                InterfaceC0566c interfaceC0566c2 = interfaceC0566c;
                j0 j0Var2 = j0Var;
                B9.r rVar2 = rVar;
                ak akVar2 = akVar;
                try {
                    ajVar.charlie(alVar, interfaceC0566c2, j0Var2, rVar2, akVar2);
                    int i4 = alVar.bravo;
                    int i5 = amVar.bravo;
                    if (i4 < i5) {
                        aj ajVar2 = amVar.alpha[i4];
                        alVar.charlie += ajVar2.bravo;
                        alVar.delta += ajVar2.charlie;
                        int i10 = i4 + 1;
                        alVar.bravo = i10;
                        if (i10 >= i5) {
                            break;
                        }
                        interfaceC0566c = interfaceC0566c2;
                        j0Var = j0Var2;
                        rVar = rVar2;
                        akVar = akVar2;
                    } else {
                        break;
                    }
                } finally {
                }
            }
        }
        bravo();
    }

    public final boolean delta() {
        if (this.bravo == 0) {
            return true;
        }
        return false;
    }

    public final boolean echo() {
        if (this.bravo != 0) {
            return true;
        }
        return false;
    }

    public final void foxtrot(aj ajVar) {
        int i4;
        int i5;
        int i10 = this.bravo;
        aj[] ajVarArr = this.alpha;
        int length = ajVarArr.length;
        int i11 = Barcode.FORMAT_UPC_E;
        if (i10 == length) {
            if (i10 > 1024) {
                i5 = 1024;
            } else {
                i5 = i10;
            }
            aj[] ajVarArr2 = new aj[i5 + i10];
            System.arraycopy(ajVarArr, 0, ajVarArr2, 0, i10);
            this.alpha = ajVarArr2;
        }
        int i12 = this.delta + ajVar.bravo;
        int[] iArr = this.charlie;
        int length2 = iArr.length;
        if (i12 > length2) {
            if (length2 > 1024) {
                i4 = 1024;
            } else {
                i4 = length2;
            }
            int i13 = i4 + length2;
            if (i13 >= i12) {
                i12 = i13;
            }
            int[] iArr2 = new int[i12];
            ArraysKt.zulu(0, 0, iArr, iArr2, length2);
            this.charlie = iArr2;
        }
        int i14 = this.foxtrot;
        int i15 = ajVar.charlie;
        int i16 = i14 + i15;
        Object[] objArr = this.echo;
        int length3 = objArr.length;
        if (i16 > length3) {
            if (length3 <= 1024) {
                i11 = length3;
            }
            int i17 = i11 + length3;
            if (i17 >= i16) {
                i16 = i17;
            }
            Object[] objArr2 = new Object[i16];
            System.arraycopy(objArr, 0, objArr2, 0, length3);
            this.echo = objArr2;
        }
        aj[] ajVarArr3 = this.alpha;
        int i18 = this.bravo;
        this.bravo = i18 + 1;
        ajVarArr3[i18] = ajVar;
        this.delta += ajVar.bravo;
        this.foxtrot += i15;
    }
}
