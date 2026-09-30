package h6;

import V5.n;
import android.R;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.GoogleApiAvailability;
import g.C1718a;
import java.util.LinkedList;

/* renamed from: h6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1811a {
    public InterfaceC1813c alpha;
    public Bundle bravo;
    public LinkedList charlie;
    public final C1718a delta = new C1718a(3, this);

    public static void bravo(FrameLayout frameLayout) {
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        Context context = frameLayout.getContext();
        int isGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(context);
        String charlie = n.charlie(isGooglePlayServicesAvailable, context);
        String bravo = n.bravo(isGooglePlayServicesAvailable, context);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(charlie);
        linearLayout.addView(textView);
        Intent errorResolutionIntent = googleApiAvailability.getErrorResolutionIntent(context, isGooglePlayServicesAvailable, null);
        if (errorResolutionIntent != null) {
            Button button = new Button(context);
            button.setId(R.id.button1);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(bravo);
            linearLayout.addView(button);
            button.setOnClickListener(new h(context, errorResolutionIntent));
        }
    }

    public abstract void alpha(C1718a c1718a);

    public final void charlie(int i4) {
        while (!this.charlie.isEmpty() && ((j) this.charlie.getLast()).alpha() >= i4) {
            this.charlie.removeLast();
        }
    }

    public final void delta(Bundle bundle, j jVar) {
        if (this.alpha != null) {
            jVar.bravo();
            return;
        }
        if (this.charlie == null) {
            this.charlie = new LinkedList();
        }
        this.charlie.add(jVar);
        if (bundle != null) {
            Bundle bundle2 = this.bravo;
            if (bundle2 == null) {
                this.bravo = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        alpha(this.delta);
    }
}
