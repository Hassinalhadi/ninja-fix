package t6;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.recyclerview.widget.RecyclerView;
import delivery.samurai.android.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import s1.InterfaceC2577j;

/* renamed from: t6.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3077x {
    public static boolean alpha;
    public static Method bravo;
    public static boolean charlie;
    public static Field delta;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r1v2, types: [Pd.c, Wf.af] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object alpha(Wf.ad adVar, ArrayList arrayList, Wf.x xVar, Wf.r rVar, Pd.c cVar) {
        ?? r12;
        int i4;
        ArrayList args;
        if (cVar instanceof Wf.af) {
            Wf.af afVar = (Wf.af) cVar;
            int i5 = afVar.red;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                afVar.red = i5 - RecyclerView.UNDEFINED_DURATION;
                r12 = afVar;
                Object obj = r12.purple;
                Od.a aVar = Od.a.alpha;
                i4 = r12.red;
                if (i4 == 0) {
                    if (i4 == 1) {
                        ?? r62 = r12.alpha;
                        ResultKt.alpha(obj);
                        args = r62;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    r12.alpha = arrayList;
                    r12.red = 1;
                    obj = delta(adVar, xVar, rVar, r12);
                    args = arrayList;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                String str = (String) obj;
                Regex regex = Wf.ai.alpha;
                Intrinsics.echo(str, "<this>");
                Intrinsics.echo(args, "args");
                return Wf.ai.alpha.golf(str, new Vc.m(1, args));
            }
        }
        r12 = new Pd.c(cVar);
        Object obj2 = r12.purple;
        Od.a aVar2 = Od.a.alpha;
        i4 = r12.red;
        if (i4 == 0) {
        }
        String str2 = (String) obj2;
        Regex regex2 = Wf.ai.alpha;
        Intrinsics.echo(str2, "<this>");
        Intrinsics.echo(args, "args");
        return Wf.ai.alpha.golf(str2, new Vc.m(1, args));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [s1.at, java.lang.Object] */
    public static boolean bravo(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        WeakHashMap weakHashMap = s1.au.alpha;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList2 = s1.at.delta;
            s1.at atVar = (s1.at) view.getTag(R.id.tag_unhandled_key_event_manager);
            WeakReference weakReference = null;
            s1.at atVar2 = atVar;
            if (atVar == null) {
                ?? obj = new Object();
                obj.alpha = null;
                obj.bravo = null;
                obj.charlie = null;
                view.setTag(R.id.tag_unhandled_key_event_manager, obj);
                atVar2 = obj;
            }
            WeakReference weakReference2 = atVar2.charlie;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                atVar2.charlie = new WeakReference(keyEvent);
                if (atVar2.bravo == null) {
                    atVar2.bravo = new SparseArray();
                }
                SparseArray sparseArray = atVar2.bravo;
                if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
                    sparseArray.removeAt(indexOfKey);
                }
                if (weakReference == null) {
                    weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference != null) {
                    View view2 = (View) weakReference.get();
                    if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
                        return true;
                    }
                    arrayList.get(size).getClass();
                    throw new ClassCastException();
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean charlie(InterfaceC2577j interfaceC2577j, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        Window window;
        boolean z2 = false;
        if (interfaceC2577j != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return interfaceC2577j.superDispatchKeyEvent(keyEvent);
            }
            KeyEvent.DispatcherState dispatcherState = null;
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window2 = activity.getWindow();
                if (window2.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!alpha) {
                            try {
                                bravo = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            alpha = true;
                        }
                        Method method = bravo;
                        if (method != null) {
                            try {
                                Object invoke = method.invoke(actionBar, keyEvent);
                                if (invoke != null) {
                                    z2 = ((Boolean) invoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (z2) {
                            return true;
                        }
                    }
                }
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window2.getDecorView();
                if (s1.au.charlie(decorView, keyEvent)) {
                    return true;
                }
                if (decorView != null) {
                    dispatcherState = decorView.getKeyDispatcherState();
                }
                return keyEvent.dispatch(activity, dispatcherState, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!charlie) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        delta = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    charlie = true;
                }
                Field field = delta;
                if (field != null) {
                    try {
                        onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    } catch (IllegalAccessException unused4) {
                    }
                    if (onKeyListener == null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                        return true;
                    }
                    window = dialog.getWindow();
                    if (!window.superDispatchKeyEvent(keyEvent)) {
                        return true;
                    }
                    View decorView2 = window.getDecorView();
                    if (s1.au.charlie(decorView2, keyEvent)) {
                        return true;
                    }
                    if (decorView2 != null) {
                        dispatcherState = decorView2.getKeyDispatcherState();
                    }
                    return keyEvent.dispatch(dialog, dispatcherState, dialog);
                }
                onKeyListener = null;
                if (onKeyListener == null) {
                }
                window = dialog.getWindow();
                if (!window.superDispatchKeyEvent(keyEvent)) {
                }
            } else if ((view != null && s1.au.charlie(view, keyEvent)) || interfaceC2577j.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object delta(Wf.ad adVar, Wf.x xVar, Wf.r rVar, Pd.c cVar) {
        Wf.ae aeVar;
        int i4;
        if (cVar instanceof Wf.ae) {
            Wf.ae aeVar2 = (Wf.ae) cVar;
            int i5 = aeVar2.purple;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                aeVar2.purple = i5 - RecyclerView.UNDEFINED_DURATION;
                aeVar = aeVar2;
                Object obj = aeVar.alpha;
                Od.a aVar = Od.a.alpha;
                i4 = aeVar.purple;
                if (i4 == 0) {
                    if (i4 == 1) {
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    Wf.v alpha2 = Wf.u.alpha(adVar, rVar);
                    aeVar.purple = 1;
                    Regex regex = Wf.ai.alpha;
                    StringBuilder beige = ao.ad.beige(alpha2.bravo, "/");
                    beige.append(alpha2.charlie);
                    beige.append("-");
                    beige.append(alpha2.delta);
                    String sb2 = beige.toString();
                    Wf.ah ahVar = new Wf.ah(xVar, alpha2, null);
                    w.o oVar = Wf.ai.bravo;
                    oVar.getClass();
                    obj = vf.ad.mike(new Wf.c(oVar, sb2, ahVar, null), aeVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                Intrinsics.charlie(obj, "null cannot be cast to non-null type org.jetbrains.compose.resources.StringItem.Value");
                return ((Wf.ac) obj).alpha;
            }
        }
        aeVar = new Pd.c(cVar);
        Object obj2 = aeVar.alpha;
        Od.a aVar2 = Od.a.alpha;
        i4 = aeVar.purple;
        if (i4 == 0) {
        }
        Intrinsics.charlie(obj2, "null cannot be cast to non-null type org.jetbrains.compose.resources.StringItem.Value");
        return ((Wf.ac) obj2).alpha;
    }
}
