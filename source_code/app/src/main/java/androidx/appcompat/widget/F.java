package androidx.appcompat.widget;

/* loaded from: classes3.dex */
public class F extends C0465l {
    public final /* synthetic */ AppCompatTextView red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(AppCompatTextView appCompatTextView) {
        super(2, appCompatTextView);
        this.red = appCompatTextView;
    }

    @Override // androidx.appcompat.widget.C0465l, androidx.appcompat.widget.E
    public final void alpha(int i4) {
        super/*android.widget.TextView*/.setLastBaselineToBottomHeight(i4);
    }

    @Override // androidx.appcompat.widget.C0465l, androidx.appcompat.widget.E
    public final void charlie(int i4) {
        super/*android.widget.TextView*/.setFirstBaselineToTopHeight(i4);
    }
}
