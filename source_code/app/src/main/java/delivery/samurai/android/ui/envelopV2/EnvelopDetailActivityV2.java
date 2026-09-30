package delivery.samurai.android.ui.envelopV2;

import Aa.f;
import Aa.l;
import B9.AbstractC0054n;
import B9.ab;
import Eb.b;
import Fb.p;
import Gb.d;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.au;
import com.app.base.BaseViewModel;
import com.app.network.network.models.EnvelopNotification;
import com.app.network.network.models.Image;
import com.checkout.components.card.utils.constants.ExpiryDateConstantsKt;
import com.clevertap.android.sdk.Constants;
import dagger.hilt.android.AndroidEntryPoint;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.envelopV2.EnvelopDetailActivityV2;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import kotlin.text.r;
import r3.C2492a;
import s6.AbstractC2634d5;
import s6.S6;
import z1.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ldelivery/samurai/android/ui/envelopV2/EnvelopDetailActivityV2;", "Ld3/k;", "<init>", "()V", "r6/u", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class EnvelopDetailActivityV2 extends p {

    /* renamed from: N, reason: collision with root package name */
    public static final /* synthetic */ int f12255N = 0;

    /* renamed from: J, reason: collision with root package name */
    public final ab f12256J;

    /* renamed from: K, reason: collision with root package name */
    public AbstractC0054n f12257K;

    /* renamed from: L, reason: collision with root package name */
    public EnvelopNotification f12258L;

    /* renamed from: M, reason: collision with root package name */
    public String f12259M;

    public EnvelopDetailActivityV2() {
        super(1);
        this.f1294I = false;
        addOnContextAvailableListener(new b(this, 4));
        this.f12256J = new ab(u.alpha.bravo(EnvelopsViewModelV2.class), new d(this, 1), new d(this, 0), new d(this, 2));
        this.f12259M = ExpiryDateConstantsKt.EXPIRY_DATE_PREFIX_ZERO;
    }

    public static Integer green(String str) {
        try {
            if (!r.quebec(str, "0x", false) && !r.quebec(str, "0X", false)) {
                if (r.quebec(str, "#", false)) {
                    return Integer.valueOf(Color.parseColor(str));
                }
                return null;
            }
            return Integer.valueOf((int) Long.decode(str).longValue());
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // d3.k
    public final BaseViewModel black() {
        return (EnvelopsViewModelV2) this.f12256J.getValue();
    }

    public final void gold(EnvelopNotification envelopNotification) {
        EnvelopNotification.Tag tag;
        String str;
        Integer num;
        Integer num2;
        int parseColor;
        int parseColor2;
        int parseColor3;
        List<EnvelopNotification.Tag> tags;
        Integer num3 = null;
        if (envelopNotification != null && (tags = envelopNotification.getTags()) != null) {
            tag = (EnvelopNotification.Tag) CollectionsKt.green(tags);
        } else {
            tag = null;
        }
        if (tag != null) {
            str = tag.getValue();
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            gray().f567h.setVisibility(0);
            gray().f567h.setText(tag.getValue());
            String color = tag.getColor();
            if (color != null) {
                num = green(color);
            } else {
                num = null;
            }
            String foregroundColor = tag.getForegroundColor();
            if (foregroundColor != null) {
                num2 = green(foregroundColor);
            } else {
                num2 = null;
            }
            String foregroundColor2 = tag.getForegroundColor();
            if (foregroundColor2 != null) {
                num3 = green(foregroundColor2);
            }
            if (num != null) {
                parseColor = num.intValue();
            } else {
                parseColor = Color.parseColor("#FFF0FDF4");
            }
            if (num2 != null) {
                parseColor2 = num2.intValue();
            } else {
                parseColor2 = Color.parseColor("#FF16A34A");
            }
            if (num3 != null) {
                parseColor3 = num3.intValue();
            } else {
                parseColor3 = Color.parseColor("#FF16A34A");
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(getResources().getDisplayMetrics().density * 100.0f);
            gradientDrawable.setColor(parseColor);
            gradientDrawable.setStroke((int) (1 * getResources().getDisplayMetrics().density), parseColor2);
            gray().f567h.setBackground(gradientDrawable);
            gray().f567h.setTextColor(parseColor3);
            return;
        }
        gray().f567h.setVisibility(8);
    }

    public final AbstractC0054n gray() {
        AbstractC0054n abstractC0054n = this.f12257K;
        if (abstractC0054n != null) {
            return abstractC0054n;
        }
        Intrinsics.lima("binding");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    @Override // d3.k, d3.q, androidx.fragment.app.an, ae.o, f1.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        EnvelopNotification envelopNotification;
        String str;
        String createdAt;
        super.onCreate(bundle);
        g delta = z1.d.delta(this, R.layout.activity_envelop_detail_v2);
        Intrinsics.delta(delta, "setContentView(...)");
        this.f12257K = (AbstractC0054n) delta;
        String stringExtra = getIntent().getStringExtra("ENVELOP_NOTIFICATION_ID");
        if (stringExtra == null) {
            stringExtra = ExpiryDateConstantsKt.EXPIRY_DATE_PREFIX_ZERO;
        }
        this.f12259M = stringExtra;
        Serializable serializableExtra = getIntent().getSerializableExtra("ENVELOP_NOTIFICATION");
        if (serializableExtra instanceof EnvelopNotification) {
            envelopNotification = (EnvelopNotification) serializableExtra;
        } else {
            envelopNotification = null;
        }
        this.f12258L = envelopNotification;
        ab abVar = this.f12256J;
        if (envelopNotification != null) {
            gray().romeo(this.f12258L);
            gold(this.f12258L);
            AbstractC0054n gray = gray();
            EnvelopNotification envelopNotification2 = this.f12258L;
            if (envelopNotification2 != null && (createdAt = envelopNotification2.getCreatedAt()) != null) {
                str = AbstractC2634d5.golf(createdAt);
            } else {
                str = "";
            }
            gray.f569j.setText(str);
            EnvelopsViewModelV2 envelopsViewModelV2 = (EnvelopsViewModelV2) abVar.getValue();
            String envelopeId = this.f12259M;
            Intrinsics.echo(envelopeId, "envelopeId");
            BaseViewModel.launchApi$default(envelopsViewModelV2, null, new Gb.u(null, envelopsViewModelV2, envelopeId), 1, null);
        } else {
            EnvelopsViewModelV2 envelopsViewModelV22 = (EnvelopsViewModelV2) abVar.getValue();
            String envelopId = this.f12259M;
            Intrinsics.echo(envelopId, "envelopId");
            ?? auVar = new au(new C2492a(2, "loading"));
            BaseViewModel.launchApi$default(envelopsViewModelV22, null, new Gb.r(envelopsViewModelV22, envelopId, auVar, null), 1, null);
            auVar.observe(this, new f(7, new l(8, this)));
        }
        final int i4 = 0;
        gray().f566g.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: Gb.c
            public final /* synthetic */ EnvelopDetailActivityV2 purple;

            {
                this.purple = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Image file;
                String url;
                EnvelopDetailActivityV2 envelopDetailActivityV2 = this.purple;
                switch (i4) {
                    case 0:
                        int i5 = EnvelopDetailActivityV2.f12255N;
                        envelopDetailActivityV2.onBackPressed();
                        return;
                    default:
                        EnvelopNotification envelopNotification3 = envelopDetailActivityV2.f12258L;
                        if (envelopNotification3 != null && (file = envelopNotification3.getFile()) != null && (url = file.getUrl()) != null) {
                            w wVar = new w();
                            wVar.setArguments(S6.charlie(new Pair(Constants.KEY_URL, url)));
                            wVar.romeo(envelopDetailActivityV2.getSupportFragmentManager(), "FullScreenImageDialog");
                            return;
                        }
                        return;
                }
            }
        });
        final int i5 = 1;
        gray().f565f.setOnClickListener(new View.OnClickListener(this) { // from class: Gb.c
            public final /* synthetic */ EnvelopDetailActivityV2 purple;

            {
                this.purple = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Image file;
                String url;
                EnvelopDetailActivityV2 envelopDetailActivityV2 = this.purple;
                switch (i5) {
                    case 0:
                        int i52 = EnvelopDetailActivityV2.f12255N;
                        envelopDetailActivityV2.onBackPressed();
                        return;
                    default:
                        EnvelopNotification envelopNotification3 = envelopDetailActivityV2.f12258L;
                        if (envelopNotification3 != null && (file = envelopNotification3.getFile()) != null && (url = file.getUrl()) != null) {
                            w wVar = new w();
                            wVar.setArguments(S6.charlie(new Pair(Constants.KEY_URL, url)));
                            wVar.romeo(envelopDetailActivityV2.getSupportFragmentManager(), "FullScreenImageDialog");
                            return;
                        }
                        return;
                }
            }
        });
    }
}
