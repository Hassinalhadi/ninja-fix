package c1;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: c1.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0808g {
    public final float alpha;
    public final float bravo;
    public final float charlie;
    public final float delta;
    public final int echo;

    public C0808g(Context context, XmlResourceParser xmlResourceParser) {
        this.alpha = Float.NaN;
        this.bravo = Float.NaN;
        this.charlie = Float.NaN;
        this.delta = Float.NaN;
        this.echo = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC0820s.kilo);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = obtainStyledAttributes.getIndex(i4);
            if (index == 0) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.echo);
                this.echo = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new C0815n().bravo((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.delta = obtainStyledAttributes.getDimension(index, this.delta);
            } else if (index == 2) {
                this.bravo = obtainStyledAttributes.getDimension(index, this.bravo);
            } else if (index == 3) {
                this.charlie = obtainStyledAttributes.getDimension(index, this.charlie);
            } else if (index == 4) {
                this.alpha = obtainStyledAttributes.getDimension(index, this.alpha);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        obtainStyledAttributes.recycle();
    }
}
