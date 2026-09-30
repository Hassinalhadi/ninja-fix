package Wb;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import delivery.samurai.android.R;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import t6.S3;
import x9.AbstractC3307a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LWb/s;", "Lx9/a;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class s extends AbstractC3307a {

    /* renamed from: r, reason: collision with root package name */
    public B9.aa f2214r;

    /* renamed from: s, reason: collision with root package name */
    public final Lazy f2215s = LazyKt.lazy(new B2.q(24, this));

    @Override // x9.AbstractC3307a
    public final void azure() {
    }

    @Override // androidx.fragment.app.ai
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        amber();
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.bottom_sheet_call_options, viewGroup, false);
        int i4 = R.id.btnCallPhone;
        Button button = (Button) S3.bravo(R.id.btnCallPhone, inflate);
        if (button != null) {
            i4 = R.id.btnWhatsApp;
            Button button2 = (Button) S3.bravo(R.id.btnWhatsApp, inflate);
            if (button2 != null) {
                LinearLayout linearLayout = (LinearLayout) inflate;
                B9.aa aaVar = new B9.aa(linearLayout, button, button2);
                this.f2214r = aaVar;
                Intrinsics.checkNotNull(aaVar);
                Intrinsics.delta(linearLayout, "getRoot(...)");
                return linearLayout;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w, androidx.fragment.app.ai
    public final void onDestroyView() {
        super.onDestroyView();
        this.f2214r = null;
    }

    @Override // x9.AbstractC3307a, androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        B9.aa aaVar = this.f2214r;
        Intrinsics.checkNotNull(aaVar);
        final int i4 = 0;
        aaVar.alpha.setOnClickListener(new View.OnClickListener(this) { // from class: Wb.r
            public final /* synthetic */ s purple;

            {
                this.purple = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        Intent intent = new Intent("android.intent.action.DIAL");
                        s sVar = this.purple;
                        intent.setData(Uri.parse("tel:" + StringsKt.b((String) sVar.f2215s.getValue()).toString()));
                        sVar.amber();
                        sVar.startActivity(intent);
                        sVar.juliet();
                        return;
                    default:
                        s sVar2 = this.purple;
                        try {
                            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("https://wa.me/".concat(new Regex("\\D").foxtrot(kotlin.text.r.oscar(StringsKt.b((String) sVar2.f2215s.getValue()).toString(), "+", ""), ""))));
                            intent2.setPackage("com.whatsapp");
                            sVar2.startActivity(intent2);
                        } catch (ActivityNotFoundException unused) {
                            sVar2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.whatsapp")));
                        }
                        sVar2.juliet();
                        return;
                }
            }
        });
        B9.aa aaVar2 = this.f2214r;
        Intrinsics.checkNotNull(aaVar2);
        final int i5 = 1;
        aaVar2.bravo.setOnClickListener(new View.OnClickListener(this) { // from class: Wb.r
            public final /* synthetic */ s purple;

            {
                this.purple = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i5) {
                    case 0:
                        Intent intent = new Intent("android.intent.action.DIAL");
                        s sVar = this.purple;
                        intent.setData(Uri.parse("tel:" + StringsKt.b((String) sVar.f2215s.getValue()).toString()));
                        sVar.amber();
                        sVar.startActivity(intent);
                        sVar.juliet();
                        return;
                    default:
                        s sVar2 = this.purple;
                        try {
                            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("https://wa.me/".concat(new Regex("\\D").foxtrot(kotlin.text.r.oscar(StringsKt.b((String) sVar2.f2215s.getValue()).toString(), "+", ""), ""))));
                            intent2.setPackage("com.whatsapp");
                            sVar2.startActivity(intent2);
                        } catch (ActivityNotFoundException unused) {
                            sVar2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.whatsapp")));
                        }
                        sVar2.juliet();
                        return;
                }
            }
        });
    }
}
