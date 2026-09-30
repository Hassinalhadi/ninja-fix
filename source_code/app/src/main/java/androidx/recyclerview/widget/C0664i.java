package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0664i implements ar {
    public final ar alpha;
    public int purple = 0;
    public int red = -1;
    public int silver = -1;
    public Object teal = null;

    public C0664i(ar arVar) {
        this.alpha = arVar;
    }

    public final void alpha() {
        int i4 = this.purple;
        if (i4 == 0) {
            return;
        }
        ar arVar = this.alpha;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3) {
                    arVar.onChanged(this.red, this.silver, this.teal);
                }
            } else {
                arVar.onRemoved(this.red, this.silver);
            }
        } else {
            arVar.onInserted(this.red, this.silver);
        }
        this.teal = null;
        this.purple = 0;
    }

    @Override // androidx.recyclerview.widget.ar
    public final void onChanged(int i4, int i5, Object obj) {
        int i10;
        int i11;
        int i12;
        if (this.purple == 3 && i4 <= (i11 = this.silver + (i10 = this.red)) && (i12 = i4 + i5) >= i10 && this.teal == obj) {
            this.red = Math.min(i4, i10);
            this.silver = Math.max(i11, i12) - this.red;
            return;
        }
        alpha();
        this.red = i4;
        this.silver = i5;
        this.teal = obj;
        this.purple = 3;
    }

    @Override // androidx.recyclerview.widget.ar
    public final void onInserted(int i4, int i5) {
        int i10;
        if (this.purple == 1 && i4 >= (i10 = this.red)) {
            int i11 = this.silver;
            if (i4 <= i10 + i11) {
                this.silver = i11 + i5;
                this.red = Math.min(i4, i10);
                return;
            }
        }
        alpha();
        this.red = i4;
        this.silver = i5;
        this.purple = 1;
    }

    @Override // androidx.recyclerview.widget.ar
    public final void onMoved(int i4, int i5) {
        alpha();
        this.alpha.onMoved(i4, i5);
    }

    @Override // androidx.recyclerview.widget.ar
    public final void onRemoved(int i4, int i5) {
        int i10;
        if (this.purple == 2 && (i10 = this.red) >= i4 && i10 <= i4 + i5) {
            this.silver += i5;
            this.red = i4;
        } else {
            alpha();
            this.red = i4;
            this.silver = i5;
            this.purple = 2;
        }
    }
}
