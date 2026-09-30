package e2;

import Y1.aa;
import Y1.aq;
import Y1.e;
import Y1.k;
import Y1.p;
import Y1.r;
import al.g;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.ab;
import androidx.appcompat.app.b;
import androidx.appcompat.app.q;
import androidx.drawerlayout.widget.DrawerLayout;
import com.bumptech.glide.load.engine.h;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.homev2.HomeActivityV2;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.collections.t;
import kotlin.jvm.internal.Intrinsics;
import s6.W6;
import y1.InterfaceC3390c;

/* renamed from: e2.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1626a implements p {
    public final Context alpha;
    public final h bravo;
    public final WeakReference charlie;
    public g delta;
    public ObjectAnimator echo;
    public final HomeActivityV2 foxtrot;

    public C1626a(HomeActivityV2 homeActivityV2, h configuration) {
        WeakReference weakReference;
        Intrinsics.echo(configuration, "configuration");
        b drawerToggleDelegate = homeActivityV2.getDrawerToggleDelegate();
        if (drawerToggleDelegate != null) {
            Context yankee = ((q) drawerToggleDelegate).alpha.yankee();
            Intrinsics.delta(yankee, "getActionBarThemedContext(...)");
            this.alpha = yankee;
            this.bravo = configuration;
            DrawerLayout drawerLayout = (DrawerLayout) configuration.red;
            if (drawerLayout != null) {
                weakReference = new WeakReference(drawerLayout);
            } else {
                weakReference = null;
            }
            this.charlie = weakReference;
            this.foxtrot = homeActivityV2;
            return;
        }
        throw new IllegalStateException(("Activity " + homeActivityV2 + " does not have a DrawerToggleDelegate set").toString());
    }

    @Override // Y1.p
    public final void alpha(r controller, aa destination, Bundle bundle) {
        InterfaceC3390c interfaceC3390c;
        Map map;
        String stringBuffer;
        aq aqVar;
        String valueOf;
        boolean z2;
        Pair pair;
        int i4;
        float f5;
        Intrinsics.echo(controller, "controller");
        Intrinsics.echo(destination, "destination");
        if (destination instanceof Y1.g) {
            return;
        }
        WeakReference weakReference = this.charlie;
        if (weakReference != null) {
            interfaceC3390c = (InterfaceC3390c) weakReference.get();
        } else {
            interfaceC3390c = null;
        }
        if (weakReference != null && interfaceC3390c == null) {
            androidx.navigation.internal.g gVar = controller.bravo;
            gVar.getClass();
            gVar.papa.remove(this);
            return;
        }
        Context context = this.alpha;
        Intrinsics.echo(context, "context");
        CharSequence charSequence = destination.silver;
        if (charSequence == null) {
            stringBuffer = null;
        } else {
            Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(charSequence);
            StringBuffer stringBuffer2 = new StringBuffer();
            if (bundle != null) {
                map = W6.kilo(bundle);
            } else {
                map = t.alpha;
            }
            while (matcher.find()) {
                String group = matcher.group(1);
                if (group != null && map.containsKey(group)) {
                    matcher.appendReplacement(stringBuffer2, "");
                    k kVar = (k) destination.india().get(group);
                    if (kVar != null) {
                        aqVar = kVar.alpha;
                    } else {
                        aqVar = null;
                    }
                    e eVar = aq.charlie;
                    if (Intrinsics.areEqual(aqVar, eVar)) {
                        Intrinsics.checkNotNull(bundle);
                        valueOf = context.getString(((Integer) eVar.alpha(bundle, group)).intValue());
                    } else {
                        Intrinsics.checkNotNull(aqVar);
                        Intrinsics.checkNotNull(bundle);
                        valueOf = String.valueOf(aqVar.alpha(bundle, group));
                    }
                    Intrinsics.checkNotNull(valueOf);
                    stringBuffer2.append(valueOf);
                } else {
                    throw new IllegalArgumentException(("Could not find \"" + group + "\" in " + bundle + " to fill label \"" + ((Object) charSequence) + '\"').toString());
                }
            }
            matcher.appendTail(stringBuffer2);
            stringBuffer = stringBuffer2.toString();
        }
        if (stringBuffer != null) {
            HomeActivityV2 homeActivityV2 = this.foxtrot;
            androidx.appcompat.app.a supportActionBar = homeActivityV2.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.tango(stringBuffer);
            } else {
                throw new IllegalStateException(("Activity " + homeActivityV2 + " does not have an ActionBar set via setSupportActionBar()").toString());
            }
        }
        boolean lima = this.bravo.lima(destination);
        if (interfaceC3390c == null && lima) {
            bravo(null, 0);
            return;
        }
        if (interfaceC3390c != null && lima) {
            z2 = true;
        } else {
            z2 = false;
        }
        g gVar2 = this.delta;
        if (gVar2 != null) {
            pair = new Pair(gVar2, Boolean.TRUE);
        } else {
            g gVar3 = new g(context);
            this.delta = gVar3;
            pair = new Pair(gVar3, Boolean.FALSE);
        }
        g gVar4 = (g) pair.first;
        boolean booleanValue = ((Boolean) pair.second).booleanValue();
        if (z2) {
            i4 = R.string.nav_app_bar_open_drawer_description;
        } else {
            i4 = R.string.nav_app_bar_navigate_up_description;
        }
        bravo(gVar4, i4);
        if (z2) {
            f5 = 0.0f;
        } else {
            f5 = 1.0f;
        }
        if (booleanValue) {
            float f10 = gVar4.india;
            ObjectAnimator objectAnimator = this.echo;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(gVar4, "progress", f10, f5);
            this.echo = ofFloat;
            Intrinsics.charlie(ofFloat, "null cannot be cast to non-null type android.animation.ObjectAnimator");
            ofFloat.start();
            return;
        }
        gVar4.setProgress(f5);
    }

    public final void bravo(g gVar, int i4) {
        boolean z2;
        HomeActivityV2 homeActivityV2 = this.foxtrot;
        androidx.appcompat.app.a supportActionBar = homeActivityV2.getSupportActionBar();
        if (supportActionBar != null) {
            if (gVar != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            supportActionBar.oscar(z2);
            b drawerToggleDelegate = homeActivityV2.getDrawerToggleDelegate();
            if (drawerToggleDelegate != null) {
                ab abVar = ((q) drawerToggleDelegate).alpha;
                abVar.beige();
                androidx.appcompat.app.a aVar = abVar.f2731h;
                if (aVar != null) {
                    aVar.romeo(gVar);
                    aVar.quebec(i4);
                    return;
                }
                return;
            }
            throw new IllegalStateException(("Activity " + homeActivityV2 + " does not have a DrawerToggleDelegate set").toString());
        }
        throw new IllegalStateException(("Activity " + homeActivityV2 + " does not have an ActionBar set via setSupportActionBar()").toString());
    }
}
