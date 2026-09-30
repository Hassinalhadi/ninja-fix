package B9;

import android.view.View;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;

/* renamed from: B9.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0046j extends z1.g {

    /* renamed from: f, reason: collision with root package name */
    public final TextView f499f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f500g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f501h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f502i;

    public /* synthetic */ AbstractC0046j(z1.c cVar, View view, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        super(view, 0, cVar);
        this.f499f = textView;
        this.f500g = textView2;
        this.f501h = textView3;
        this.f502i = textView4;
    }

    public AbstractC0046j(z1.c cVar, View view, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, TextView textView) {
        super(view, 0, cVar);
        this.f500g = materialButton;
        this.f501h = materialButton2;
        this.f502i = materialButton3;
        this.f499f = textView;
    }
}
