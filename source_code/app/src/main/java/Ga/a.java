package Ga;

import B2.q;
import P.e;
import Xd.l;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.as;
import com.clevertap.android.sdk.Constants;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.captainsuniforms.CaptainsUniformsFragment;
import delivery.samurai.android.ui.captainsuniforms.viewmodel.CaptainsUniformsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s6.G6;
import s6.I0;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ CaptainsUniformsFragment purple;

    public /* synthetic */ a(CaptainsUniformsFragment captainsUniformsFragment, int i4) {
        this.alpha = i4;
        this.purple = captainsUniformsFragment;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
        boolean z10;
        int i4 = this.alpha;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i4) {
            case 0:
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(intValue & 1, z2)) {
                    I0.alpha(e.echo(1496972167, new a(this.purple, 1), c0585q), c0585q, 48);
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            default:
                if ((intValue & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C0585q c0585q2 = (C0585q) interfaceC0581m;
                if (c0585q2.magenta(intValue & 1, z10)) {
                    final CaptainsUniformsFragment captainsUniformsFragment = this.purple;
                    CaptainsUniformsViewModel captainsUniformsViewModel = (CaptainsUniformsViewModel) captainsUniformsFragment.e.getValue();
                    boolean india = c0585q2.india(captainsUniformsFragment);
                    Object jade = c0585q2.jade();
                    as asVar = C0580l.alpha;
                    if (india || jade == asVar) {
                        final int i5 = 0;
                        jade = new Function1() { // from class: Ga.b
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                switch (i5) {
                                    case 0:
                                        String str = (String) obj3;
                                        CaptainsUniformsFragment captainsUniformsFragment2 = captainsUniformsFragment;
                                        captainsUniformsFragment2.getClass();
                                        if (str != null && str.length() != 0) {
                                            try {
                                                Uri parse = Uri.parse(str);
                                                Intent intent = new Intent("android.intent.action.VIEW", parse);
                                                intent.addFlags(268435456);
                                                if (intent.resolveActivity(captainsUniformsFragment2.requireContext().getPackageManager()) != null) {
                                                    captainsUniformsFragment2.startActivity(intent);
                                                } else {
                                                    try {
                                                        Intent intent2 = new Intent("android.intent.action.VIEW", parse);
                                                        intent2.addFlags(268435456);
                                                        captainsUniformsFragment2.startActivity(intent2);
                                                    } catch (Exception unused) {
                                                        Context requireContext = captainsUniformsFragment2.requireContext();
                                                        Intrinsics.delta(requireContext, "requireContext(...)");
                                                        String string = captainsUniformsFragment2.getString(R.string.error_failed_to_open_link);
                                                        Intrinsics.delta(string, "getString(...)");
                                                        L9.d.pink(requireContext, string);
                                                    }
                                                }
                                            } catch (Exception unused2) {
                                                Context requireContext2 = captainsUniformsFragment2.requireContext();
                                                Intrinsics.delta(requireContext2, "requireContext(...)");
                                                String string2 = captainsUniformsFragment2.getString(R.string.error_failed_to_open_link);
                                                Intrinsics.delta(string2, "getString(...)");
                                                L9.d.pink(requireContext2, string2);
                                            }
                                        }
                                        return Unit.INSTANCE;
                                    default:
                                        Ma.a store = (Ma.a) obj3;
                                        Intrinsics.echo(store, "store");
                                        double d4 = store.bravo;
                                        CaptainsUniformsFragment captainsUniformsFragment3 = captainsUniformsFragment;
                                        captainsUniformsFragment3.getClass();
                                        double d9 = store.charlie;
                                        try {
                                            Intent intent3 = new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d4 + Constants.SEPARATOR_COMMA + d9 + "?q=" + d4 + Constants.SEPARATOR_COMMA + d9 + "(" + Uri.encode(store.alpha) + ")"));
                                            intent3.setPackage("com.google.android.apps.maps");
                                            if (intent3.resolveActivity(captainsUniformsFragment3.requireContext().getPackageManager()) != null) {
                                                captainsUniformsFragment3.startActivity(intent3);
                                            } else {
                                                try {
                                                    captainsUniformsFragment3.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.google.com/maps/search/?api=1&query=" + d4 + Constants.SEPARATOR_COMMA + d9)));
                                                } catch (Exception unused3) {
                                                    Context requireContext3 = captainsUniformsFragment3.requireContext();
                                                    Intrinsics.delta(requireContext3, "requireContext(...)");
                                                    String string3 = captainsUniformsFragment3.getString(R.string.error_failed_to_open_link);
                                                    Intrinsics.delta(string3, "getString(...)");
                                                    L9.d.pink(requireContext3, string3);
                                                }
                                            }
                                        } catch (Exception unused4) {
                                            Context requireContext4 = captainsUniformsFragment3.requireContext();
                                            Intrinsics.delta(requireContext4, "requireContext(...)");
                                            String string4 = captainsUniformsFragment3.getString(R.string.error_failed_to_open_link);
                                            Intrinsics.delta(string4, "getString(...)");
                                            L9.d.pink(requireContext4, string4);
                                        }
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        c0585q2.f(jade);
                    }
                    Function1 function1 = (Function1) jade;
                    boolean india2 = c0585q2.india(captainsUniformsFragment);
                    Object jade2 = c0585q2.jade();
                    if (india2 || jade2 == asVar) {
                        final int i10 = 1;
                        jade2 = new Function1() { // from class: Ga.b
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                switch (i10) {
                                    case 0:
                                        String str = (String) obj3;
                                        CaptainsUniformsFragment captainsUniformsFragment2 = captainsUniformsFragment;
                                        captainsUniformsFragment2.getClass();
                                        if (str != null && str.length() != 0) {
                                            try {
                                                Uri parse = Uri.parse(str);
                                                Intent intent = new Intent("android.intent.action.VIEW", parse);
                                                intent.addFlags(268435456);
                                                if (intent.resolveActivity(captainsUniformsFragment2.requireContext().getPackageManager()) != null) {
                                                    captainsUniformsFragment2.startActivity(intent);
                                                } else {
                                                    try {
                                                        Intent intent2 = new Intent("android.intent.action.VIEW", parse);
                                                        intent2.addFlags(268435456);
                                                        captainsUniformsFragment2.startActivity(intent2);
                                                    } catch (Exception unused) {
                                                        Context requireContext = captainsUniformsFragment2.requireContext();
                                                        Intrinsics.delta(requireContext, "requireContext(...)");
                                                        String string = captainsUniformsFragment2.getString(R.string.error_failed_to_open_link);
                                                        Intrinsics.delta(string, "getString(...)");
                                                        L9.d.pink(requireContext, string);
                                                    }
                                                }
                                            } catch (Exception unused2) {
                                                Context requireContext2 = captainsUniformsFragment2.requireContext();
                                                Intrinsics.delta(requireContext2, "requireContext(...)");
                                                String string2 = captainsUniformsFragment2.getString(R.string.error_failed_to_open_link);
                                                Intrinsics.delta(string2, "getString(...)");
                                                L9.d.pink(requireContext2, string2);
                                            }
                                        }
                                        return Unit.INSTANCE;
                                    default:
                                        Ma.a store = (Ma.a) obj3;
                                        Intrinsics.echo(store, "store");
                                        double d4 = store.bravo;
                                        CaptainsUniformsFragment captainsUniformsFragment3 = captainsUniformsFragment;
                                        captainsUniformsFragment3.getClass();
                                        double d9 = store.charlie;
                                        try {
                                            Intent intent3 = new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d4 + Constants.SEPARATOR_COMMA + d9 + "?q=" + d4 + Constants.SEPARATOR_COMMA + d9 + "(" + Uri.encode(store.alpha) + ")"));
                                            intent3.setPackage("com.google.android.apps.maps");
                                            if (intent3.resolveActivity(captainsUniformsFragment3.requireContext().getPackageManager()) != null) {
                                                captainsUniformsFragment3.startActivity(intent3);
                                            } else {
                                                try {
                                                    captainsUniformsFragment3.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.google.com/maps/search/?api=1&query=" + d4 + Constants.SEPARATOR_COMMA + d9)));
                                                } catch (Exception unused3) {
                                                    Context requireContext3 = captainsUniformsFragment3.requireContext();
                                                    Intrinsics.delta(requireContext3, "requireContext(...)");
                                                    String string3 = captainsUniformsFragment3.getString(R.string.error_failed_to_open_link);
                                                    Intrinsics.delta(string3, "getString(...)");
                                                    L9.d.pink(requireContext3, string3);
                                                }
                                            }
                                        } catch (Exception unused4) {
                                            Context requireContext4 = captainsUniformsFragment3.requireContext();
                                            Intrinsics.delta(requireContext4, "requireContext(...)");
                                            String string4 = captainsUniformsFragment3.getString(R.string.error_failed_to_open_link);
                                            Intrinsics.delta(string4, "getString(...)");
                                            L9.d.pink(requireContext4, string4);
                                        }
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        c0585q2.f(jade2);
                    }
                    Function1 function12 = (Function1) jade2;
                    boolean india3 = c0585q2.india(captainsUniformsFragment);
                    Object jade3 = c0585q2.jade();
                    if (india3 || jade3 == asVar) {
                        jade3 = new q(9, captainsUniformsFragment);
                        c0585q2.f(jade3);
                    }
                    G6.alpha(captainsUniformsViewModel, function1, function12, (Function0) jade3, c0585q2, 0);
                } else {
                    c0585q2.ochre();
                }
                return Unit.INSTANCE;
        }
    }
}
