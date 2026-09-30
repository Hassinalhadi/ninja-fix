package s6;

import android.graphics.Typeface;
import android.widget.ImageView;
import android.widget.TextView;
import delivery.samurai.android.R;
import i3.C1889b;
import i3.C1890c;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import oe.C2233d;
import pe.InterfaceC2330f;

/* renamed from: s6.e5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2643e5 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [J3.h] */
    /* JADX WARN: Type inference failed for: r5v4, types: [U3.a, com.bumptech.glide.j] */
    public static final void alpha(ImageView imageView, String str) {
        Intrinsics.echo(imageView, "imageView");
        com.bumptech.glide.j foxtrot = com.bumptech.glide.b.echo(imageView.getContext()).foxtrot();
        if (str != null && StringsKt.beige(str, "placehold", false)) {
            J3.j jVar = new J3.j();
            jVar.alpha();
            jVar.alpha = true;
            str = new J3.h(str, new J3.l(jVar.bravo));
        }
        ?? r5 = (com.bumptech.glide.j) foxtrot.crimson(str).golf(R.drawable.fallback_image_drawable);
        r5.beige(new C1890c(imageView), null, r5, Y3.f.alpha);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r1v2, types: [J3.h] */
    /* JADX WARN: Type inference failed for: r5v3, types: [U3.a, java.lang.Object, com.bumptech.glide.j] */
    public static final void bravo(ImageView imageView, String str, int i4) {
        boolean z2;
        Intrinsics.echo(imageView, "<this>");
        if ((str != null && kotlin.text.r.quebec(str, "/", false)) || (str != null && kotlin.text.r.quebec(str, "file://", false))) {
            z2 = true;
        } else {
            z2 = false;
        }
        com.bumptech.glide.j foxtrot = com.bumptech.glide.b.echo(imageView.getContext()).foxtrot();
        if (z2) {
            if (str == null) {
                str = "";
            }
            str = new File(str);
        } else if (str != null && StringsKt.beige(str, "placehold", false)) {
            J3.j jVar = new J3.j();
            jVar.alpha();
            jVar.alpha = true;
            str = new J3.h(str, new J3.l(jVar.bravo));
        }
        ?? crimson = foxtrot.crimson(str);
        Intrinsics.delta(crimson, "load(...)");
        crimson.beige(new C1889b(imageView, i4, 0), null, crimson, Y3.f.alpha);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [J3.h] */
    /* JADX WARN: Type inference failed for: r5v4, types: [U3.a, com.bumptech.glide.j] */
    public static void charlie(ImageView imageView, String str, int i4, int i5) {
        int i10;
        if ((i5 & 2) != 0) {
            i4 = R.dimen.spacing_zero;
        }
        if ((i5 & 4) != 0) {
            i10 = R.drawable.fallback_image_drawable;
        } else {
            i10 = R.drawable.ic_package_icon;
        }
        Intrinsics.echo(imageView, "<this>");
        com.bumptech.glide.j foxtrot = com.bumptech.glide.b.echo(imageView.getContext()).foxtrot();
        if (str != null && StringsKt.beige(str, "placehold", false)) {
            J3.j jVar = new J3.j();
            jVar.alpha();
            jVar.alpha = true;
            str = new J3.h(str, new J3.l(jVar.bravo));
        }
        ?? r5 = (com.bumptech.glide.j) foxtrot.crimson(str).golf(i10);
        r5.beige(new C1889b(imageView, i4, 1), null, r5, Y3.f.alpha);
    }

    public static final void delta(ImageView imageView, String str) {
        Intrinsics.echo(imageView, "imageView");
        charlie(imageView, str, R.dimen.spacing_12, 4);
    }

    public static final void echo(TextView textView, Boolean bool) {
        Intrinsics.echo(textView, "textView");
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.ic_done_24, 0);
            textView.setTypeface(textView.getTypeface(), 1);
        } else {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
            textView.setTypeface(Typeface.create(textView.getTypeface(), 0), 0);
        }
    }

    public static final String foxtrot(InterfaceC2330f classDescriptor, String str) {
        String internalName;
        Intrinsics.echo(classDescriptor, "classDescriptor");
        String str2 = C2233d.alpha;
        Ne.e india = Ue.e.golf(classDescriptor).india();
        Intrinsics.delta(india, "fqNameSafe.toUnsafe()");
        Ne.b foxtrot = C2233d.foxtrot(india);
        if (foxtrot != null) {
            internalName = Ve.b.bravo(foxtrot).echo();
            Intrinsics.delta(internalName, "byClassId(it).internalName");
        } else {
            internalName = AbstractC2616b5.echo(classDescriptor, Ge.f.delta);
        }
        Intrinsics.echo(internalName, "internalName");
        return internalName + '.' + str;
    }
}
