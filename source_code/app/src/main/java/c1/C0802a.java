package c1;

/* renamed from: c1.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0802a extends AbstractC0804c {

    /* renamed from: a, reason: collision with root package name */
    public int f3457a;

    /* renamed from: b, reason: collision with root package name */
    public int f3458b;

    /* renamed from: c, reason: collision with root package name */
    public Z0.a f3459c;

    public boolean getAllowsGoneWidget() {
        return this.f3459c.f2445l;
    }

    public int getMargin() {
        return this.f3459c.f2446m;
    }

    public int getType() {
        return this.f3457a;
    }

    @Override // c1.AbstractC0804c
    public final void hotel(Z0.d dVar, boolean z2) {
        int i4 = this.f3457a;
        this.f3458b = i4;
        if (z2) {
            if (i4 == 5) {
                this.f3458b = 1;
            } else if (i4 == 6) {
                this.f3458b = 0;
            }
        } else if (i4 == 5) {
            this.f3458b = 0;
        } else if (i4 == 6) {
            this.f3458b = 1;
        }
        if (dVar instanceof Z0.a) {
            ((Z0.a) dVar).f2444k = this.f3458b;
        }
    }

    public void setAllowsGoneWidget(boolean z2) {
        this.f3459c.f2445l = z2;
    }

    public void setDpMargin(int i4) {
        this.f3459c.f2446m = (int) ((i4 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i4) {
        this.f3459c.f2446m = i4;
    }

    public void setType(int i4) {
        this.f3457a = i4;
    }
}
