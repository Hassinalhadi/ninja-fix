package W0;

import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.jvm.internal.Intrinsics;
import r1.InterfaceC2485d;

/* loaded from: classes3.dex */
public class d implements InterfaceC2485d {
    public final Object[] alpha;
    public int purple;

    public d(int i4) {
        if (i4 > 0) {
            this.alpha = new Object[i4];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    @Override // r1.InterfaceC2485d
    public boolean alpha(Object instance) {
        Object[] objArr;
        boolean z2;
        Intrinsics.echo(instance, "instance");
        int i4 = this.purple;
        int i5 = 0;
        while (true) {
            objArr = this.alpha;
            if (i5 < i4) {
                if (objArr[i5] == instance) {
                    z2 = true;
                    break;
                }
                i5++;
            } else {
                z2 = false;
                break;
            }
        }
        if (!z2) {
            int i10 = this.purple;
            if (i10 >= objArr.length) {
                return false;
            }
            objArr[i10] = instance;
            this.purple = i10 + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    public void bravo(b bVar) {
        int i4 = this.purple;
        Object[] objArr = this.alpha;
        if (i4 < objArr.length) {
            objArr[i4] = bVar;
            this.purple = i4 + 1;
        }
    }

    @Override // r1.InterfaceC2485d
    public Object charlie() {
        int i4 = this.purple;
        if (i4 <= 0) {
            return null;
        }
        int i5 = i4 - 1;
        Object[] objArr = this.alpha;
        Object obj = objArr[i5];
        Intrinsics.charlie(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i5] = null;
        this.purple--;
        return obj;
    }

    public d() {
        this.alpha = new Object[Barcode.FORMAT_QR_CODE];
    }
}
