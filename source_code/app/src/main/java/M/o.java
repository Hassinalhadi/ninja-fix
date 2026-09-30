package M;

/* loaded from: classes3.dex */
public final class o extends n {
    public final /* synthetic */ int silver;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.silver) {
            case 0:
                int i4 = this.red;
                this.red = i4 + 2;
                Object[] objArr = this.alpha;
                return new a(0, objArr[i4], objArr[i4 + 1]);
            case 1:
                int i5 = this.red;
                this.red = i5 + 2;
                return this.alpha[i5];
            default:
                int i10 = this.red;
                this.red = i10 + 2;
                return this.alpha[i10 + 1];
        }
    }
}
