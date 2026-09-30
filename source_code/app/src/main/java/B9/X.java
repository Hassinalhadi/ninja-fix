package B9;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes2.dex */
public abstract class X extends z1.g {

    /* renamed from: f, reason: collision with root package name */
    public final TextView f264f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f265g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f266h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f267i;

    /* renamed from: j, reason: collision with root package name */
    public final View f268j;

    public X(z1.c cVar, View view, TextView textView, TextView textView2, ImageView imageView, TextView textView3, TextView textView4) {
        super(view, 0, cVar);
        this.f264f = textView;
        this.f265g = textView2;
        this.f268j = imageView;
        this.f266h = textView3;
        this.f267i = textView4;
    }

    public X(z1.c cVar, View view, ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        super(view, 0, cVar);
        this.f268j = constraintLayout;
        this.f264f = textView;
        this.f265g = textView2;
        this.f266h = textView3;
        this.f267i = textView4;
    }

    public X(z1.c cVar, View view, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, TextView textView, TextView textView2) {
        super(view, 0, cVar);
        this.f266h = materialButton;
        this.f267i = materialButton2;
        this.f268j = materialButton3;
        this.f264f = textView;
        this.f265g = textView2;
    }
}
