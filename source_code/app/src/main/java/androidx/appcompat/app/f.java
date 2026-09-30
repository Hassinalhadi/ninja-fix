package androidx.appcompat.app;

import J8.ay;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import delivery.samurai.android.R;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class f {
    public final Context alpha;
    public final int amber;
    public final int azure;
    public final int beige;
    public final boolean black;
    public final ay blue;
    public final g bravo;
    public final Window charlie;
    public CharSequence delta;
    public CharSequence echo;
    public AlertController$RecycleListView foxtrot;
    public View golf;
    public Button india;
    public CharSequence juliet;
    public Message kilo;
    public Button lima;
    public CharSequence mike;
    public Message november;
    public Button oscar;
    public CharSequence papa;
    public Message quebec;
    public NestedScrollView romeo;
    public Drawable sierra;
    public ImageView tango;
    public TextView uniform;
    public TextView victor;
    public View whiskey;
    public ListAdapter xray;
    public final int zulu;
    public boolean hotel = false;
    public int yankee = -1;
    public final Z8.c bronze = new Z8.c(1, this);

    public f(Context context, g gVar, Window window) {
        this.alpha = context;
        this.bravo = gVar;
        this.charlie = window;
        ay ayVar = new ay();
        ayVar.bravo = new WeakReference(gVar);
        this.blue = ayVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, aj.a.echo, R.attr.alertDialogStyle, 0);
        this.zulu = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.amber = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.azure = obtainStyledAttributes.getResourceId(7, 0);
        this.beige = obtainStyledAttributes.getResourceId(3, 0);
        this.black = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        gVar.supportRequestWindowFeature(1);
    }

    public static boolean alpha(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (alpha(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static ViewGroup bravo(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void charlie(int i4, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message message;
        if (onClickListener != null) {
            message = this.blue.obtainMessage(i4, onClickListener);
        } else {
            message = null;
        }
        if (i4 != -3) {
            if (i4 != -2) {
                if (i4 == -1) {
                    this.juliet = charSequence;
                    this.kilo = message;
                    return;
                }
                throw new IllegalArgumentException("Button does not exist");
            }
            this.mike = charSequence;
            this.november = message;
            return;
        }
        this.papa = charSequence;
        this.quebec = message;
    }
}
