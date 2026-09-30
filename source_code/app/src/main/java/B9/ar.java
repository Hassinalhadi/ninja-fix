package B9;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes2.dex */
public abstract class ar extends z1.g {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f365p = 0;

    /* renamed from: f, reason: collision with root package name */
    public final MaterialButton f366f;

    /* renamed from: g, reason: collision with root package name */
    public final MaterialButton f367g;

    /* renamed from: h, reason: collision with root package name */
    public final ImageView f368h;

    /* renamed from: i, reason: collision with root package name */
    public final ImageView f369i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f370j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f371k;

    /* renamed from: l, reason: collision with root package name */
    public String f372l;

    /* renamed from: m, reason: collision with root package name */
    public String f373m;

    /* renamed from: n, reason: collision with root package name */
    public String f374n;

    /* renamed from: o, reason: collision with root package name */
    public String f375o;

    public ar(z1.c cVar, View view, MaterialButton materialButton, MaterialButton materialButton2, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2) {
        super(view, 0, cVar);
        this.f366f = materialButton;
        this.f367g = materialButton2;
        this.f368h = imageView;
        this.f369i = imageView2;
        this.f370j = textView;
        this.f371k = textView2;
    }

    public abstract void romeo(String str);

    public abstract void sierra(String str);

    public abstract void tango(String str);
}
