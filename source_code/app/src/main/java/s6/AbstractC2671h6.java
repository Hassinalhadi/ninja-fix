package s6;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import delivery.samurai.android.R;
import g3.C1743d;
import g3.u;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import ke.InterfaceC2036d;
import ke.InterfaceC2037e;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import me.AbstractC2120h;
import pe.InterfaceC2328d;
import pe.InterfaceC2330f;
import pe.InterfaceC2332h;
import pe.InterfaceC2334j;
import pe.InterfaceC2335k;
import pe.InterfaceC2345u;
import se.C2871u;

/* renamed from: s6.h6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2671h6 {
    public static final Object alpha(Object obj, InterfaceC2328d interfaceC2328d) {
        kotlin.reflect.jvm.internal.impl.types.y charlie;
        Class foxtrot;
        if ((!(interfaceC2328d instanceof pe.al) || !Qe.g.delta((pe.aw) interfaceC2328d)) && (charlie = charlie(interfaceC2328d)) != null && (foxtrot = foxtrot(charlie)) != null) {
            return delta(foxtrot, interfaceC2328d).invoke(obj, null);
        }
        return obj;
    }

    public static final InterfaceC2037e bravo(InterfaceC2037e interfaceC2037e, InterfaceC2345u descriptor, boolean z2) {
        kotlin.reflect.jvm.internal.impl.types.y charlie;
        Intrinsics.echo(descriptor, "descriptor");
        if (!Qe.g.alpha(descriptor)) {
            List peach = descriptor.peach();
            Intrinsics.delta(peach, "descriptor.valueParameters");
            if (!peach.isEmpty()) {
                Iterator it = peach.iterator();
                while (it.hasNext()) {
                    kotlin.reflect.jvm.internal.impl.types.y type = ((se.aq) it.next()).getType();
                    Intrinsics.delta(type, "it.type");
                    if (Qe.g.charlie(type)) {
                        break;
                    }
                }
            }
            kotlin.reflect.jvm.internal.impl.types.y returnType = descriptor.getReturnType();
            if ((returnType == null || !Qe.g.charlie(returnType)) && ((interfaceC2037e instanceof InterfaceC2036d) || (charlie = charlie(descriptor)) == null || !Qe.g.charlie(charlie))) {
                return interfaceC2037e;
            }
        }
        return new ke.u(interfaceC2037e, descriptor, z2);
    }

    public static final kotlin.reflect.jvm.internal.impl.types.y charlie(InterfaceC2328d interfaceC2328d) {
        InterfaceC2330f interfaceC2330f;
        C2871u g2 = interfaceC2328d.g();
        C2871u a6 = interfaceC2328d.a();
        if (g2 != null) {
            return g2.getType();
        }
        if (a6 != null) {
            if (interfaceC2328d instanceof InterfaceC2334j) {
                return a6.getType();
            }
            InterfaceC2335k lima = interfaceC2328d.lima();
            if (lima instanceof InterfaceC2330f) {
                interfaceC2330f = (InterfaceC2330f) lima;
            } else {
                interfaceC2330f = null;
            }
            if (interfaceC2330f != null) {
                return interfaceC2330f.oscar();
            }
        }
        return null;
    }

    public static final Method delta(Class cls, InterfaceC2328d descriptor) {
        Intrinsics.echo(descriptor, "descriptor");
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", null);
            Intrinsics.delta(declaredMethod, "{\n        getDeclaredMet…LINE_CLASS_MEMBERS)\n    }");
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new je.Q("No unbox method found in inline class: " + cls + " (calling " + descriptor + ')');
        }
    }

    public static final void echo(androidx.fragment.app.ai aiVar, final C1743d compliance, Function0 function0) {
        androidx.fragment.app.an activity;
        L9.l lVar;
        L9.l lVar2;
        String string;
        String string2;
        Object m206constructorimpl;
        L9.j[] jVarArr = L9.j.alpha;
        Intrinsics.echo(aiVar, "<this>");
        Intrinsics.echo(compliance, "compliance");
        if (aiVar.isAdded() && (activity = aiVar.getActivity()) != null && !activity.isFinishing()) {
            final Context requireContext = aiVar.requireContext();
            Intrinsics.delta(requireContext, "requireContext(...)");
            U7.c delta = U7.c.delta(LayoutInflater.from(requireContext));
            if (compliance.alpha()) {
                lVar = new L9.l(requireContext.getString(R.string.precise_location_required_title_urgent), requireContext.getString(R.string.blocking_approximate_location_message), requireContext.getString(R.string.open_settings), Integer.valueOf(R.drawable.bg_gradient_location_error), Integer.valueOf(R.color.location_error_red_dark), Integer.valueOf(R.color.location_error_red));
            } else if (compliance.bravo()) {
                int ordinal = L9.d.november(requireContext).ordinal();
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            string = requireContext.getString(R.string.while_using_app_text);
                        } else {
                            string = requireContext.getString(R.string.denied_text);
                        }
                    } else {
                        string = requireContext.getString(R.string.ask_every_time_text);
                    }
                } else {
                    string = requireContext.getString(R.string.while_using_app_text);
                }
                Intrinsics.checkNotNull(string);
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 31) {
                    string2 = requireContext.getString(R.string.background_location_steps_android12);
                } else if (i4 >= 29) {
                    string2 = requireContext.getString(R.string.background_location_steps_android10);
                } else {
                    string2 = requireContext.getString(R.string.background_location_steps_android9);
                }
                Intrinsics.checkNotNull(string2);
                String string3 = requireContext.getString(R.string.background_location_downgraded_message, string, string2);
                Intrinsics.delta(string3, "getString(...)");
                lVar = new L9.l(requireContext.getString(R.string.background_location_downgraded_title), string3, requireContext.getString(R.string.open_settings), Integer.valueOf(R.drawable.bg_gradient_location_warning), Integer.valueOf(R.color.location_warning_yellow_dark), Integer.valueOf(R.color.location_warning_yellow));
            } else {
                g3.u uVar = g3.u.purple;
                List list = compliance.bravo;
                if (list.contains(uVar)) {
                    lVar2 = new L9.l(requireContext.getString(R.string.location_permission_required_title), requireContext.getString(R.string.location_permission_required_message), requireContext.getString(R.string.turn_on), Integer.valueOf(R.drawable.bg_gradient_location_info), Integer.valueOf(R.color.location_info_blue_dark), Integer.valueOf(R.color.location_info_blue));
                } else if (list.contains(g3.u.white)) {
                    lVar2 = new L9.l(requireContext.getString(R.string.dialog_system_location_disabled_title), requireContext.getString(R.string.dialog_system_location_disabled_message), requireContext.getString(R.string.open_settings), Integer.valueOf(R.drawable.bg_gradient_location_info), Integer.valueOf(R.color.grey_700), Integer.valueOf(R.color.location_info_blue));
                } else {
                    String string4 = requireContext.getString(R.string.location_permission_required_title);
                    String str = compliance.charlie;
                    if (str == null) {
                        str = requireContext.getString(R.string.dialog_location_permission_required_message);
                        Intrinsics.delta(str, "getString(...)");
                    }
                    lVar = new L9.l(string4, str, requireContext.getString(R.string.open_settings), Integer.valueOf(R.drawable.bg_gradient_location_info), Integer.valueOf(R.color.location_info_blue_dark), Integer.valueOf(R.color.location_info_blue));
                }
                lVar = lVar2;
            }
            String str2 = lVar.alpha;
            Intrinsics.delta(str2, "component1(...)");
            String str3 = lVar.bravo;
            Intrinsics.delta(str3, "component2(...)");
            String str4 = lVar.charlie;
            Intrinsics.delta(str4, "component3(...)");
            int intValue = lVar.delta.intValue();
            int intValue2 = Integer.valueOf(R.color.white).intValue();
            int intValue3 = lVar.echo.intValue();
            int intValue4 = lVar.foxtrot.intValue();
            ConstraintLayout constraintLayout = (ConstraintLayout) delta.red;
            constraintLayout.setBackgroundResource(intValue);
            ((ImageView) delta.purple).setColorFilter(requireContext.getColor(intValue2));
            TextView textView = (TextView) delta.yellow;
            textView.setText(str2);
            textView.setTextColor(requireContext.getColor(intValue3));
            ((TextView) delta.silver).setText(str3);
            MaterialButton materialButton = (MaterialButton) delta.white;
            materialButton.setText(str4);
            materialButton.setBackgroundColor(requireContext.getColor(intValue4));
            Fe.c cVar = new Fe.c(requireContext);
            androidx.appcompat.app.d dVar = (androidx.appcompat.app.d) cVar.red;
            dVar.sierra = (ConstraintLayout) delta.alpha;
            dVar.mike = false;
            final androidx.appcompat.app.g foxtrot = cVar.foxtrot();
            materialButton.setOnClickListener(new L9.e(compliance, aiVar, requireContext, foxtrot));
            ((MaterialButton) delta.teal).setOnClickListener(new View.OnClickListener() { // from class: L9.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C1743d c1743d = C1743d.this;
                    boolean alpha = c1743d.alpha();
                    Context context = requireContext;
                    if (!alpha && !c1743d.bravo()) {
                        if (c1743d.bravo.contains(u.white)) {
                            String string5 = context.getString(R.string.dialog_system_location_disabled_message);
                            Intrinsics.delta(string5, "getString(...)");
                            d.pink(context, string5);
                            return;
                        }
                        foxtrot.dismiss();
                        return;
                    }
                    String string6 = context.getString(R.string.must_grant_precise_location);
                    Intrinsics.delta(string6, "getString(...)");
                    d.pink(context, string6);
                }
            });
            if (compliance.alpha() || compliance.bravo()) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(constraintLayout, "alpha", 1.0f, 0.7f, 1.0f);
                ofFloat.setDuration(1000L);
                ofFloat.setRepeatCount(-1);
                ofFloat.start();
            }
            foxtrot.setOnDismissListener(new L9.g(function0, aiVar));
            L9.i.alpha.put(aiVar, new WeakReference(foxtrot));
            try {
                Result.Companion companion = Result.INSTANCE;
                foxtrot.show();
                m206constructorimpl = Result.m206constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m207exceptionOrNullimpl(m206constructorimpl) != null) {
                LinkedHashMap linkedHashMap = L9.i.alpha;
                L9.i.alpha.remove(aiVar);
            }
        }
    }

    public static final Class foxtrot(kotlin.reflect.jvm.internal.impl.types.y yVar) {
        kotlin.reflect.jvm.internal.impl.types.ae foxtrot;
        Intrinsics.echo(yVar, "<this>");
        Class golf = golf(yVar.green().kilo());
        if (golf != null) {
            if (!kotlin.reflect.jvm.internal.impl.types.az.foxtrot(yVar) || ((foxtrot = Qe.g.foxtrot(yVar)) != null && !kotlin.reflect.jvm.internal.impl.types.az.foxtrot(foxtrot) && !AbstractC2120h.blue(foxtrot))) {
                return golf;
            }
            return null;
        }
        return null;
    }

    public static final Class golf(InterfaceC2335k interfaceC2335k) {
        if ((interfaceC2335k instanceof InterfaceC2330f) && Qe.g.bravo(interfaceC2335k)) {
            InterfaceC2330f interfaceC2330f = (InterfaceC2330f) interfaceC2335k;
            Class juliet = je.a0.juliet(interfaceC2330f);
            if (juliet != null) {
                return juliet;
            }
            throw new je.Q("Class object for the class " + interfaceC2330f.getName() + " cannot be found (classId=" + Ue.e.foxtrot((InterfaceC2332h) interfaceC2335k) + ')');
        }
        return null;
    }
}
