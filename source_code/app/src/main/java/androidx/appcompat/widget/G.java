package androidx.appcompat.widget;

/* loaded from: classes3.dex */
public final class G extends F {
    public final /* synthetic */ AppCompatTextView silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(AppCompatTextView appCompatTextView) {
        super(appCompatTextView);
        this.silver = appCompatTextView;
    }

    @Override // androidx.appcompat.widget.C0465l, androidx.appcompat.widget.E
    public final void delta(int i4, float f5) {
        super/*android.widget.TextView*/.setLineHeight(i4, f5);
    }
}
